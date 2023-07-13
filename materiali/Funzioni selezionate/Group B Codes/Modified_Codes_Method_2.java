
// 1)Change the logical AND operator with the logical OR operator in the 'if' statement if(e.getResults()!= null && e.getResults().size()>0).
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
        if(e.getResults()!= null || e.getResults().size()>0){                
            System.out.println(name + " (homonym) had a " + e.getResults().get(0).getMatchType() +  
            " match. Clean Name: " + e.getResults().get(0).getCleanName());
        }        
    }    
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Creation of three new methods: 'displayMatchResult', 'displayNotFoundResult' and 'displayHomonymResult', in order to move the printing logic of the results inside these methods.
public void findMatchType(String name){        
    try{            
        NameSearchResult result = cbSearcher.searchForRecord(name, null);            
        if(result != null) {
            String matchType = result.getMatchType();
            String cleanName = result.getCleanName();
            displayMatchResult(name, matchType, cleanName);  
        } else {
            displayNotFoundResult(name);  
        }       
    }       
    catch(SearchResultException e){            
        if(e.getResults() != null && e.getResults().size() > 0) {
            String matchType = e.getResults().get(0).getMatchType();
            String cleanName = e.getResults().get(0).getCleanName();
            displayHomonymResult(name, matchType, cleanName);  
        }        
    }    
}

private void displayMatchResult(String name, String matchType, String cleanName) {
    System.out.println(name + " had a " + matchType + " match. Clean name: " + cleanName);
}

private void displayNotFoundResult(String name) {
    System.out.println(name + " could not be found in index");
}

private void displayHomonymResult(String name, String matchType, String cleanName) {
    System.out.println(name + " (homonym) had a " + matchType + " match. Clean Name: " + cleanName);
}

//------------------------------------------------------------------------------------------------------------------------

// 3)Replacing `catch(SearchResultException e)` with `catch(NullPointerException e)`
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
    catch(NullPointerException e){            
        if(e.getResults()!= null && e.getResults().size()>0){                
            System.out.println(name + " (homonym) had a " + e.getResults().get(0).getMatchType() +  
            " match. Clean Name: " + e.getResults().get(0).getCleanName());
        }        
    }    
}

//------------------------------------------------------------------------------------------------------------------------

// 4)Changing the 'if' statement from 'if(result != null)' to 'if(result != " ")'.
public void findMatchType(String name){        
    try{            
        NameSearchResult result = cbSearcher.searchForRecord(name, null);            
        if(result != "")            
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