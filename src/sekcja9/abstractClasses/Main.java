package sekcja9.abstractClasses;

public class Main {
    public static void main(String[] args) {

        /* // My Linked list variant

                MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        String stringData = "Poznań Warszawa Wrocław Lublin Kraków Gdańsk Poznań Przemyśl Arłamów Rzeszów Lubartów Szczecin";
        String[] data = stringData.split(" ");
        for (String s: data) {
            if (list.addItem(new Node(s))) {
                System.out.println("Added: " + s);
            }
        }

        System.out.println("Root: " + list.getRoot().getValue());
        System.out.println("Root's next: " + list.getRoot().next().getValue());
        list.traverse(list.getRoot());

        list.removeItem(new Node("Poznań"));
        list.removeItem(new Node("Warszawa"));
        list.removeItem(new Node("Arłamów"));
        list.removeItem(new Node("Chojnice"));
        list.traverse(list.getRoot());
         */


        SearchTree tree = new SearchTree(null);
        tree.traverse(tree.getRoot());

        String stringData = "Poznań Warszawa Wrocław Lublin Kraków Gdańsk Poznań Przemyśl Arłamów Rzeszów Lubartów Szczecin";
//        String stringData = "9 4 7 2 0 6 8 1 3 5";
        String[] data = stringData.split(" ");
        for (String s: data) {
            if (tree.addItem(new Node(s))) {
                System.out.println("Added: " + s);
            }
        }

        tree.traverse(tree.getRoot());

//        System.out.println("Root: " + tree.getRoot().getValue());
        //      System.out.println("Root's next: " + tree.getRoot().next().getValue());


    }
}
