import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FirstAndLastWordTest {
    @Test
    public void testNoIgnoreCase(){
        String testCase[] = {"Andrea", "andrea", "casa", "banana", "elefante"};
        List<String> stringList = new ArrayList<>();
        for (String stringa: testCase)
            stringList.add(stringa);

        FirstAndLastWord firstAndLastWord = new FirstAndLastWord(stringList);
        firstAndLastWord.sort();
        Assert.assertEquals("Andrea", firstAndLastWord.getFirst());
        Assert.assertEquals("elefante", firstAndLastWord.getLast());
    }
    @Test
    public void testIgnoreCase(){
        String testCase[] = {"Andrea", "andrea", "casa", "elefante", "Elefante"};
        List<String> stringList = new ArrayList<>();
        for (String stringa: testCase)
            stringList.add(stringa);

        FirstAndLastWord firstAndLastWord = new FirstAndLastWord(stringList);
        firstAndLastWord.sort();
        Assert.assertEquals("Andrea", firstAndLastWord.getFirst());
        Assert.assertEquals("elefante", firstAndLastWord.getLast());
    }
}