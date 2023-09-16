import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class LionClassTest {

    @Mock
    Feline feline = new Feline();

    public LionClassTest() throws Exception {
    }


    @Test
    public void getFoodVerifyFeline() throws Exception {
        Lion newLion = new Lion(feline);
        newLion.getFood();
        verify(feline, Mockito.times(1)).getFood("Хищник");
    }

    @Test
    public void getKittensVerifyFeline(){
        Lion newLion1 = new Lion(feline);
        newLion1.getKittens();
        verify(feline, Mockito.times(1)).getKittens();
    }

    @Test
    public void doesHaveManeReturnTrue(){
    Lion lionTrue = new Lion(true);
    Assert.assertTrue("Ожидали возвращаемое значение True", lionTrue.doesHaveMane());

    }

    @Test
    public void doesHaveManeReturnFalse(){
        Lion lionFalse = new Lion(false);
        Assert.assertFalse("Ожидали возвращаемое значение False", lionFalse.doesHaveMane());
    }

    @Test
    public void lionSexError() {
        assertThrows(Exception.class, () -> new Lion("Непонятный пол"));
    }

    @Spy
    Lion newLionM = new Lion("Самец");


    @Test
    public void lionSexSamec() throws Exception {
        Assert.assertNotNull(newLionM);

    }

    @Spy
    Lion newLionW = new Lion("Самка");


    @Test
    public void lionSexSamka() throws Exception {
        Assert.assertNotNull(newLionW);

    }


}




