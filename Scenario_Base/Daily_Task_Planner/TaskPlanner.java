package Daily_Task_Planner;
import java.util.LinkedList;
import java.util.Scanner;

public class TaskPlanner {
    LinkedList<Task> tasks = new LinkedList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showAllTasks() {
        for (Task task : tasks) {
            task.execute();
        }
    }

    public void search(String keyword) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.print("Found: ");
                task.execute();
                found = true;
            }
        }
        if (!found) System.out.println("No task found with keyword: " + keyword);
    }

    public static void main(String[] args) {
        TaskPlanner planner = new TaskPlanner();
        planner.addTask(new Meeting("Project discussion at 10 AM"));
        planner.addTask(new Workout("Leg day workout at 7 AM"));
        planner.addTask(new CodingSession("Build LinkedList-based planner"));

        planner.showAllTasks();

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter keyword to search: ");
        String keyword = sc.nextLine();
        planner.search(keyword);
        
        sc.close();
    }
}
