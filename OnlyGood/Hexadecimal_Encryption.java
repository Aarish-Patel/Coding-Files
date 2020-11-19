import java.util.*;
class Hexadecimal_Encryption
{
    String Encrypted_String, Decrypted_String, public_key, Message1, Message2, Message3;
    Scanner sc = new Scanner(System.in);
    String arrayop[] = new String[2];
    char o;
    int i, c, receiver, ct;
    double iteration;
    Hexadecimal_Encryption()
    {
        o = '\u0000';
        i = 0;
        c = 0;
        Encrypted_String = "";
        Decrypted_String = "";
        public_key = "";
        Message1 = "Encrypting.................."; 
        Message2 = "Decrypting.................."; 
        Message3 = "Processing The String.......";
    }
    void Hexadecimal_main(String input, int rkey, char auto)
    {
        Encryption_h ob1 = new Encryption_h();
        Decryption_h ob2 = new Decryption_h();
        c = 0;
        ct = 0;
        for(i = 0;i <= 100000000; i++)
        {
            if(i % 5000000 == 0)
            {
                System.out.print(Message1.charAt(c));
                c++;
            }
        }
        System.out.print("\f");
        arrayop = ob1.Encryption_prog(input);
        Encrypted_String = arrayop[0];
        public_key = arrayop[1];
        System.out.println("Hexadecimal : " + Encrypted_String);
        System.out.println("Public Key : " + public_key);
        if(Character.toLowerCase(auto) == 'y')
        {
            System.out.print("Should the program be decrypted : ");
            String autostr = "yes  ";
            for(iteration = 0.0; iteration <= 90000000.0; iteration += 0.5)
            {
                if(iteration % 30000000.0 == 0.0)
                {
                    System.out.print(autostr.charAt(ct));
                    ct ++;
                }
            }
            System.out.println();
            o = auto;
            System.out.print("Enter receiver's key(" + rkey + ") : ");
            autostr = String.valueOf(rkey);
            ct = 0;
            for(iteration = 0; iteration <= 10000000 * (autostr.length() - 1); iteration += 0.25)
            {
                if(iteration % 10000000 == 0)
                {
                    System.out.print(autostr.charAt(ct));
                    ct ++;
                }
            }
            System.out.println();
            receiver = rkey;
        }
        else
        {
            System.out.print("Should the program be decrypted : ");
            o = sc.next().charAt(0);
            System.out.print("Enter receiver's key(" + rkey + ") : ");
            receiver = sc.nextInt();
        }
        if(receiver == rkey)
        {
            c = 0;
            if(o == 'Y' || o == 'y')
            {
                Decrypted_String = ob2.Decryption_prog(Encrypted_String, public_key);
                    for(i = 0;i <= 100000000; i++)
                {
                    if(i % 5000000 == 0)
                    {
                        System.out.print(Message3.charAt(c));
                        c++;
                    }
                }
                System.out.println();
                c = 0;
                    for(i = 0;i <= 100000000; i++)
                {
                    if(i % 5000000 == 0)
                    {
                        System.out.print(Message2.charAt(c));
                        c++;
                    }
                }
                System.out.println();
                System.out.println("Decrypted : " + Decrypted_String);
                System.out.println("Objects to be sent = " + Encrypted_String + "\nand " +  public_key);
                if(Character.toLowerCase(auto) == 'y')
                {
                    for(iteration = 0; iteration < 1999999999; iteration += 0.5)
                    {
                    }
                }
            }
            else
                System.out.println("Very well then.");
        }
    }
}