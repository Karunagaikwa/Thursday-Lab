public class Casting
{
    public static void main(String [] args)
    {
        int i = 81;
        char c;
        c =(char) i;
        System.out.println("The (int) value 81 is converted into (char) is:  " +c);

        double d = 324.142;
        i = (int)d;
        System.out.println("The (double) value 324.142 is converted into (int) is: "  +i);

        float f = 72.38f;
        i = (int) f;
        System.out.println("The (float) value is converted into (int) is:  "  +i);

        byte b;
        b = (byte) d;
        System.out.println("The (double) value is converted into (byte) is:  "  + b);

    }
    
}