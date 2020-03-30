package sekcja8.ArrayListChallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    //for testing purposes
    public MobilePhone() {
        contacts.add(new Contact("Adam Nowicki", "505 667 345"));
        contacts.add(new Contact("Roman Majer", "725 627 123"));
        contacts.add(new Contact("Adela Kowalska", "605 555 345"));
        contacts.add(new Contact("Kamila Neumann", "601 827 298"));
    }

    public void listContacts() {
        int contactOrderNumber;
        if (contacts.size() > 0) {
            for (int i = 0; i < contacts.size(); i++) {
                contactOrderNumber = i + 1;
                System.out.println((contactOrderNumber) + ": " +
                        contacts.get(i).getName() + " | " +
                        contacts.get(i).getPhoneNumber());
            }
        } else {
            System.out.println("No contacts in base");
        }
    }

    public void addContact() {
        System.out.println("Adding new contact:");
        Contact c = getContactDataFromInput();
        if (!isInContacts(c)) {
            contacts.add(c);
            System.out.println("Contact added.");
        } else {
            System.out.println("Failed. Contact is already in list!");
        }
    }

    private Contact getContactDataFromInput() {
        System.out.print("Enter name:");
        String name = scanner.nextLine();
        System.out.print("Enter phone number:");
        String phoneNumber = scanner.nextLine();
        return new Contact(name, phoneNumber);
    }

    public void removeContact() {
        listContacts();
        if (contacts.size() < 1) {
            return;
        }
        System.out.print("Enter contact number to remove:");
        int contactIndex = getContactIndexFromUser();

        if (contactIndex >= 0 && contactIndex < contacts.size()) {
            contacts.remove(contactIndex);
            System.out.println("Contact removed");
        } else {
            System.out.println("Invalid number");
        }
    }

    public void modifyContact() {
        listContacts();
        if (contacts.size() < 1) {
            return;
        }

        System.out.print("Enter contact number to modify:");
        int contactIndex = getContactIndexFromUser();

        if (contactIndex >= 0 && contactIndex < contacts.size()) {
            Contact c = getContactDataFromInput();
            if (!isInContacts(c)) {
                contacts.set(contactIndex, c);
                System.out.println("Contact updated");
            } else {
                System.out.println("Failed. Contact is already in list!");
            }

        } else {
            System.out.println("Invalid number");
        }
    }

    private int getContactIndexFromUser() {
        int contactOrderNumber = scanner.nextInt();
        scanner.nextLine();
        return contactOrderNumber - 1;
    }

    public void searchContact() {
        if (contacts.size() < 1) {
            System.out.println("No contacts in base");
            return;
        }

        System.out.print("Enter contact name to search for:");
        String searchName = scanner.nextLine().toLowerCase();
        boolean found = false;

        for (Contact c : contacts) {
            String contactName = c.getName().toLowerCase();
            if (contactName.contains(searchName)) {
                found = true;
                System.out.println(c.getName() + " | " + c.getPhoneNumber());
            }
        }

        if (!found) {
            System.out.println("Nothing found");
        }
    }

    public boolean isInContacts(Contact c) {
        for (Contact record : contacts) {
            if (record.getName().equalsIgnoreCase(c.getName())) {
                return true;
            }
        }
        return false;
    }

}