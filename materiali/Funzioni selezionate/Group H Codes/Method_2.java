//Code summary: run the check thread

public void run() {        
    //Checks the pool and delivers a mail message        
    Properties props = new Properties();        
    Session session = Session.getInstance(props, null);        
    while (!Thread.currentThread().interrupted()) {          
        try {                
            String key = outgoing.accept(delayTime);                
            log(Thread.currentThread().getName() + " will process mail " + key);                
            MailImpl mail = outgoing.retrieve(key);                
            deliver(mail, session);                
            outgoing.remove(key);                
            mail = null;            
        } 
        catch (Exception e) {
            log("Exception caught in RemoteDelivery.run(): " + e);            
        }        
    }    
}