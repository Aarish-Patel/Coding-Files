class binary_to_int
{
    int p, s, l;
    char c1;
    String rstr;
    binary_to_int()
    {
        p = 0;
        s = 0;
        l = 0;
        c1 = '\u0000';
        rstr = "";
    }
    int bin_to_int(String str)
    {
        rstr = "";
        s = 0;
        for(p = str.length() - 1; p >= 0; p --)
        {
            c1 = str.charAt(p);
            rstr += c1;
        }
        for(l = 0; l < rstr.length(); l++)
        {
            c1 = rstr.charAt(l);
            if(c1 == '1')
            {
                s += Math.pow(2, l);
            }
        }
        return s;
    }
}