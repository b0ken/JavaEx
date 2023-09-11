package ru.mirea.lab1;

import java.util.Scanner;

/*Написать программу, в результате которой массив чисел создается с
помощью инициализации (как в Си) вводится и считается в цикле сумма
элементов целочисленного массива, а также среднее арифметическое его
элементов результат выводится на экран. Использовать цикл for.*/

public class Ex1p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int array_size = sc.nextInt();
        int[] array = new int[array_size];
        int sum = 0;
        System.out.print("Enter the array elements(only integers): ");
        for (int i = 0; i < array_size; i++) {
            array[i] = sc.nextInt();
            sum += array[i];
        }
        System.out.print("Sum of array elements: " + sum);
        System.out.print("\nAverage of array elements: " + (double) sum / array_size);
    }

}

