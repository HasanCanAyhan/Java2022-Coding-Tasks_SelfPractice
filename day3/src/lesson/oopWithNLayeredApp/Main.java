package lesson.oopWithNLayeredApp;

import lesson.oopWithNLayeredApp.business.ProductManager;
import lesson.oopWithNLayeredApp.core.logging.DatabaseLogger;
import lesson.oopWithNLayeredApp.core.logging.FileLogger;
import lesson.oopWithNLayeredApp.core.logging.Logger;
import lesson.oopWithNLayeredApp.core.logging.MailLogger;
import lesson.oopWithNLayeredApp.dataAccess.HibernateProductDao;
import lesson.oopWithNLayeredApp.dataAccess.JdbcProductDao;
import lesson.oopWithNLayeredApp.entities.Product;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {


        Product product1 = new Product(1,"IPHONE Xr",10000);

        List<Logger> loggers = Arrays.asList(new DatabaseLogger(),new FileLogger(), new MailLogger());

        ProductManager productManager = new ProductManager(new HibernateProductDao(),loggers); //new JdbcProductDao()
        productManager.add(product1);




    }

}
