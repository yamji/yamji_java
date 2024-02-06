package casting;

public class casting1 {
    public static void main(String[] args) {
        int intValue = 10;
        long longValue;
        double soubleValue;

        longValue = intValue; //int -> long
        System.out.println("longValue = " + longValue); //longValue = 10

        soubleValue = intValue;
        System.out.println("doubleValue1 = " + soubleValue); //doubleValue1 = 10.0

        soubleValue = 20L;
        System.out.println("dobleValue2 = " + soubleValue); //doubleValue2 = 20.0
    }
}
