
// 1)To replace the "--" operator with "++" in the while loop
private boolean heuristic_DeleteLatestTask() {
    // Choosing a task of the last interval
    DRCInterval interval = (DRCInterval) intervalList.getLast().getPrevious().getElement();
    DRCTask task = null;
    int chosenTask = gsc.random.nextInt(interval.tasks.size());
    Iterator it = interval.tasks.iterator();
    while (chosenTask++ >= 0) {    
        task = (DRCTask) it.next();
    }
    // Deleting the task
    boolean success = deleteTask(task);
    if (Registry.LOG_CHANGES && success) {    
        if (operationDescriptions != null) {
            System.out.println("DRC DeleteLatestTask: " + 
                operationDescriptions.get(new Long((long) task.operationVar.value())));
        } 
        else {
            System.out.println("DRC DeleteLatestTask: " + task);
        }
    }
    return success;   
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Moving the declaration of the task variable
private boolean heuristic_DeleteLatestTask() {
    // Choosing a task of the last interval
    DRCInterval interval = (DRCInterval)intervalList.getLast().getPrevious().getElement();
    int chosenTask = gsc.random.nextInt(interval.tasks.size());
    Iterator it = interval.tasks.iterator();
    while (chosenTask-- >= 0) {    
        task = (DRCTask) it.next();
    }
    DRCTask task = null;
    // Deleting the task
    boolean success = deleteTask(task);
    if (Registry.LOG_CHANGES && success) {    
        if (operationDescriptions != null) {
            System.out.println("DRC DeleteLatestTask: " + 
            operationDescriptions.get(new Long((long) task.operationVar.value())));    
        } 
        else {
            System.out.println("DRC DeleteLatestTask: " + task);    
        }
    }
    return success;   
}

//------------------------------------------------------------------------------------------------------------------------

// 3)To use the 'remove()' method instead of 'deleteTask()'.
private boolean heuristic_DeleteLatestTask() {
    // Choosing a task of the last interval
    DRCInterval interval = (DRCInterval) intervalList.getLast().getPrevious().getElement();
    DRCTask task = null;
    int chosenTask = gsc.random.nextInt(interval.tasks.size());
    Iterator it = interval.tasks.iterator();
    while (chosenTask-- >= 0) {    
        task = (DRCTask) it.next();
    }
    // Deleting the task
    interval.tasks.remove(task);
    boolean success = true;
    if (Registry.LOG_CHANGES && success) {    
        if (operationDescriptions != null) {
            System.out.println("DRC DeleteLatestTask: " + 
                operationDescriptions.get(new Long((long) task.operationVar.value())));
        } 
        else {
            System.out.println("DRC DeleteLatestTask: " + task);
        }
    }
    return success;   
}

//------------------------------------------------------------------------------------------------------------------------

// 4)To randomly select a task, you can directly use the `get` method on the `interval.tasks` list.
private boolean heuristic_DeleteLatestTask() {
    // Choosing a task of the last interval
    DRCInterval interval = (DRCInterval) intervalList.getLast().getPrevious().getElement();
    DRCTask task = interval.tasks.get(gsc.random.nextInt(interval.tasks.size()));

    // Deleting the task
    boolean success = deleteTask(task);
    if (Registry.LOG_CHANGES && success) {    
        if (operationDescriptions != null) {
            System.out.println("DRC DeleteLatestTask: " + 
                operationDescriptions.get(new Long((long) task.operationVar.value())));
        } 
        else {
            System.out.println("DRC DeleteLatestTask: " + task);
        }
    }
    return success;   
}