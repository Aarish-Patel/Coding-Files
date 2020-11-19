class dec_to_hex
{
    int i, quotient, remainder, x, y, so;
    String rhex, hex;
    char c;
    char safer[] = {'*','&','#','@','*','&','#','@','#', '*'};
    char distraction[] = {'!', '$', '%', '^', '(', ')', 'a', 'b', 'c', 'd'};        
    dec_to_hex()
    {
        i = 0;
        quotient = 0;
        remainder = 0;
        x = 0;
        y = 0;
        so = 0;
        rhex = "";
        hex = "";
        c = '\u0000';
    }
    String dec_to_hex(int dec)
    {
        rhex = "";
        hex =  "";
        while(dec > 9)
        {
            quotient = dec/16;
            remainder = dec - (quotient * 16);
            dec = quotient;
            if(remainder < 16)
            {
                if(remainder < 10)
                {
                    rhex += remainder;
                }
                else
                {
                    if(remainder == 10)
                        rhex += 'A';
                    if(remainder == 11)
                        rhex += 'B';
                    if(remainder == 12)
                        rhex += 'C';
                    if(remainder == 13)
                        rhex += 'D';
                    if(remainder == 14)
                        rhex += 'E';
                    if(remainder == 15)
                        rhex += 'F';
                }
            }
        }
        rhex += dec;
        for(i = rhex.length() - 1; i >= 0; i --)
        {
            c = rhex.charAt(i);
            x = (int)(Math.random()*10);
            y = (int)(Math.random()*10);
            if(i == 0)
            {
                hex = hex + distraction[x] + c;
                continue;
            }
            hex = hex + distraction[x] + c + distraction[y];
        }
        so = (int)(Math.random()*10);
        hex += safer[so];
        return hex;
    }
}