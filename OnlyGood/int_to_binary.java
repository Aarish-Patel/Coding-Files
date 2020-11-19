import java.util.*;
class int_to_binary
{
    String str, cstr;
    int i, x, y, so;
    char c;
    char safer[] = {'*','&','#','@','*','&','#','@','#', '*'};
    char distraction[] = {'!', '$', '%', '^', '(', ')', '3', '5', '9', '7'};
    int_to_binary()
    {
        str = "";
        cstr = "";
        i = 0;
        x = 0;
        y = 0;
        so = 0;
        c = '\u0000';
    }
    String int_to_bin(int a)
    {
       str = "";
       while(a > 0)
       {
           if(a %  2 == 0)
           {
              str += "0";
              a /= 2;
            }
           else
           {
               str += "1";
               a = (a-1) / 2;
            }
       }
        str += "0000";
        cstr =  "";
        for(i = str.length() - 1; i >= 0; i --)
        {
            c = str.charAt(i);
            x = (int)(Math.random()*10);
            y = (int)(Math.random()*10);
            if(i == 0)
            {
                cstr = cstr + distraction[x] + c;
                continue;
            }
            cstr = cstr + distraction[x] + c + distraction[y];
        }
        so = (int)(Math.random()*10);
        cstr += safer[so];
        return cstr;
    }
}