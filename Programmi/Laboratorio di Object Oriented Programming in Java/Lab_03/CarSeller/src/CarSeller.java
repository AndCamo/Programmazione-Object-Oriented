import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarSeller {
    private final List<Car> cars;

    public CarSeller() {
        this.cars = new ArrayList<>();
    }

    public void readUserDataFromFile(File file) throws FileNotFoundException {
        Scanner in = new Scanner(file);
        while (in.hasNextLine()) {
        String carBrand = in.nextLine();
        String carModel = in.nextLine();
        int manufacturingYear = Integer.parseInt(in.nextLine());
        double price = Double.parseDouble(in.nextLine());
        Car newCar = new Car(carBrand, carModel, manufacturingYear, price);
        this.cars.add(newCar);
        }
    }

    public List<Car> searchCarByBrandAndModel(String brand, String model) {
        List<Car> foundCars = new ArrayList<>();
        for(Car tmpCar : cars) {
            if (tmpCar.getBrand().equals(brand))
                if (tmpCar.getModel().equals(model))
                    foundCars.add(tmpCar);
        }
        return foundCars;
    }

    public List<Car> searchCarByBrandModelAndYear(String brand, String model, int manufacturingYear) {
        List<Car> foundCars = new ArrayList<>();
        for (Car tmpCar : cars) {
            if (tmpCar.getBrand().equals(brand) && tmpCar.getModel().equals(model))
                if (tmpCar.getManufacturingYear() >= manufacturingYear)
                    foundCars.add(tmpCar);
        }
        return foundCars;
    }
    public List<Car> searchCarByBrandAModelYearAndPrice(String brand, String model, int manufacturingYear, int minPrice, int maxPrice) {
        List<Car> foundCars = new ArrayList<>();
        for (Car tmpCar : cars) {
            if (tmpCar.getPrice() >= minPrice && tmpCar.getPrice() <= maxPrice)
                    foundCars.add(tmpCar);
        }
        return foundCars;
    }

}