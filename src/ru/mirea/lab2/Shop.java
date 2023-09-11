package ru.mirea.lab2;

import java.util.Scanner;
import java.util.ArrayList;

public class Shop {
    private ArrayList<String> computers;

    public Shop() {
        computers = new ArrayList<>();
    }

    public void addComputer(String computer) {
        computers.add(computer);
    }

    public void removeComputer(String removeComp) {
        boolean foundC = false;
        for (String computer : computers) {
            if (computer.contains(removeComp)) {
                System.out.println("Removing " + computer);
                computers.remove(removeComp);
                System.out.println(computer + " successfully removed");
                foundC = true;

            }
        }
        if (!foundC) {
            System.out.println("Computer is not found");
        }
    }

    public void searchComputer(String searchTerm) {
        boolean found = false;
        for (String computer : computers) {
            if (computer.contains(searchTerm)){
                System.out.println("Found computer: " + computer);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Computer is not found");
        }
    }

    public static void main(String[] args) {
        int choise = 3;
        Shop computerShop = new Shop();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of computers: ");
        int numOfComp = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= numOfComp; i++) {
            System.out.print("Enter computer №" + i + ": ");
            String computer = sc.nextLine();
            computerShop.addComputer(computer);
        }
        while (choise != 0) {
            System.out.println("\nAvailable operations: \n" + "1. Remove\n" + "2. Search\n" + "To exit, enter 0");
            choise = sc.nextInt();
            if (choise == 1) {
                System.out.print("Enter the computer name to remove: ");
                String removeComp = sc.nextLine();
                computerShop.removeComputer(removeComp);
            }
            if (choise == 2) {
                System.out.print("Enter a search term: ");
                String searchTerm = sc.next();
                computerShop.searchComputer(searchTerm);
            }
        }
    }
}
