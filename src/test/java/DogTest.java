import io.zipcoder.polymorphism.Dog;
import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void nameTest() {
        Dog dog = new Dog();
        dog.setName("Sora");
        String expected = "Sora";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog();
        String expected = "Woof";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }
}
