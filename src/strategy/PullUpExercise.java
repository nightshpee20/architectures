package strategy;

public class PullUpExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("🪂🪂 Pull ups. 🪂🪂");
    }

    @Override
    public String getType() {
        return "Aesthetic";
    }

    @Override
    public int getDifficulty() {
        return 3;
    }
}
