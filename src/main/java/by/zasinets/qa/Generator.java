package by.zasinets.qa;

public class Generator implements Random {
    Array array = new Array();
    int[] newArray = array.createArray();

    @Override
    public int[] generateNumbers() {
        for (int i = 0; i < newArray.length; i++) {
        newArray[i] = (int) (Math.random() * 200 - 100);
        }
        return newArray;
    }
}
