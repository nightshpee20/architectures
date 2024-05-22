package strategy;

public class MarathonExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("🏃‍♂️🏃‍♂️ Running a marathon. 🏃‍♂️🏃‍♂️");
    }

    @Override
    public String getType() {
        return "Cardio";
    }

    @Override
    public int getDifficulty() {
        return 10;
    }
}
