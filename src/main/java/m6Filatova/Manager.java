package m6Filatova;

public class Manager extends Employee {

    String hireEmployees;
    String fireEmployees;
    public Manager(String name, int id, String title, String dob, int salary, String address) {
        super(name, id, title, dob, salary, address);
    }

    public Manager() {
    }

    public String getHireEmployees() {
        return hireEmployees;
    }

    public void setHireEmployees(String hireEmployees) {
        this.hireEmployees = hireEmployees;
    }

    public String getFireEmployees() {
        return fireEmployees;
    }

    public void setFireEmployees(String fireEmployees) {
        this.fireEmployees = fireEmployees;
    }

    public void employeeDetails(){
        System.out.println("Hire" + hireEmployees);
        System.out.println("Fire" + fireEmployees);
    }


    public void hireSomeone(Manager manager,Clerk clerk){
        System.out.println("Manager " + manager.getEmployeeName() + " hired " +clerk.getEmployeeName());
    }
}
