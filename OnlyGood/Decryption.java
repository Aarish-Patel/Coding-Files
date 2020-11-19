class Decryption
{
   binary_to_int ob1 = new binary_to_int();
   int i, j, k, flag, d, flag2, ct;
   char c;
   String bstr, fstr, public_key;
   char safer[] = {'*','&','#','@','*','&','#','@','#', '*'};
   char distraction[] = {'!', '$', '%', '^', '(', ')', '3', '5', '9', '7'};
   Decryption()
   {
       i = 0;
       j = 0;
       k = 0;
       flag = 0;
       d = 0;
       flag2 = 0;
       ct = 0;
       c = '\u0000';
       bstr = "";
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
                bstr += Encrypted_String.charAt(i);
            }
            else if(flag2 == 1)
            {
                d = ob1.bin_to_int(bstr);
                d += Integer.valueOf(public_key.charAt(ct)) - 48;
                ct ++;
                fstr += (char)(d);
                bstr = "";
            }
            else
                continue;
        }
        return fstr;
   }
}