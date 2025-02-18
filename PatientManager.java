import java.text.ParseException;
import java.util.ArrayList;
public class PatientManager {
    
    ArrayList<Patient> pList;

    public PatientManager(){
        pList = new ArrayList<>();
        for (int i=0; i < 10; i++){
            pList.add(null);
        }
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
        
            String finalStr = "";
            for (int i=0; i < pList.size(); i++){
                if (pList.get(i) != null){
                    Patient patientGotten = pList.get(i);
                    int caffeineTxt = (int)patientGotten.caffeineLvl;
                    int idTxt = patientGotten.idNum;

                    finalStr += idTxt + " " + caffeineTxt + "\n";
                }
            } 
            if("".equals(finalStr)){
            return "Empty\n";
            }
            return finalStr; 
    }

}
