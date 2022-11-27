package task2.abstractDemo;

public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlDatabaseManager()); // or you can say new SqlServerDatabaseManager
        customerManager.getCustomers();
    }

}