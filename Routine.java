import java.util.ArrayList;

/**
 * Holds information for a user's routine.
 * 
 * @version 04.19.2022
 * @author Tim Asher
 */
public class Routine {
    
    private ArrayList<Exercise> exercises;
    private String id;

    /**
     * Constructor
     */
    public Routine(String id) {
        this.id = id;
        exercises =  new ArrayList<Exercise>();
    }

    /**
     * 
     * @return
     */
    public String getId() {
        return this.id;
    }

    /**
     * 
     * @return
     */
    public ArrayList<Exercise> getExercises() {
        return this.exercises;
    }

    /**
     * 
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 
     * @param e
     */
    public void addExercise(Exercise e) {
        exercises.add(e);
    }

    /**
     * 
     */
    public String toString() {
        String str = this.id + "\nExercise\tBodyPart\tSets\tReps\n------------------------------------\n";
        for (Exercise e : exercises) {
            str += e.toString();
        }
        str += "------------------------------------\n";
        return str;
    }
}
