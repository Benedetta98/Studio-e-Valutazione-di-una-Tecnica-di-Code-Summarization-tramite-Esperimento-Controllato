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
    buf.append(displayFalseWarnings ? "true" : "false");
    return buf.toString(); //return an encoded string
}