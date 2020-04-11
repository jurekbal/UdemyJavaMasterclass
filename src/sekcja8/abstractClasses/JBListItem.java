package sekcja8.abstractClasses;

public abstract class JBListItem {
    protected JBListItem next;
    protected JBListItem previous;
    protected Object value;

    public JBListItem(Object value) {
        this.value = value;
    }

    abstract JBListItem next();
    abstract JBListItem setNext(JBListItem item);
    abstract JBListItem previous();
    abstract JBListItem setPrevious(JBListItem item);

    public abstract int compareTo(JBListItem item);

    public Object getValue(){
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
