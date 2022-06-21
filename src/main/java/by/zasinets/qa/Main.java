package by.zasinets.qa;

public class Main {
    public static void main(String[] args) {
        Numbers numbers = new Numbers();
        for ( Integer positiveNumbers : numbers.fullArray  ) {
            System.out.println("Число в этом массиве = " + positiveNumbers);
        }
        System.out.println("Количество положительных нечетных чисел в этом массиве = " + numbers.findNumbers());
    }
}
