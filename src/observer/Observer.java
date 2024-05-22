package observer;

import decorator.Workout;

import java.util.List;

public interface Observer {
    void notify(List<Workout> workouts);
}
