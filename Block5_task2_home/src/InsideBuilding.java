/**
 * subclass InsideBuilding  provides the qualitive description of microclimate inside a building
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 20.05.16)
 */
public class InsideBuilding extends Climate {

    private double outerTemperature;

    /**
     * defines the constructor with a set of characteristics of microclimate inside a building
     * @param outerTemperature
     * @param pressure
     * @param innerTemperature
     * @param humidity
     */
    public InsideBuilding(double outerTemperature, double pressure, double innerTemperature, double humidity) {
        this.outerTemperature = outerTemperature;
        setPressure(pressure);
        setTemperature(innerTemperature);
        setHumidity(humidity);
    }

    @Override
    public String toString() {
        return "InsideBuilding{}" + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    /**
     * provides the deep cloning
     * @return InsideBuilding clone
     */
    @Override
    public InsideBuilding clone() {
        try {
            InsideBuilding in = (InsideBuilding) super.clone();
            return in;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    /**
     * calculates the temperarure inside the building with some coefficient
     * @return double temperature
     */
    @Override
    public double calculateTemperature() {
        return (getTemperature()*.95);
    }


    public void calculateRoomIllumination(){
        System.out.println("The room illumination has been calculated!");
    }
}
