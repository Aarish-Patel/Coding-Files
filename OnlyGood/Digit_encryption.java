class Digit_encryption
{
    int i, quotient, remainder, x, y, so;
    String fdec;
    char c;
    char safer[] = {'*','&','#','@','*','&','#','@','#', '*'};
    char distraction[] = {'!', '$', '%', '^', '(', ')', 'a', 'b', 'r', 'd'};
    Digit_encryption()
    {
        i = 0;
        quotient = 0;
        remainder = 0;
        x = 0;
        y = 0;
        so = 0;
        c = '\u0000';
    }
    String Digit_encryption(int dec)
    {
        fdec = "";
        String sdec = String.valueOf(dec);
        for(i = 0; i < sdec.length(); i ++)
        {
            c = sdec.charAt(i);
            x = (int)(Math.random()*10);
            y = (int)(Math.random()*10);
            if(i == sdec.length() - 1)
            {
               fdec = fdec + distraction[y] + c;
               continue;
            }
            fdec = fdec + distraction[x] + c + distraction[y];
        }
        so = (int)(Math.random()*10);
        fdec += safer[so];
        return fdec;
    }
}