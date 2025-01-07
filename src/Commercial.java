public class Commercial extends Property {
    private boolean storeroom;
    private double yield;

    public Commercial(String address, double area, double price, boolean storeroom, double yield) {
        super(address, area, price);
        this.storeroom = storeroom;
        this.yield = yield;
    }

    public boolean hasStoreroom() {
        return storeroom;
    }

    public void setStoreroom(boolean storeroom) {
        this.storeroom = storeroom;
    }

    public double getYield() {
        return yield;
    }

    public void setYield(double yield) {
        if (yield >= 0) {
            this.yield = yield;
        }
    }

    public void printYield() {
        double monthlyProfit = (price * yield) / 100 / 12;
        System.out.println("Monthly Profit: " + monthlyProfit);
    }

    @Override
    public void taxIt() {
        double tax = price * 0.05;
        System.out.println("Tax for Commercial: " + tax);
    }

    @Override
    public String toString() {
        return "Commercial [Storeroom: " + storeroom + ", Yield: " + yield + "] " + super.toString();
    }
}
