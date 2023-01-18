import java.util.Collection;
import java.util.TreeSet;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Collection<Car> CarClassUser1CarCollection = new TreeSet<>(new CarComparator());
        CarClassUser1CarCollection.add(new Car("Ferrari",LocalDate.ofYearDay(1965,165)));
        CarClassUser1CarCollection.add(new Car("Porsche",LocalDate.ofYearDay(2019,242)));
        CarClassUser1CarCollection.add(new Car("Lamborghini",LocalDate.ofYearDay(2021,311)));
        CarClassUser1CarCollection.add(new Car("Mclaren",LocalDate.ofYearDay(1999,87)));
        CarClassUser1CarCollection.add(new Car("Bugatti",LocalDate.ofYearDay(2020,134)));
        CarClassUser1CarCollection.add(new Car("Audi",LocalDate.ofYearDay(2022,254)));
        CarClassUser1CarCollection.add(new Car("Zamboni",LocalDate.ofYearDay(1987,143)));
        Collection<Car> CarClassUser2CarCollection = new TreeSet<>(new CarComparator());
        CarClassUser2CarCollection.add(new Car("Reliant",LocalDate.ofYearDay(1973,43)));
        CarClassUser2CarCollection.add(new Car("Reliant",LocalDate.ofYearDay(1974,177)));
        CarClassUser2CarCollection.add(new Car("Reliant",LocalDate.ofYearDay(1979,8)));
        CarClassUser2CarCollection.add(new Car("Reliant",LocalDate.ofYearDay(1971,159)));
        CarClassUser2CarCollection.add(new Car("Reliant",LocalDate.ofYearDay(1978,235)));
        CarClassUser2CarCollection.add(new Car("Reliant",LocalDate.ofYearDay(1975,354)));
        CarClassUser2CarCollection.add(new Car("Peugeot",LocalDate.ofYearDay(2006,287)));
        System.out.println(CarClassUser1CarCollection);
        System.out.println(CarClassUser2CarCollection);
    }
}