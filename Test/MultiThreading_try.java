class MultiThreading_try
{
    public static void main() throws java.lang.InterruptedException
    {
        int length = 1000000;
        int partition_length = length/10;
        int[] array = new int[length];
        int[] array1 = new int[length/10];
        int[] array2 = new int[length/10];
        int[] array3 = new int[length/10];
        int[] array4 = new int[length/10];
        int[] array5 = new int[length/10];
        int[] array6 = new int[length/10];
        int[] array7 = new int[length/10];
        int[] array8 = new int[length/10];
        int[] array9 = new int[length/10];
        int[] array10 = new int[length/10];
        for(int i = 0; i < array.length; i ++)
        {
            array[i] = length - i;
            if(i < partition_length)
            {
                array1[i] = length - i;
            }
            else if(i < 2 * partition_length)
            {
                array2[i - partition_length] = length - i;
            }
            else if(i < 3 * partition_length)
            {
                array3[i - 2 * partition_length] = length - i;
            }
            else if(i < 4 * partition_length)
            {
                array4[i - 3 * partition_length] = length - i;
            }
            else if(i < 5 * partition_length)
            {
                array5[i - 4 * partition_length] = length - i;
            }
            else if(i < 6 * partition_length)
            {
                array6[i - 5 * partition_length] = length - i;
            }
            else if(i < 7 * partition_length)
            {
                array7[i - 6 * partition_length] = length - i;
            }
            else if(i < 8 * partition_length)
            {
                array8[i - 7 * partition_length] = length - i;
            }
            else if(i < 9 * partition_length)
            {
                array9[i - 8 * partition_length] = length - i;
            }
            else if(i < 10 * partition_length)
            {
                array10[i - 9 * partition_length] = length - i;
            }
        }
        Thread t1 = new FirstThread(array1);
        Thread t2 = new SecondThread(array2);
        Thread t3 = new ThirdThread(array3);
        Thread t4 = new FourthThread(array4);
        Thread t5 = new FifthThread(array5);
        Thread t6 = new SixthThread(array6);
        Thread t7 = new SeventhThread(array7);
        Thread t8 = new EighthThread(array8);
        Thread t9 = new NinthThread(array9);
        Thread t10 = new TenthThread(array10);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        t6.join();
        t7.join();
        t8.join();
        t9.join();
        t10.join();
        for(int i : array10)
        {
            System.out.println(i);
        }
        for(int i : array9)
        {
            System.out.println(i);
        }
        for(int i : array8)
        {
            System.out.println(i);
        }
        for(int i : array7)
        {
            System.out.println(i);
        }
        for(int i : array6)
        {
            System.out.println(i);
        }
        for(int i : array5)
        {
            System.out.println(i);
        }
        for(int i : array4)
        {
            System.out.println(i);
        }
        for(int i : array3)
        {
            System.out.println(i);
        }
        for(int i : array2)
        {
            System.out.println(i);
        }
        for(int i : array1)
        {
            System.out.println(i);
        }
    }
}
class FirstThread extends Thread
{
    int array[];
    FirstThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class SecondThread extends Thread
{
    int array[];
    SecondThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class ThirdThread extends Thread
{
    int array[];
    ThirdThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class FourthThread extends Thread
{
    int array[];
    FourthThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class FifthThread extends Thread
{
    int array[];
    FifthThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class SixthThread extends Thread
{
    int array[];
    SixthThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class SeventhThread extends Thread
{
    int array[];
    SeventhThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class EighthThread extends Thread
{
    int array[];
    EighthThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class NinthThread extends Thread
{
    int array[];
    NinthThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}
class TenthThread extends Thread
{
    int array[];
    TenthThread(int array[])
    {
        this.array = array;
    }
    public void run()
    {
        int min, max, pos, posm, uv, j, i, temp, tempm;
        for(i = 0; i < (int)(array.length / 2); i ++)
        {
            min = array[i];
            max = array[i];
            pos = i;
            posm = i;
            uv = array.length - i - 1;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > array[j])
                {
                    min = array[j];
                    pos = j;
                }
               if(max < array[j])
               {
                 max = array[j];
                 posm = j;
                }
               }
            temp = array[i];
            array[i] = array[pos];
            array[pos] = temp;
            if(i == posm)
            {
                tempm = array[uv];
                array[uv] = array[pos];
                array[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = array[uv];
             array[uv] = array[posm];
             array[posm] = tempm;
            }
           }
        }
    }
}