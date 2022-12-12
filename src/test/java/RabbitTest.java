import io.zipcoder.polymorphism.Rabbit;
import org.junit.Assert;
import org.junit.Test;

public class RabbitTest {

    @Test
    public void nameTest(){
        Rabbit rabbit = new Rabbit();
        rabbit.setName("Bun");
        String expected = "Bun";
        String actual = rabbit.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        Rabbit rabbit = new Rabbit();
        String expected = "kip-kip";
        String actual = rabbit.speak();
        Assert.assertEquals(expected, actual);
    }
}
