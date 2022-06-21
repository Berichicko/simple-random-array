package by.zasinets.qa;

public class Numbers implements Numerical {
    Generator generator = new Generator();
    int[] fullArray = generator.generateNumbers();
    private int positiveOddNumbers;

    @Override
    public int findNumbers() {
        for (int i = 0; i < fullArray.length; i++) {
            if ((fullArray[i] % 2 != 0) && fullArray[i] > 0) {
                positiveOddNumbers++;
            }
        }
        return positiveOddNumbers;
    }
}
