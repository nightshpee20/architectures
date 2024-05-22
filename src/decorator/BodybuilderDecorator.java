package decorator;

import strategy.CrunchExercise;
import strategy.Exercise;
import strategy.PullUpExercise;

import java.util.ArrayList;
import java.util.List;

public class BodybuilderDecorator extends WorkoutDecorator {
    public BodybuilderDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void perform(List<Exercise> exercises) {
        if (exercises == null)
            exercises = new ArrayList<>();

        exercises.add(new CrunchExercise());
        exercises.add(new PullUpExercise());

        super.perform(exercises);
    }

    @Override
    public int getRating() {
        return super.getRating() + 25;
    }
}
