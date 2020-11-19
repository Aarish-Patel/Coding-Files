class hex_to_dec
{
    int ct, i, dec, dig;
    char c;
    hex_to_dec()
    {
        ct = 0;
        i = 0;
        dec = 0;
        dig = 0;
        c = '\u0000';
    }
    int hex_to_dec(String hex)
    {
        ct = 0;
        dec = 0;
        for(i = hex.length() - 1; i >= 0; i--)
        {
            c = hex.charAt(ct);
            if(Character.isDigit(c))
                dig = (int)(c) - 48;
            else
                dig = (int)(c) - 55;
            dec += dig * (int)Math.pow(16, i);
            ct ++;
        }
        return dec;
    }
}