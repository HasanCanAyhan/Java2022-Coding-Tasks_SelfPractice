package task2.abstractDemo;

public class OracleDatabaseManager extends BaseDatabaseManager {

    @Override
    public void getData() {
        System.out.println("Data returned : Oracle");
    }

}