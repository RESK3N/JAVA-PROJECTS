import java.io.*;
import java.util.Scanner;

class Person {
    String name;
    int age;
    String gender;
}

class Patient extends Person {
    String disease, admitDate;

    void inputData(Scanner sc) {
        System.out.print("Name: "); name = sc.next();
        System.out.print("Age: "); age = sc.nextInt();
        System.out.print("Gender: "); gender = sc.next();
        System.out.print("Disease: "); disease = sc.next();
        System.out.print("Admit Date: "); admitDate = sc.next();
    }

    void saveToFile() throws IOException {
        FileWriter fw = new FileWriter("patients.txt", true);
        fw.write(name + "," + age + "," + gender + "," + disease + "," + admitDate + "\n");
        fw.close();
    }

    static void viewAllPatients() throws IOException {
        FileReader fr = new FileReader("patients.txt");
        int i;
        System.out.println("All Patients:");
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}

class Doctor extends Person {
    String specialization, timings;

    void inputData(Scanner sc) {
        System.out.print("Name: "); name = sc.next();
        System.out.print("Age: "); age = sc.nextInt();
        System.out.print("Gender: "); gender = sc.next();
        System.out.print("Specialization: "); specialization = sc.next();
        System.out.print("Timings: "); timings = sc.next();
    }

    void saveToFile() throws IOException {
        FileWriter fw = new FileWriter("doctors.txt", true);
        fw.write(name + "," + age + "," + gender + "," + specialization + "," + timings + "\n");
        fw.close();
    }

    static void viewAllDoctors() throws IOException {
        FileReader fr = new FileReader("doctors.txt");
        int i;
        System.out.println("All Doctors:");
        while ((i = fr.read()) != -1) {
            System.out.print((char) i);
        }
        fr.close();
    }
}

public class hospital {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Add Patient\n2. Add Doctor\n3. View Patients\n4. View Doctors\n5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    Patient p = new Patient();
                    p.inputData(sc);
                    p.saveToFile();
                    break;
                case 2:
                    Doctor d = new Doctor();
                    d.inputData(sc);
                    d.saveToFile();
                    break;
                case 3:
                    Patient.viewAllPatients();
                    break;
                case 4:
                    Doctor.viewAllDoctors();
                    break;
                case 5:
                    System.out.println("Exiting...");
            }
        } while (choice != 5);

        sc.close();
    }
}
