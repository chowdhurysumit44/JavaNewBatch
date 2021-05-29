package basic;

public class JavaInt {
    static int shirt=10;
    static int pant=20;
    static int totalbazar =shirt+pant;

    public static void shopping(){
        System.out.println("Shopping price is: $"+totalbazar);
    }
    public static void sumitshopping(String message){
        System.out.println(message+totalbazar);
    }
}
