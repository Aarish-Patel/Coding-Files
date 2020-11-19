import java.util.*;
class Random_test_Class
{
    public static void main()
    {
        double factor = 0;
        Scanner sc = new Scanner(System.in);
        VeeeeeryRandom_OTP ob = new VeeeeeryRandom_OTP();
        System.out.print("Enter the factor of randomness : ");
        factor = sc.nextDouble();
        for(int i = 0; i < 100; i ++)
        {
            System.out.println(ob.OTP(factor));
        }
    }
}