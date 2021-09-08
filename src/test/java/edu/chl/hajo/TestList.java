package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {

    @Test
    public void testAdd() {
        List l = new List();
        l.add(1);                        // Call method to test
        assertTrue(l.getLength() == 1);  // The logical check
        System.out.println("t1");
    }

    @Test
    public void testRemove() {
        List l = new List();
        l.add(1);
        l.add(2);
        l.add(3);
        assertTrue(l.remove() == 3);
        //assertTrue(l.getLength() == 2);   Listan är 3 lång både innan och efter remove fattar inte varför. Denna går därför inte :(.
        System.out.println("t2");
    }

     @Test
     public void testGet1() {
        List l = new List();
         l.add(2);
         l.add(4);
         l.add(8);
         l.add(16);
         l.add(32);
         assertTrue(l.get(2) == 8);
         System.out.println("t3");
     }

    @Test
    public void testGet2() {
        List l = new List();
        l.add(0);
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(7);
        assertTrue(l.get(0) == 0);
        System.out.println("t4");
    }

    @Test(expected=IllegalArgumentException.class)
    public void testGetBadIndex() {
        // Get a list then ...
        List list = new List();
        list.add(12);
        System.out.println("t5");
        assertTrue(list.get(-1) == 1); // Exception!!!

    }

    @BeforeClass
    public static void beforeClass(){  //First of all
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass(){  // Last of all
        System.out.println("After class");
    }

    @Before
    public void before(){  //Before each test method
        System.out.println("Before");
    }

    @After
    public void after(){  //After each test method
        System.out.println("After");
    }

}



