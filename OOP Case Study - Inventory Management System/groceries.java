public class groceries extends Product{

    public String expiration;
    private String nutritionalValue;

    @Override
    public String toString() {
        return "groceries{" + super.toString() +
                "expiration='" + expiration + '\'' +
                ", nutritionalValue='" + nutritionalValue + '\'' +
                '}';
    }

    public String getExpiration() {
        return expiration;
    }

    public void setExpiration(String expiration) {
        this.expiration = expiration;
    }

    public String getNutritionalValue() {
        return nutritionalValue;
    }

    public void setNutritionalValue(String nutritionalValue) {
        this.nutritionalValue = nutritionalValue;
    }

    public groceries(String name, int quantity, double tax, int id, String expiration, String nutritionalValue) {
        super(name, quantity, tax, id);
        this.expiration = expiration;
        this.nutritionalValue = nutritionalValue;
    }
}
