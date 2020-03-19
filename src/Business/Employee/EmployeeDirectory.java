/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import java.util.ArrayList;

/**
 *
 * @author nares
 */
public class EmployeeDirectory {
 
    private ArrayList<Employee> employeeList;
    public EmployeeDirectory() {
        employeeList = new ArrayList();
    }

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    
    public Employee createEmployee(String name){
        Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
    public Employee getEmployeeFromEmpID(int empID) {
        System.out.println("fetch emp id -->" +empID);
        for(Employee employee: this.employeeList )
        {
            System.out.println("current eid -->" +employee.getId());
            if (employee.getId() == empID){
                return employee;
            }
        }
        return null;
    }
    public void removeEmployee(Employee employee){
        employeeList.remove(employee);
    
    }
     public Boolean checkIfEmployeeIsUnique(String name){
        return this.employeeList.stream().noneMatch(emp->emp.getName().equalsIgnoreCase(name));
    }
}
