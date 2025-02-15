import java.util.ArrayList;
public class PatientManager {
    
    ArrayList<Patient> pList;

    public PatientManager(){
        pList = new ArrayList<Patient>(10);
    }

    public int admitPatient(Patient beingAdmitted){
        for (int i=0; i < pList.size(); i++){
            if (pList.get(i) == null){
                pList.set(i, beingAdmitted);
                int index = i;
                return index;
            }
        }
        return -1;
    }

    public Patient removePatient(int indexNum){
        Patient pRemoved = pList.get(indexNum);
        pList.set(indexNum, null);
        return pRemoved;
    }

    public int caffeineAbsorption(){
        for (int i=0; i < pList.size(); i++){
            if (pList.get(i) != null){

                //pList.caffeineLvl;
                // figure out how to get and change caffeine level 
                //
            }
        }    
        return 0;
    }

    @Override
    public String toString(){
        if (pList != null){
            String finalStr;
            for (int i=0; i < pList.size(); i++){
                if (pList.get(i) != null){
    
                    // again
                    // figure out how to get caffeine level and ID number

                    // finalStr += patientIdvar + " " + patientCaffieneVar + "\n";
                }
            } 
            return finalStr;
        } else {
            return "Empty"; 
        }
    }

}
