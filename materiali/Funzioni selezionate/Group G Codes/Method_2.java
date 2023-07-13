//Code summary: loads a property from the given line

private SimpleProperty loadProperty(String line) throws IOException {    
    int propertySplitPoint = line.indexOf(PROPERTY_SEPERATOR);    
    if (propertySplitPoint == -1) {      
        throw new IOException(String.format("Unable to find seperator %s when parsing line '%s'", 
        PROPERTY_SEPERATOR, line));    
    }   
    // Get the name.    
    String name = line.substring(0, propertySplitPoint);    
    // Load the value, checking for a case where there is no value after the separator.    
    String value;   
    if (line.length() - 1 == propertySplitPoint) {      
        value = "";    } 
    else {      
        value = line.substring(propertySplitPoint + 1);    }    
    return new SimpleProperty(name, value);  
}