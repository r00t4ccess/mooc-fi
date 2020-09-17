import java.util.ArrayList;

public class ExerciseManagement {
    
    private ArrayList<Exercise> exercises;
    
    public ExerciseManagement() {
        this.exercises = new ArrayList<>();
    }

    public ArrayList<String> exerciseList() {
        ArrayList<String> list = new ArrayList<>();
        for (Exercise exercise : exercises) {
            list.add(exercise.getName());
        }
        return list;
    }
    
    public void add(String exercisea) {
        this.exercises.add(new Exercise(exercisea));
    }
    
    public void markAsCompleted(String exercise) {
        for (Exercise i : exercises) {
            if (i.getName().equals(exercise)) {
                i.setCompleted(true);
            }
        }
    }
    
    public boolean isCompleted(String exercise) {
        for (Exercise i : exercises) {
            if ( i.getName().equals(exercise)) {
                return i.isCompleted();
            }
        }
        
        return false;
    }
}
