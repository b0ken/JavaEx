package ru.mirea.lab2;

import java.lang.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author b0ken = new Author("Artemii Bozhko", "ambozhko@ya.ru", 'M');
        System.out.println("Author is " + b0ken.getName());
        System.out.println("My email is " + b0ken.getEmail());
        System.out.println("My gender is " + b0ken.getGender());
    }
}
