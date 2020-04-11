package sekcja8.abstractClasses;

public interface NodeList {
    JBListItem getRoot();
    boolean addItem(JBListItem item);
    boolean removeItem(JBListItem item);
    void traverse(JBListItem root);
}
