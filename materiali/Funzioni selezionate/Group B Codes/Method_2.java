public void findMatchType(String name){        
    try{            
        NameSearchResult result = cbSearcher.searchForRecord(name, null);            
        if(result != null)            
            System.out.println(name +" had a " + result.getMatchType() + " match. Clean name: " 
            + result.getCleanName());
        else{                
            System.out.println(name + " could not be found in index");            
        }       
    }       
    catch(SearchResultException e){            
        if(e.getResults()!= null && e.getResults().size()>0){                
            System.out.println(name + " (homonym) had a " + e.getResults().get(0).getMatchType() +  
            " match. Clean Name: " + e.getResults().get(0).getCleanName());
        }        
    }    
}