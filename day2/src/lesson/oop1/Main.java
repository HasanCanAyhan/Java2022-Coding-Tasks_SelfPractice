package lesson.oop1;

public class Main {

    public static void main(String[] args) {

        //day2 :https://youtu.be/2Vx_Z-5Dr4I  : OOP // 05.11.22


        Product product1 = new Product();
        //                set value
        //product1.name = "Delonghi Caffee M";
        product1.setName("Delonghi Caffee M");
        //product1.unitPrice = 7500;
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("delonghi.jpg");

        //                   get value
        //System.out.println(product1.name);

        //p1 has name,unitPrice,discount,unitInStock....

        Product product2 = new Product();
        product2.setName("Smeg Caffee M");
        product2.setUnitPrice( 6500 );
        product2.setDiscount(8);
        product2.setUnitsInStock(23);
        product2.setImageUrl("delonghi.jpg");


        Product product3 = new Product();
        product3.setName("Kitchen Aid Caffee M");
        product3.setUnitPrice(4500);
        product3.setDiscount(9);
        product3.setUnitsInStock(2);
        product3.setImageUrl("delonghi.jpg");


        Product[] products = {product1,product2,product3};

        System.out.println("<ul>");
        for (Product product : products) {
            System.out.println( "<li>" + product.getName() + " : " + product.getUnitPrice() + "</li>");
        }
        System.out.println("</ul>");  // in line 41-45 we return html file , so that we can see them in the web page


        System.out.println("-----------------------------------------------------------");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setPhone("05354565656565");
        individualCustomer.setCustomerNumber("123");
        individualCustomer.setFirstName("Can");
        individualCustomer.setLastName("Ayhan");


        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("0545556566566");
        corporateCustomer.setTaxNumber("111111111111111111");
        corporateCustomer.setCustomerNumber("54321");


        Customer[] customers = {individualCustomer,corporateCustomer};



    }



}
