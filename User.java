/**
 * User for the workout application.
 * 
 * @version 10.20.2022
 * @author Tim Asher
 */
public class User {

    private String firstname;
    private String lastname;
    private String[] routines;

    /**
     * Constructor - firstname and lastname required
     */
    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.routines = new String[5];
    }

    /**
     * Retrieve user's first name
     */
    public String getFirstName() {
        return this.firstname;
    }

    /**
     * Retrieve user's last name
     */
    public String getLastName() {
        return this.lastname;
    }

    /**
     * Retrieve user's workout routines
     */
    public String[] getRoutines() {
        return this.routines;
    }


}