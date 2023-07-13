
// 1)Remove the newline character "\n" after the closing </tagName> tag.

public void writeElement(Writer out, int indent) throws IOException {    
    out.write(createIndent(indent) + "<" + tagName);    
    // Writes element properties.    
    Iterator params = props.keySet().iterator();    
    while (params.hasNext()) {      
        Object param = params.next();      
        Object value = props.get(param);      
        out.write(" " + param.toString());      
        if (value != null)        
        out.write("=" + new CXmlScanner().wrapString(value.toString()));    
    }    
    // Writes end of tag    
    if (childs.size() == 0)     
        out.write(">\n");    
    else {      
        out.write(">\n");      
        // Writes element content.      
        writeChildElements(out, indent);      
        out.write(createIndent(indent) + "</" + tagName + ">");    
    }  
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Introduce the variable "wrappedValue" to store the converted and wrapped value from CXmlScanner before writing it to the output stream.

public void writeElement(Writer out, int indent) throws IOException {
    out.write(createIndent(indent) + "<" + tagName);
    // Writes element properties.
    Iterator params = props.keySet().iterator();
    while (params.hasNext()) {
        Object param = params.next();
        Object value = props.get(param);
        out.write(" " + param.toString());
        if (value != null) {
            String wrappedValue = new CXmlScanner().wrapString(value.toString());
            out.write("=" + wrappedValue);
        }
    }
    // Writes end of tag
    if (childs.size() == 0)
        out.write(">\n");
    else {
        out.write(">\n");
        // Writes element content.
        writeChildElements(out, indent);
        out.write(createIndent(indent) + "</" + tagName + ">\n");
    }
}

//------------------------------------------------------------------------------------------------------------------------

// 3)Changing the 'if' statement from 'if (childs.size() == 0)' to 'if (childs.size() != 0)'.

public void writeElement(Writer out, int indent) throws IOException {    
    out.write(createIndent(indent) + "<" + tagName);    
    // Writes element properties.    
    Iterator params = props.keySet().iterator();    
    while (params.hasNext()) {      
        Object param = params.next();      
        Object value = props.get(param);      
        out.write(" " + param.toString());      
        if (value != null)        
        out.write("=" + new CXmlScanner().wrapString(value.toString()));    
    }    
    // Writes end of tag    
    if (childs.size() != 0)     
        out.write(">\n");    
    else {      
        out.write(">\n");      
        // Writes element content.      
        writeChildElements(out, indent);      
        out.write(createIndent(indent) + "</" + tagName + ">\n");    
    }  
}

//------------------------------------------------------------------------------------------------------------------------

// 4)Moving the declaration of the 'params' variable.

public void writeElement(Writer out, int indent) throws IOException {    
    out.write(createIndent(indent) + "<" + tagName);    
    // Writes element properties.        
    while (params.hasNext()) {      
        Object param = params.next();      
        Object value = props.get(param);      
        out.write(" " + param.toString());      
        if (value != null)        
        out.write("=" + new CXmlScanner().wrapString(value.toString()));    
    }
    Iterator params = props.keySet().iterator();    
    // Writes end of tag    
    if (childs.size() == 0)     
        out.write(">\n");    
    else {      
        out.write(">\n");      
        // Writes element content.      
        writeChildElements(out, indent);      
        out.write(createIndent(indent) + "</" + tagName + ">\n");    
    }  
}