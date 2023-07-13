
// 1)The variable `curr.tokenType` is assigned as "NUMBER" instead of "STRING" within the if block.

protected int innerProcString(Lexem curr) {    
    curr.tokenType = UNKNOWN;    
    char temp = curr.token.charAt(0);    
    if (isQuote(temp)) {      
        curr.tokenType = NUMBER;      
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

//------------------------------------------------------------------------------------------------------------------------

// 2)Changing the 'if' statement from 'if (temp == '\n' || temp == '\r')' to 'if (temp != '\n' && temp != '\r')'.

protected int innerProcString(Lexem curr) {    
    curr.tokenType = UNKNOWN;    
    char temp = curr.token.charAt(0);    
    if (isQuote(temp)) {      
        curr.tokenType = STRING;      
        char quote = temp;      
        while (bufferPos < bufferLen) {        
            temp = buffer.charAt(bufferPos);        
            if (temp != '\n' && temp != '\r') break;        
            curr.token += temp;        
            bufferPos++;        
            if (temp == quote) break;      
        }    
    }    
    return curr.tokenType;  
}

//------------------------------------------------------------------------------------------------------------------------

// 3)Adding '\t' as a break condition.

protected int innerProcString(Lexem curr) {    
    curr.tokenType = UNKNOWN;    
    char temp = curr.token.charAt(0);    
    if (isQuote(temp)) {      
        curr.tokenType = STRING;      
        char quote = temp;      
        while (bufferPos < bufferLen) {        
            temp = buffer.charAt(bufferPos);        
            if (temp == '\n' || temp == '\r' || temp == '\t') break;       
            curr.token += temp;        
            bufferPos++;        
            if (temp == quote) break;      
        }    
    }    
    return curr.tokenType;  
}

//------------------------------------------------------------------------------------------------------------------------

// 4)Replacing 'break' in the 'if (temp == '\n' || temp == '\r')' statement with 'return curr.tokenType'.

protected int innerProcString(Lexem curr) {    
    curr.tokenType = UNKNOWN;    
    char temp = curr.token.charAt(0);    
    if (isQuote(temp)) {      
        curr.tokenType = STRING;      
        char quote = temp;      
        while (bufferPos < bufferLen) {        
            temp = buffer.charAt(bufferPos);        
            if (temp == '\n' || temp == '\r') return curr.tokenType;        
            curr.token += temp;        
            bufferPos++;        
            if (temp == quote) break;      
        }    
    }    
    return curr.tokenType;  
}