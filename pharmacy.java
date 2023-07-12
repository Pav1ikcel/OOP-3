import java.util.Objects;

public class Pharmacy implements Comparable<Pharmacy> {
    private String name;
    private int power;
    private String component;

    public Pharmacy(String name, int power, String component) {
        this.name = name;
        this.power = power;
        this.component = component;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public String getComponent() {
        return component;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy pharmacy = (Pharmacy) o;
        return power == pharmacy.power && Objects.equals(name, pharmacy.name) && Objects.equals(component, pharmacy.component);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, power, component);
    }

    @Override
    public int compareTo(Pharmacy other) {
        int powerComparison = Integer.compare(this.power, other.power);
        if (powerComparison != 0) {
            return powerComparison;
        } else {
            return this.component.compareTo(other.component);
        }
    }
}
