/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.EcoSystem;
import Business.POJO.Homeless;
import java.util.HashMap;

/**
 *
 * @author nares
 */
public class AnalysisHelper {
    
    private EcoSystem system;
    public AnalysisHelper(EcoSystem system) {
        this.system = system;
    }
   public HashMap getCandidateGenderDistribution(){
       HashMap<String, Integer> data = new HashMap<>();
       int maleCount = 50;
       int femaleCount = 25;
       int otherCount = 5;
       for (Homeless homeless : system.gethomlessDirectory().getHomelesslist()){
        if (homeless.getGender().equalsIgnoreCase("Male")){
           maleCount = maleCount + 1;
           }
         if (homeless.getGender().equalsIgnoreCase("Female")){
           femaleCount = femaleCount + 1;
           }
         if (homeless.getGender().equalsIgnoreCase("Other")){
           otherCount = otherCount + 1;
          }
       }
       data.put("Male", maleCount);
       data.put("Female", femaleCount);
       data.put("Other", otherCount);
       return data;
   }
     public HashMap getCandiateAgeDistribution(){
       HashMap<String, Integer> data = new HashMap<>();
       int under18 = 30;
       int adult = 25;
       int old = 60;
       int age;
       for (Homeless homeless : system.gethomlessDirectory().getHomelesslist()){
        if (homeless.getAge() != 0){
           age =  homeless.getAge();
           if(age <= 15 ){
                under18 = under18 +1;
            }
           if(age > 15 && age <= 60 ){
                adult = adult +1;
            }
           if(age > 60 ){
                old = old +1;
            }
         }
       }
       data.put("Under18", under18);
       data.put("Adult", adult);
       data.put("Above60", old);
       return data;
   }
   public HashMap getCandiateEducationDistribution(){
       HashMap<String, Integer>  data = new HashMap<>();
       String education;
       int value;
       for (Homeless homeless : system.gethomlessDirectory().getHomelesslist()){
        value = 0;
        education = homeless.getEducation_level();
        if (education != null){
           education =  homeless.getEducation_level();
            if (data.containsKey(education)){
                value = data.get(education);
            }
            value = value + 1;
            data.put(education, value);
           }
       }
       data.put("HighSchool", 40);
       data.put("Graduate", 20);
       data.put("UnderGraduate", 40);
       return data;
   }
    
}
