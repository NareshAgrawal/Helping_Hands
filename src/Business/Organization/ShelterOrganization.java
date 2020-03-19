/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.Shelter_ManagerRole;
import java.util.ArrayList;

/**
 *
 * @author nares
 */
public class ShelterOrganization extends Organization{
    private Shelter shelter;
    public ShelterOrganization() {
        super(Organization.Type.Shelter.getValue());
        this.shelter= new Shelter();
    }
    public Shelter getShelter() {
        return shelter;
    }

    public void setShelter(Shelter shelter) {
        this.shelter = shelter;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
         roles.add(new Shelter_ManagerRole());
        return roles;
    }
}
