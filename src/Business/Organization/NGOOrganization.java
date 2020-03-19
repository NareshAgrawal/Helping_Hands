/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Field_WorkerRole;
import Business.Role.Maintences_StaffRole;
import Business.Role.NGO_ManagerRole;
import Business.Role.Role;
import java.util.ArrayList;
/**
 *
 * @author nares
 */
public class NGOOrganization extends Organization{
    
     public NGOOrganization() {
        super(Organization.Type.NGO.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Maintences_StaffRole());
        roles.add(new NGO_ManagerRole());
        roles.add(new Field_WorkerRole());
        return roles;
    }
    
}
