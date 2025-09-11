package Methods;

// public class recursion {
//         static void countdown(int n) {
//           if (n > 0) {
//             System.out.print(n + " ");
//             countdown(n - 1);
//           }
//         }
      
//         public static void main(String[] args) {
//           countdown(5);
//         }
//       }


public class recursion{
    static int factorial(int n){
        if (n > 1){
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args){
        System.out.println("Factorial of 5 is " + factorial(5));
    }
}