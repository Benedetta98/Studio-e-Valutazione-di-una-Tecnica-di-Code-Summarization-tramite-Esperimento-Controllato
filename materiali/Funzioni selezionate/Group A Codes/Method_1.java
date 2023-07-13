//Code summary: calculates the sum of the current function

private CVariant functionSum(Stack stack) throws CExpressionError {    
    int params = getValue(stack, 0).getInt();    
    //param stack a expression stack with function parameters   
    if (params < 2)  throw new CExpressionError("Expected more then 2 parameters");    
    CVariant result = new CSoftVariant(getValue(stack, params));    
    for (int i = params-1; i >= 1; i--) {      
        result.add(getValue(stack, i));    
    }    
    return result; //return a function result
}