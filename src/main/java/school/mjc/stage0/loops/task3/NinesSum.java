package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        int term = 0;
        int sum = 0;
        for (int i = 1; i - 1 < lengthOfLastNumber; i++) {
            term = term * 10 + 9;
            sum = sum + term;
        }
        System.out.println(sum);
    }
}
