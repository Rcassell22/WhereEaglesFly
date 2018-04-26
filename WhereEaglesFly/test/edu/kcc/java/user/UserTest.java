package edu.kcc.java.user;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import edu.kcc.java.user.User;

/**
 * User is currently being evaluated.
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
     * Build a String of the specified size.
     *
     * @param size
     * @return
     */
    private String buildString(int size) {
        char[] chars = new char[size];
        for (int i = 0; i < size; i++) {
            chars[i] = 'X';
        }
        return new String(chars);
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
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsernameGood() {
        System.out.println("setUsernameGood");
        String username = buildString(15);
        User instance = new User();
        instance.setUsername(username);
        assertEquals(username, instance.getUsername());
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsernameNull() {
        System.out.println("setUsernameNull");
        String username = null;
        User instance = new User();
        instance.setUsername(username);
        String original = instance.getUsername();
        try {
            instance.setUsername(username);
            fail("Allowed to set a username that is null.");
        } catch (Exception ex) {
            assertEquals(original, instance.getUsername());
        }
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsernameEmpty() {
        System.out.println("setUsernameEmpty");
        String username = "";
        User instance = new User();
        String original = instance.getUsername();
        try {
            instance.setUsername(username);
            fail("Allowed to set a username that is empty.");
        } catch (Exception ex) {
            assertEquals(original, instance.getUsername());
        }
    }

    /**
     * Test of setUsername method, of class User.
     */
    @Test
    public void testSetUsernameTooLong() {
        System.out.println("setUsernameTooLong");
        String username = buildString(256) + 1;
        User instance = new User();
        String original = instance.getUsername();
        try {
            instance.setUsername(username);
            fail("Allowed to set a username that is too long.");
        } catch (Exception ex) {
            assertEquals(original, instance.getUsername());
        }
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
    }

    /**
     * Test of setRetrievedUsername method, of class User.
     */
    @Test
    public void testSetRetrievedUsernameGood() {
        System.out.println("setRetrievedUsernameGood");
        String retrievedUsername = buildString(15);
        User instance = new User();
        instance.setRetrievedUsername(retrievedUsername);
        assertEquals(retrievedUsername, instance.getRetrievedUsername());
    }

    /**
     * Test of setRetrievedUsername method, of class User.
     */
    @Test
    public void testSetRetrievedUsernameNull() {
        System.out.println("setRetrievedUsernameNull");
        String retrievedUsername = null;
        User instance = new User();
        instance.setRetrievedUsername(retrievedUsername);
        String original = instance.getRetrievedUsername();
        try {
            instance.setUsername(retrievedUsername);
            fail("Allowed to set a retrievedUsername that is null.");
        } catch (Exception ex) {
            assertEquals(original, instance.getUsername());
        }
    }

    /**
     * Test of setRetrievedUsername method, of class User.
     */
    @Test
    public void testSetRetrievedUsernameEmpty() {
        System.out.println("setRetrievedUsernameEmpty");
        String retrievedUsername = "";
        User instance = new User();
        instance.setRetrievedUsername(retrievedUsername);
        String original = instance.getRetrievedUsername();
        try {
            instance.setUsername(retrievedUsername);
            fail("Allowed to set a retrievedUsername that is empty.");
        } catch (Exception ex) {
            assertEquals(original, instance.getUsername());
        }
    }

    /**
     * Test of setRetrievedUsername method, of class User.
     */
    @Test
    public void testSetRetrievedUsernameTooLong() {
        System.out.println("setRetrievedUsername");
        String retrievedUsername = buildString(256) + 1;
        User instance = new User();
        instance.setRetrievedUsername(retrievedUsername);
        String original = instance.getRetrievedUsername();
        try {
            instance.setUsername(retrievedUsername);
            fail("Allowed to set a retrievedUsername that is too long.");
        } catch (Exception ex) {
            assertEquals(original, instance.getUsername());
        }
    }
}
