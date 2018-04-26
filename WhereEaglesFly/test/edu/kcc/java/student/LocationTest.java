package edu.kcc.java.student;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Badis Saidani
 */
public class LocationTest {
    
    public LocationTest() {
    }
    
    
    @Before
    public void setUp() {
    }
    
    
     /**
     * Test of getCountry method, of class Location.
     */
    @Test
    public void testGetCountry() {
        System.out.println("getCountry");
        Location instance = new Location();
        String expResult = null;
        String result = instance.getCountry();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCountry method, of class Location.
     */
    @Test
    public void testSetCountryNull() {
        System.out.println("setCountryNull");
        String country = null;
        Location instance = new Location();
        String originalCountry = instance.getCountry();
        try {
            instance.setCountry(country);
            fail("Allowed to set null country.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalCountry, instance.getCountry());
        }
    }

    /**
     * Test of setCountry method, of class Location.
     */
    @Test
    public void testSetCountryBlank() {
        System.out.println("setCountryBlank");
        String country = "";
        Location instance = new Location();
        String originalCountry = instance.getCountry();
        try {
            instance.setCountry(country);
            fail("Allowed to set blank country.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalCountry, instance.getCountry());
        }
    }

    /**
     * Test of setCountry method, of class Location.
     */
    @Test
    public void testSetCountryLong() {
        System.out.println("setCountryLong");
        String country = buildString(257);
        Location instance = new Location();
        String originalCountry = instance.getCountry();
        try {
            instance.setCountry(country);
            fail("Allowed to set long country.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalCountry, instance.getCountry());
        }
    }

    /**
     * Helper function to build long strings.
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
     * Test of setCountry method, of class Location.
     */
    @Test
    public void testSetCountryGood() {
        System.out.println("setCountryGood");
        String country = "John Doe";
        Location instance = new Location();
        instance.setCountry(country);
        assertEquals(country, instance.getCountry());
    }

    /**
     * Test of getCity method, of class Location.
     */
    @Test
    public void testGetCity() {
        System.out.println("getCity");
        Location instance = new Location();
        String expResult = "";
        String result = instance.getCity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCity method, of class Location.
     */
    @Test
    public void testSetCity() {
        System.out.println("setCity");
        String city = "";
        Location instance = new Location();
        instance.setCity(city);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

     /**
     * Test of getRegionId method, of class Location.
     */
    @Test
    public void testGetRegionId() {
        System.out.println("getRegionId");
        Location instance = new Location();
        String expResult = null;
        String result = instance.getRegionId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setRegionId method, of class Location.
     */
    @Test
    public void testSetRegionIdNull() {
        System.out.println("setRegionIdNull");
        String regionId = null;
        Location instance = new Location();
        String originalRegionId = instance.getRegionId();
        try {
            instance.setRegionId(regionId);
            fail("Allowed to set null Region id.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalRegionId, instance.getRegionId());
        }
    }

    /**
     * Test of setRegionId method, of class Location.
     */
    @Test
    public void testSetRegionIdBlank() {
        System.out.println("setRegionIdBlank");
        String regionId = "";
        Location instance = new Location();
        String originalRegionId = instance.getRegionId();
        try {
            instance.setRegionId(regionId);
            fail("Allowed to set blank Region id.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalRegionId, instance.getRegionId());
        }
    }

    /**
     * Test of setRegionId method, of class Location.
     */
    @Test
    public void testSetRegionIdLong() {
        System.out.println("setRegionIdLong");
        String regionId = buildString(2);
        Location instance = new Location();
        String originalRegionId = instance.getRegionId();
        try {
            instance.setRegionId(regionId);
            fail("Allowed to set long Region id.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalRegionId, instance.getRegionId());
        }
    }

    /**
     * Test of setRegionId method, of class Location.
     */
    @Test
    public void testSetRegionIdGood() {
        System.out.println("setRegionIdGood");
        String regionId = "John Doe";
        Location instance = new Location();
        instance.setRegionId(regionId);
        assertEquals(regionId, instance.getRegionId());
    }

     /**
     * Test of getPostalCode method, of class Location.
     */
    @Test
    public void testGetPostalCode() {
        System.out.println("getPostalCode");
        Location instance = new Location();
        String expResult = null;
        String result = instance.getPostalCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPostalCode method, of class Location.
     */
    @Test
    public void testSetPostalCodeNull() {
        System.out.println("setPostalCodeNull");
        String postalCode = null;
        Location instance = new Location();
        String originalPostalCode = instance.getPostalCode();
        try {
            instance.setPostalCode(postalCode);
            fail("Allowed to set null postal code.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalPostalCode, instance.getPostalCode());
        }
    }

    /**
     * Test of setPostalCode method, of class Location.
     */
    @Test
    public void testSetPostalCodeBlank() {
        System.out.println("setPostalCodeBlank");
        String postalCode = "";
        Location instance = new Location();
        String originalPostalCode = instance.getPostalCode();
        try {
            instance.setPostalCode(postalCode);
            fail("Allowed to set blank postal code.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalPostalCode, instance.getPostalCode());
        }
    }

    /**
     * Test of setPostalCode method, of class Location.
     */
    @Test
    public void testSetPostalCodeLong() {
        System.out.println("setPostalCodeLong");
        String postalCode = buildString(5);
        Location instance = new Location();
        String originalPostalCode = instance.getPostalCode();
        try {
            instance.setPostalCode(postalCode);
            fail("Allowed to set long Postal Code.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalPostalCode, instance.getPostalCode());
        }
    }

        /**
     * Test of getStreetAddress method, of class Location.
     */
    @Test
    public void testGetStreetAddress() {
        System.out.println("getStreetAddress");
        Location instance = new Location();
        String expResult = null;
        String result = instance.getStreetAddress();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStreetAddress method, of class Location.
     */
    @Test
    public void testSetStreetAddressNull() {
        System.out.println("setStreetAddressNull");
        String street = null;
        Location instance = new Location();
        String originalStreetAddress = instance.getStreetAddress();
        try {
            instance.setStreetAddress(street);
            fail("Allowed to set null StreetAddress.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalStreetAddress, instance.getStreetAddress());
        }
    }

    /**
     * Test of setStreetAddress method, of class Location.
     */
    @Test
    public void testSetStreetAddressBlank() {
        System.out.println("setStreetAddressBlank");
        String street = "";
        Location instance = new Location();
        String originalStreetAddress = instance.getStreetAddress();
        try {
            instance.setStreetAddress(street);
            fail("Allowed to set blank street.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalStreetAddress, instance.getStreetAddress());
        }
    }

    /**
     * Test of setStreetAddress method, of class Location.
     */
    @Test
    public void testSetStreetAddressLong() {
        System.out.println("setStreetAddressLong");
        String street = buildString(257);
        Location instance = new Location();
        String originalStreetAddress = instance.getStreetAddress();
        try {
            instance.setStreetAddress(street);
            fail("Allowed to set long street.");
        } catch (IllegalArgumentException iae) {
            assertEquals(originalStreetAddress, instance.getStreetAddress());
        }
    }

}
