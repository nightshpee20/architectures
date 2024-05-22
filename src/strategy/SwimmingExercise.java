package strategy;

public class SwimmingExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("🏊‍♂️🏊‍♂️ Swimming 1km 🏊‍♂️🏊‍♂️");
    }

    @Override
    public String getType() {
        return "Cardio";
    }

    @Override
    public int getDifficulty() {
        return 5;
    }
}
