package udemy_exercises.cell_phone;

import java.util.Scanner;

public class Main {
    private static CellPhone cellPhone = new CellPhone("867-5309");
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit) {
            System.out.println("Enter action: Option 6 is the list of possible actions");
            int action  = scanner.nextInt();
            scanner.nextLine();

            switch(action) {
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;
                case 1:
                    cellPhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }

    private static void addNewContact() {
        System.out.println("Enter new Contact Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Phone number: ");
        String phone = scanner.nextLine();
        Contact newContact  = Contact.createContact(name, phone);
        if(cellPhone.addNewContact(newContact)) {
            System.out.println("New Contact Added: name = " + name + ", and phone = " + phone);
        } else {
            System.out.println("Cannot add. " + name + " already exists.");
        }
    }
    private static void updateContact() {
        System.out.println("Enter an existing Contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = cellPhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact not found.");
            return;
        }
        System.out.println("Enter new name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new number: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);
        if (cellPhone.updateContact(existingContactRecord, newContact)) {
            System.out.println("Record successfully updated.");
        } else {
            System.out.println("Not able to update record.");
        }
    }
        private static void removeContact() {
            System.out.println("Enter an existing Contact name: ");
            String name = scanner.nextLine();
            Contact existingContactRecord = cellPhone.queryContact(name);
            if (existingContactRecord == null) {
                System.out.println("Contact not found.");
                return;
            }
            if(cellPhone.removeContact(existingContactRecord)) {
                System.out.println("Deleted record.");
            } else {
                System.out.println("Not able to delete record.");
            }
    }
        private static void queryContact() {
            System.out.println("Enter an existing Contact name: ");
            String name = scanner.nextLine();
            Contact existingContactRecord = cellPhone.queryContact(name);
            if(existingContactRecord == null) {
                System.out.println("Contact not found.");
                return;
            }
            System.out.println("Name " + existingContactRecord.getName() + " phone number " + existingContactRecord.getPhoneNumber());
        }
    private static void startPhone(){
            System.out.println("Starting phone...");
        }

    private static void printActions() {
        System.out.println("Available actions are as follows: \npress: ");
        System.out.println("Zero (0) to quit\n" +
                "One (1) to print contacts \n" +
                "Two (2) to add new contact\n" +
                "Three (3) to update an existing contact \n" +
                "Four (4) to remove an existing contact \n" +
                "Five (5) to query if an existing contact is present\n" +
                "Six (6) to print a list of available actions");
        System.out.println("Choose your action please.");
    }
}
