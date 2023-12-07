// HospitalManagementSystem.java
import java.util.ArrayList;

public class HospitalManagementSystem {
    public static void main(String[] args) {
        // Create patients
        Patient patient1 = new Patient("John Doe", 25, "Fever");
        Patient patient2 = new Patient("Jane Smith", 30, "Broken Leg");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Johnson", "Orthopedic Surgeon");

        // Assign patients to doctors
        doctor1.assignPatient(patient1);
        doctor2.assignPatient(patient2);

        // Display information
        System.out.println("Patient Information:");
        System.out.println(patient1);
        System.out.println(patient2);

        System.out.println("\nDoctor Information:");
        System.out.println(doctor1);
        System.out.println(doctor2);
    }
}
