package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int i = 0;
        while (i <= printTillInclusive) {
            System.out.println(i);
            i+=2;
        }
    }
}
