/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author nares
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Type type){
        Organization organization = null;
        if (type.getValue().equals(Type.Doctor.getValue())){
            organization = new DoctorOrganization();
            organizationList.add(organization);
        }
    
         if (type.getValue().equals(Type.Food.getValue())){
            organization = new FoodOrganization();
            organizationList.add(organization);
           }
        
        if (type.getValue().equals(Type.Employment.getValue())){
            organization = new EmploymentOrganization();
            organizationList.add(organization);
           }
        if (type.getValue().equals(Type.NGO.getValue())){
            organization = new NGOOrganization();
            organizationList.add(organization);
           }
        
        if (type.getValue().equals(Type.Pharmacy.getValue())){
            organization = new PharmacyOrganization();
            organizationList.add(organization);
           }
        
        if (type.getValue().equals(Type.Shelter.getValue())){
            organization = new ShelterOrganization();
            organizationList.add(organization);
           }
        
           return organization;
    }
    public Organization getOrganizationFromOrgID(int orgID) {
        for(Organization organization: organizationList )
        {
            if (organization.getOrganizationID() == orgID){
                return organization;
            }
        }
        return null;
        
    }
        
    public void removeOrganization(Organization organization){
        organizationList.remove(organization);    
    }
    
  
}
