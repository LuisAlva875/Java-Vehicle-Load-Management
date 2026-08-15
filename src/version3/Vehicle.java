package version3;

/**
 *
 * @author Luis Alva
 */
public class Vehicle {

    public double load;
    public double maxLoad;
    public double addBox;

    public Vehicle(double maxLoad) {
        this.maxLoad = KilosToNewtons(maxLoad);
    }

    public double getLoad() {
        return NewtonsToKilos(load);
    }

    public double getMaxLoad() {
        return NewtonsToKilos(maxLoad);
    }

    public boolean addBox(double extraLoad) {
        if (load + KilosToNewtons(extraLoad) <= maxLoad) {
            load += KilosToNewtons(extraLoad);
            return true;
        } else {
            return false;
        }
    }

    private double KilosToNewtons(double kilos) {
        double peso = kilos * 9.81;
        return peso;
    }

    private double NewtonsToKilos(double newtons) {
        double kilos = newtons / 9.81;
        return kilos;
    }
}