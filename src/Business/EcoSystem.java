/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Organization.Organization;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.network.Network;
import java.util.ArrayList;
import Business.POJO.HomelessDirectory;

/**
 *
 * @author nares
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;
    private HomelessDirectory homelessDirectory;
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    public HomelessDirectory gethomlessDirectory(){
        if(homelessDirectory==null){
            homelessDirectory = new HomelessDirectory();
            homelessDirectory.getHomelesslist();//creating empty array
        }
        return homelessDirectory;
    }
    
    public Network createAndAddNetwork(){
        Network network=new Network();
        networkList.add(network);
        return network;
    }
     public Boolean checkifNetworkIsUnique(String name){
        return networkList.stream().noneMatch(nwk->nwk.getName().equalsIgnoreCase(name));
    }
     
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        networkList=new ArrayList<Network>();
    }

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
            return false;
        }
       
        return true;
    }
}
