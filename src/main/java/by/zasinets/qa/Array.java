package by.zasinets.qa;

import java.util.Scanner;

public class Array implements Multiplicity {

    @Override
    public int[] createArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        return myArray;
    }
}
