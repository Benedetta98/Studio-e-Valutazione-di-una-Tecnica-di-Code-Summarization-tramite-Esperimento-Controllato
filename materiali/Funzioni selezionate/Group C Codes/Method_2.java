private boolean heuristic_DeleteLatestTask() {
    // Choosing a task of the last interval
    DRCInterval interval = (DRCInterval)intervalList.getLast().getPrevious().getElement();
    DRCTask task = null;
    int chosenTask = gsc.random.nextInt(interval.tasks.size());
    Iterator it = interval.tasks.iterator();
    while (chosenTask-- >= 0) {    
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