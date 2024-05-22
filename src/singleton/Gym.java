package singleton;

import decorator.Workout;
import observer.Athlete;
import observer.TrainingRegiment;

import java.util.List;

public class Gym {
    private static Gym instance;
    private Workout baseWorkout;
    private List<Athlete> athletes;
    private List<TrainingRegiment> trainingRegiments;

    private Gym() {}

    public static Gym getInstance() {
        if (instance == null)
            instance = new Gym();

        return instance;
    }

    public Workout getBaseWorkout() {
        return baseWorkout;
    }

    public void setBaseWorkout(Workout baseWorkout) {
        this.baseWorkout = baseWorkout;
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public List<TrainingRegiment> getTrainingRegiments() {
        return trainingRegiments;
    }

    public void setTrainingRegiments(List<TrainingRegiment> trainingRegiments) {
        this.trainingRegiments = trainingRegiments;
    }
}
