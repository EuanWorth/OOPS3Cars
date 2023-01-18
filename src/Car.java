import java.time.LocalDate;
import java.util.Date;

public class Car implements Comparable<Car> {
    private String manufacturer;
    private LocalDate manufactureDate;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public int getAge() {
        LocalDate now = LocalDate.now();
        if (now.getDayOfYear() < manufactureDate.getDayOfYear()) {
            return now.getYear() - manufactureDate.getDayOfYear() - 1;
        }
        return now.getYear() - manufactureDate.getDayOfYear();
    }

    public Car(String manufacturer, LocalDate manufactureDate) {
        this.manufacturer = manufacturer;
        this.manufactureDate = manufactureDate;
    }

    public int compareTo(Car o) {
        return this.manufacturer.compareToIgnoreCase(o.manufacturer);
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", manufactureDate=" + manufactureDate +
                '}';
    }
}
