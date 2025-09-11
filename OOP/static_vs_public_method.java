package OOP;

public class static_vs_public_method {
    static void myStaticMethod(){
        System.out.println("Static Methods can be called without creating objects");
    }
    public void myPublicMethod(){
        System.out.println("Public Method must be called by creating Objects");
    }
    public static void main(String[] args){
        myStaticMethod(); // Call the static method
        // myPublicMethod(); // Call the public method
        static_vs_public_method obj = new static_vs_public_method(); // Create an Object of Main
        obj.myPublicMethod(); // Call the public method on the Object
        
    }
}
