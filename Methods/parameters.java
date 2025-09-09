package Methods;

// public class parameters {
//     static void myMethod(String fname , int age){
//         System.out.println(fname + " is " + age);
//     }
//     public static void main(String[] args){
//         myMethod("Daniyal", 21);
//         myMethod("Ahmed", 9);
//     }
// }

// Another Example: 
public class parameters{
    static void checkAge(int age){
        if (age < 18){
            System.out.println("Access denied!");
        } else{
            System.out.println("Aceess granted!");
        }
    }
    public static void main(String[] args){
        checkAge(20);
        checkAge(17);
    }
}