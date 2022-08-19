package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else if (numberToSkip == lastInRow) {
            int counter = 1;
            int sum = 0;
            do {
                sum = sum + counter;
                counter++;
            } while (counter <= lastInRow);
            System.out.println("skipped sum is " + sum);
            System.out.println("counted sum is 0");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else {
            int counter = 1;
            int sum = 0;
            do {
                sum = sum + counter;
                counter++;
            } while (counter <= lastInRow - numberToSkip);
            System.out.println("skipped sum is " + sum);
            int counter2 = numberToSkip + 1;
            int sum2 = 0;
            do {
                sum2 = sum2 + counter2;
                counter2++;
            } while (counter2 <= lastInRow);
            System.out.println("counted sum is " + sum2);
        }
    }
}