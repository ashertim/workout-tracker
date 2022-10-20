
/**
 * 
 * @version 10.20.2022
 * @author Tim Asher
 */
public class Exercise {

    private String exerciseName; // name of exercise, e.g. Bicep Curl
    private String bodyPart; // body part worked by exercise, e.g. Bicep
    private int reps; // number repeated in a set, e.g. 10
    private int sets; // number of sets for the exercise, e.g. 3
    
    /**
     * Initialise the Exercise object
     * 
     * @param exerciseName
     *          The name of the exercise, e.g. Bicep Curl
     */
    public Exercise(String exerciseName) {
        this.exerciseName = exerciseName;
        this.bodyPart = "";
        this.reps = 0;
        this.sets = 0;
    }

    /**
     * @return name of exercise
     */
    public String getExerciseName() {
        return exerciseName;
    }

    /**
     * @return body part worked by exercise
     */
    public String getBodyPart() {
        return bodyPart;
    }

    /**
     * @return number of sets for exercise
     */
    public int getSets() {
        return sets;
    }

    /**
     * @return number of reps per set for exercise
     */
    public int getReps() {
        return reps;
    }

    /**
     * 
     * @param exerciseName
     */
    public void setExerciseName(String exerciseName) {
        this.exerciseName = exerciseName;
    }

    /**
     * 
     * @param bodyPart
     */
    public void setBodyPart(String bodyPart) {
        this.bodyPart = bodyPart;
    }

    /**
     * 
     * @param sets
     */
    public void setSets(int sets) {
        this.sets = sets;
    }

    /**
     * 
     * @param reps
     */
    public void setReps(int reps) {
        this.reps = reps;
    }
}
