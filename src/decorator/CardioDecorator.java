package decorator;

import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class CardioDecorator extends WorkoutDecorator {
    public CardioDecorator(Workout workout) {
        super(workout);
    }

    @Override
    public void perform(List<Exercise> exercises) {
        if (exercises == null)
            exercises = new ArrayList<>();

        exercises.add(new SwimmingExercise());
        exercises.add(new MarathonExercise());

        super.perform(exercises);
    }

    @Override
    public int getRating() {
        return super.getRating() + 4;
    }
}
