import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Mock
    Feline feline = new Feline();


    Cat cat = new Cat(feline);

    @Test
    public void catGetSoundReturnMya(){
        Assert.assertEquals("Вернулось не верное значение, ожидалось Мяу!", "Мяу", cat.getSound());
    }

    @Test
    public void catGetFoodVerifyFeline() throws Exception {
        Cat cat = new Cat(feline);
    when(feline.eatMeat()).thenReturn(Arrays.asList("Кар, Кар, Кар"));
    cat.getFood();
    verify(feline).eatMeat();




    }




}
