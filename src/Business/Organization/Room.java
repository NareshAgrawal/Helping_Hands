/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

/**
 *
 * @author Surya
 */
public class Room {
    private int roomnumber;
    private boolean available;
    private String actualroom;
    public Room(int roomnumber,boolean available){
        this.roomnumber=roomnumber;
        this.available=available;
        this.actualroom=String.valueOf(roomnumber);
    }

    public int getRoomnumber() {
        return roomnumber;
    }

    public void setRoomnumber(int roomnumber) {
        this.roomnumber = roomnumber;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getActualroom() {
        return actualroom;
    }

    public void setActualroom(String actualroom) {
        this.actualroom = actualroom;
    }
    
    
    public String tostring(){
        return String.valueOf(roomnumber);
        
    }
}
