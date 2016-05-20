/**
 * Abstract class Climate defines the common fields (pressure, temperature, humidity)
 * and abstract method realized in subclasses (calculateTemperature())
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 20.05.16)
 */
public abstract class Climate implements Cloneable {
   private double pressure, temperature, humidity;

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }
public abstract double calculateTemperature();

    @Override
    public String toString() {
        return "Climate{" +
                "pressure=" + pressure +
                ", temperature=" + temperature +
                ", humidity=" + humidity +
                '}';
    }

    /**
     * the method provides cloning functions
     * @return Climate duplicate
     * @throws CloneNotSupportedException
     */
    @Override
    public Climate clone() throws CloneNotSupportedException {
        try {
            Climate climate = (Climate) super.clone();
            return climate;
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
            return null;
        }

    }
}
