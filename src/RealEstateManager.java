import java.util.ArrayList;

public class RealEstateManager {
    private String name;
    private ArrayList<Property> properties;

    public RealEstateManager(String name) {
        this.name = name;
        this.properties = new ArrayList<>();
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public ArrayList<Property> getPropertiesByPrice(double price) {
        ArrayList<Property> result = new ArrayList<>();
        for (Property p : properties) {
            if (p.getPrice() <= price) {
                result.add(p);
            }
        }
        return result;
    }

    public double totalValue() {
        double total = 0;
        for (Property p : properties) {
            total += p.getPrice();
        }
        return total;
    }
}
