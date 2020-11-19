class Decryption_d
{
   int i, j, k, l, flag, d, flag2, ct;
   char c;
   String destr, fstr, public_key;
   char safer[] = {'*','&','#','@','*','&','#','@','#', '*'};
   char distraction[] = {'!', '$', '%', '^', '(', ')', 'a', 'b', 'r', 'd'};
   Decryption_d()
   {
       i = 0;
       j = 0;
       k = 0;
       l = 0;
       flag = 0;
       d = 0;
       flag2 = 0;
       ct = 0;
       c = '\u0000';
       destr = "";
       fstr = "";
       public_key = "";
   }
   String Decryption_prog(String Encrypted_String, String public_key)
   {
        for(i = 0; i < Encrypted_String.length(); i ++)
        {
            c = Encrypted_String.charAt(i);
            flag = 0;
            flag2 = 0;
            for(j = 0; j < distraction.length ; j ++)
            {
                if(c == distraction[j])
                {
                    flag += 1;
                }
            }
            for(k = 0; k < safer.length ; k ++)
            {
                if(c == safer[k])
                {
                    flag2 = 1;
                }
                else
                    continue;
            }
            if(flag == 0 && flag2 == 0)
            {
                destr += Encrypted_String.charAt(i);
            }
            else if(flag2 == 1)
            {
                for(l = 0; l < destr.length(); l++)
                {
                    d = ((d * 10) + ((int)destr.charAt(l) - 48));
                }
                d += Integer.valueOf(public_key.charAt(ct)) - 48;
                ct ++;
                fstr += (char)(d);
                destr = "";
                d = 0;
            }
            else
                continue;
        }
        return fstr;
   }
}