/**
 * class Wind provides the additional characteristics of the outer climate like velocity and direction of the wind
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 20.05.16)
 */
public class Wind implements Cloneable{

    private double velocity;
    private Direction direction;

    public Wind(double velocity, Direction direction) {
        this.velocity = velocity;
        this.direction = direction;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

         Wind wind = (Wind) o;

        if (Double.compare(wind.getVelocity(), getVelocity()) != 0) return false;
        return getDirection() == wind.getDirection();

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getVelocity());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getDirection().hashCode();
        return result;
    }

    /**
     * the deep cloning is provided
     * @return Wind clone
     */

    @Override
    public Wind clone(){
        try {
            Wind wind= (Wind) super.clone();
            return wind;
        } catch (CloneNotSupportedException ex){
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public String toString() {
        return "Wind{" +
                "velocity=" + velocity +
                ", direction=" + direction +
                '}';
    }
}
