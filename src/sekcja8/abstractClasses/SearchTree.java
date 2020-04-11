package sekcja8.abstractClasses;

public class SearchTree implements NodeList {

    public JBListItem root = null;

    public SearchTree(JBListItem root) {
        this.root = root;
    }

    @Override
    public JBListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(JBListItem newItem) {
        if (root == null) {
            //The tree is empty, new item becomes the head
            this.root = newItem;
            return true;
        }

        //otherwise start comparing from the head of the tree
        JBListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0 ) {
                //newItem is greater than currentItem, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no node to the right so insert at this point
                    currentItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, move left if possible
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    // there is no node to the left, add at this point
                    currentItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already in list, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(JBListItem item) {
        // quite complicated algoritm
        return false;
    }

    @Override
    public void traverse(JBListItem root) {
        //metoda rekurencyjna (recursive method)
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());

        }
    }
}
