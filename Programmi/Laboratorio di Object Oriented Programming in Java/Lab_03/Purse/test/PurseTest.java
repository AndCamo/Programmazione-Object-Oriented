import org.junit.Assert;
import org.junit.Test;

public class PurseTest {

  @Test
  public void findTest() {
    Purse newPurse = new Purse();
    newPurse.add(Purse.DOLLAR);
    Assert.assertTrue(newPurse.find(Purse.DOLLAR));
    Assert.assertFalse(newPurse.find(Purse.DIME));
  }

  @Test
  public void countTest() {
    Purse newPurse = new Purse();
    for(int i = 0; i < 10; i++)
      newPurse.add(Purse.DOLLAR);

    Assert.assertEquals(10, newPurse.count(Purse.DOLLAR), 0);
  }

  @Test
  public void minMaxTest() {
    Purse newPurse = new Purse();
    newPurse.add(Purse.DIME);
    newPurse.add(Purse.DOLLAR);
    newPurse.add(Purse.NICKEL);
    newPurse.add(Purse.QUARTER);

    Assert.assertEquals(Purse.DOLLAR, newPurse.getMaximum());
    Assert.assertEquals(Purse.NICKEL, newPurse.getMinimum());

  }

  @Test
  public void getTotalTest() {
    Purse newPurse = new Purse();
    for(int i = 0; i < 10; i++)
      newPurse.add(Purse.DOLLAR);
    newPurse.add(Purse.DIME);
    newPurse.add(Purse.DOLLAR);
    newPurse.add(Purse.NICKEL);

    Assert.assertEquals(11.15, newPurse.getTotal(),0);
  }

  @Test
  public void addRemoveTest() {
    Purse newPurse = new Purse();
    newPurse.add(Purse.DOLLAR);
    Assert.assertTrue(newPurse.find(Purse.DOLLAR));
    newPurse.remove(Purse.DOLLAR);
    Assert.assertFalse(newPurse.find(Purse.DOLLAR));
  }

  @Test
  public void hasCoinTest() {
    Purse newPurse = new Purse();
    newPurse.add(Purse.DOLLAR);
    newPurse.add(Purse.NICKEL);
    Assert.assertTrue(newPurse.hasCoin(Purse.DOLLAR));
  }

  @Test
  public void toStringTest() {
    Purse newPurse = new Purse();
    for(int i = 0; i < 10; i++)
      newPurse.add(Purse.QUARTER);
    newPurse.add(Purse.DIME);
    newPurse.add(Purse.DOLLAR);
    newPurse.add(Purse.NICKEL);

    Assert.assertEquals("Purse[Dollar = 1, Quarter = 10, Dime = 1, Nickel = 1, Cent = 0]", newPurse.toString());
  }

  @Test
  public void equalsTest() {
    Purse firstPurse = new Purse();
    Purse secondPurse = new Purse();
    firstPurse.add(Purse.DIME);
    firstPurse.add(Purse.DOLLAR);
    firstPurse.add(Purse.NICKEL);
    secondPurse.add(Purse.DIME);
    secondPurse.add(Purse.DOLLAR);
    secondPurse.add(Purse.NICKEL);

    Assert.assertTrue(firstPurse.equals(secondPurse));
  }
}