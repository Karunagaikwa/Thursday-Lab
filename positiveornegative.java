public class positiveornegative
{
    public static void main(String [] args)
    {
        int num = 123;
        if(num > 0)
        {
            System.out.println("given no is:"  + num);
            System.out.println("The number is positive");
        }
        else if(num < 0)
        {
            System.out.println("The number is negative");
        }
        else
        {
            System.out.println("The number is zero");
        }
    }
}