public class PatientTester {

    public static void main(String[] args){

        PatientManager doctor = new PatientManager();
        System.out.println(doctor);

        doctor.admitPatient(new Patient(1, 200));
        doctor.admitPatient(new Patient(2, 400));
        doctor.admitPatient(new Patient(3, 600));
        doctor.admitPatient(new Patient(4, 800));
        System.out.println(doctor);

        doctor.caffeineAbsorption();
        doctor.caffeineAbsorption();
        System.out.println(doctor);

        doctor.removePatient(3);
        System.out.println(doctor);
    }
}
