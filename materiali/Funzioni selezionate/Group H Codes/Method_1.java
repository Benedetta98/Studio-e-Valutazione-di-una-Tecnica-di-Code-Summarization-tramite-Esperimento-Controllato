public void loadFromStream(InputStream stream) throws IOException {    
    sections.clear();    
    String s = readLine(stream);    
    if (s == null) return;    
    CItemArray section = new CItemArray();    
    sections.putValue("", section);    
    while (s != null) {      
        if (s.startsWith("[")) {        
            s = s.substring(1);        
            if (s.endsWith("]"))          
                s = s.substring(0, s.length()-1);        
            section = new CItemArray();        
            sections.putValue(s, section);      
        } 
        else {        
            String[] parts = splitLine(s);        
            section.putValue(parts[0].toUpperCase(), s);      
        }      
        s = readLine(stream);    
    }  
}