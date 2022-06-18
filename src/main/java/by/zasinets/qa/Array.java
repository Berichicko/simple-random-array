package by.zasinets.qa;

public class Array {
    public static void main(String[] args) {
        int j = 0;
        int[] array = new int[100];
        for (int i = 0; i < array.length - 1; i++) {
            array[i] = (int) Math.round((Math.random() * 100) + 1);
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                j++;
            }
        }
        System.out.println(j);
    }
}
