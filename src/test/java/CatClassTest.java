import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatClassTest {

    @Mock
    Feline feline = new Feline();


    @Test
    public void catGetSoundReturnMya() {
        Cat cat = new Cat(feline);
        Assert.assertEquals("Вернулось не верное значение, ожидалось Мяу!", "Мяу", cat.getSound());
    }

    @Test
    public void catGetFoodVerifyFeline() throws Exception {
        Cat cat = new Cat(feline);
        when(feline.eatMeat()).thenReturn(Arrays.asList("Кар, Кар, Кар"));
        cat.getFood();
        verify(feline, Mockito.times(1)).eatMeat();

    }

    @Test
    public void catGetFoodReturnText() throws Exception {
        Cat cat = new Cat(feline);
        List<String> predator = List.of("Животные", "Птицы", "Рыба");
        when(cat.getFood()).thenReturn(predator);
        Assert.assertEquals("Ошибка!! Тест не возвращает значение "+ predator, predator, cat.getFood());
    }
}





