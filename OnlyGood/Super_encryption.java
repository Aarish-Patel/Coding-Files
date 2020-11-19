import java.util.Scanner;
class Super_encryption
{
    char c, o;
    String input, ninput, finals, des, public_key, Encrypted_String, Decrypted_String, Message1, Message2, Message3, fpublic_key;
    int iter, r, i, cs;
    double iteration;
    Scanner sc = new Scanner(System.in);
    String arrayop[];
    char distraction[] = {'!', '$', '%', '^', '(', ')', '3', '5', '9', '7'};
    Super_encryption()
    {
        o = 'y';
        c = '\u0000';
        input = "";
        ninput = "";
        finals = "";
        des = "";
        public_key = "";
        Encrypted_String = "";
        Decrypted_String = "";
        fpublic_key = "";
        iter = 0;
        r = 0;
        i = 0;
        cs = 0;
        arrayop = new String[2];
    }
    void main(char auto)
    {
        String Message1 = "Encrypting......................."; 
        String Message2 = "Decrypting................"; 
        String Message3 = "Processing The String.........";
        System.out.print("Enter the String to be Encrypted : ");
        input = sc.nextLine();
        des = "";
        fpublic_key = "";
        finals = "";
        for(iter = 0; iter < input.length(); iter ++)
        {
            ninput = "";
            c = input.charAt(iter);
            r = (int)(Math.random() * 10);
            ninput += c;
            for(i = 0; i < distraction.length; i ++)
            {
                if(c == distraction[i])
                des += c;
            }
            if(r <= 3)
            {
                    Binary_Encryption ob = new Binary_Encryption();
                    String Encrypted_String, Decrypted_String;
                    Encryption ob1 = new Encryption();
                    Decryption ob2 = new Decryption();
                    cs = 0;
                    for(i = 0;i <= 100000000; i++)
                    {
                        if(i % 5000000 == 0)
                        {
                            System.out.print(Message1.charAt(cs));
                            cs++;
                        }
                    }
                    System.out.println();
                    arrayop = ob1.Encryption_prog(ninput);
                    Encrypted_String = arrayop[0];
                    public_key = arrayop[1];
                    fpublic_key += public_key;
                    finals += Encrypted_String;
                    cs = 0;
                    if(o == 'Y' || o == 'y')
                    {
                        Decrypted_String = ob2.Decryption_prog(Encrypted_String, public_key);
                            for(i = 0;i <= 100000000; i++)
                        {
                            if(i % 5000000 == 0)
                            {
                                System.out.print(Message3.charAt(cs));
                                cs++;
                            }
                        }
                        System.out.println();
                        cs = 0;
                        des += Decrypted_String;
                    }
                    }
            else if(r < 6)
            {
                Hexadecimal_Encryption ob = new Hexadecimal_Encryption();
                String Encrypted_String, Decrypted_String;
                Encryption_h ob1 = new Encryption_h();
                Decryption_h ob2 = new Decryption_h();
                cs = 0;
                for(i = 0;i <= 100000000; i++)
                {
                    if(i % 5000000 == 0)
                    {
                        System.out.print(Message1.charAt(cs));
                        cs++;
                    }
                }
                System.out.println();
                arrayop = ob1.Encryption_prog(ninput);
                Encrypted_String = arrayop[0];
                public_key = arrayop[1];
                fpublic_key += public_key;
                finals += Encrypted_String;
                cs = 0;
                if(o == 'Y' || o == 'y')
                    {
                        Decrypted_String = ob2.Decryption_prog(Encrypted_String, public_key);
                            for(i = 0;i <= 100000000; i++)
                        {
                            if(i % 5000000 == 0)
                            {
                                System.out.print(Message3.charAt(cs));
                                cs++;
                            }
                        }
                        System.out.println();
                        cs = 0;
                        des += Decrypted_String;
                    }
            }
            else if(r < 9)
            {
                Octal_Encryption ob = new Octal_Encryption();
                String Encrypted_String, Decrypted_String;
                Encryption_o ob1 = new Encryption_o();
                Decryption_o ob2 = new Decryption_o();
                cs = 0;
                for(i = 0;i <= 100000000; i++)
                {
                    if(i % 5000000 == 0)
                    {
                        System.out.print(Message1.charAt(cs));
                        cs++;
                    }
                }
                System.out.println();
                arrayop = ob1.Encryption_prog(ninput);
                Encrypted_String = arrayop[0];
                public_key = arrayop[1];
                fpublic_key += public_key;
                finals += Encrypted_String;
                cs = 0;
                if(o == 'Y' || o == 'y')
                    {
                        Decrypted_String = ob2.Decryption_prog(Encrypted_String, public_key);
                            for(i = 0;i <= 100000000; i++)
                        {
                            if(i % 5000000 == 0)
                            {
                                System.out.print(Message3.charAt(cs));
                                cs++;
                            }
                        }
                        System.out.println();
                        cs = 0;
                        des += Decrypted_String;
                    }
            }
            else if(r <= 10)
            {
                Decimal_Encryption ob = new Decimal_Encryption();
                String Encrypted_String, Decrypted_String;
                Encryption_d ob1 = new Encryption_d();
                Decryption_d ob2 = new Decryption_d();
                cs = 0;
                for(i = 0;i <= 100000000; i++)
                {
                    if(i % 5000000 == 0)
                    {
                        System.out.print(Message1.charAt(cs));
                        cs++;
                    }
                }
                System.out.println();
                arrayop = ob1.Encryption_prog(ninput);
                Encrypted_String = arrayop[0];
                public_key = arrayop[1];
                fpublic_key += public_key;
                finals += Encrypted_String;
                cs = 0;
                if(o == 'Y' || o == 'y')
                    {
                        Decrypted_String = ob2.Decryption_prog(Encrypted_String, public_key);
                            for(i = 0;i <= 100000000; i++)
                        {
                            if(i % 5000000 == 0)
                            {
                                System.out.print(Message3.charAt(cs));
                                cs++;
                            }
                        }
                        System.out.println();
                        cs = 0;
                        des += Decrypted_String;
                    }
            }
            }
        System.out.println("Super : " + finals);
        System.out.println("Public Key : " + fpublic_key);
        for(i = 0; i < input.length(); i++)
        {    for(i = 0;i <= 100000000; i++)
             {
                if(i % 5000000 == 0)
                {
                    System.out.print(Message2.charAt(cs));
                    cs++;
                }
             }
             System.out.println();
        }
        System.out.println("Decrypted : " + des);
        System.out.println("Objects to be sent = " + finals + "\nand " + fpublic_key);
        if(Character.toLowerCase(auto) == 'y')
            {
                for(iteration = 0; iteration < 1999999999; iteration += 0.5)
                {
                }
            }
    }
}