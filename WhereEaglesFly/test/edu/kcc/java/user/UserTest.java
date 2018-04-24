package edu.kcc.java.user;

import java.util.ArrayList;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import user.User;

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
     * Test of getPassword method, of class User.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        User instance = new User();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class User.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        User instance = new User();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRoles method, of class User.
     */
    @Test
    public void testGetRoles() {
        System.out.println("getRoles");
        User instance = new User();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getRoles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRoles method, of class User.
     */
    @Test
    public void testSetRoles() {
        System.out.println("setRoles");
        ArrayList<String> role = null;
        User instance = new User();
        instance.setRoles(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addRole method, of class User.
     */
    @Test
    public void testAddRole() {
        System.out.println("addRole");
        String role = "";
        User instance = new User();
        instance.addRole(role);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hasRole method, of class User.
     */
    @Test
    public void testHasRole() {
        System.out.println("hasRole");
        String role = "";
        User instance = new User();
        boolean expResult = false;
        boolean result = instance.hasRole(role);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
