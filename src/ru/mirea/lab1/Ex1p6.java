package ru.mirea.lab1;

/*Написать программу, в результате работы которой выводятся на экран
первые 10 чисел гармонического ряда (форматировать вывод).*/

public class Ex1p6 {
    public static void main(String[] args) {
        System.out.print("The first 10 numbers of the harmonic series are: ");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%.2f%n", 1.0 / i);
        }
    }
}
