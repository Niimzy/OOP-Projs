public class Electronics extends Product{

    private String warranty;
    private double consumption;

    @Override
    public String toString() {
        return "Electronics{" + super.toString() +
                "warranty='" + warranty + '\'' +
                ", consumption=" + consumption +
                '}';
    }

    public Electronics(String name, int quantity, double tax, int id, double consumption, String warranty) {
        super(name, quantity, tax, id);
        this.consumption = consumption;
        this.warranty = warranty;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}
