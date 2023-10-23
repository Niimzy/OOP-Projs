public class Electronics extends Product{

    private String warranty;
    private String consumption;

    @Override
    public String toString() {
        return super.toString() +
                ", warranty='" + warranty +
                ", consumption=" + consumption;
    }

    public Electronics(String name, double price, int quantity, double tax, int id, String consumption, String warranty) {
        super(name,price, quantity, tax, id);
        this.consumption = consumption;
        this.warranty = warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getConsumption() {
        return consumption;
    }

    public void setConsumption(String consumption) {
        this.consumption = consumption;
    }
}
