public class ReverseNum{
    static int myReverse(int num){
        int rev = 0;
        while (num != 0) {
            rev = rev * 10 + num%10;
            num /= 10; 
        }
        return rev;
    }
    public static void main(String[] args){
        int number = 3456;
        System.out.println("Reverse : " + myReverse(number));
    }
}
