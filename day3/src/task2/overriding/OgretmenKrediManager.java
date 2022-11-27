package task2.overriding;

public class OgretmenKrediManager extends BaseKrediManager {


    public double calculate(double amount) {
        return amount * 1.28;
    }
}