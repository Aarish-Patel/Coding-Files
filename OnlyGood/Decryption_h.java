class Decryption_h
{
   hex_to_dec ob1 = new hex_to_dec();
   int i, j, k, flag, d, flag2, ct;
   char c;
   String hstr, fstr, public_key;
   char safer[] = {'*','&','#','@','*','&','#','@','#', '*'};
   char distraction[] = {'!', '$', '%', '^', '(', ')', 'a', 'b', 'c', 'd'};
   Decryption_h()
   {
       i = 0;
       j = 0;
       k = 0;
       flag = 0;
       d = 0;
       flag2 = 0;
       ct = 0;
       c = '\u0000';
       hstr = "";
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
                hstr += Encrypted_String.charAt(i);
            }
            else if(flag2 == 1)
            {
                d = ob1.hex_to_dec(hstr);
                d += Integer.valueOf(public_key.charAt(ct)) - 48;
                ct ++;
                fstr += (char)(d);
                hstr = "";
            }
            else
                continue;
        }
        return fstr;
   }
}