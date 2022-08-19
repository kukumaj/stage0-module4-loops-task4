package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {

        int counter = 0;
        do {
            if (counter % 3 == 0) {
                counter++;
                continue;
            } else {
                System.out.println(counter);
            }
            counter++;
        } while (counter <= lastPrinted);
    }
}

