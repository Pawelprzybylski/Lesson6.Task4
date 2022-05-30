import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldAgeHigherThan18() {

        //given
        int age = 26;


        //when
        boolean verificationAge = Main.ageVerify(age);

        //then
        Assert.assertEquals(true, verificationAge);

    }

    public void shouldAgeLowerThan18() {
        //given
        int age = 16;

        //when
        boolean verificationAge = Main.ageVerify(age);

        //then
        Assert.assertEquals(false, verificationAge);
    }
}
