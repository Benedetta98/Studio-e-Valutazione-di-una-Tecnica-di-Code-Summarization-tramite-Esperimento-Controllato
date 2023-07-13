
// 1)Replace the 'for' loop with a 'while' loop.

//Code summary: dumps the contents of the term

public void dumpSpecies() {
    try {
        OutputStreamWriter fileOut = new OutputStreamWriter(new FileOutputStream("/data/species.txt"), "UTF-8");
        Term term = new Term("rank", "species");
        TopDocs hits = cbSearcher.search(new TermQuery(term), 2000000);
        int index = 0;
        while (true) {
            ScoreDoc sdoc = hits.scoreDocs[index];
            Document doc = cbReader.document(sdoc.doc);
            if (doc.getField("synonym") == null) {
                String lsid = StringUtils.trimToNull(doc.getField("lsid").stringValue());
                if (lsid == null)
                    lsid = doc.getField("id").stringValue();
                fileOut.write(lsid + "\n");
            }
            index++;
        }
        fileOut.flush();
    } catch (Exception e) {
        e.printStackTrace();
    }
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Completely remove the try-catch block.

//Code summary: dumps the contents of the term

public void dumpSpecies() {
    OutputStreamWriter fileOut = new OutputStreamWriter(new FileOutputStream("/data/species.txt"), "UTF-8");
    Term term = new Term("rank", "species");
    TopDocs hits = cbSearcher.search(new TermQuery(term), 2000000);
    for (ScoreDoc sdoc : hits.scoreDocs) {
        Document doc = cbReader.document(sdoc.doc);
        if (doc.getField("synonym") == null) {
            String lsid = StringUtils.trimToNull(doc.getField("lsid").stringValue());
            if (lsid == null)
                lsid = doc.getField("id").stringValue();
            fileOut.write(lsid + "\n");
        }
    }
    fileOut.flush();
}

//------------------------------------------------------------------------------------------------------------------------

// 3)Use a BufferedWriter to improve file writing performance. By using a BufferedWriter, the data is written to a buffer before being actually written to the disk.

//Code summary: dumps the contents of the term

public void dumpSpecies() {
    try (BufferedWriter writer = Files.newBufferedWriter(Paths.get("/data/species.txt"), StandardCharsets.UTF_8)) {
        Term term = new Term("rank", "species");
        TopDocs hits = cbSearcher.search(new TermQuery(term), 2000000);
        for (ScoreDoc sdoc : hits.scoreDocs) {
            Document doc = cbReader.document(sdoc.doc);
            if (doc.getField("synonym") == null) {
                String lsid = StringUtils.trimToNull(doc.getField("lsid").stringValue());
                if (lsid == null)
                    lsid = doc.getField("id").stringValue();
                writer.write(lsid);
                writer.newLine();
            }
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}

//------------------------------------------------------------------------------------------------------------------------

// 4) Use System.out.println() to write to the file.

//Code summary: dumps the contents of the term

public void dumpSpecies() {
    try {
        Term term = new Term("rank", "species");
        TopDocs hits = cbSearcher.search(new TermQuery(term), 2000000);
        for (ScoreDoc sdoc : hits.scoreDocs) {
            Document doc = cbReader.document(sdoc.doc);
            if (doc.getField("synonym") == null) {
                String lsid = StringUtils.trimToNull(doc.getField("lsid").stringValue());
                if (lsid == null)
                    lsid = doc.getField("id").stringValue();
                System.out.println(lsid);
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
}