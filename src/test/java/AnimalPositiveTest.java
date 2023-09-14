import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;


public class AnimalPositiveTest {


    @Test
    public void animalGetFoodReturnText(){
        Animal animal = new Animal();
        Assert.assertEquals("Вернулся не корректный текст!!!!", "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", animal.getFamily());
    }

}
