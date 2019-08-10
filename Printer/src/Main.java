import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printOptions();

        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContactByPosition();
                    break;
                case 4:
                    updateContactName();
                    break;
                case 5:
                    updateContactNumber();
                    break;
                case 6:
                    removeContactByName();
                    break;
                case 7:
                    removeContactByNumber();
                    break;
                case 8:
                    searchForContactByName();
                    break;
                case 9:
                    searchForContactByNumber();
                    break;
                case 10:
                    quit = true;
                    System.out.println("Application Ended" +
                            "\nThank You for Using!");
                    break;
            }
        }
    } //Switch For Choice Selection

    public static void printOptions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the Contact List.");
        System.out.println("\t 2 - To add a contact.");
        System.out.println("\t 3 - To update a contact by position.");
        System.out.println("\t 4 - To update a contact Name");
        System.out.println("\t 5 - To update a contact Number.");
        System.out.println("\t 6 - To remove a contact by Name.");
        System.out.println("\t 7 - To remove a contact by Number.");
        System.out.println("\t 8 - To search for a contact by Name.");
        System.out.println("\t 9 - To search for a contact by Number.");
        System.out.println("\t 10 - To quit the application.");
    } //To Print Options

    public static void addContact() { //
        System.out.print("Enter contact name: ");
        String name = scanner.nextLine();
        System.out.print("Enter contact number: ");
        long number = scanner.nextLong();
        mobilePhone.addContact(name, number);
    // To Add Contact
    }

    public static void updateContactByPosition() {
        System.out.print("Enter the position of contact to be updated: ");
        int position = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the updated contact name: ");
        String updatedName = scanner.nextLine();
        System.out.print("Enter the updated contact number: ");
        long updatedNumber = scanner.nextLong();
        if(mobilePhone.FindContactByNumber(updatedNumber) == -1)
            mobilePhone.updateContactList(position, updatedName, updatedNumber);
        else
            System.out.println("Entered Mobile Number already exists");


    }

    public static void updateContactNumber() {
        System.out.print("Enter the contact name whose number is to be updated: ");
        String updatedName = scanner.nextLine();
        System.out.print("Enter the updated contact number: ");
        long updatedNumber = scanner.nextLong();
        scanner.nextLine();
        if(mobilePhone.FindContactByNumber(updatedNumber) == -1)
            mobilePhone.updateContactList(mobilePhone.FindContactByName(updatedName), updatedName, updatedNumber);
        else
            System.out.println("Entered Mobile Number already exists");
    }

    public static void updateContactName() {
        System.out.print("Enter the contact number whose name is to be updated: ");
        long updatedNumber = scanner.nextLong();
        scanner.nextLine();
        System.out.print("Enter the updated contact name: ");
        String updatedName = scanner.nextLine();
        mobilePhone.updateContactList(mobilePhone.FindContactByNumber(updatedNumber), updatedName, updatedNumber);
    }

    public static void removeContactByName() {
        System.out.print("Enter the Contact Name to be removed: ");
        String a = scanner.nextLine();
        mobilePhone.DeleteContactByName(a);
    }

    public static void removeContactByNumber() {
        System.out.print("Enter the Contact Number to be removed: ");
        long b = scanner.nextLong();
        mobilePhone.DeleteContactByNumber(b);
    }

    public static void searchForContactByName() {
        System.out.print("Enter the Contact Name to be searched for: ");
        String searchName = scanner.nextLine();
        if(mobilePhone.FindContactByName(searchName) > 0)
            System.out.println("Contact Found at position " + mobilePhone.FindContactByName(searchName));
        else
            System.out.println("Contact Not Found!!");
    }

    public static void searchForContactByNumber() {
        System.out.print("Enter the Contact Number to be searched for: ");
        long searchNumber = scanner.nextLong();
        scanner.nextLine();
        if(mobilePhone.FindContactByNumber(searchNumber) > 0)
            System.out.println("Contact Found at position " + mobilePhone.FindContactByNumber(searchNumber));
        else
            System.out.println("Contact Not Present!!");
    }

//    public static void processArrayList() {
//        ArrayList<String> newArray = new ArrayList<String>();
//        newArray.addAll(grocerList.getGroceryList());
//
//        ArrayList<String> nextArray = new ArrayList<String>(grocerList.getGroceryList());
//
//        String[] myArray = new String[grocerList.getGroceryList().size()];
//        myArray = grocerList.getGroceryList().toArray(myArray);
//    }
}