/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author sirip
 */
public class carFleet {
    private ArrayList<car> fleet;
    private Date lastUpdatedDate;
    
    
    public carFleet(){
        this.fleet = new ArrayList<car>();
    }

    public ArrayList<car> getFleet() {
        return fleet;
    }

    public void setFleet(ArrayList<car> fleet) {
        this.fleet = fleet;
    }

    public Date getLastUpdatedDate() {
        return lastUpdatedDate;
    }

    public void setLastUpdatedDate(Date lastUpdatedDate) {
        this.lastUpdatedDate = lastUpdatedDate;
    }
    
    public car addNewCar(){
        car newCar = new car();
        fleet.add(newCar);
        return newCar;
        
    }
    
    public void deleteCar(car c){
        fleet.remove(c);
    }
}
