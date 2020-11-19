class oct_to_int
{
    int ct, i, dec, dig;
    char c;
    oct_to_int()
    {
        ct = 0;
        i = 0;
        dec = 0;
        dig = 0;
        c = '\u0000';
    }
    int oct_to_int(String oct)
    {
        ct = 0;
        dec = 0;
        for(i = oct.length() - 1; i >= 0; i--)
        {
            c = oct.charAt(ct);
            dig = (int)(c) - 48;
            dec += dig * (int)Math.pow(8, i);
            ct ++;
        }
        return dec;
    }
}