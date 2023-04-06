import java.util.ArrayList;

/**
 * Holds information for a user's routine.
 * 
 * @version 04.06.2022
 * @author Tim Asher
 */
public class Routine {
    
    private ArrayList<Exercise> exercises;

    /**
     * Constructor
     */
    public Routine() {
        exercises =  new ArrayList<Exercise>();
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
     * @param e
     */
    public void addExercise(Exercise e) {
        exercises.add(e);
    }

    /**
     * 
     */
    public String toString() {
        String str = "Exercise\tBodyPart\tSets\tReps\n------------------------------------\n";
        for (Exercise e : exercises) {
            str += e.toString();
        }
        str += "------------------------------------\n";
        return str;
    }
}
