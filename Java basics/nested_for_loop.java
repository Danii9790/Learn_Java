// public class nested_for_loop {
//     public static void main(String[] args){
//         // Outer Loop
//         for (int i = 1; i <= 2;i++){
//             System.out.println("Outer : " + i);

//             // Inner Loop
//             for (int j = 1 ; j <= 3; j++){
//                 System.out.println("Inner : " + j);
//             }
//         }
//     }
// }

// Multiplication Table Example
public class nested_for_loop {
    public static void main(String[] args){
        for (int i = 1;i<=3;i++){
            for(int j =1;j<=3;j++){
                System.out.println(i*j + " ");
            }
            System.out.println();
        }
    }
}
