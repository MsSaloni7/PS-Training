import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
class ExampleTestTest extends ExampleTest {

    @Test
    public void testExample() throws Exception {
        ExampleTest testobj = new ExampleTest();

        String mood = ExampleTest.checkMood("Sample Message");

        Assert.assertThat(mood, CoreMatchers.is("happy"));
    }

}