package LinkedList.TaskScheduler;
class TaskNode {
    int taskId;
    String taskName;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int taskId, String taskName, int priority, String dueDate) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}

public class TaskScheduler {
    private TaskNode head = null;
    private TaskNode current = null;

    // Add task at the end
    public void addTaskAtEnd(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
        }
    }

    // Add task at the beginning
    public void addTaskAtBeginning(int id, String name, int priority, String dueDate) {
        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            TaskNode temp = head;
            while (temp.next != head)
                temp = temp.next;
            temp.next = newNode;
            newNode.next = head;
            head = newNode;
        }
    }

    // Add task at a specific position (1-based index)
    public void addTaskAtPosition(int id, String name, int priority, String dueDate, int position) {
        if (position <= 1) {
            addTaskAtBeginning(id, name, priority, dueDate);
            return;
        }

        TaskNode newNode = new TaskNode(id, name, priority, dueDate);
        TaskNode temp = head;
        int count = 1;
        while (count < position - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Remove task by ID
    public void removeTaskById(int id) {
        if (head == null) return;

        TaskNode temp = head, prev = null;
        do {
            if (temp.taskId == id) {
                if (temp == head && temp.next == head) {
                    head = null;
                    return;
                }

                if (temp == head) {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                } else {
                    prev.next = temp.next;
                }
                System.out.println("Task " + id + " removed.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        System.out.println("Task ID not found.");
    }

    // View current task and move to next
    public void viewAndMoveToNextTask() {
        if (head == null) {
            System.out.println("No tasks available.");
            return;
        }

        if (current == null)
            current = head;

        System.out.println("Current Task: " + current.taskId + " - " + current.taskName);
        current = current.next;
    }

    // Display all tasks
    public void displayAllTasks() {
        if (head == null) {
            System.out.println("Task list is empty.");
            return;
        }

        TaskNode temp = head;
        System.out.println("Task List:");
        do {
            System.out.println("ID: " + temp.taskId + ", Name: " + temp.taskName + ", Priority: " + temp.priority + ", Due: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }

    // Search task by priority
    public void searchByPriority(int priority) {
        if (head == null) {
            System.out.println("No tasks to search.");
            return;
        }

        boolean found = false;
        TaskNode temp = head;
        do {
            if (temp.priority == priority) {
                System.out.println("Found: " + temp.taskId + " - " + temp.taskName + ", Due: " + temp.dueDate);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tasks found with priority " + priority);
    }

    // Main method to demonstrate
    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();

        ts.addTaskAtEnd(1, "Task A", 1, "2025-07-09");
        ts.addTaskAtBeginning(2, "Task B", 2, "2025-07-10");
        ts.addTaskAtPosition(3, "Task C", 3, "2025-07-11", 2);

        ts.displayAllTasks();

        ts.viewAndMoveToNextTask();
        ts.viewAndMoveToNextTask();

        ts.searchByPriority(2);
        ts.removeTaskById(2);
        ts.displayAllTasks();
    }
}
