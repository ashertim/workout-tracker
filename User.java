import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

/**
 * User for the workout application.
 * 
 * @version 04.06.2023
 * @author Tim Asher
 */
public class User {

    private String firstname;
    private String lastname;
    private ArrayList<Routine> routines;
    // private Map<String, Integer> personalRecords; // Map name of exercise to 

    /**
     * Initialise the user - firstname and lastname required at minimum
     * 
     * @param firstname
     *          User's first name, e.g. John
     * @param lastname
     *          User's last name, e.g. Doe
     */
    public User(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.routines = new ArrayList<Routine>();
        // this.personalRecords = new HashMap<>();
    }

    /**
     * @return user's first name
     */
    public String getFirstName() {
        return firstname;
    }

    /**
     * @return user's last name
     */
    public String getLastName() {
        return lastname;
    }

    /**
     * @return user's workout routines
     */
    public ArrayList<Routine> getRoutines() {
        return routines;
    }

    /**
     * 
     * @param r
     */
    public void addRoutine(Routine r) {
        routines.add(r);
    }

    /**
     * Change the user's first name
     * 
     * @param firstname
     *          User's first name, e.g. John
     */
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    /**
     * Change the user's last name
     * 
     * @param lastname
     *          User's last name, e.g. Doe
     */
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Change the user's workout routines
     * 
     * @param routines
     *          ArrayList of routines containing exercises
     */
    public void setRoutines(ArrayList<Routine> routines) {
        this.routines = routines;
    }



}