package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power>=0)System.out.println(1);
        else {
            System.out.println("too much power");
            return;
        }
        int powerRout =1;
        for (int i = 1; i <= power; i++) {
            System.out.println(powerRout<<=1);
        }

    }
}
