package task2.interfaces;

public class MysqlCustomerDal implements ICustomerDal, IRepository {

    @Override
    public void add() {
        System.out.println("with MySql is added ");
    }

}