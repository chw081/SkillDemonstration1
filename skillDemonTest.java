import java.util.ArrayList;
import static org.junit.Assert.*;
import org.junit.*;
public class SkillDemoTest {

    @Test
    public void averageScoreOdd() {
        skillDemon test = new skillDemon();
        test.add(5);
        test.add(2);
        boolean actual = test.averageScore() == 3.5;
        assertEquals(true, actual);
    }
}