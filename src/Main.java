import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        RealEstateManager manager = new RealEstateManager("John Doe");
        ArrayList<Property> properties = DataManager.generateProperties();

        // הוספת נכסים למנהל המשרד
        for (Property p : properties) {
            manager.addProperty(p);
        }

        // דוגמה לדפיסת כל הנכסים
        for (Property p : manager.getPropertiesByPrice(500000)) {
            System.out.println(p);
        }
    }
}
