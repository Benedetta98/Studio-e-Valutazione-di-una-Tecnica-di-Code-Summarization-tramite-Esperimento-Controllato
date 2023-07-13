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
        out.write(createIndent(indent) + "</" + tagName + ">\n");    
    }  
}