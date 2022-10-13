import org.junit.Assert;
import org.junit.Test;

public class InputCheckerTest {
    @Test
    public void okTest(){
        String testCase[] = {"S", "SI", "OK", "certo", "perche no?"};
        InputChecker inputChecker = new InputChecker();
        for(String stringa : testCase)
        {
            Assert.assertEquals("OK", inputChecker.checkInput(stringa));
        }
    }
    @Test
    public void fineTest(){
        String testCase[] = {"N", "No"};
        InputChecker inputChecker = new InputChecker();
        for(String stringa : testCase)
        {
            Assert.assertEquals("Fine", inputChecker.checkInput(stringa));
        }
    }
    @Test
    public void defaultTest(){
        String testCase[] = {"Ciao", "Non"};
        InputChecker inputChecker = new InputChecker();
        for(String stringa : testCase)
        {
            Assert.assertEquals("Dato non corretto", inputChecker.checkInput(stringa));
        }
    }
}