package m6Filatova;

public class Accountant extends Employee {
    public boolean getEmployeeName;

    public Accountant(String name, int id, String title, String dob, int salary, String address) {
        super(name, id, title, dob, salary, address);
    }


         public Accountant() {

        }

        public void createReport(Accountant  accountant){
            System.out.println("Accountant " + accountant.getEmployeeName() + " will prepare the report " );
        }
    }

