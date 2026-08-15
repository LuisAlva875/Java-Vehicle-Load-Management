package version1;

/**
 *
 * @author Luis Alva
 */
public class Vehicle {

    public double load;
    public double maxLoad;

    public Vehicle(double kilos) {
        maxLoad = kilos;
    }

    public double getLoad() {
        return load;
    }

    public double getMaxLoad() {
        return maxLoad;
    }
}