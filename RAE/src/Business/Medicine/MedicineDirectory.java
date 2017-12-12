/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author Romell
 */
public class MedicineDirectory {
     private ArrayList<Medicine> medicineList;
    
    public MedicineDirectory(){
        medicineList= new ArrayList<>();
                
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }

    
    
       public Medicine addVaccine() {
        Medicine medicine = new Medicine();
        medicineList.add(medicine);
        return medicine;
    }
    
    public void removeVaccine(Medicine medicine
    ) {
        medicineList.remove(medicine);
    }
    
}
