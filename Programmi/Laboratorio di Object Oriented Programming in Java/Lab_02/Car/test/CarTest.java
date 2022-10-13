import org.junit.Assert;
import org.junit.Test;

public class CarTest {
    @Test
    public void addFuelTest(){
        Car automobile = new Car(0.05);
        Assert.assertEquals(0, automobile.getGas(), 0);
        automobile.addGas(50);
        Assert.assertEquals(50, automobile.getGas(), 0);
    }
    @Test
    public void driveTest(){
        Car automobile = new Car(0.05);
        automobile.addGas(40);
        Assert.assertEquals(40, automobile.getGas(), 0);

        automobile.drive(150);
        Assert.assertEquals(32.5, automobile.getGas(), 0);
    }
}