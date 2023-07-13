
// 1)Add a finally clause at the end of the try-catch block to release the session and props resources at the end of each iteration of the while loop.

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
        finally {
            // Clean up resources
            session = null;
            props = null;
        }        
    }    
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Remove 'try-catch' block.

//Code summary: run the check thread

public void run() {        
    //Checks the pool and delivers a mail message        
    Properties props = new Properties();        
    Session session = Session.getInstance(props, null);        
    while (!Thread.currentThread().interrupted()) {                         
        String key = outgoing.accept(delayTime);                
        log(Thread.currentThread().getName() + " will process mail " + key);                
        MailImpl mail = outgoing.retrieve(key);                
        deliver(mail, session);                
        outgoing.remove(key);                
        mail = null;               
    }    
}

//------------------------------------------------------------------------------------------------------------------------

// 3)Modify the 'while' statement with while (Thread.currentThread().interrupted()).

//Code summary: run the check thread

public void run() {        
    //Checks the pool and delivers a mail message        
    Properties props = new Properties();        
    Session session = Session.getInstance(props, null);        
    while (Thread.currentThread().interrupted()) {          
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

//------------------------------------------------------------------------------------------------------------------------

// 4)Set the variable 'mail' to 0.

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
            mail = 0;            
        } 
        catch (Exception e) {
            log("Exception caught in RemoteDelivery.run(): " + e);            
        }        
    }    
}