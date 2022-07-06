package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int firstnumber = 0;
        int secondNumber = 1;
        int thirdNumber;
        System.out.println(firstnumber);
        if (lastFibonacci > 0) {
            System.out.println(secondNumber);
        }
        if (lastFibonacci > 1) {
            for (int i = 2; i < lastFibonacci; i++) {
                thirdNumber = firstnumber + secondNumber;
                System.out.println(thirdNumber);
                firstnumber = secondNumber;
                secondNumber = thirdNumber;
            }
        }
    }
}
