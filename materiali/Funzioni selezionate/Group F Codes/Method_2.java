//Code summary: converts the bounding box to a query string

protected void bboxToQuery(String bbox, ArrayList<String> fqList) {  
    // e.g. bbox=122.013671875,-53.015625,172.990234375,-10.828125        
    if (bbox != null && !bbox.isEmpty()) {            
        String[] bounds = StringUtils.split(bbox, ",");            
        if (bounds.length == 4) {                
            String fq1 = "longitude:[" + bounds[0] + " TO " + bounds[2] + "]";                
            fqList.add(fq1);                
            String fq2 = "latitude:[" + bounds[1] + " TO " + bounds[3] + "]";                
            fqList.add(fq2);  } 
            else {                
                logger.warn("BBOX does not contain the expected number of coords (4). Found: " + bounds.length);           
            }       
    }   
}