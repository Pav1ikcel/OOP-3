import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Pharmacy> result = new HashSet<>();

        Pharmacy pharmacy1 = new Pharmacy("Medicine A", 10, "Component A");
        Pharmacy pharmacy2 = new Pharmacy("Medicine B", 20, "Component B");
        Pharmacy pharmacy3 = new Pharmacy("Medicine A", 10, "Component A");
        Pharmacy pharmacy4 = new Pharmacy("Medicine B", 30, "Component B");

        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        result.add(pharmacy4);

        System.out.println(result.size()); // Output: 3, так как pharmacy1 и pharmacy3 равны по содержимому

        for (Pharmacy pharmacy : result) {
            System.out.println(pharmacy.getName() + " - " + pharmacy.getPower() + " - " + pharmacy.getComponent());
        }
    }
}
