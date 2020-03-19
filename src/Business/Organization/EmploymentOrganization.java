/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.RecruiterRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author nares
 */
public class EmploymentOrganization extends Organization {
    
    public EmploymentOrganization() {
        super(Organization.Type.Employment.getValue());
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RecruiterRole());
        return roles;
    }
    
}
