package by.zasinets.qa;

public class Generator implements Random {
    Array array = new Array();
    int[] newArray = array.createArray();

    @Override
    public int[] generateNumbers() {
        int a = -1;
        int b = 10;
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = a + (int) (Math.random() * b);
        }
        return newArray;
    }
}
