package decorator;

import strategy.Exercise;

import java.util.List;

public class BasicWorkout implements Workout {
    private List<Exercise> exercises;

    public BasicWorkout() {}

    public BasicWorkout(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    @Override
    public void perform() {
        perform(null);
    }

    @Override
    public void perform(List<Exercise> exercises) {
        if (this.exercises != null && !this.exercises.isEmpty())
            this.exercises.forEach(Exercise::perform);

        if (exercises == null || exercises.isEmpty())
            return;

        exercises.forEach(Exercise::perform);
    }

    @Override
    public List<Exercise> getExercises() {
        return exercises;
    }

    @Override
    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }

    @Override
    public int getRating() {
        return 10;
    }
}
