package school.mjc.stage0.loops.task3;

public class AlphabetPrinter {
    private static final int RANGE_START = 97;
    private static final int END_OF_RANGE = 123;

    public void printAlphabet() {
        for (int i = RANGE_START; i < END_OF_RANGE; i++) {
            System.out.println((char) i);
        }
    }
}
