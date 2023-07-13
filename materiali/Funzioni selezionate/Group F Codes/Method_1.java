private void addCosts_unsafe(ConventionalConstraint constraint, int costID, Object costMappingOptions) {        
    // Creating default cost function if needed        
    if (currentCostFunction == null) {            
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