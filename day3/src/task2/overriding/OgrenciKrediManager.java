package task2.overriding;

public class OgrenciKrediManager extends BaseKrediManager {

    public double calculate(double amount) {
        return amount * 1.10;
    }
}