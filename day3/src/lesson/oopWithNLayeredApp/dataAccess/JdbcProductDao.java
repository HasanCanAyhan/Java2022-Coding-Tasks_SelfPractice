package lesson.oopWithNLayeredApp.dataAccess;

import lesson.oopWithNLayeredApp.entities.Product;

public class JdbcProductDao implements ProductDao{

    public void add(Product product){
        //only here db access codes  are written -->> SQL
        System.out.println("With JDBC product is added to DB ");
    }


}
