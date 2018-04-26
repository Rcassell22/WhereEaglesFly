package edu.kcc.java.authentication;

import java.util.Hashtable;
import java.util.jar.Attributes;
import javax.naming.Context;
import javax.naming.NamingEnumeration;
import javax.naming.directory.DirContext;
import javax.naming.directory.InitialDirContext;
import javax.naming.directory.SearchControls;
import javax.naming.directory.SearchResult;

/**
 *
 * @author Will
 */
public class JNDIClass {
    
    /*
    
    JNDI is the Java Naming and Directory Interface.
    It's used to separate the concerns of the application developer 
    and the application deployer. When you're writing an application 
    which relies on a database, you shouldn't need to worry about the 
    user name or password for connecting to that database. JNDI allows 
    the developer to give a name to a database, and rely on the deployer 
    to map that name to an actual instance of the database.
    */
   public JNDIClass(){
    
    Hashtable<String, String> env = new Hashtable<String, String>();
    env.put(Context.INITIAL_CONTEXT_FACTORY, "com.sun.jndi.ldap.LdapCtxFactory");
    env.put(Context.SECURITY_AUTHENTICATION, "simple");
    env.put(Context.PROVIDER_URL, "z0crdc03.kirkwood.edu:636");
    
    // The value of Context.SECURITY_PRINCIPAL must be the logon username with the domain name
    env.put(Context.SECURITY_PRINCIPAL, "CN=java3class,OU=SystemAccounts,DC=kirkwood,DC=edu");
    
    // The value of the Context.SECURITY_CREDENTIALS should be the user's password
    env.put(Context.SECURITY_CREDENTIALS, "Trefrav4waQegeyu");
    
    DirContext ctx;
    
    try {
    // Authenticate the logon user
    ctx = new InitialDirContext(env);

    // Create the search controls         
      SearchControls searchCtls = new SearchControls();
      
      //Specify the attributes to return
      String returnedAtts[]={"kNumber","givenName"};
      searchCtls.setReturningAttributes(returnedAtts);
      
      //Specify the search scope
      searchCtls.setSearchScope(SearchControls.SUBTREE_SCOPE);
      
      //specify the LDAP search filter
      String searchFilter = "(&(objectClass=SystemAccounts))";
      
      //Specify the Base for the search
      String searchBase = "dc=kirkwood,dc=edu";
      //initialize counter to total the results
      int totalResults = 0;
      
      // Search for objects using the filter
      NamingEnumeration<SearchResult> answer = ctx.search(searchBase, searchFilter, searchCtls);

      //Loop through the search results
      while (answer.hasMoreElements())
      {
        SearchResult sr = (SearchResult)answer.next();

        totalResults++;

        System.out.println("Name: " + sr.getName());
        Attributes attrs = (Attributes) sr.getAttributes();
        System.out.println("kNumber: " + attrs.get("kNumber"));
      }

      System.out.println("Total Results: " + totalResults);
      ctx.close();
 
    } catch (Exception ex) {
        System.out.println(" Search error: " + ex);
        System.exit(-1);  
    }
   }

}
