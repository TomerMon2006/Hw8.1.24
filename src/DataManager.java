import java.util.ArrayList;

public class DataManager {
    public static ArrayList<Property> generateProperties() {
        ArrayList<Property> properties = new ArrayList<>();
        properties.add(new Plot("Tel Aviv, Frishman 12", 200, 500000, Plot.Type.URBAN));
        properties.add(new Plot("Ramat Gan, Bialik 23", 150, 350000, Plot.Type.AGRICULTURAL));
        properties.add(new Apartment("Haifa, Ben Gurion 1", 80, 450000, 2, 3));
        properties.add(new Villa("Eilat, Shderot HaTamar 8", 300, 1000000, 3, 2));
        properties.add(new Vacation("Dead Sea, Ein Bokek 5", 50, 250000, 1, 4));
        properties.add(new Commercial("Jerusalem, King David 10", 500, 2500000, true, 8));
        properties.add(new Office("Herzliya, Sokolov 11", 120, 1000000));
        return properties;
    }
}
