/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author sirip
 */
public class car implements Comparable<car> {
    
    private String manufacturer;
    private boolean availability;
    private int manfyear;
    private int nseats;
    private String serialno;
    private String modelno;
    private String city;
    private boolean expired;
    private int eta;

    public car(String manufacturer, boolean availability, int manfyear, int nseats, String serialno, String modelno, String city, boolean expired, int eta) {
        this.manufacturer = manufacturer;
        this.availability = availability;
        this.manfyear = manfyear;
        this.nseats = nseats;
        this.serialno = serialno;
        this.modelno = modelno;
        this.city = city;
        this.expired = expired;
        this.eta = eta;
    }
    
    public car(){
        
    }

    
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


    public int getManfyear() {
        return manfyear;
    }

    public void setManfyear(int manfyear) {
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

    @Override
    public int compareTo(car comparecar) {
        int compareeta = ((car)comparecar).getEta();
        return this.eta-compareeta;
    }
    
    
}
