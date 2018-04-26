package edu.kcc.java.user;

import java.util.ArrayList;

/**
 * Temporary to enable filters to be working without problems. Needs to adjusted
 * to match active directory.
 *
 * @author Jacob Conley
 */
public class User {

    /**
     * The username of the current user
     */
    private String username;

    /**
     * The retrieved username
     *
     * Used for checking whether Gary or Brenda is signed in. Anyone else is
     * only allowed to see the regular or student view.
     */
    private String retrievedUsername;

    /**
     * The full constructor
     *
     * @param username
     */
    public User(String username, String retrievedUsername) {
        this.username = username;
        this.retrievedUsername = retrievedUsername;
    }

    /**
     * No-args constructor
     */
    public User() {
        this.username = "";
        this.retrievedUsername = "";
    }

    /**
     * Constructor without a retrieved username
     *
     * @param username
     */
    public User(String username) {
        this.username = username;
        this.retrievedUsername = "";
    }

    /**
     * The username of the current user
     *
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * The username of the current user
     *
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * The retrieved username
     *
     * Used for checking whether Gary or Brenda is signed in. Anyone else is
     * only allowed to see the regular or student view.
     *
     * @return the retrievedUsername
     */
    public String getRetrievedUsername() {
        return retrievedUsername;
    }

    /**
     * The retrieved username
     *
     * Used for checking whether Gary or Brenda is signed in. Anyone else is
     * only allowed to see the regular or student view.
     *
     * @param retrievedUsername the retrievedUsername to set
     */
    public void setRetrievedUsername(String retrievedUsername) {
        this.retrievedUsername = retrievedUsername;
    }

}
