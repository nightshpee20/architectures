package observer;

import decorator.Workout;

import java.util.List;

public class Athlete implements Observer {
    private String name;
    private Workout workout;

    public Athlete() {}

    public Athlete(String name) {
        this.name = name;
    }

    @Override
    public void notify(List<Workout> workouts) {
        workouts.forEach(workout -> {
            if (this.workout.getRating() < workout.getRating())
                this.workout = workout;
        });
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Workout getWorkout() {
        return workout;
    }

    public void setWorkout(Workout workout) {
        this.workout = workout;
    }
}
