import java.util.*;
class Dev
{
    Scanner sc = new Scanner(System.in);
    char o;
    int keys[];
    int urkey, uskey, flag, i;
    Dev()
    {
       keys = new int[2];
       o = '\u0000';
       flag = 0;
    }
    int[] UKey(int skey, int rkey)
    {
        System.out.println("Current sender's key is " + skey + " and current reciever's  key is " + rkey);
        System.out.print("Do you want to change it(both have to be prime numbers)(enter big numbers at your own risk): ");
        o = sc.next().charAt(0);
        if(Character.toLowerCase(o) == 'y')
        {
            do
            {
                flag = 0;
                System.out.print("Enter new Sender's key : ");
                uskey = sc.nextInt();
                System.out.print("Enter new Reciever's key : ");
                urkey = sc.nextInt();
                if(uskey % 2 == 0 || urkey == 0)
                {
                    flag = 1;
                }
                for(i = 3; i < uskey; i ++)
                {
                    if(uskey % i == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
                for(i = 3; i < urkey; i ++)
                {
                    if(urkey % i == 0)
                    {
                        flag = 1;
                        break;
                    }
                }
            }while(flag != 0);
            keys[0] = uskey;
            keys[1] = urkey;
        }
        return keys;
    }
    int[] keygen()
    {
        do
        {
            flag = 0;
            uskey = (int)(Math.random() * 100);
            urkey = (int)(Math.random() * 100);
            if(uskey % 2 == 0 || urkey == 0)
            {
                flag = 1;
            }
            for(i = 3; i < uskey; i ++)
            {
                if(uskey % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
            for(i = 3; i < urkey; i ++)
            {
                if(urkey % i == 0)
                {
                    flag = 1;
                    break;
                }
            }
        }while(flag != 0);
        keys[0] = uskey;
        keys[1] = urkey;
        return keys;
    }
}