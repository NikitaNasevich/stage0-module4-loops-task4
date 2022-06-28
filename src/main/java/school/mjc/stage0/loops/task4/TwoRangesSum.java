package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < numberToSkip) {
            System.out.println("number to skip is bugger then the last");
            return;
        }

        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
            return;
        }
        int skippedSum = 0;
        int counted = 0;
        for (int i = 1; i <= lastInRow; i++) {
            counted += i;
            if (i == numberToSkip) {
                skippedSum = counted;
            }
        }

        System.out.printf("skipped sum is %d\n", skippedSum);
        System.out.printf("counted sum is %d\n", (counted - skippedSum));
    }
}
