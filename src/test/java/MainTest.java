import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    @Test
    public void shouldAgeHigherThan18() {
        //given
        int age = 26;
        //when
        boolean ageVerification = Main.verifyAge(age);
        //then
        Assert.assertEquals(true, ageVerification);
    }

    public void shouldAgeLowerThan18() {
        //given
        int age = 16;
        //when
        boolean ageVerification = Main.verifyAge(age);
        //then
        Assert.assertEquals(false, ageVerification);
    }
}
