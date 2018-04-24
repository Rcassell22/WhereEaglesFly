package user;

import java.util.ArrayList;

/**
 * Temporary to enable filters to be working without problems
 *
 * @author Jacob Conley
 */
public class User {

    /**
     * The username of the current user
     */
    private String username;
    /**
     * The password of the current user; should not be stored...
     */
    private String password;
    /**
     * The list of roles attached to the current user
     */
    private ArrayList<String> roles;

    /**
     * The full constructor
     *
     * @param username
     * @param password
     * @param role
     */
    public User(String username, String password, ArrayList<String> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }

    /**
     * No-args constructor
     */
    public User() {
        this.username = "";
        this.password = "";
        this.roles = new ArrayList<>();
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.roles = new ArrayList<>();
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
     * The password of the current user; should not be stored...
     *
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * The password of the current user; should not be stored...
     *
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * The list of roles attached to the current user
     *
     * @return the roles
     */
    public ArrayList<String> getRoles() {
        return roles;
    }

    /**
     * The list of roles attached to the current user
     *
     * @param role the roles to set
     */
    public void setRoles(ArrayList<String> role) {
        this.roles = role;
    }

    /**
     * Adds a role to the role list.
     *
     * @param role The role to add.
     */
    public void addRole(String role) {
        roles.add(role);
    }
    
    public boolean hasRole(String role) {
        return roles.contains(role);
    }

}
