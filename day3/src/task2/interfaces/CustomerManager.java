package task2.interfaces;

public class CustomerManager {
    private ICustomerDal customerdal;

    public CustomerManager(ICustomerDal customerdal) {
        this.customerdal = customerdal;
    }

    public void add() {

        customerdal.add();
    }
}