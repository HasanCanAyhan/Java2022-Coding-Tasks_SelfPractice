package task2.abstractClasses;

public abstract class GameCalculator {
    public abstract void calculate();

    public final void gameOver() //Not Overriding bcs it is final
    {
        System.out.println("Game  Over!");
    }
}