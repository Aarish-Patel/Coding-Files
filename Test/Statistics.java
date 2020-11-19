class Statistics
{
    static void Vert_Histo(int vals[])
    {
        int max = 0, ct = -1, flags = 0, x = vals.length;
        for(int i: vals)
        {
            if(i >= max)
            {
                max = i;
            }
        }
        for(int j = max; j > 0; j --)
        {
            for(int k = 0; k < vals.length; k ++)
            {
                    if(vals[k] >= j)
                {
                    System.out.print(" || ");
                }
                else
                {
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
    }
    static void Vert_Histo(int vals[][])
    {
        int max = 0, ct = 0, dct = 0, maxd = 0, flags = 0, x = vals.length;
        for(int i: vals[0])
        {
            if(i >= max)
            {
                max = i;
            }
        }
        for(int i: vals[1])
        {
            while(i > 9)
            {
                i /= 10;
                dct ++;
            }
            if(dct > maxd)
            {
                maxd = dct;
            }
        }
        for(int j = max; j > 0; j --)
        {
            System.out.print(vals[1][j - 1] + "   ");
            for(int k = 0; k < vals[0].length; k ++)
            {
                    if(vals[0][k] >= j)
                {
                    System.out.print(" || ");
                }
                else
                {
                    System.out.print("    ");
                }
            }
            ct ++;
            System.out.println();
        }
        System.out.print("0   ");
        for(int i : vals[0])
        {
            System.out.print(" " + i + "  ");
        }
    }
}