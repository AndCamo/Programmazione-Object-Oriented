import org.junit.Assert;
import org.junit.Test;

public class LockerTest {
    @Test
    public void lockTest(){
        Locker armadietto = new Locker();
        Assert.assertTrue(armadietto.isOpen());
        armadietto.lock();
        Assert.assertFalse(armadietto.isOpen());
    }
    @Test
    public void codeTest(){
        Locker armadietto = new Locker();
        armadietto.newComb("AND");
        armadietto.lock();
        Assert.assertEquals(false, armadietto.isOpen());
        armadietto.unlock("AND");
        Assert.assertEquals(true, armadietto.isOpen());
    }
    @Test
    public void errorUnlockTest(){
        Locker armadietto = new Locker();
        armadietto.newComb("AND");
        armadietto.lock();
        Assert.assertEquals(false, armadietto.isOpen());
        armadietto.unlock("CAM");
        Assert.assertEquals(false, armadietto.isOpen());
    }
}