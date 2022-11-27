package task2.polymorphismDemo;

public class Main {

    public static void main(String[] args) {
        //baselog childs
        BaseLogger[] loggers = {
                        new EmailLogger(),
                        new FileLogger(),
                        new DatabaseLogger(),
                        new ConsoleLogger()
                };

        //loggers each
        for (BaseLogger eachLog : loggers) {
            eachLog.log("Log Message");
        }

        //customerManager logger
        CustomerManager customerManager = new CustomerManager(new EmailLogger());
        customerManager.add();
    }

}