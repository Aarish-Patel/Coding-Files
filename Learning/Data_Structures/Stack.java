package Data_Structures;

class Stack<T extends Comparable<T>>
{
    int length;
    int capacity;
    LinkedList<T> stack;
    Stack(int length)
    {
        capacity = length;
        stack = new LinkedList<>();
    }
    Stack()
    {
        length = 0;
        capacity = 5;
        stack = new LinkedList<>(capacity);
    }
    public void push(T data)
    {
        stack.set(length, data);
        length ++;
    }
    public T pop()
    {
        T data;
        length --;
        data = stack.get(length);
        stack.set(length, null);
        return data;
    }
    public T peek()
    {
        T data;
        return stack.get(length - 1);
    }
    public void sort()
    {
        T temp, tempm, min, max; 
        int pos, posm, uv;
        for(int i = 0; i < (int)(length / 2); i ++)
        {
            min = stack.get(i);
            max = stack.get(i);
            pos = i;
            posm = i;
            uv = length - i - 1;
            for(int j = i + 1; j <= uv; j ++)
            {
               if(min.compareTo(stack.get(j)) > 0)
                {
                    min = stack.get(j);
                    pos = j;
                }
               if(max.compareTo(stack.get(j)) > 0)
               {
                 max = stack.get(j);
                 posm = j;
                }
               }
            temp = stack.get(i);
            stack.set(i, stack.get(pos));
            stack.set(pos, temp);
            if(i == posm)
            {
                tempm = stack.get(uv);
                stack.set(uv, stack.get(pos));
                stack.set(pos, tempm);
            }
            else
            {
                if(uv != 5)
                {
                     tempm = stack.get(uv);
                    stack.set(uv, stack.get(posm));
                    stack.set(posm, tempm);
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
        LinkedList<T> newstack = new LinkedList<>(length);
        for(int i = 0; i < length; i ++)
        {
            newstack.set(i, stack.get(i));
        }
        stack = newstack;
    }
    public void increase(int length)
    {
        LinkedList<T> newstack = new LinkedList<>(length);
        for(int i = 0; i < this.length; i ++)
        {
             newstack.set(i, stack.get(i));
        }
        stack = newstack;
    }
    public void decrease(int length)
    {
        LinkedList<T> newstack = new LinkedList<>(length);
        for(int i = 0; i < length; i ++)
        {
            newstack.set(i, stack.get(i));
        }
        stack = newstack;
        this.length = length;
    }
    public int search(T data)
    {
        T i;
        int index = 0, temp = 0;
        for(int j=0; j < stack.length; j ++)
        {
            i = stack.get(j);
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
        T i;
        for(int j = 0 ; j < stack.length; j ++)
        {
            i = stack.get(j);
            System.out.print(i + " ");
        }
        return "";
    }
}