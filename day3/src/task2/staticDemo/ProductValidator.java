package task2.staticDemo;

public class ProductValidator //Ana class static olamaz
{
    //statick block
    static {
        System.out.println("Static kullanımda çalışan blok1");
    }

    static {
        System.out.println("Static kullanımda çalışan blok2");
    }

    //constructor
    public ProductValidator() {
        System.out.println("Static kullanımda yapıcı block çalışmaz");
    }


    public static boolean isValid(Product product) {
        return (product.price > 0 && !product.name.isEmpty());
    }

    //innerClass
    public static class innerClass //Alt class'lar static olabilir
    {

    }
}