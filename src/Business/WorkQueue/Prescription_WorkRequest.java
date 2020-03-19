/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.POJO.Homeless;
import java.util.ArrayList;

/**
 *
 * @author nares
 */
public class Prescription_WorkRequest extends WorkRequest {
  // private Homeless homeless;
   private String name;
   private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   private ArrayList<String> medicinesList = new ArrayList<>();
   private String diagnosis;

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

  /*  public Homeless getHomeless() {
        return homeless;
    }

    public void setHomeless(Homeless homeless) {
        this.homeless = homeless;
    }*/

    public ArrayList<String> getMedicinesList() {
        return medicinesList;
    }

    public void setMedicinesList(ArrayList<String> medicinesList) {
        this.medicinesList = medicinesList;
    }
    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
    
/*   @Override
    public String toString() {
        return String.valueOf(this.homeless.getCandidateID());
    }*/
}
