
// 1)Change the logical operator in the first 'if' statement from && to ||.

//Code summary: converts the bounding box to a query string

protected void bboxToQuery(String bbox, ArrayList<String> fqList) {  
    // e.g. bbox=122.013671875,-53.015625,172.990234375,-10.828125 
    if (bbox == null || bbox.isEmpty()) {
        return;
    }       
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

//------------------------------------------------------------------------------------------------------------------------

// 2)Modification of the 'if' statement, if (!(bbox != null && !bbox.isEmpty())).

//Code summary: converts the bounding box to a query string

protected void bboxToQuery(String bbox, ArrayList<String> fqList) {  
    // e.g. bbox=122.013671875,-53.015625,172.990234375,-10.828125        
    if (!(bbox != null && !bbox.isEmpty())) {            
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

//------------------------------------------------------------------------------------------------------------------------

// 3)Add an initial check to verify if 'bbox' is null or empty. In such case, the function terminates immediately.

//Code summary: converts the bounding box to a query string

protected void bboxToQuery(String bbox, ArrayList<String> fqList) {  
    // e.g. bbox=122.013671875,-53.015625,172.990234375,-10.828125        
    if (bbox != null || !bbox.isEmpty()) {            
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

//------------------------------------------------------------------------------------------------------------------------

// 4)Modification of the 'if' statement, if (bounds.length > 0).

//Code summary: converts the bounding box to a query string

protected void bboxToQuery(String bbox, ArrayList<String> fqList) {  
    // e.g. bbox=122.013671875,-53.015625,172.990234375,-10.828125        
    if (bbox != null && !bbox.isEmpty()) {            
        String[] bounds = StringUtils.split(bbox, ",");            
        if (bounds.length > 0) {                
            String fq1 = "longitude:[" + bounds[0] + " TO " + bounds[2] + "]";                
            fqList.add(fq1);                
            String fq2 = "latitude:[" + bounds[1] + " TO " + bounds[3] + "]";                
            fqList.add(fq2);  } 
            else {                
                logger.warn("BBOX does not contain the expected number of coords (4). Found: " + bounds.length);           
            }       
    }   
}