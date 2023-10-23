import java.util.Scanner;

public class Demo {


    public static void main(String[] args) {

        Product.setArraysize(10);
        Product mobile = new smartphones("Huawei Y9", 250, 2, 2.3, 11, "40watts", "2 years", "Android", "128gb", "10MP");
        mobile.addProduct();
        Product groceries = new groceries("Coca Cola", 60, 2, 1.5, 12, "12/04/2024","10 Calories");
        groceries.addProduct();
        Product laptop = new Laptop("Dell Latitude", 140.99, 2, 13.6, 13, "80 watts", "1 year", "Intel i5 - 9th gen", "16gb", "1920 X 1080");
        laptop.addProduct();
        Product table = new tables("Dining table", 15.99, 2,0,19,"Wooden", "100 X 100 cm","Round");
        table.addProduct();

        Product.showProducts();
        laptop.addProduct();
        laptop.updateQuantity(4);
        groceries.removeProduct(1);
        Product.showProducts();
        Product.stockLevels();

        System.out.println();






























    }




}

