import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public class CarSellerTest {
    @Test
    public void searchCarByBrandAndModelTest(){
        CarSeller carSeller = new CarSeller();
        File file = Path.of("test/").resolve("testData.txt").toFile();
        try {
            carSeller.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Car> suitableCars = carSeller.searchCarByBrandAndModel("Tesla", "Model Y");
        Assert.assertEquals(2, suitableCars.size());
    }

    @Test
    public void searchCarByBrandModelAndYear(){
        CarSeller carSeller = new CarSeller();
        File file = Path.of("test/").resolve("testData.txt").toFile();
        try {
            carSeller.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Car> suitableCars = carSeller.searchCarByBrandModelAndYear("Tesla", "Model Y", 2020);
        Assert.assertEquals(2, suitableCars.size());
    }
    @Test
    public void returnCarByBrandAModelYearAndPriceTest() {
        CarSeller carSeller = new CarSeller();
        File file = Path.of("test/").resolve("testData.txt").toFile();
        try {
            carSeller.readUserDataFromFile(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        List<Car> suitableCars = carSeller.searchCarByBrandAModelYearAndPrice("Tesla", "Model Y", 2022, 36000, 40000);
        Assert.assertEquals(0, suitableCars.size());
    }
}