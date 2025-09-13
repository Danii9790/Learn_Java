package OOP;

public class constructor {
    int modelYear;
    String modelName;
    public constructor(int year ,String name){
        modelName = name;
        modelYear = year;
    }
    public static void main(String[] args){
        constructor myCar = new constructor(2022, "BMW");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
