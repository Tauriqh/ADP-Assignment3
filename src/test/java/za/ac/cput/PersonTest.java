package za.ac.cput;

import org.junit.*;
import org.junit.Ignore;

import static org.junit.Assert.*;

public class PersonTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    //Object Equality
    @Test
    public void testPersonObjectEquality() throws Exception {
        Person person1 = new Person
                .Builder()
                .id(1)
                .firstName("Tauriq")
                .lastName("Hendricks")
                .age(22)
                .build();

        Assert.assertEquals("Hendricks", person1.getLastName());
    }

    //Object Identity
    @Test
    public void testPersonObjectIdentity() throws Exception {
        Person person1 = new Person
                .Builder()
                .id(1)
                .firstName("Tauriq")
                .lastName("Hendricks")
                .age(22)
                .build();

        Assert.assertSame("Tauriq",person1.getFirstName());
        Assert.assertNotSame("James",person1.getFirstName());
    }

    //Failing Test
    @Test
    public void testPersonFailingTest() throws Exception {
        Person person1 = new Person
                .Builder()
                .id(1)
                .firstName("Tauriq")
                .lastName("Hendricks")
                .age(22)
                .build();

        Assert.assertEquals(21, person1.getAge());
    }

    //Timeouts
    @Test(timeout = 1000)
    public void testPersonTimeouts() throws Exception {

    }

    //DisablingTest
    @Ignore
    @Test
    public void testPersonDisablingTest() throws Exception {
        Person person1 = new Person
                .Builder()
                .id(1)
                .firstName("Tauriq")
                .lastName("Hendricks")
                .age(22)
                .build();

        Assert.assertEquals("Person{id=1, firstName='Tauriq', lastName='Hendroicks', age=22}", person1.toString());
    }
}