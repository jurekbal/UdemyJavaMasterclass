package sekcja8.abstractClasses;

public class Node extends JBListItem {
    public Node(Object value) {
        super(value);
    }

    @Override
    JBListItem next() {
        return this.next;
    }

    @Override
    JBListItem setNext(JBListItem item) {
        this.next = item;
        return this.next;
    }

    @Override
    JBListItem previous() {
        return this.previous;
    }

    @Override
    JBListItem setPrevious(JBListItem item) {
        this.previous = item;
        return this.previous;
    }

    @Override
    public int compareTo(JBListItem item) {
        if (item != null) {
            return ((String) this.value).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
