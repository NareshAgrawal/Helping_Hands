/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Food_SupplierRole;
import Business.Role.Role;
import java.util.ArrayList;


/**
 *
 * @author nares
 */
public class FoodOrganization extends Organization{
  
     public FoodOrganization() {
        super(Organization.Type.Food.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new Food_SupplierRole());
        return roles;
    }
}
