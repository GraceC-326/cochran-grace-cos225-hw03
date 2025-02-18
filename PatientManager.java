/*
 Grace Cochran
 COS 225: Homework 3
 */

import java.util.ArrayList;
public class PatientManager {
    
    ArrayList<Patient> pList;

    public PatientManager(){
        pList = new ArrayList<>();
        // for loop makes the size 10 by adding ten null patients
        for (int i=0; i < 10; i++){
            pList.add(null);
        }
    }

    // goes through the size of the list and adds a patient if a space in
    // the list is null.
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

    // goes through the size of the list, checks for spots with patients
    // in them, and minuses each patients caffeine level by 160.
    // also calls removePatient() if a patient's caffeinr level is less
    // than zero.
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

    // Goes through the size of the list, checks for spots with patients
    // in them, takes their ID numbers & caffeine levels into variables,
    // and puts the variables into a string to be returned.
    // Also returns string "Empty" if going through the size of the list
    // results in no patients being found.
    @Override
    public String toString(){
        String finalStr = "";
        for (int i=0; i < pList.size(); i++){
            if (pList.get(i) != null){
                Patient patientGotten = pList.get(i);
                // note: caffeine level is turned into an int to get rid of
                // the .0 in the double
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