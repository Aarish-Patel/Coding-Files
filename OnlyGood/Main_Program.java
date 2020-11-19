import java.util.*;
class Main_Program
{
    String input;
    char c;
    int[] nkey = new int[2];
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    Scanner sc2 = new Scanner(System.in);
    Scanner sc3 = new Scanner(System.in);
    Scanner sc4 = new Scanner(System.in);
    Binary_Encryption ob = new Binary_Encryption();
    Hexadecimal_Encryption ob1 = new Hexadecimal_Encryption();
    Octal_Encryption ob2 = new Octal_Encryption();
    Decimal_Encryption ob3 = new Decimal_Encryption();
    All_Encryption ob4 = new All_Encryption();
    Super_encryption ob5 = new Super_encryption();
    Hacker ob6 = new Hacker();
    Dev ob7 = new Dev();
    Main_Program()
    {
        input = "";
        c = '\u0000';
    }
    int[] main(int Lock, int rkey, int skey, char auto)
    {        
        System.out.print("This is an Encryption Program\nOptions of encryption\n1.Decimal\n2.Binary\n3.Octadecimal\n4.Hexadecimal\n5.All demo\n6.Super\n7.Hacker\n8.Developer\nEnter your option :");
        c = sc.next().charAt(0);
        nkey[0] = skey;
        nkey[1] = rkey;
        if(c == '1' || c == 'd' || c == 'D')
        {   
            System.out.print("Enter the String to be encrypted : ");
            input = sc1.nextLine();
            ob3.Decimal_main(input, rkey, auto);
        }
        if(c == '2' || c == 'b' || c == 'B')
        {
            System.out.print("Enter the String to be encrypted : ");
            input = sc2.nextLine();
            ob.binary_main(input, rkey, auto);
        }
        if(c == '3' || c == 'o' || c == 'O')
        {
            System.out.print("Enter the String to be encrypted : ");
            input = sc3.nextLine();
            ob2.Octal_main(input, rkey, auto);
        }
        if(c == '4' || c == 'h' || c == 'H')
        {
            System.out.print("Enter the String to be encrypted : ");
            input = sc4.nextLine();
            ob1.Hexadecimal_main(input, rkey, auto);
        }
        if(c == '5' || c == 'a' || c == 'A')
        {
            ob4.main(rkey, auto);
        }
        if(c == '6' || c == 's' || c == 'S')
        {
            ob5.main(auto);
        }
        if(c == '7' ||c == 'h' || c == 'H')
        {
            ob6.Key_Extraction(Lock, auto);
        }
        if(c == '8' ||c == 'd' || c == 'D')
        {
            nkey = ob7.UKey(rkey, skey);
            skey = nkey[0];
            rkey = nkey[1];
        }
        return nkey;
    }
}