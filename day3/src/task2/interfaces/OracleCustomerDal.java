package task2.interfaces;

public class OracleCustomerDal implements ICustomerDal {

    @Override
    public void add() {
        System.out.println("With Oracle is added");
    }
}