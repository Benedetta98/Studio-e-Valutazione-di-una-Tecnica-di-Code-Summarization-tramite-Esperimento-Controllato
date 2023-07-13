
// 1)Use constants and descriptive names for the delimiters.

//Code summary: returns a string representation of the object

public String toEncodedString() {
    //Priority threshold
    StringBuilder buf = new StringBuilder();
    buf.append(getMinPriority());
    //Encode enabled bug categories. Note that these aren't really used for much.
    // They only come in to play when parsed by a version of FindBugs older than 1.1.
    buf.append(PRIORITY_DELIMITER);
    for (Iterator<String> i = activeBugCategorySet.iterator(); i.hasNext();) {
        buf.append(i.next());
        if (i.hasNext()) {
            buf.append(CATEGORY_DELIMITER);
        }
    }

    // Whether to display false warnings
    buf.append(FIELD_DELIMITER);
    buf.append(displayFalseWarnings ? "true" : "false");
    return buf.toString(); //return an encoded string
}

//------------------------------------------------------------------------------------------------------------------------

// 2)Use of FIELD_DELIMITER in the statement buf.append(FIELD_DELIMITER) instead of buf.append(LISTITEM_DELIMITER).

//Code summary: returns a string representation of the object

public String toEncodedString() {
    //Priority threshold
    StringBuilder buf = new StringBuilder();
    buf.append(getMinPriority());
    //Encode enabled bug categories. Note that these aren't really used for much.
    // They only come in to play when parsed by a version of FindBugs older than 1.1.
    buf.append(FIELD_DELIMITER);
    for (Iterator<String> i = activeBugCategorySet.iterator(); i.hasNext(); ) {
        buf.append(i.next());
        if (i.hasNext()) {
            buf.append(FIELD_DELIMITER);
        }
    }
    
    // Whether to display false warnings
    buf.append(FIELD_DELIMITER);
    buf.append(displayFalseWarnings ? "true" : "false");
    return buf.toString(); //return an encoded string
}

//------------------------------------------------------------------------------------------------------------------------

// 3)Change the instruction buf.append(displayFalseWarnings ? "true" : "false") to buf.append(displayFalseWarnings ? "false" : "true").

//Code summary: returns a string representation of the object

public String toEncodedString() {
    //Priority threshold
    StringBuilder buf = new StringBuilder();
    buf.append(getMinPriority());
    //Encode enabled bug categories. Note that these aren't really used for much.
    // They only come in to play when parsed by a version of FindBugs older than 1.1.
    buf.append(FIELD_DELIMITER);
    for (Iterator<String> i = activeBugCategorySet.iterator(); i.hasNext(); ) {
        buf.append(i.next());
        if (i.hasNext()) {
            buf.append(LISTITEM_DELIMITER);
        }
    }
    // Whether to display false warnings
    buf.append(FIELD_DELIMITER);
    buf.append(displayFalseWarnings ? "false" : "true");
    return buf.toString(); //return an encoded string
}

//------------------------------------------------------------------------------------------------------------------------

// 4)Use a while loop instead of a for-each loop.

//Code summary: returns a string representation of the object

public String toEncodedString() {
    //Priority threshold
    StringBuilder buf = new StringBuilder();
    buf.append(getMinPriority());
    //Encode enabled bug categories. Note that these aren't really used for much.
    // They only come in to play when parsed by a version of FindBugs older than 1.1.
    buf.append(FIELD_DELIMITER);
    Iterator<String> i = activeBugCategorySet.iterator();
    while (i.hasNext()) {
        buf.append(i.next());
        buf.append(LISTITEM_DELIMITER);
    }
    // Whether to display false warnings
    buf.append(FIELD_DELIMITER);
    buf.append(displayFalseWarnings ? "true" : "false");
    return buf.toString(); //return an encoded string
}