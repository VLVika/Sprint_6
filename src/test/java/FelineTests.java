import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
    Feline feline = new Feline();
    String animalKind = "Хищник";


  /*  @Spy
    Animal animal = new Animal();

    @Test
    public void felineEatMeatVerifyAnimalGetFood() throws Exception {
        Feline feline = new Feline();
        feline.eatMeat();
        verify(animal, Mockito.times(1)).getFood("Хищник");

    }*/
//       when(animal.getFood(animalKind)).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));



    @Spy
    Feline felineSpy;

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
        Assert.assertEquals("Ожидаели текст: "+ expected, expected, feline.getFamily());
    }






    }


