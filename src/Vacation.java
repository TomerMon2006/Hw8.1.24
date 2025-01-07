public class Vacation extends Residential {
    private int guests;

    public Vacation(String address, double area, double price, int parkingLots, int guests) {
        super(address, area, price, parkingLots);
        setGuests(guests);
    }

    public int getGuests() {
        return guests;
    }

    public void setGuests(int guests) {
        if (guests >= 1) {
            this.guests = guests;
        }
    }

    @Override
    public void taxIt() {
        double tax = price * 0.25;
        System.out.println("Tax for Vacation: " + tax);
    }

    @Override
    public String toString() {
        return "Vacation [Guests: " + guests + "] " + super.toString();
    }
}
