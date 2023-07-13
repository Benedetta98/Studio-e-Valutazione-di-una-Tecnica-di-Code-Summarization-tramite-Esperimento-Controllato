//Code summary: dumps the contents of the term

public void dumpSpecies(){            
    try{                
        OutputStreamWriter fileOut = new OutputStreamWriter(new FileOutputStream("/data/species.txt"), "UTF-8");
        Term term = new Term("rank", "species");                
        TopDocs hits = cbSearcher.search(new TermQuery(term), 2000000);
        for(ScoreDoc sdoc : hits.scoreDocs){                
            Document doc = cbReader.document(sdoc.doc);                
            if(doc.getField("synonym") == null){                    
                String lsid = StringUtils.trimToNull(doc.getField("lsid").stringValue());                    
                if(lsid == null)                        
                    lsid = doc.getField("id").stringValue();                    
                fileOut.write(lsid + "\n");                
            }            
        }            
        fileOut.flush();            
    }            
    catch(Exception e){                
        e.printStackTrace();            
    }        
}