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
        createSampleFleet();
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
    
    public void addNewCar(car newCar){
        //car newCar = new car();    
        fleet.add(newCar);
        //return newCar;

    }
    
    public void deleteCar(car c){
        fleet.remove(c);
    }
    
    public void createSampleFleet() {
        car c1 = new car("GM",true,2005,5,"BAC12","A320","Newyork",false,20);
        car c2 = new car("GM",false,2009,3,"ZXC34","XC40","Boston",false,15);
        car c3 = new car("GM",true,2010,4,"XCX21","AC50","Newyork",true,15);
        car c4 = new car("GM",true,2011,2,"DF345","XC40","Boston",false,5);
        car c5 = new car("GM",true,2013,1,"BAC34","A320","California",false,1);
        car c6 = new car("Toyota",false,2015,6,"FDC12","SUV1","Newyork",false,5);
        car c7 = new car("Toyota",true,2017,3,"RFR45","SUV1","California",true,35);
        car c8 = new car("Toyota",true,2015,2,"TGY45","I320","Boston",false,2);
        car c9 = new car("Toyota",true,2016,0,"GCV34","XC60","Newyork",false,15);
        car c10 = new car("Toyota",false,2008,1,"BCF45","ALTIS","Boston",true,3);
        car c11 = new car("Mercedes",true,2019,3,"MCF65","E320","California",false,45);
        car c12 = new car("Mercedes",false,2020,1,"DFG45","AMG","Newyork",false,32);
        car c13 = new car("Mercedes",true,2005,3,"RFM34","AMG","Boston",false,7);
        car c14 = new car("Mercedes",true,2019,2,"FTS34","SUV1","Boston",true,2);
        car c15 = new car("Mercedes",false,2012,3,"RFT56","AMG","Newyork",false,45);
        car c16 = new car("BMW",true,2015,4,"BTE35","I320","California",false,32);
        car c17 = new car("BMW",false,2018,2,"GHR32","XC60","Newyork",false,20);
        car c18 = new car("BMW",true,2021,1,"DFR21","X360","Boston",false,5);
        car c19 = new car("BMW",true,2013,2,"ERF69","I320","Boston",false,6);
        car c20 = new car("BMW",false,2014,1,"RFT98","AMG","California",true,3);
        
        
        addNewCar(c1);
        addNewCar(c2);
        addNewCar(c3);
        addNewCar(c4);
        addNewCar(c5);
        addNewCar(c6);
        addNewCar(c7);
        addNewCar(c8);
        addNewCar(c9);
        addNewCar(c10);
        addNewCar(c11);
        addNewCar(c12);
        addNewCar(c13);
        addNewCar(c14);
        addNewCar(c15);
        addNewCar(c16);
        addNewCar(c17);
        addNewCar(c18);
        addNewCar(c19);
        addNewCar(c20);

        
    }
}
