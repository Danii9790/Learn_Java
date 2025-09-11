package OOP;

public class class_objects {
    int x = 5;
    public static void main(String[] args){
        class_objects myObj1 = new class_objects(); 
        class_objects myObj2 = new class_objects();
        myObj2.x = 10;
        System.out.println("Obj 1 : " + myObj1.x);
        System.out.println("Obj 2 : " + myObj2.x); 
    }
}
