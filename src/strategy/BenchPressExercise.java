package strategy;

public class BenchPressExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("💪💪 Bench Pressing. 💪💪");
    }

    @Override
    public String getType() {
        return "Strength";
    }

    @Override
    public int getDifficulty() {
        return 2;
    }
}
