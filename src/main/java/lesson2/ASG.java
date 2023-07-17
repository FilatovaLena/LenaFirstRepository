package lesson2;

public class ASG {
    public static void main(String[] args) {

       ASG asg = new ASG();
       asg.odd();


    }
    public void odd ( ){
    for ( int i=0 ; i<=100 ; i++){
        if(i %3 ==0 && i %2 ==0){
          i=i+0;
            System.out.println("odd"+i );

        }
    }
    }
}
