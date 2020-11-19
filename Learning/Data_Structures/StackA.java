package Data_Structures;

//pop returning array
class StackA
{
    int length;
    int capacity;
    int[] stack;
    StackA(int length)
    {
        capacity = length;
        stack = new int[capacity];
    }
    StackA()
    {
        length = 0;
        capacity = 5;
        stack = new int[capacity];
    }
    public void push(int data)
    {
        stack[length] = data;
        length ++;
    }
    public int pop()
    {
        int data;
        length --;
        data = stack[length];
        stack[length] = 0;
        return data;
    }
    public int peek()
    {
        int data;
        return stack[length - 1];
    }
    public void sort()
    {
        int temp, tempm, min, max, pos, posm, uv;
        for(int i = 0; i < (int)(length / 2); i ++)
        {
            min = stack[i];
            max = stack[i];
            pos = i;
            posm = i;
            uv = length - i - 1;
            for(int j = i + 1; j <= uv; j ++)
            {
               if(min > stack[j])
                {
                    min = stack[j];
                    pos = j;
                }
               if(max < stack[j])
               {
                 max = stack[j];
                 posm = j;
                }
               }
            temp = stack[i];
            stack[i] = stack[pos];
            stack[pos] = temp;
            if(i == posm)
            {
                tempm = stack[uv];
                stack[uv] = stack[pos];
                stack[pos] = tempm;
            }
            else
            {
                if(uv != 5)
                {
                     tempm = stack[uv];
                     stack[uv] = stack[posm];
                     stack[posm] = tempm;
                }
           }
        }
    }
    public boolean isEmpty()
    {
        if(length <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public void reduce()
    {
        int[] newstack = new int[length];
        for(int i = 0; i < length; i ++)
        {
            newstack[i] = stack[i];
        }
        stack = newstack;
    }
    public void increase(int length)
    {
        int[] newstack = new int[length];
        for(int i = 0; i < this.length; i ++)
        {
            newstack[i] = stack[i];
        }
        stack = newstack;
    }
    public void decrease(int length)
    {
        int[] newstack = new int[length];
        for(int i = 0; i < length; i ++)
        {
            newstack[i] = stack[i];
        }
        stack = newstack;
        this.length = length;
    }
    public int search(int data)
    {
        int temp = 0, index = -1;
        for(int i : stack)
        {
            if(i == data)
            {
                index = length - temp;
            }
            temp ++;
        }
        return index - 1;
    }
    @Override
    public String toString()
    {
        for(int i : stack)
        {
            System.out.print(i + " ");
        }
        return "";
    }
}