package main;

import  org.junit.*;

import static org.junit.Assert.*;

public class SampleClassTest {

    static SampleClass sm;

    @BeforeClass
    public static void beforeClass(){
        sm = new SampleClass();
    }

    @Test
    public void add() {
        int c = sm.add(1,3);
        assertEquals(4,c);
    }

    @Test(expected = ArithmeticException.class)
    public void divided() {
        int c = sm.divided(1,0);
        assertEquals(0,c);
    }

    @Test
    public void Sample() {
        String string1 = "Junit";
        String string2 = "Junit";
        String string3 = "test";
        String string4 = "test";
        String string5 = null;
        int variable1 = 1;
        int variable2 = 2;
        int[] anArray1 = {1,2,3};
        int[] anArray2 = {1,2,3};
        String a1 = new String("hello");
        String a2 = new String("hello");

        assertEquals("String one and Two: ",string1,string2);
        assertEquals("String three and four: ",string3,string4);
        //assertEquals("String one and Three: ",string1,string3);
        assertNull("String five is null: ",string5);
        assertNotNull("String one is not null:",string1);
        assertTrue("variable1 is less than variable2 : ",variable1<variable2);
        assertNotSame("Array checking",anArray1,anArray2);
        assertArrayEquals("Array equal",anArray1,anArray2);
        assertSame(string1,string2);
        assertNotSame(a1,a2);
    }

}