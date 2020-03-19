/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Surya
 */
public class Shelter {
    private List<Room> roomList;
    
    public Shelter(){
        this.roomList= new ArrayList<>();
        Room room = new Room(0,true);
         for(int i=1;i<=25;i++){
             room= new Room(i,true);
             roomList.add(room);
         }
    }
    
    public Room bookroom(String actualroom){
        
        for(int i= 0;i<roomList.size();i++){
            if(roomList.get(i).getActualroom().equals(actualroom)){
                roomList.get(i).setAvailable(false);
                return roomList.get(i);
            }
        }
        return null;
    }
    
    public List displayAvailableRooms(){
        List<Room> tempList= new ArrayList();
        for(Room s:roomList){
            if(s.isAvailable()){
            tempList.add(s);
            }
        }
        return tempList;
    }
    public List<Room> getRoomList() {
        return roomList;
    }
    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}


