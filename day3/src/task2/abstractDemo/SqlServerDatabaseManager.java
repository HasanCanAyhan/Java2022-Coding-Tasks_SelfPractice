package task2.abstractDemo;

public class SqlServerDatabaseManager extends BaseDatabaseManager {
    @Override
    public void getData() {
        System.out.println("Data returned : SqlServer");
    }
}