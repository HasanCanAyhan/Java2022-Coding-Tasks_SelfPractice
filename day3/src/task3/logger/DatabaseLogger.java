package task3.logger;

public class DatabaseLogger implements Logger {


    @Override
    public void log(String data) {
        System.out.println("Veritabanına loglandı : " + data);
    }
}