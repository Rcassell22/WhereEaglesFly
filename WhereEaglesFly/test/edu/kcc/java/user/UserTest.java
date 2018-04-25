package edu.kcc.java.user;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.kcc.java.user.User;

/**
 *
 * @author Jacob Slaubaugh
 */
public class UserTest {

    public UserTest() {
    }

    @Before
    public void setUp() {
    }

    /**
     * Test of getUsername method, of class User.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        User instance = new User();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "";
        User instance = new User();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRetrievedUsername method, of class User.
     */
    @Test
    public void testGetRetrievedUsername() {
        System.out.println("getRetrievedUsername");
        User instance = new User();
        String expResult = "";
        String result = instance.getRetrievedUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRetrievedUsername method, of class User.
     */
    @Test
    public void testSetRetrievedUsername() {
        System.out.println("setRetrievedUsername");
        String retrievedUsername = "";
        User instance = new User();
        instance.setRetrievedUsername(retrievedUsername);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
}
