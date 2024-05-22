package observer;

import decorator.Workout;

import java.util.ArrayList;
import java.util.List;

public class TrainingRegiment {
    private List<Athlete> athletes;
    private List<Workout> workouts;

    public void subscribeAthlete(Athlete athlete) {
        athletes.add(athlete);
    }

    public TrainingRegiment() {
        athletes = new ArrayList<>();
        workouts = new ArrayList<>();
    }

    public void unsubscribeAthlete(Athlete athlete) {
        athletes.remove(athlete);
    }

    public void notifyAthletes() {
        if (athletes == null || athletes.isEmpty())
            return;

        athletes.forEach(athlete -> athlete.notify(workouts));
    }

    public List<Athlete> getAthletes() {
        return athletes;
    }

    public void setAthletes(List<Athlete> athletes) {
        this.athletes = athletes;
    }

    public List<Workout> getWorkouts() {
        return workouts;
    }

    public void setWorkouts(List<Workout> workouts) {
        this.workouts = workouts;
        notifyAthletes();
    }
}
