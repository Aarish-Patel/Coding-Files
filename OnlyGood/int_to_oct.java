class int_to_oct
{
    int i, quotient, remainder, x, y, so;
    String roct, oct;
    char c;
    char safer[] = {'*','&','#','@','*','&','#','@','#', '*'};
    char distraction[] = {'!', '$', '%', '^', '(', ')', '8', '9', 'r', 'd'};
    int_to_oct()
    {
        i = 0;
        quotient = 0;
        remainder = 0;
        x = 0;
        y = 0;
        so = 0;
        roct = "";
        oct = "";
        c = '\u0000';
    }
    String int_to_oct(int dec)
    {
        oct = "";
        roct = "";
        while(dec > 7)
        {
            quotient = dec / 8;
            remainder = dec - (quotient * 8);
            dec = quotient;
            roct += remainder;
        }
        roct += dec;
        for(i = roct.length() - 1; i >= 0; i --)
        {
            c = roct.charAt(i);
            x = (int)(Math.random()*10);
            y = (int)(Math.random()*10);
            if(i == 0)
            {
                oct = oct + distraction[x] + c;
                continue;
            }
            oct = oct + distraction[x] + c + distraction[y];
        }
        so = (int)(Math.random()*10);
        oct += safer[so];
        return oct;
    }
}