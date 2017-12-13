/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.workQueue;

/**
 *
 * @author Romell
 */
public class MedicineSupplyWorkRequest extends WorkRequest{
    private String dosageRequest;
    private int quantity;
    private String city;
    private String medicineName;

    public int getQuantity() {
        return quantity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    

    public String getDosageRequest() {
        return dosageRequest;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public void setDosageRequest(String dosageRequest) {
        this.dosageRequest = dosageRequest;
    }
    public String toString()
    {
        return getMessage();
    }
}
