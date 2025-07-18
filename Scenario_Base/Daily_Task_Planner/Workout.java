package Daily_Task_Planner;
public class Workout extends Task {
    public Workout(String description) {
        super(description);
    }

    @Override
    public void execute() {
        System.out.println("Workout Task: " + description);
    }
}
