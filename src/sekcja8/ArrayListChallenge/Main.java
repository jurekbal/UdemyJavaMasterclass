package sekcja8.ArrayListChallenge;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        MobilePhone mobilePhone = new MobilePhone();

        String choice = "";
        do {
            choice = menu.showMenuAndGetUserChoice();
            switch (choice) {
                case "0" : {
                    break;
                }
                case "1" : {
                    mobilePhone.listContacts();
                    Menu.promptAndWait();
                    break;
                }
                case "2" : {
                    mobilePhone.addContact();
                    Menu.promptAndWait();
                    break;
                }
                case "3" : {
                    mobilePhone.modifyContact();
                    Menu.promptAndWait();
                    break;
                }
                case "4" : {
                    mobilePhone.removeContact();
                    Menu.promptAndWait();
                    break;
                }
                case "5" : {
                    mobilePhone.searchContact();
                    Menu.promptAndWait();
                    break;
                } default : {
                    System.out.println("Invalid option");
                    Menu.waitForEnter();
                }
            }

        } while (!choice.equals("0"));
        System.out.println("Good bye!");
    }

}
