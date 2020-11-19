class Encryption_h
{
    Public_Key ob = new Public_Key();
    String Encrypted, public_key;
    String rstatement[];
    char c;
    int i, a, r;
    Encryption_h()
    {
        Encrypted = "";
        public_key = "";
        rstatement = new String[2];
        c = '\u0000';
        i = 0;
        a = 0;
        r = 0;
    }
    String[] Encryption_prog(String input)
    {
        dec_to_hex ob1 = new dec_to_hex();
        for(i = 0; i < input.length(); i ++)
        {            
            c = input.charAt(i);
            r = ob.Storage_Creation();
            a = (int)(c) - r;
            public_key += r;
            Encrypted += ob1.dec_to_hex(a);
        }
        rstatement[0] = Encrypted;
        rstatement[1] = public_key;
        return rstatement;
    }
}