import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Map;

/**
 * User for the workout application.
 * 
 * @version 04.19.2023
 * @author Tim Asher
 */
public class User {

    private String username;
    private ArrayList<Routine> routines;
    // private Map<String, Integer> personalRecords; // Map name of exercise to 

    /**
     * Initialise the user - firstname and lastname required at minimum
     * 
     * @param username
     *          Unique username; e.g. johndoe
     */
    public User(String username) {
        this.username = username;
        this.routines = new ArrayList<Routine>();
        // this.personalRecords = new HashMap<>();
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return user's workout routines
     */
    public ArrayList<Routine> getRoutines() {
        return routines;
    }

    /**
     * 
     * @param id
     * @return
     */
    public Routine getRoutineById(String id) {
        for (Routine r : routines) {
            if (r.getId() == id) {
                return r;
            }
        }
        return null;
    }

    /**
     * 
     * @param r
     */
    public void addRoutine(Routine r) {
        routines.add(r);
    }

    /**
     * Change the username
     * 
     * @param username
     *          Unique username; e.g. johndoe
     */
    public void setUsername(String username) {
        this.username = username;
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

    /**
     * 
     */
    public String toString() {
        return this.username + "'s routines:\n" + this.routines.toString();
    }


}