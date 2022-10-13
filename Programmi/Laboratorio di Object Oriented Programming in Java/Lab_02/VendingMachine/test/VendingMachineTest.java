import org.junit.Assert;
import org.junit.Test;

public class VendingMachineTest {
  @Test
    public void addCansTest(){
      VendingMachine distributore = new VendingMachine();
      distributore.addCans(10);
      Assert.assertEquals(10, distributore.getNumberOfCans(), 0);
  }

  @Test
    public void takeCansTest(){
    VendingMachine distributore = new VendingMachine(15);
    for(int i = 0; i<5; i++)
      distributore.takeCan();
    Assert.assertEquals(10, distributore.getNumberOfCans(), 0);
  }

  @Test
  public void takeMoneyTest() {
    VendingMachine vm = new VendingMachine(10);
    vm.takeCan();
    vm.takeCan();
    Assert.assertEquals(2, vm.getNumberOfTokens(), 0);
    vm.takeTokens();
    Assert.assertEquals(0, vm.getNumberOfTokens(), 0);
  }
}