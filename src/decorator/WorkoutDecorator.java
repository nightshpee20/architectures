package decorator;

import strategy.Exercise;

import java.util.List;

public abstract class WorkoutDecorator implements Workout {
    protected Workout workout;

    public WorkoutDecorator(Workout workout) {
        this.workout = workout;
    }

    @Override
    public void perform() {
        perform(null);
    }

    @Override
    public void perform(List<Exercise> exercises) {
        workout.perform(exercises);
    }

    @Override
    public List<Exercise> getExercises() {
        return workout.getExercises();
    }

    @Override
    public void setExercises(List<Exercise> exercises) {
        workout.setExercises(exercises);
    }

    @Override
    public int getRating() {
        return workout.getRating();
    }
}
