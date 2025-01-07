import java.util.ArrayList;

public abstract class Property {
    protected String address;
    protected double area;
    protected double price;

    // ברירת מחדל: כתובת "Na, na", שטח 0, מחיר 0
    public Property(String address, double area, double price) {
        setAddress(address);
        setArea(area);
        setPrice(price);
    }

    // getters
    public String getAddress() {
        return address;
    }

    public double getArea() {
        return area;
    }

    public double getPrice() {
        return price;
    }

    // setters
    public void setAddress(String address) {
        if (address == null || address.trim().isEmpty() || !address.contains(" ")) {
            this.address = "Na, na";
        } else {
            this.address = address;
        }
    }

    public void setArea(double area) {
        if (area >= 0) {
            this.area = area;
        }
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        }
    }

    // toString
    public String toString() {
        return "Address: " + address + ", Area: " + area + " sqm, Price: " + price + " NIS";
    }

    // פונקציה אבסטרקטית
    public abstract void taxIt();
}
