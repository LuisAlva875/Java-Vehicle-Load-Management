package version2;

/**
 *
 * @author Luis Alva
 */
public class Vehicle {

    public double load;
    public double maxLoad;
    public double addBox;

    public Vehicle(double kilos) {
        maxLoad = kilos;
        load = kilos;
        addBox = kilos;
    }

    public double getLoad() {
        return load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }

    public boolean addBox(double extraLoad) {
        addBox = extraLoad;
        return true;
    }
}