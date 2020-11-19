import java.util.*;
class Quadratic_Equation_Done
{
    public static void main()
    {
        String s;
        int x, x2, a, b, c;
        double a1, a2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Quadratic Equation : ");
        s = sc.nextLine();
        x = s.indexOf("^") + 2;
        x2 = s.indexOf("x", x + 1) + 1;
        c = Integer.parseInt(s.substring(x2,s.indexOf("=")));
        if (s.indexOf("x")== 0)
         a = 1;
        else
         a = Integer.parseInt(s.substring(0,s.indexOf("x")));
         
        if (x2 - x == 2)
         b = Integer.parseInt(s.charAt(x)+("1"));
        else
         b = Integer.parseInt(s.substring(x,x2 - 1));
 
        a1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        a2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.println("The First Root is : " + a1);
        System.out.println("The Second Root is : " + a2);
    }
}