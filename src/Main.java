import decorator.BasicWorkout;
import decorator.BodybuilderDecorator;
import decorator.CardioDecorator;
import decorator.Workout;
import observer.Athlete;
import observer.TrainingRegiment;
import singleton.Gym;
import strategy.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Exercise benchPress = new BenchPressExercise();
        Exercise crunches = new CrunchExercise();
        Exercise marathon = new MarathonExercise();
        Exercise deadlift = new DeadliftExercise();
        Exercise pullUps = new PullUpExercise();
        Exercise swimming = new SwimmingExercise();

        List<Exercise> exercises = List.of(benchPress, crunches, marathon);

        Workout baseWorkout = new BasicWorkout(exercises);

        Gym gym = Gym.getInstance();
        gym.setBaseWorkout(baseWorkout);

        Athlete athlete1 = new Athlete("Nikola");
        Athlete athlete2 = new Athlete("Pesho");
        Athlete athlete3 = new Athlete("Gosho");

        Workout workout1 = new BasicWorkout(List.of(benchPress, pullUps, deadlift));
        Workout workout2 = new BasicWorkout(List.of(crunches, swimming, marathon));
        Workout workout3 = new BasicWorkout(List.of(pullUps, crunches, swimming));

        athlete1.setWorkout(workout1); //rating == 10
        athlete2.setWorkout(workout2); //rating == 10
        athlete3.setWorkout(workout3); //rating == 10

        gym.setAthletes(List.of(athlete1,athlete2,athlete3));

        TrainingRegiment trainingRegiment = new TrainingRegiment();
        trainingRegiment.setWorkouts(List.of(workout1, workout2, workout3));
        trainingRegiment.subscribeAthlete(athlete1);
        trainingRegiment.subscribeAthlete(athlete2);
        trainingRegiment.subscribeAthlete(athlete3);

        gym.setTrainingRegiments(List.of(trainingRegiment));

        //Testing the baseWorkout
        baseWorkout.perform();

        System.out.println("\n########## TESTING DECORATORS ###############");
        Workout cardioBodybuilderWorkout = new CardioDecorator(new BodybuilderDecorator(baseWorkout));
        cardioBodybuilderWorkout.perform();

        System.out.println("\n########## TESTING OBSERVERS ###############");
        List<Workout> newWorkouts = List.of(workout1, workout2, cardioBodybuilderWorkout, workout3);
        trainingRegiment.setWorkouts(newWorkouts);
        List<Athlete> athletes = trainingRegiment.getAthletes();
        athletes.forEach(athlete -> System.out.println("** " + athlete.getWorkout().getRating())); //** 39

        Athlete updatedAthlete = athletes.get(0);
        Workout newWorkout = new BasicWorkout(List.of(crunches, pullUps, crunches, pullUps));
        updatedAthlete.setWorkout(newWorkout);

        System.out.println("\n########## TESTING STRATEGY ############");
        updatedAthlete.getWorkout().getExercises().forEach(Exercise::perform); //crunches, pullUps, crunches, pullUps

        System.out.println("\n########## TESTING SINGLETON ###############");
        Gym gym2 = Gym.getInstance();
        System.out.println(gym2.getBaseWorkout().equals(gym.getBaseWorkout()));
    }
}
