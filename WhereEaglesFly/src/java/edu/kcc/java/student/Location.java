package edu.kcc.java.student;

import javax.validation.constraints.*;

/**
 *
 * @author Wesley Richardson
 */
public class Location {

    /**
     * The country the student lives in
     */
    @Size(max=100)
    @Null
    private String country;

    /**
     * The city the student lives in
     */
    @Size(max=100)
    @Null
    private String city;

    /**
     * The name of state, province, or other regional name
     */
    @Size(max=100)
    @Null
    private String regionId;

    /**
     * The postal code of the location of the student
     */
    @Size(max=100)
    @Null
    private String postalCode;

    /**
     * The street address of the student
     */
    @Size(max=100)
    @Null
    private String streetAddress;

    public Location(String country, String city, String regionId, String postalCode, String streetAddress) {
        this.country = country;
        this.city = city;
        this.regionId = regionId;
        this.postalCode = postalCode;
        this.streetAddress = streetAddress;
    }

    public Location() {
        this.country = "";
        this.city = "";
        this.regionId = "";
        this.postalCode = "";
        this.streetAddress = "";
    }

    /**
     * The country the student lives in
     *
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * The country the student lives in
     *
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * The city the student lives in
     *
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * The city the student lives in
     *
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The name of state, provence, or other region name
     *
     * @return the regionId
     */
    public String getRegionId() {
        return regionId;
    }

    /**
     * The name of state, provence, or other region name
     *
     * @param regionId the regionId to set
     */
    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    /**
     * The postal code of the location of the student
     *
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * The postal code of the location of the student
     *
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * The street address of the student
     *
     * @return the streetAddress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * The street address of the student
     *
     * @param streetAddress the streetAddress to set
     */
    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

}
