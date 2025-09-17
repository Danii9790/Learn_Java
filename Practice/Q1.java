import java.util.Scanner;
class Insuffi_Exception extends Exception{
    public Insuffi_Exception(String message){
        super(message);
    }
}

public class Q1{
    public static void main(String[] args){
        int balance = 10000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Amount to withdraw : ");
        int amount = sc.nextInt();
        try{
            if (amount > balance){
                throw new Insuffi_Exception("Insufficent Balnce to withdraw !");
            } else {
                balance -= amount;
                System.out.println("Your withdraw is succesfully your remaining balance is : " + balance);
            }
        }
        catch(Insuffi_Exception e){
            System.out.print("Error!!" + e.getMessage());
        }
    }
}
