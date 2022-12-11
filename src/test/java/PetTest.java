import io.zipcoder.polymorphism.Pets;
import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void constructorTest(){
        Pets pet = new Pets("Max");
        String expected = "Max";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setNameTest(){
        Pets pet = new Pets("Sam");
        pet.setName("Sam");
        String expected = "Sam";
        String actual = pet.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNameTest(){
        Pets pet = new Pets("Sora");
        String actual = pet.getName();
        Assert.assertEquals("Sora", actual);
    }
}
