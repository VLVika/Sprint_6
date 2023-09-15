import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

@RunWith(Parameterized.class)
public class AnimalParametrizedTest {

    String animalKind;
    List<String> expectedResult;

    public AnimalParametrizedTest(String animalKind,List<String> expectedResult){
        this.animalKind = animalKind;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] getParametrs(){
        return new Object[][]{
                {"Травоядное", List.of("Трава", "Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
        };
    }
    @Test
    public void animalGetFoodPositiveParametrizedTest() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalKind);
        Assert.assertEquals("Ошибка!!!! При передачи параметра " + animalKind + " ожидалось такое сообщение " + expectedResult, expectedResult, actual);

    }




}
