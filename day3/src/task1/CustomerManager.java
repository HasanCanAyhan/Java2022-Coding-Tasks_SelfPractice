package task1;

public class CustomerManager {
    private Customer customer;
    private CreditService creditService;

    public CustomerManager(Customer customer,CreditService creditService) {
        this.customer = customer;
        this.creditService = creditService;
    }

    public void save(){
        System.out.println("Customer saved " );
    }
    public void delete(){
        System.out.println("Customer deleted " );
    }

    public void giveCredit(){
        creditService.calculate(); // when we say -> new TeacherCreditManager(); Then it will be printed "Teacher Kredi saved"
        System.out.println("Kredi is given");

    }
}