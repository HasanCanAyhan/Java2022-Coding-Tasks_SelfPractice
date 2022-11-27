package task2.abstractDemo;

public class MySqlDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("Data returned : Mysql");
    }
}