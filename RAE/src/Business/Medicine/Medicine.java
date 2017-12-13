/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

/**
 *
 * @author Romell
 */
public class Medicine {
    private String medicineName;
    private String medId;
     
    private static int mCount;
    public  Medicine()
    {
         medId= "Medicine"+(++mCount);
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getMedId() {
        return medId;
    }

    public void setMedId(String medId) {
        this.medId = medId;
    }
    @Override
    public String toString()
    {
        return medicineName;
    }
    
}
