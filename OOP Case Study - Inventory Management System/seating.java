public class seating extends furniture{

    private String loadCapacity;

    public String getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public String toString() {
        return   super.toString() +
                ", loadCapacity= " + loadCapacity
                ;
    }

    public void setLoadCapacity(String loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public seating(String name,double price, int quantity, double tax, int id, String material, String dimensions, String loadCapacity) {
        super(name,price, quantity, tax,id, material, dimensions);
        this.loadCapacity = loadCapacity;
    }
}
