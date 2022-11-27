package task2.methods2;

public class Main {


    public static void main(String[] args) {
        //String mesaj = "Bugün hava çok güzel";
        String str = findCity();
        System.out.println(str);

        int total = sum(5,7);
        System.out.println(total);

        int total1 = sum2(2,3,4,5,6,7,8);
        System.out.println(total1);

    }

    public static void save() {
        System.out.println("saved");
    }

    public static void delete() {
        System.out.println("deleted");
    }

    public static void update() {
        System.out.println("updated");
    }

    public static int sum(int sayi1,int sayi2) {
        return sayi1+sayi2;
    }

    public static int sum2(int... sayilar) {
        int toplam = 0;
        for(int sayi:sayilar) {
            toplam += sayi;
        }

        return toplam;
    }

    public static String findCity() {
        return "Samsun";
    }

}
