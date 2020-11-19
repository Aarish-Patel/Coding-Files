class VeeeeeryRandom_OTP
{
    static String OTP(double factor)
    {
        double x;
        int i = 0, r = 0;
        String s = "", fs = "", OTP = "";
        while (i <= factor)
        {
            x = (Math.random() * Math.pow(10,7));
            s += String.valueOf(x);
            for(int j = 0; j < s.length(); j ++)
            {
                if(s.charAt(j) != '.')
                {
                    fs += s.charAt(j);
                }
            }
            i ++;
        }
        while(true)
        {
            r = (int)(Math.random() * Math.pow(10, (int)(Math.random() * 10)));
            if(r >= 4 && r < fs.length())
            {
                break;
            }
        }
        OTP = fs.substring(r - 4, r);
        return OTP;
    }
}