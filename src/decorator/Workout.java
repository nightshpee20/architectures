package decorator;

import strategy.Exercise;

import java.util.List;

public interface Workout {
    void perform();
    void perform(List<Exercise> exercises);
    List<Exercise> getExercises();
    void setExercises(List<Exercise> exercises);
    int getRating();
}
