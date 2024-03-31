package Practicals;


public class Practical30 {
    public static void main(String[] args) {
        int a = 18;
        System.out.println("Primitive Value is: "+ a);
        Integer i = Integer.valueOf(a);
        System.out.println("Object Value after autoboxing is: "+ i);

        int b = i.intValue();
        System.out.println("Primitive Value after Unboxing: "+ b);
    }
    
}
