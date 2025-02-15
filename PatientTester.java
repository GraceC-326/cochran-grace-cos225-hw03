public class PatientTester {

    public static void main(String[] args){

        PatientManager doctor = new PatientManager();
        System.out.println(doctor);

        doctor.pList.add(new Patient(1, 200));
        doctor.pList.add(new Patient(2, 400));
        doctor.pList.add(new Patient(3, 600));
        doctor.pList.add(new Patient(4, 800));
        System.out.println(doctor);

        doctor.caffeineAbsorption();
        doctor.caffeineAbsorption();
        System.out.println(doctor);

        doctor.removePatient(3);
        System.out.println(doctor);
    }
}
