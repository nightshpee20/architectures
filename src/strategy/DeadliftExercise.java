package strategy;

public class DeadliftExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("🏋️‍♂️🏋️‍♂️ Deadlifting. 🏋️‍♂️🏋️‍♂️");
    }

    @Override
    public String getType() {
        return "Strength";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }
}
