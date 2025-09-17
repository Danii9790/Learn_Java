package OOP;

// public class constructor {
//     int modelYear;
//     String modelName;
//     public constructor(int year ,String name){
//         modelName = name;
//         modelYear = year;
//     }
//     public static void main(String[] args){
//         constructor myCar = new constructor(2022, "BMW");
//         System.out.println(myCar.modelYear + " " + myCar.modelName);
//     }
// }

// Without Constructor
// public class constructor {
//     int modelYear;
//     String modelName;
//     public static void main(String[] args){
//         constructor car1 = new constructor();
//         car1.modelName = "BMW";
//         car1.modelYear = 2021;
        
//         System.out.println(car1.modelYear + " " + car1.modelName );
//     }
// }

// With Constructor

public class constructor{
    int modelYear;
    String modelName;
    public constructor(int year , String name){
        modelName = name;
        modelYear = year;
    }
    public static void main(String[] args){
        constructor car1 = new constructor(2021, "BMW");  // Value set in one line
        constructor car2 = new constructor(2023, "Mercedes"); //another car, no extra code
        System.out.println(car1.modelName + " " + car1.modelYear);
        System.out.println(car2.modelName + " " + car2.modelYear);
    }

}
