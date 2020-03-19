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
public class DoctorWorkRequest extends WorkRequest{
    
    private String messageDoc;
   
    private String name;

    public String getMessageDoc() {
        return messageDoc;
    }

    public void setMessageDoc(String messageDoc) {
        this.messageDoc = messageDoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
