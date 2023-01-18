import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        int Manu = o1.getManufacturer().compareTo(o2.getManufacturer());
        if (Manu != 0) {
            return Manu;
        } else {
            return (int)(o1.getManufactureDate().toEpochDay() - o2.getManufactureDate().toEpochDay());
        }
    }
}
