
// 1)The 'toUpperCase()' method is added to convert the value to uppercase.

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
        value = line.substring(propertySplitPoint + 1);    
    }
    value = value.toUpperCase(); // Convert value to uppercase    
    return new SimpleProperty(name, value);  
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Assign the value 'null' to the variable 'value'.

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
        value = null;    } 
    else {      
        value = line.substring(propertySplitPoint + 1);    }    
    return new SimpleProperty(name, value);  
}

//------------------------------------------------------------------------------------------------------------------------

// 3)The last return statement is modified.

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
    return new SimpleProperty(value, name);  
}

//------------------------------------------------------------------------------------------------------------------------

// 4)Add a new line of code after assigning the value to the property. This line executes the 'trim()' method on the variable 'value'.

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
        value = line.substring(propertySplitPoint + 1);    
    }
    value = value.trim(); // Trim any leading or trailing whitespace    
    return new SimpleProperty(name, value);  
}


