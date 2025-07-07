package LinkedList.Student_Reacord_Managment;
public class StudentList {
    private Student head;

    public void addAtBeginning(Student newStudent) {
        newStudent.next = head;
        head = newStudent;
    }

    public void addAtEnd(Student newStudent) {
        if (head == null) {
            head = newStudent;
            return;
        }
        Student current = head;
        while (current.next != null)
            current = current.next;
        current.next = newStudent;
    }

    public void deleteByRollNumber(int rollNumber) {
        if (head == null) return;
        if (head.rollNumber == rollNumber) {
            head = head.next;
            return;
        }
        Student current = head;
        while (current.next != null && current.next.rollNumber != rollNumber)
            current = current.next;
        if (current.next != null)
            current.next = current.next.next;
    }

    public Student searchByRollNumber(int rollNumber) {
        Student current = head;
        while (current != null) {
            if (current.rollNumber == rollNumber) return current;
            current = current.next;
        }
        return null;
    }

    public void updateGrade(int rollNumber, char newGrade) {
        Student s = searchByRollNumber(rollNumber);
        if (s != null)
            s.grade = newGrade;
    }

    public void display() {
        Student current = head;
        while (current != null) {
            System.out.println("Roll: " + current.rollNumber + ", Name: " + current.name + ", Age: " + current.age + ", Grade: " + current.grade);
            current = current.next;
        }
    }
}
