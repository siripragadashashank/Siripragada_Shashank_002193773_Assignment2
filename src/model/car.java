/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sirip
 */
public class car {
    
    private String manufacturer;
    private boolean availability;
    private String manfyear;
    private int nseats;
    private String serialno;
    private String modelno;
    private String city;
    private boolean expired;
    private int eta;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }


    public String getManfyear() {
        return manfyear;
    }

    public void setManfyear(String manfyear) {
        this.manfyear = manfyear;
    }

    public int getNseats() {
        return nseats;
    }

    public void setNseats(int nseats) {
        this.nseats = nseats;
    }

    public String getSerialno() {
        return serialno;
    }

    public void setSerialno(String serialno) {
        this.serialno = serialno;
    }

    public String getModelno() {
        return modelno;
    }

    public void setModelno(String modelno) {
        this.modelno = modelno;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isExpired() {
        return expired;
    }

    public void setExpired(boolean expired) {
        this.expired = expired;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }
    
    @Override
    public String toString(){
        return manufacturer;
    }
    
}
