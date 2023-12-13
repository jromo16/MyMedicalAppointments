import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();

        Doctor myDoctor = new Doctor("John Alexander", "Médico Cirujano");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejapendeja@gmail.com");
        patient.setWeith(54.6);
        System.out.println(patient.getWeith());

        patient.setPhoneNumber("922496881");
        System.out.println(patient.getPhoneNumber());



        }
    }