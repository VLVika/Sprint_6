import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertThrows;


public class AnimalNegativeTest {

    String animalKind = "Всеядное";


    @Test
    public void animalExeptionTest(){
        Animal newAnimal = new Animal();
        assertThrows(Exception.class, () -> newAnimal.getFood(animalKind));
    }



}
