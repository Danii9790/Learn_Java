import java.util.Scanner;
public class compute_electricity_bill{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int units = scanner.nextInt();

        double bill = 0;

        if (units <=100){
            bill = units * 15;
        } else if(units <=200){
            bill = (100 * 15 ) + ((units - 100) * 20);
        
        } else{
            bill = (100 * 15) + (100 * 20) + ((units - 200) * 25);
        }
        System.out.println("Electricity Bill for " + units +" " +  "Units Rs: " + bill);
        scanner.close();

    }
}
