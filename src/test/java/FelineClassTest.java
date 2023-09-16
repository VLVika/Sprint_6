
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class FelineClassTest {


    @Spy
    Feline felineSpy;

    @Test
    public void felineEatMeatReturnText() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        felineSpy.eatMeat();
        Assert.assertEquals("Ошибка!! Ожидалось следующее сообщение " + expected, expected, felineSpy.eatMeat());

    }


    @Test
    public void getKittensCount5ReturnTheSame () throws Exception {
        int actual = felineSpy.getKittens(5);
        int eхpected = 5;
        Assert.assertEquals("Ожидалось число " + eхpected, actual, eхpected);
    }

    @Test
    public void getKittensCount1ReturnTheSame () throws Exception {
        int actual = felineSpy.getKittens(1);
        int eхpected = 1;
        Assert.assertEquals("Ожидалось число " + eхpected, actual, eхpected);
    }

    @Test
    public void getKittensNoParams(){
        felineSpy.getKittens();
        verify(felineSpy, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getFamilyWasReturnTheText(){
        String expected = "Кошачьи";
        Assert.assertEquals("Ожидаели текст: "+ expected, expected, felineSpy.getFamily());
    }

}
