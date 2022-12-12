import io.zipcoder.polymorphism.Cat;
import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void catNameTest(){
        Cat cat = new Cat();
        cat.setName("Figs");
        String expected = "Figs";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void speakTest(){
        Cat cat = new Cat();
        String expected = "Meow";
        String actual = cat.speak();
        Assert.assertEquals(expected, actual);
    }
}
