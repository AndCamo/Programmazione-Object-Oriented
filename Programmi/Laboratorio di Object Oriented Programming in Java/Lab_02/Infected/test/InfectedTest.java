import org.junit.Assert;
import org.junit.Test;

public class InfectedTest {
    @Test
    public void addInfectedTest() {
        Infected pandemia = new Infected("Covid-19", 1000);
        Assert.assertEquals("Covid-19", pandemia.getDisease());
        Assert.assertEquals(1000, pandemia.getNumberOfInfected(), 0);
    }
    @Test
    public void rtAddTest(){
        Infected pandemia = new Infected("Covid-19");
        pandemia.addInfected(20000);
        Assert.assertEquals(20000, pandemia.getNumberOfInfected(), 0);
        pandemia.updateInfectedByRt(1.5);
        Assert.assertEquals(30000, pandemia.getNumberOfInfected(), 0);

    }
    @Test
    public void rtDecreseTest(){
        Infected pandemia = new Infected("Covid-19");
        pandemia.addInfected(10000);
        Assert.assertEquals(10000, pandemia.getNumberOfInfected(), 0);
        pandemia.updateInfectedByRt(0.5);
        Assert.assertEquals(5000, pandemia.getNumberOfInfected(), 0);

    }
}