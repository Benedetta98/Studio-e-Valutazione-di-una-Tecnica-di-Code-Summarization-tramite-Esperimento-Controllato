
// 1)Changing the 'if' statement from 'if (currentCostFunction == null)' to 'if (currentCostFunction != null)'.

private void addCosts_unsafe(ConventionalConstraint constraint, int costID, Object costMappingOptions) {        
    // Creating default cost function if needed        
    if (currentCostFunction != null) {            
        DEFAULT_FUNCTION = createCostFunction("Default Cost Function");            
        currentCostFunction = DEFAULT_FUNCTION;       
    }       
    // Adding constraint costs' handling to cost function        
    currentCostFunction.addConstraint(constraint, costID, currentCostMapping, costMappingOptions);        
    // Updating graphical component if existent        
    if (constraint.graphObject instanceof NodeGraphics) {            
        ((ConventionalConstraintGraphics) constraint.graphObject).updateCosts();            
        ((NodeGraphics) constraint.graphObject).updateSize();        
    }   
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Remove the declaration of variable 'DEFAULT_FUNCTION'.

private void addCosts_unsafe(ConventionalConstraint constraint, int costID, Object costMappingOptions) {        
    // Creating default cost function if needed        
    if (currentCostFunction == null) {            
        createCostFunction("Default Cost Function");            
        currentCostFunction = DEFAULT_FUNCTION;       
    }       
    // Adding constraint costs' handling to cost function        
    currentCostFunction.addConstraint(constraint, costID, currentCostMapping, costMappingOptions);        
    // Updating graphical component if existent        
    if (constraint.graphObject instanceof NodeGraphics) {            
        ((ConventionalConstraintGraphics) constraint.graphObject).updateCosts();            
        ((NodeGraphics) constraint.graphObject).updateSize();        
    }   
}

//------------------------------------------------------------------------------------------------------------------------

// 3)Moving the declaration of the 'DEFAULT_FUNCTION' variable.

private void addCosts_unsafe(ConventionalConstraint constraint, int costID, Object costMappingOptions) {        
    // Creating default cost function if needed        
    if (currentCostFunction == null) {                        
        currentCostFunction = DEFAULT_FUNCTION;
        DEFAULT_FUNCTION = createCostFunction("Default Cost Function");       
    }       
    // Adding constraint costs' handling to cost function        
    currentCostFunction.addConstraint(constraint, costID, currentCostMapping, costMappingOptions);        
    // Updating graphical component if existent        
    if (constraint.graphObject instanceof NodeGraphics) {            
        ((ConventionalConstraintGraphics) constraint.graphObject).updateCosts();            
        ((NodeGraphics) constraint.graphObject).updateSize();        
    }   
}

//------------------------------------------------------------------------------------------------------------------------

// 4)Using a separate method for creating the default cost function.

private void addCosts_unsafe(ConventionalConstraint constraint, int costID, Object costMappingOptions) {        
    createDefaultCostFunctionIfNeeded();
    currentCostFunction.addConstraint(constraint, costID, currentCostMapping, costMappingOptions);        
    updateGraphicalComponent(constraint);
}

private void createDefaultCostFunctionIfNeeded() {
    if (currentCostFunction == null) {            
        DEFAULT_FUNCTION = createCostFunction("Default Cost Function");            
        currentCostFunction = DEFAULT_FUNCTION;       
    } 
}