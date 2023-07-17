package m6Filatova;

public class Clerk extends Employee{
    public Clerk(String name, int id, String title, String dob, int salary, String address) {
        super(name, id, title, dob, salary, address);
    }



    public Clerk() {

    }

    public void callToTheCustomer(Clerk clerk){
            System.out.println("Clerk " + clerk.getEmployeeName() + " calling to the customer " );
    }
    public void answerIncomingCalls (Clerk clerk1){
        System.out.println("Clerk " + clerk1.getEmployeeName() + " answering incoming calls ");
    }
}




