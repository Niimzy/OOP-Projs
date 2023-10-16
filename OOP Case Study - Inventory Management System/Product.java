import java.util.ArrayList;

public class Product {
    private String name;
    private int quantity;
    private double tax;
    private int id;

    int size = 1;
    Product[] Products = new Product[size];


    public Product(String name, int quantity, double tax, int id) {
        this.name = name;
        this.quantity = quantity;
        this.tax = tax;
        this.id = id;
    }

    public void addProduct(Product p){

        for (int i = 0; i < Products.length; i++)
        {
            if (Products[i] == null){
                Products[i] = p;
                System.out.println(size);
                size++;
            }
        }

    }

    public void showProducts(){
        for (int i = 0; i < Products.length; i++){
            if (Products[i] != null){
                System.out.println(Products[i]);
            }
        }
    }

    public void findProductById(int id){

        for (int i = 0; i < Products.length; i++){
            if(id == Products[i].getId()){
                System.out.println("Product found: " + Products[i] );
            }
            else{
                System.out.println("Product not found");
            }
        }

    }

    public void findProductByName(String name){

        for (int i = 0; i < Products.length; i++){
            if(name == Products[i].getName()){
                System.out.println("Product found: " + Products[i] );
            }
            else{
                System.out.println("Product not found");
            }
        }

    }

    public void removeProduct(int id){

        for (int i = 0; i < Products.length; i++){
            if(id == Products[i].getId()){
                Products[i] = null;
            }
            else{
                System.out.println("Product not found");
            }
        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", tax=" + tax +
                ", id=" + id +
                '}';
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
