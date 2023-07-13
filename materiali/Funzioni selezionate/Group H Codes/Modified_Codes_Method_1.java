
// 1)Removal of the instruction 'sections.clear()'.

public void loadFromStream(InputStream stream) throws IOException {    
    //sections.clear();    
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

//------------------------------------------------------------------------------------------------------------------------

// 2)Insertion of the line 'section = sections.get(s)' immediately after inserting a new section into the sections map.

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
                s = s.substring(0, s.length() - 1);
            section = new CItemArray();
            sections.putValue(s, section);
            section = sections.get(s);
        } else {
            String[] parts = splitLine(s);
            section.putValue(parts[0].toUpperCase(), s);
        }
        s = readLine(stream);
    }
}

//------------------------------------------------------------------------------------------------------------------------

// 3)The line 'sections.clear()' is added within the else block.

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
                s = s.substring(0, s.length() - 1);
            section = new CItemArray();
            sections.putValue(s, section);
        } else {
            String[] parts = splitLine(s);
            section.putValue(parts[0].toUpperCase(), s);
            sections.clear();
        }
        s = readLine(stream);
    }
}

//------------------------------------------------------------------------------------------------------------------------

// 4)Added a variable named currentSection of type CItemArray to keep track of the current section during iteration.

public void loadFromStream(InputStream stream) throws IOException {
    Map<String, CItemArray> updatedSections = new HashMap<>();
    CItemArray currentSection = new CItemArray();
    updatedSections.put("", currentSection);
    String line = readLine(stream);

    while (line != null) {
        if (line.startsWith("[")) {
            line = line.substring(1);
            if (line.endsWith("]"))
                line = line.substring(0, line.length() - 1);
            currentSection = new CItemArray();
            updatedSections.put(line, currentSection);
        } else {
            String[] parts = splitLine(line);
            String key = parts[0].toUpperCase();
            currentSection.putValue(key, line);
        }

        line = readLine(stream);
    }

    sections.clear();
    sections.putAll(updatedSections);
}