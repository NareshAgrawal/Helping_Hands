/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author nares
 */
public class NGO_ManagertoFieldWorker_WorkRequest extends WorkRequest {
  private String name;
  private int ID;
  private String MessageNGO;
  private String tempStatus;

    public String getMessageNGO() {
        return MessageNGO;
    }

    public void setMessageNGO(String MessageNGO) {
        this.MessageNGO = MessageNGO;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTempStatus() {
        return tempStatus;
    }

    public void setTempStatus(String tempStatus) {
        this.tempStatus = tempStatus;
    }
  
    
  
}
