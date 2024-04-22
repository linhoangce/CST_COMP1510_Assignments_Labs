package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestThisTest {
    
    /** The TestThis object to test. */
    private TestThis test;
        
    /**
     * Creates a new Mathematics objects before each test is executed.
     * 
     * @throws Exception
     *             if a Mathematics object cannot be created.
     */
    @BeforeEach
    private void setUp() throws Exception {
        test = new TestThis();
    }
    
    /** Test largestIntIntInt method. */
    @Test
    void testLargestIntIntInt1() {
        int max = test.largest(3, 2, 1);
        assertEquals(3, max);
    }

    /** Test largestIntIntInt method. */
    @Test
    void testLargestIntIntInt2() {
        int max = test.largest(501, 123, 603);
        assertEquals(603, max);
    }
    
    /** Test largestIntIntInt method. */
    @Test
    void testLargestIntIntInt3() {
        int max = test.largest(20, 22, 20);
        assertEquals(22, max);
    }
    
    /** Test largestArrayList method. */
    @Test
    void testLargestListOfInteger1() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(11);
        list.add(12);
        int max = test.largest(list);
        assertEquals(12, max);
    }

    /** Test largestArrayList method. */
    @Test
    void testLargestListOfInteger2() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(632);
        list.add(1000);
        list.add(1000);
        list.add(1001);
        int max = test.largest(list);
        assertEquals(1001, max);
    }
    
    /** Test largestArrayList method. */
    @Test
    void testLargestListOfInteger3() {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(250);
        list.add(42);
        list.add(650);
        list.add(100);
        list.add(-100000);
        list.add(0);
        list.add(649);
        int max = test.largest(list);
        assertEquals(650, max);
    }
}
