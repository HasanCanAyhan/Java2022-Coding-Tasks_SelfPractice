package lesson.oopWithNLayeredApp.dataAccess;

import lesson.oopWithNLayeredApp.entities.Product;

public class HibernateProductDao implements ProductDao{

    public void add(Product product){
        //only here db access codes  are written -->> SQL
        System.out.println("With Hibernate product is added to DB ");
    }

}
