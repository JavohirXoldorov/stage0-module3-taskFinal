package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int newNumber = 0, k = 0;
        while (number > 0) {
            int r = number % 10;
            newNumber *= 10;
            newNumber += r;
            number /= 10;
        }
        number = newNumber;
        System.out.println(number);
    }
}
