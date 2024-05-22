package decorator;

import strategy.BenchPressExercise;
import strategy.DeadliftExercise;
import strategy.Exercise;

import java.util.ArrayList;
import java.util.List;

public class PowerlifterDecorator extends WorkoutDecorator {
    public PowerlifterDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void perform(List<Exercise> exercises) {
        if (exercises == null)
            exercises = new ArrayList<>();

        exercises.add(new DeadliftExercise());
        exercises.add(new BenchPressExercise());

        super.perform();
    }

    @Override
    public List<Exercise> getExercises() {
        return super.getExercises();
    }

    @Override
    public int getRating() {
        return super.getRating() + 15;
    }
}
