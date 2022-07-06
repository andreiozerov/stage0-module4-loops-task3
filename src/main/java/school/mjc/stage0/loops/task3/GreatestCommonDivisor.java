package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        System.out.println(getGCD(first, second));
    }

    private int getGCD(int firstNumber, int secondNumber) {
        for (int i = firstNumber % secondNumber; i != 0; i = firstNumber % secondNumber) {
            firstNumber = secondNumber;
            secondNumber = i;
        }
        return secondNumber;
    }
}
