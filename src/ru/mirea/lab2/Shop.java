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
    public void removeComputer(String computer) {
        computers.remove(computer);
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
        System.out.print("Enter a search term: ");
        String searchTerm = sc.nextLine();
        computerShop.searchComputer(searchTerm);

    }
}
