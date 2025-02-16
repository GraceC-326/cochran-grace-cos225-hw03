import java.util.ArrayList;
public class PatientManager {
    
    ArrayList<Patient> pList;

    public PatientManager(){
        pList = new ArrayList<>(10);
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
                Patient patientGot = pList.get(i);
                patientGot.caffeineLvl -= 160;
                if (patientGot.caffeineLvl <= 0){
                    removePatient(i);
                }
            }
        }    
        return 0;
    }

    @Override
    public String toString(){
        if (pList != null){
            String finalStr = null;
            for (int i=0; i < pList.size(); i++){
                if (pList.get(i) != null){
                    Patient patientGotten = pList.get(i);
                    double caffeineTxt = patientGotten.caffeineLvl;
                    int idTxt = patientGotten.idNum;

                    finalStr += idTxt + " " + caffeineTxt + "\n";
                }
            } 
            return finalStr;
        } 
            return "Empty"; 
    }

}
