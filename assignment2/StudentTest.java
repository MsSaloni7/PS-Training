import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

class StudentTest extends Student {



    @Test
    public void testStudent() throws Exception {
        Student stuobj = new Student();

        String name = Student.studentName("Saloni", "Sah");

        Assert.assertThat(name, CoreMatchers.is("Saloni Sah"));
    }

}