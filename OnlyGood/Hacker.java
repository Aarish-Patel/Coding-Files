class Hacker
{
    void Key_Extraction(int Lock, char auto)
    {
        //in basic encryption the keys are two random prime numbers from whom 1 is subtracted and the resultant numbers are multiplied
        int primes[] = new int[Lock];
        int receiver[] = new int[Lock];
        int sender[] = new int[Lock];
        int i, j, k, p, flag = 0, ct = 0;
        double iteration;
        for(i = 1; i < Lock; i++)
        {
            flag = 0;
            if(i % 2 != 0)
            {
                for(j = 3; j < i; j +=2)
                {
                    if (i % j == 0)
                    {
                        flag += 1;
                        break;
                    }
                }
                if(flag == 0)
                {
                    primes[ct] = i;
                    ct ++;
                }
            }
        }
        flag = 0;
        for(k = 0; k < primes.length - 1; k ++)
        {
            flag = 0;
            if(primes[k] == 0)
            {
                continue;
            }
            for(p = 1; p < primes.length - 1; p ++)
            {
                if(primes[p] == 0)
                {
                    continue;
                }
                System.out.println(primes[k] + "  " + primes[p]);
                if((primes[k] - 1) * (primes[p] - 1) == Lock)
                {       
                    flag += 1;
                    break;
                }
            }
            if(flag > 0)
            {
                receiver[k] = primes[k];
                sender[k] = primes[p];
            }
        }
        for(i = 0; i < receiver.length; i ++)
        {
            if(receiver[i] != 0 && sender[i] != 0)
            {
                System.out.println("Sender = " + sender[i] + "     Receiver = " + receiver[i]);
            }
        }
        if(Character.toLowerCase(auto) == 'y')
            {
                for(iteration = 0; iteration < 1999999999; iteration += 0.5)
                {
                }
            }
    }
}