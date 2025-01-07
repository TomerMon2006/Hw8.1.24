public class Villa extends Residential {
    private int levels;

    public Villa(String address, double area, double price, int parkingLots, int levels) {
        super(address, area, price, parkingLots);
        setLevels(levels);
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        if (levels >= 1) {
            this.levels = levels;
        }
    }

    @Override
    public void taxIt() {
        double tax = price * 0.08;
        System.out.println("Tax for Villa: " + tax);
    }

    @Override
    public String toString() {
        return "Villa [Levels: " + levels + "] " + super.toString();
    }
}
