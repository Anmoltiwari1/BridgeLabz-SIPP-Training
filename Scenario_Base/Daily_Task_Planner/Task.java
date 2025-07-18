package Daily_Task_Planner;
public abstract class Task {
    String description;

    public Task(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
