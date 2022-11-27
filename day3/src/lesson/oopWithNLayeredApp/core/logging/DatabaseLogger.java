package lesson.oopWithNLayeredApp.core.logging;

public class DatabaseLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("It is logged to DB : " + data);
    }
}
