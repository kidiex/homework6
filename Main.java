public class Main {
    public static void main(String[] args) {
        // Тестирование метода getCarByBrend
        Car[] cars = {
            new Car(1, "Toyota", "Camry", 2020, "Black", 25000.0, "ABC123"),
            new Car(2, "Honda", "Civic", 2019, "White", 22000.0, "DEF456"),
            new Car(3, "Toyota", "Corolla", 2021, "Red", 20000.0, "GHI789"),
            new Car(4, "BMW", "X5", 2018, "Blue", 45000.0, "JKL012"),
            new Car(5, "Toyota", "RAV4", 2015, "Silver", 18000.0, "MNO345")
        };

        Car[] toyotaCars = getCarByBrend(cars, "Toyota");
        System.out.println("Toyota cars found: " + toyotaCars.length);
        
        Car[] audiCars = getCarByBrend(cars, "Audi");
        System.out.println("Audi cars found: " + audiCars.length);
        
        // Тестирование метода getCarByBrendAndYearOperational
        int currentYear = 2024;
        Car[] oldToyotaCars = getCarByBrendAndYearOperational(cars, "Toyota", 3, currentYear);
        System.out.println("Toyota cars older than 3 years: " + oldToyotaCars.length);
    }

    public static Car[] getCarByBrend(Car[] cars, String brend) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend)) {
                result[index++] = car;
            }
        }
        
        return result;
    }

    public static Car[] getCarByBrendAndYearOperational(Car[] cars, String brend, int years, int currentYear) {
        int count = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend) && (currentYear - car.getYear()) > years) {
                count++;
            }
        }
        
        Car[] result = new Car[count];
        int index = 0;
        for (Car car : cars) {
            if (car.getBrand().equalsIgnoreCase(brend) && (currentYear - car.getYear()) > years) {
                result[index++] = car;
            }
        }
        
        return result;
    }
}
