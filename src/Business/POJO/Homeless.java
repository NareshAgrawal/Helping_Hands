/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.POJO;

/**
 *
 * @author nares
 */
public class Homeless {
    
    private int candidateID;
    private String name;
    private String gender;
    private int SSN;
    private String BOD;
    private String education ;
    private String skills;
    private String disease;
    private long emergency_contact;
    private String street_Name;
    private String city;
    private int zip;
    private String state;
    private String comment;
    private String education_level;
    private int age;
  //  private static int count=100;
    
    public Homeless(){
       // candidateID=count;
        //count++;
    }

    public int getCandidateID() {
        return candidateID;
    }

    public void setCandidateID(int candidateID) {
        this.candidateID = candidateID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getSSN() {
        return SSN;
    }

    public void setSSN(int SSN) {
        this.SSN = SSN;
    }

    public String getBOD() {
        return BOD;
    }

    public void setBOD(String BOD) {
        this.BOD = BOD;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public long getEmergency_contact() {
        return emergency_contact;
    }

    public void setEmergency_contact(long emergency_contact) {
        this.emergency_contact = emergency_contact;
    }
   
    

   

    public String getStreet_Name() {
        return street_Name;
    }

    public void setStreet_Name(String street_Name) {
        this.street_Name = street_Name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEducation_level() {
        return education_level;
    }

    public void setEducation_level(String education_level) {
        this.education_level = education_level;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    
    

           
    
}
