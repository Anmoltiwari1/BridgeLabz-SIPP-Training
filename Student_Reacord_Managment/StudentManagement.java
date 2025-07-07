package Student_Reacord_Managment;
public class StudentManagement {
    public static void main(String[] args) {
        StudentList list = new StudentList();
        list.addAtBeginning(new Student(1, "Anmol", 21, 'A'));
        list.addAtEnd(new Student(2, "Raj", 22, 'B'));
        list.display();
        list.updateGrade(2, 'A');
        list.display();
    }
}
