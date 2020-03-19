/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author nares
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Doctor("Doctor"),
        Field_worker("Field worker"),
        Food_Supplier("Food Supplier"),
        Maintences_Staff("Maintences Staff"),
        NGO_Manager("NGO Manager"),
        Pharmacist("Pharmacist"),
        Recruiter("Recruiter"),
        Shelter_Manager("Shelter Manager"),
        ;
        
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
