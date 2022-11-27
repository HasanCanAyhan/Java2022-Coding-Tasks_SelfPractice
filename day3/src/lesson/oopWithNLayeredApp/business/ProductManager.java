package lesson.oopWithNLayeredApp.business;

import lesson.oopWithNLayeredApp.core.logging.Logger;
import lesson.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import lesson.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import lesson.oopWithNLayeredApp.dataAccess.ProductDao;
import lesson.oopWithNLayeredApp.entities.Product;

import java.util.List;

public class ProductManager { // ProductService

    //Dependency Injection
    private ProductDao productDao; // Jdbc or Hibernate
    private List<Logger> loggers;

    public ProductManager(ProductDao productDao, List<Logger> loggers) {
        this.productDao = productDao;
        this.loggers = loggers;
    }

    public void add(Product product) throws Exception {
        //business logic/rules
        if(product.getUnitPrice() < 10){
            throw new Exception("Unit Price is not less then 10");
        }

        /*
        JdbcProductDao productDao = new JdbcProductDao();
        productDao.add(product);
         */

        /*
        HibernateProductDao productDao = new HibernateProductDao();
        productDao.add(product);
         */

        /*
        ProductDao productDao = new JdbcProductDao();
        productDao.add(product);
         */

        productDao.add(product); // loosely coupled : only depend on Interface

        for (Logger logger : loggers) { // {db, mail, file}
            logger.log(product.getName());
        }




    }



}
