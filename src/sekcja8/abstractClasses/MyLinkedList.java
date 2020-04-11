package sekcja8.abstractClasses;

public class MyLinkedList implements NodeList {

    private JBListItem root = null;

    public MyLinkedList(JBListItem root) {
        this.root = root;
    }

    @Override
    public JBListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(JBListItem newItem) {
        if (root == null) { //List is empty, new item becomes the head
            this.root = newItem;
            return true;
        }

        JBListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0 ) {
                //newItem is greater than currentItem, move next if possible
                if (currentItem.next != null) {
                    currentItem = currentItem.next();
                } else {
                    //there is no next so insert at the end of list
                    currentItem.setNext(newItem).setPrevious(currentItem); //setNext method also returns newItem
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // the node is root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                System.out.println(newItem.getValue() + " is already in list, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(JBListItem item) {
        if (item != null) {
            System.out.println("Deleting item: " + item.getValue());
        }

        JBListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found item to delete
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else {
                return false; // we pass the place where item can be found in the list
            }
        }
        return false; //we reach the end of the list
    }

    @Override
    public void traverse(JBListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }

            /*
            // rewritten recursively
            if (root != null) {
                System.out.println(root.getValue());
                traverse(root.next());
            }
            // relly not a good idea for linkendList - may cause stack overflow when dealing with relly big lists
            */
        }
    }
}
