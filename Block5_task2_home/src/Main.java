/**
 *
 * @author Pidhurska Tetiana
 * @version 1 (created on 20.05.16)
 */
public class Main {
    public static void main(String[] args) {

        Outside out1 = new Outside(720, 20, 30, Direction.E, 5, 15.0, 12.6);
        Outside out2 = out1.clone();
        //two objects are equal but have different references
        System.out.println(out1 == out2);
        System.out.println(out1.equals(out2));
        System.out.println(out1.hashCode());
        System.out.println(out2.hashCode());
        System.out.println(out1.hashCode() == out2.hashCode());
        System.out.println(out1);
        System.out.println(out2);

        System.out.println("==============================");
        //two objects are independent from each other
        out1.getWind().setDirection(Direction.N);
        out1.setTemperature(0);
        System.out.println(out1 == out2);
        System.out.println(out1.equals(out2));
        System.out.println(out1.hashCode());
        System.out.println(out2.hashCode());
        System.out.println(out1.hashCode() == out2.hashCode());
        System.out.println(out1);
        System.out.println(out2);
        System.out.println("==============================");

        //polymorphism features': by using the different names of references the same method with different
        // functionalities can be involved depending on the realized subclass
        Climate out = new Outside(890, 1, 20, Direction.NE, 25, 15.0, 23);
        Climate in = new InsideBuilding(1, 890, 20, 25);
        out.calculateTemperature();
        in.calculateTemperature();
        //in.calculateRoomIllumination() // this method is not defined in base class, thus it can not be implemented directly,
        // although it is realized in subclass. the type cast is required
        InsideBuilding insideBuilding = (InsideBuilding) in;
        in.calculateTemperature();// after the type cast  the method of subclass can be implemented
        System.out.println("==============================");
        Climate[] climateArray = {out, in, new InsideBuilding(9, 700, 10, 10)};
        for (Climate elements : climateArray) {
            if (elements instanceof InsideBuilding) {
                InsideBuilding inside = (InsideBuilding) elements;
                inside.calculateRoomIllumination();// after the type cast  the method of subclass can be implemented
            }
        }

    }
}
