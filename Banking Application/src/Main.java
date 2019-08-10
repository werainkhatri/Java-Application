import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Bank bank = new Bank("Saraswat");

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printOptions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printOptions();
                    break;
                case 1:
                    addBranch();
                    break;
                case 2:
                    addCustomer();
                    break;
                case 3:
                    MakeTransaction();
                    break;
                case 4:
                    printCustomerList();
                    break;
                case 5:
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
        System.out.println("\t 1 - To Add Branch.");
        System.out.println("\t 2 - To add a customer.");
        System.out.println("\t 3 - To Make a Transaction.");
        System.out.println("\t 4 - To Print Customer List");
//        System.out.println("\t 5 - To Find Customer Name.");
//        System.out.println("\t 6 - To remove a contact by Name.");
//        System.out.println("\t 7 - To remove a contact by Number.");
//        System.out.println("\t 8 - To search for a contact by Name.");
//        System.out.println("\t 9 - To search for a contact by Number.");
        System.out.println("\t 5 - To quit the application.");
    }

    public static void addBranch() {
        System.out.print("Enter Branch Name: ");
        String name = scanner.nextLine();
        bank.addBranch(name);
    }

    public static void addCustomer() {
        System.out.print("Enter Branch Name: ");
        String branch = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Initial Transaction Amount: ");
        double trans = scanner.nextDouble();
        scanner.nextLine();
        bank.addCustomer(branch, name, trans);
    }

    public static void MakeTransaction() {
        System.out.print("Enter Branch Name: ");
        String branch = scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Transaction Amount: ");
        double trans = scanner.nextDouble();
        scanner.nextLine();
        bank.makeTrans(branch, name, trans);
    }

    public static void printCustomerList() {
        System.out.print("Enter Branch Name: ");
        String branch = scanner.nextLine();
        bank.printCustomerList(branch);
        System.out.println("Do you wish to print transaction list for a customer in this branch?" +
                "\nEnter 0 for NO and 1 for YES: ");
        int i = scanner.nextInt();
        scanner.nextLine();
        if(i == 1) {
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();
            //bank.printCustomerTransList(branch, name);
        }
        else if(i == 0)
            System.out.println("You Entered NO! Thank You.");
        else {
            System.out.println("Incorrect Input! Try Again.");
            printCustomerList();
        }
    }
}