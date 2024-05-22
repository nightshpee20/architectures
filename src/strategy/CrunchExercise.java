package strategy;

public class CrunchExercise implements Exercise {

    @Override
    public void perform() {
        System.out.println("🥩🥩 Crunches. 🥩🥩");
    }

    @Override
    public String getType() {
        return "Aesthetic";
    }

    @Override
    public int getDifficulty() {
        return 1;
    }
}
