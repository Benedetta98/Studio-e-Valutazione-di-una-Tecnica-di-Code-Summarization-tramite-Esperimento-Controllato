protected int innerProcString(Lexem curr) {    
    curr.tokenType = UNKNOWN;    
    char temp = curr.token.charAt(0);    
    if (isQuote(temp)) {      
        curr.tokenType = STRING;      
        char quote = temp;      
        while (bufferPos < bufferLen) {        
            temp = buffer.charAt(bufferPos);        
            if (temp == '\n' || temp == '\r') break;        
            curr.token += temp;        
            bufferPos++;        
            if (temp == quote) break;      
        }    
    }    
    return curr.tokenType;  
}