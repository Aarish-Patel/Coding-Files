import java.util.*;
class All_Encryption
{
    char c, auto;
    String wastetime;
    int i;
    String input;
    Scanner sc = new Scanner(System.in);
    All_Encryption()
    {
        auto = '\u0000';
        c = '\u0000';
        input = "";
    }
    void main(int rkey, char auto)
    {
        Binary_Encryption ob = new Binary_Encryption();
        Hexadecimal_Encryption ob1 = new Hexadecimal_Encryption();
        Octal_Encryption ob2 = new Octal_Encryption();
        Decimal_Encryption ob3 = new Decimal_Encryption();
        System.out.print("Enter the String to be encrypted : ");
        input = sc.nextLine();
        ob3.Decimal_main(input, rkey, auto);
        System.out.print("Press any key : ");
        if(Character.toLowerCase(auto) == 'y')
            wastetime = sc.next();
        ob.binary_main(input, rkey, auto);
        System.out.print("Press any key : ");
        if(Character.toLowerCase(auto) == 'y')
            wastetime = sc.next();
        ob2.Octal_main(input, rkey, auto);
        System.out.print("Press any key : ");
        if(Character.toLowerCase(auto) == 'y')
            wastetime = sc.next();
        ob1.Hexadecimal_main(input, rkey, auto);
    }
}