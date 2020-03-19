/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

import java.util.ArrayList;

/**
 *
 * @author nares
 */
public class HomelessDirectory {
    private ArrayList <Homeless> homelesslist;
    
    public HomelessDirectory(){
        homelesslist =new ArrayList();
    }

    public ArrayList<Homeless> getHomelesslist() {
        return homelesslist;
    }
    
}
