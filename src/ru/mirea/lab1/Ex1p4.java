package ru.mirea.lab1;

import java.util.Scanner;

public class Ex1p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int array_size = sc.nextInt();
        int[] array = new int[array_size];
        System.out.print("Enter the array elements(only integers): ");
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
        }
        int sum = 0;
        int j = 0;
        do {
            sum += array[j];
            j++;
        } while (j < array_size);
        System.out.print("Sum of array elements(do while): " + sum);
        sum = 0;
        j = 0;
        while (j < array_size) {
            sum += array[j];
            j++;
        }
        System.out.print("\nSum of array elements(while): " + sum);
        int max = array[0];
        int min = array[0];
        for (int k = 0; k < array_size; k++){
            if (array[k] > max) {
                max = array[k];
            }
            if (array[k] < min) {
                min = array[k];
            }
        }
        System.out.print("\nMaximum array element: " + max);
        System.out.print("\nMinimum array element: " + min);
    }
}
