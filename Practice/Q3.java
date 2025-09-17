import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int total = 0 , choise;
        do{
            System.out.print("Menu : ");
            System.out.print("(1) American 200 : ");
            System.out.print("(2) Espresso 250 : ");
            System.out.print("(3) Latte 215 : ");
            System.out.print("(0) Quit : ");
            System.out.print("Choose : ");
            choise = sc.nextInt();

            switch(choise){
                case 1 -> total += 200;
                case 2 -> total += 250;
                case 3 -> total += 215;
                case 0 -> System.out.println("Final Bill : Rs . " + total);
                default -> System.out.println("Invalid choise!");
            }
        }
        while (choise != 0); {
            
        }
    }
}
