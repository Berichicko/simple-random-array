package by.zasinets.qa;

import java.util.Scanner;

public class Array implements Multiplicity {

    @Override
    public int[] createArray() {
        System.out.println("Введите размер массива: ");
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            System.out.println("Введено некорректное значение! Попробуйте еще раз!");
            scanner.nextInt();
        }
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        return myArray;
    }
}
