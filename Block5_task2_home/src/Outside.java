import java.util.ArrayList;

/**
 * subclass Outside  provides the qualitive description of outer climate
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 20.05.16)
 */
public class Outside extends Climate {
    /**
     * 3 fields are defined, defining the state outside
     */
    private Wind wind;
    private double cloudage;
    private double precipitation;

    /**
     * defines the constructor with a set of characteristics of microclimate outside a building
     * @param pressure
     * @param temperature
     * @param humidity
     * @param direction
     * @param speed
     * @param cloudage
     * @param precipitation
     */
    public Outside(double pressure, double temperature, double humidity,Direction direction, double speed, double cloudage, double precipitation) {
        setPressure(pressure);
        setTemperature(temperature);
        setHumidity(humidity);
        this.wind = new Wind(speed, direction);
        this.cloudage = cloudage;
        this.precipitation = precipitation;
    }

    public void setAllparameters(Wind wind, double cloudage, double precipitation) {

        this.wind = wind;
        this.cloudage = cloudage;
        this.precipitation = precipitation;
    }

    public Wind getWind() {
        return wind;
    }

    public void setWind(Wind wind) {
        this.wind = wind;
    }

    public double getCloudage() {
        return cloudage;
    }

    public void setCloudage(double cloudage) {
        this.cloudage = cloudage;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public void setPrecipitation(double precipitation) {
        this.precipitation = precipitation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;


        Outside outside = (Outside) o;
        if (Double.compare(outside.getPressure(), getPressure()) != 0) return false;
        if (Double.compare(outside.getTemperature(), getTemperature()) != 0) return false;
        if (Double.compare(outside.getHumidity(), getHumidity()) != 0) return false;
        if (!outside.getWind().equals(this.getWind())) return false;

        if (Double.compare(outside.getCloudage(), getCloudage()) != 0) return false;
        if (Double.compare(outside.getPrecipitation(), getPrecipitation()) != 0) return false;
        return true;


    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = getWind().hashCode();
        temp = Double.doubleToLongBits(getPressure());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getTemperature());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHumidity());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCloudage());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getPrecipitation());
        result = 31 * result + (int) (temp ^ (temp >>> 32));

        return result;
    }

    /**
     * the deep cloning is provided
     * @return Outside clone
     */
    @Override
    public Outside clone() {
        try {
            Outside out = (Outside) super.clone();
            out.wind = (Wind) wind.clone();
            return out;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }

    }

    /**
     * the temperature outside is calculated accounting for some coefficient
     * @return double
     */
    @Override
    public double calculateTemperature() {
        return 1.1*getTemperature();
    }

    @Override
    public String toString() {
        return "Outside{" +
                "wind=" + wind +
                ", cloudage=" + cloudage +
                ", precipitation=" + precipitation +super.toString()+
                '}';
    }
}
