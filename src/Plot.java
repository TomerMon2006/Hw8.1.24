public class Plot extends Property {
    public enum Type {
        URBAN, AGRICULTURAL, INDUSTRIAL
    }

    private Type type;

    public Plot(String address, double area, double price, Type type) {
        super(address, area, price);
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void taxIt() {
        double tax = 0;
        switch (type) {
            case URBAN:
                tax = price * 0.1;
                break;
            case AGRICULTURAL:
                tax = price * 0.02;
                break;
            case INDUSTRIAL:
                tax = price * 0.05;
                break;
        }
        System.out.println("Tax for Plot: " + tax);
    }

    @Override
    public String toString() {
        return "Plot [Type: " + type + "] " + super.toString();
    }
}
