class TaskNode {
    int id;
    String name;
    int priority;
    String dueDate;
    TaskNode next;

    TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
    }
}

public class TaskScheduler {
    TaskNode head = null;

    void addTaskEnd(int id, String name, int priority, String dueDate) {
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

    void displayTasks() {
        if (head == null) return;
        TaskNode temp = head;
        do {
            System.out.println(temp.id + ": " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    void viewCurrentAndNext() {
        if (head != null) {
            System.out.println("Current: " + head.name);
            head = head.next;
        }
    }

    public static void main(String[] args) {
        TaskScheduler ts = new TaskScheduler();
        ts.addTaskEnd(1, "Design", 1, "2025-07-09");
        ts.addTaskEnd(2, "Code", 2, "2025-07-10");
        ts.displayTasks();
        ts.viewCurrentAndNext();
        ts.viewCurrentAndNext();
    }
}
