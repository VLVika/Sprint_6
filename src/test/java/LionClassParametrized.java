import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;


@RunWith(Parameterized.class)
public class LionClassParametrized {

    String sex;


    public LionClassParametrized(String sex){
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[][] getParams(){
        return new Object[][]{
                {"Самец"},
                {"Самка"},
        };
    }


    @Test
    public void lionPositiveParametrizedTest() throws Exception {
        MockitoAnnotations.initMocks(this);
        Lion newLion  = Mockito.spy(new Lion(sex));
        Assert.assertNotNull(newLion);

    }


}
