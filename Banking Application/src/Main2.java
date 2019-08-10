import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit, "Mumbai");
        addInOrder(placesToVisit, "Chennai");
        addInOrder(placesToVisit, "Kalyan");
        addInOrder(placesToVisit, "Kalyan");
        printList(placesToVisit);

        visit(placesToVisit);
    }

    public static void printList(LinkedList<String> linkedList) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        Iterator<String> i = linkedList.iterator();
        while(i.hasNext())
            System.out.println("Now Visiting " + i.next());
        System.out.println("=======================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while(stringListIterator.hasNext()) {
            int compare = stringListIterator.next().compareTo(newCity);
            if(compare == 0) {
                System.out.println(newCity + " is already included");
                return false;
            } else if(compare > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {

            }
        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingzForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.getFirst().isEmpty()) {
            System.out.println("No cities in the iternary");
            return;
        } else {
            System.out.println("Now Visiting " + listIterator.next());
            printMenu();
        }

        while(!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action) {
                case 0:
                    System.out.println("Holiday (Vacation) over");
                    quit = true;
                    break;
                case 1:
                    if(!goingzForward) {
                        if(listIterator.hasNext()) {
                            listIterator.next();
                        }
                        goingzForward = true;
                    }
                    if(listIterator.hasNext()) {
                        System.out.println("Now visiting " + listIterator.next());
                    } else {
                        System.out.println("Reached the end of the list");
                        goingzForward = false;
                    }
                    break;
                case 2:
                    if(goingzForward) {
                        if(listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        goingzForward = false;
                    }
                    if(listIterator.hasPrevious()) {
                        System.out.println("Now visiting " + listIterator.previous());
                    } else {
                        System.out.println("We are at the start of the list");
                        goingzForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;
            }

        }
    }

    private static void printMenu() {
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options");
    }
}