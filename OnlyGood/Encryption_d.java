class Encryption_d
{
    Public_Key ob = new Public_Key();
    String Encrypted, public_key;
    String rstatement[];
    char c;
    int i, a, r;
    Encryption_d()
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
        Digit_encryption ob1 = new Digit_encryption();
        for(i = 0; i < input.length(); i ++)
        {            
            c = input.charAt(i);
            r = ob.Storage_Creation();
            a = (int)(c) - r;
            Encrypted += ob1.Digit_encryption(a);
            public_key += r;
        }
        rstatement[0] = Encrypted;
        rstatement[1] = public_key;
        return rstatement;
    }
}