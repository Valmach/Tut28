/**
 * Created by valmach on 17/01/2017.
 */

//Casting


public class App {
    public static void main(String[] args) {

        byte byteValue = 20;
        short shortValue = 55;
        int intValue = 888;
        long longValue = 23355;

        float floatValue = 8834.3f; //insert 'f' at the end of float
        float flotValue2 = (float)99.3;
        double doubleValue = 32.4;

        System.out.println(Byte.MAX_VALUE);

        intValue = (int) longValue;

        System.out.println(intValue);

        doubleValue = intValue;
        System.out.println(doubleValue);

        intValue = (int)floatValue;
        System.out.println(intValue);

        //The following won't work as i expect it to
        //128 is too bif for a byte
        byteValue =(byte)128;
        System.out.println(byteValue);
    }
}
