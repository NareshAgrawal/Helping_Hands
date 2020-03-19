    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.POJO.Homeless;

/**
 *
 * @author Surya
 */
public class FoodSupplier_WorkRequest  extends WorkRequest {
  
  private String Item;
  private Homeless homeless;
  private String itemtype;

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }
  
    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public Homeless getHomeless() {
        return homeless;
    }

    public void setHomeless(Homeless homeless) {
        this.homeless = homeless;
    }

    @Override
    public String toString() {
        return String.valueOf(this.homeless.getCandidateID());
    }
    
  
}
    