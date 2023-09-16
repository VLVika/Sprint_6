import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertThrows;

public class AnimalNegativeTest {

    String animalKind = "Всеядное";
    String expectedResult = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
    List<String> actual;

 /*   @Test
    public void animalGetFoodNegativeTest() throws Exception {
        Animal newAnimal = new Animal();
        actual = newAnimal.getFood(animalKind);
        Assert.assertEquals("Ошибка!!!! При передачи параметра " + animalKind + " ожидалось такое сообщение " + expectedResult, expectedResult, actual);

    }*/


    @Test
    public void animalExeptionTest(){
        Animal newAnimal = new Animal();
        assertThrows(Exception.class, () -> newAnimal.getFood(animalKind));
    }



}
