/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Surya
 */
public class Maintainance_Workrequest extends WorkRequest{
    private String RoomNumber;
    private String Maintainancetype;
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getRoomNumber() {
        return RoomNumber;
    }

    public void setRoomNumber(String RoomNumber) {
        this.RoomNumber = RoomNumber;
    }

    public String getMaintainancetype() {
        return Maintainancetype;
    }

    public void setMaintainancetype(String Maintainancetype) {
        this.Maintainancetype = Maintainancetype;
    }
    
}
