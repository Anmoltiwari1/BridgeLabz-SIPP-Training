import java.util.ArrayList;

class Patient {
    String name;

    Patient(String name) {
        this.name = name;
    }
}

class Doctor {
    String name;

    Doctor(String name) {
        this.name = name;
    }

    void consult(Patient p) {
        System.out.println(name + " consulted " + p.name);
    }
}

class Hospital {
    ArrayList<Doctor> doctors = new ArrayList<>();
    ArrayList<Patient> patients = new ArrayList<>();
}

public class HospitalAssociation {
    public static void main(String[] args) {
        Doctor d1 = new Doctor("Dr. Ramesh");
        Doctor d2 = new Doctor("Dr. Suresh");

        Patient p1 = new Patient("Anmol");
        Patient p2 = new Patient("Rahul");

        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);
    }
}
