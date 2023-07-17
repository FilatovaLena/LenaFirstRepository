package m6Filatova;

public class Employee {
    String employeeName;
    int employeeID;
    String employeeTitle;
    String employeeDOB;
    int employeeSalary;
    String employeeAddress;





//    public void hireEmployee() {
//        System.out.println(String.format("Manager will hire new employee", employeeName));
//    }
//        public void fireEmployee () {
//            System.out.println(String.format("Manager will fire employee", employeeName));
//        }
//            public void callToCustomer () {
//                System.out.println(String.format("Clerk will call to the customer", employeeName));
//            }
//                public void answerCalls () {
//                    System.out.println(String.format("Clerk will answer incoming calls", employeeName));
//
//                }
//                    public void openAccount () {
//                        System.out.println(String.format("Accountant will open new account", employeeName));
//                        public void closeAccount () {
//                            System.out.println(String.format("Accountant will close an account ", employeeName));
//                            public void createReport () {
//                                System.out.println(String.format("Accountant will prepare the report ", employeeName));
//
//                            }

//                            String Manager = "The salary of Manager is 10000$";
//                            String Clerk = "The salary of Clerk is 3000$";
//                            String Accountant = "The salary of an Accountant is 5000$";

    public Employee (){
    }

    public Employee (String name, int id, String title, String dob,int salary,  String address){
                                this.employeeName = name;
                                this.employeeID = id;
                                this.employeeTitle = title;
                                this.employeeDOB = dob;
                                this.employeeSalary = salary;
                                this.employeeAddress = address;
        System.out.println("$$$$$$$$$$$$$$");
        System.out.println("Employee name is " + employeeName);
        System.out.println("Employee ID is " + employeeID);
        System.out.println("Employee title is " + employeeTitle);
        System.out.println("Employee DOB is " + employeeDOB);
        System.out.println("Employee salary is " + employeeSalary);
        System.out.println("Employee address is " + employeeAddress);
    }
    public void employeeDetails () {

    }









    public String getEmployeeName () {
        return employeeName;
    }

    public void setEmployeeName (String employeeName){
        this.employeeName = employeeName;
    }

    public int getEmployeeID () {
        return employeeID;
    }

    public void setEmployeeID ( int employeeID){
        this.employeeID = employeeID;
    }

    public String getEmployeeTitle () {
        return employeeTitle;
    }

    public void setEmployeeTitle (String employeeTitle){
        this.employeeTitle = employeeTitle;
    }

    public String getEmployeeDOB () {
        return employeeDOB;
    }

    public void setEmployeeDOB (String employeeDOB){
        this.employeeDOB = employeeDOB;
    }

    public int getEmployeeSalary () {
        return employeeSalary;
    }

    public void setEmployeeSalary ( int employeeSalary){
        this.employeeSalary = employeeSalary;
    }

    public String getEmployeeAddress () {
        return employeeAddress;
    }

    public void setEmployeeAddress (String employeeAddress){
        this.employeeAddress = employeeAddress;
    }
}
