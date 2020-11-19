package Data_Structures;
import java.util.Collection;
//find pythagorean triplits in a list
//find how many times and if a sum occurs in the list return the numbers which form the sum in a DDA
//option to print list as a -> b -> c -> d -> null
public class LinkedList<T extends Comparable<T>>
{
    private Node<T> head;
    private Node<T> nmin;
    private Node<T> nmax;
    T min = null;
    T max = null;
    int length;
    private T default_val = null;
    public LinkedList()
    {
    }
    public LinkedList(int size)
    {
        for(int i = 0; i < size; i ++)
        {
            this.insert(default_val);
        }
        length = size;
        min = default_val;
    }
    private <T extends Number> void get_default(T argument)
    {
        //Find a way to get default value for generics(if String : null, If int : 0, If double : 0.0d)
    }
    private void get_min()
    {
        Node<T> n = head;
        min = n.data;
        while(n.next != null)
        {
            n = n.next;
            if(n.data.compareTo(min) < 0)
            {
                min = n.data;
                nmin = n;
            }
        }
    }
    private void get_max()
    {
        Node<T> n = head;
        max = n.data;
        while(n.next != null)
        {
            n = n.next;
            if(n.data.compareTo(max) > 0)
            {
                max = n.data;
                nmax = n;
            }
        }
    }
    public void sort()
    {
        Node<T> min = head;
        Node<T> node = new Node<>();
        Node<T> minnode = new Node<>();
        T temp = null;
        while(min.next != null)
        {
            node = min;
            minnode = node;
            while(node != null)
            {
                if(node.data.compareTo(minnode.data) < 0)
                {
                    minnode = node;
                }
                node = node.next;
            }
            temp = min.data;
            min.data = minnode.data;
            minnode.data = temp;
            min = min.next;
        }
    }
    public boolean search(T value)
    {
        Node n = head;
        while(n.next != null)
        {
            if(n.data == value)
            {
                return true;
            }
            n = n.next;
        }
        return false;
    }
    public void reverse()
    {
        Node n = head;
        Node<T> newhead = new Node<>();
        Node<T> prev = new Node<>();
        int end = length;
        while(n.next != null)
        {
            n = n.next;
        }
        while(end != 0)
        {
            prev = head;
            for(int i = 0; i < end - 2; i ++)
            {
                prev = prev.next;
            }
            n.next = prev;
            if(end == length)
            {
                newhead = n;
            }
            n = prev;
            end --;
        }
        n.next = null;
        head = newhead;
    }
    public void combine(LinkedList LinkedList2)
    {
        Node<T> n = this.head;
        while(n.next != null)
        {
            n = n.next;
        }
        n.next = LinkedList2.head;
    }
    public void combine(LinkedList[] lists)
    {
        for(LinkedList i : lists)
        {
            this.combine(i);
        }
    }
    public void splitmid()
    {
    }
    public void splitoddeven()
    {
    }
    public void split()
    {
    }
    public void pythagorean()
    {
    }
    public void sumOccur()
    {
    }
    public int indexOf(T value)
    {
        Node n = head;
        int index = 0;
        while(n.next != null)
        {
            if(n.data == value)
            {
                return index;
            }
            n = n.next;
            index++;
        }
        return -1;
    }
    public int lastIndexOf(T value)
    {
        int index = 0, findex = -1;
        Node<T> n = head;
        while(n != null)
        {
            if(n.data == value)
            {
                findex = index;
            }
            index ++;
            n = n.next;
        }
        return findex;
    }
    public T get(int index)
    {
        Node<T> n = head;
        if(index >= length)
        {
            System.err.println("Mentioned index is greater than list length : NullPointerException");
            System.exit(0);
        }
        for(int i = 0; i < index; i ++)
        {
            n = n.next;
        }
        return n.data;
    }
    public void set(int index, T ndata)
    {
        Node<T> n = head;
        if(index >= length)
        {
            System.err.println("Mentioned index is greater than list length : NullPointerException");
            System.exit(0);
        }
        for(int i = 0; i < index; i ++)
        {
            n = n.next;
        }
        n.data = ndata;
        get_min();
        get_max();
    }
    public T pop(int index)
    {
        T data = get(index);
        deleteAt(index);
        get_min();
        get_max();
        return data;
    }
    public void insert(T data)
    {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
        if(head == null)
        {
            head = node;
        }
        else
        {
            Node n = head;
            while(n.next != null)
            {
                n = n.next;
            }
            n.next = node;
        }
        length ++;
        get_min();
        get_max();
    }
    public void insert(int index, T data)
    {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
        if(index == 0)
        {
            insertAtStart(data);
        }
        else
        {
            Node n = head;
            for(int i = 0; i < index - 1; i ++)
            {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
            length ++;
        }
        get_min();
        get_max();
    }
    public void insert(T[] values)
    {
        for(T data : values)
        {
            this.insert(data);
        }
        get_min();
        get_max();
    }
    public void insert(int index, T[] values)
    {
        for(T data : values)
        {
            index ++;
            this.insert(index, data);
        }
        get_min();
        get_max();
    }
    public void insertAtStart(T data)
    {
        Node<T> node = new Node<>();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
        length ++;
        get_min();
        get_max();
    }
    public void insertAtStart(T[] values)
    {
        int index = 0;
        for(T data : values)
        {
            this.insert(index, data);
            index ++;
        }
        get_min();
        get_max();
    }
    public void insert(Collection<? extends T> values)
    {
        for(T data : values)
        {
            this.insert(data);
        }
        get_min();
        get_max();
    }
    public void insert(int index, Collection<? extends T> list)
    {
        for(T data : list)
        {
            index ++;
            this.insert(index, data);
        }
        get_min();
        get_max();
    }
    public void insertAtStart(Collection<? extends T> list)
    {
        int index = 0;
        for(T data : list)
        {
            System.out.println("In insert"+length);
            this.insert(index, data);
            index ++;
        }
        get_min();
        get_max();
    }
    public void deleteAllOccur(T data)
    {
        while(head.data == data)
        {
            head = head.next;
            length --;
        }
        Node n = head;
        while(n.next != null)
        {
            if(n.next.data == data)
            {
                Node n1 = n.next;
                n.next = n1.next;
                n1 = null;
                length --;
            }
            else
            {
                n = n.next;
            }
        }
        get_min();
        get_max();
    }
    public void delete(T data)
    {
        if(head.data == data)
        {
            head = head.next;
            return;
        }
        Node n = head;
        while(n.next != null)
        {
            if(n.next.data == data)
            {
                break;
            }
            n = n.next;
        }
        Node n1 = n.next;
        n.next = n1.next;
        n1 = null;
        length --;
        get_min();
        get_max();
    }
    public void delete(int st_index, int end_index)
    {
        Node n = head;
        Node<T> n1 = new Node<>();
        for(int i = 0; i < length; i ++)
        {
            if(i == st_index)
            {
                n1 = n;
            }
            n = n.next;
            if(i == end_index)
            {
                n1.next = n;
                break;
            }
        }
        length = length - (end_index - st_index);
        get_min();
        get_max();
    }
    public void deleteAt(int index)
    {
        if(index == 0)
        {
            head = head.next;
        }
        else
        {
            Node n = head;
            for(int i = 0; i < index - 1; i ++)
            {
                n = n.next;
            }
            Node n1 = n.next;
            n.next = n1.next;
            n1 = null;
        }
        length --;
        get_min();
        get_max();
    }
    public void deleteFrom(int st_index)
    {
        Node n = head;
        for(int i = 0; i < length; i ++)
        {
            if(i >= st_index)
            {
                n.next = null;
                break;
            }
            n = n.next;
        }
        length = st_index + 1;
        get_min();
        get_max();
    }
    public void deleteType(Class c)
    {
        while(c.isInstance(head.data))
        {
            head = head.next;
            length --;
        }
        Node n = head;
        while(n.next != null)
        {
            if(c.isInstance(n.next.data))
            {
                Node n1 = n.next;
                n.next = n1.next;
                n1 = null;
                length --;
            }
            else
            {
                n = n.next;
            }
        }
        get_min();
        get_max();
    }
    public void deleteNode(Node<T> node)
    {
        if(head == node)
        {
            head = head.next;
            return;
        }
        Node n = head;
        while(n.next != null)
        {
            if(n.next == node)
            {
                break;
            }
            n = n.next;
        }
        Node n1 = n.next;
        n.next = n1.next;
        n1 = null;
        length --;
        get_min();
        get_max();
    }
    public void deldup()
    {
        Node<T> n = new Node<>();
        Node<T> node = head;
        Node<T> tempnode = new Node<>();
        T test_data;
        while(node.next != null)
        {
            n = head;
            test_data = node.data;
            while(n != null)
            {
                if(n.data == test_data && n != node)
                {
                    this.deleteNode(n);
                    node = head;
                    length --;
                }
                n = n.next;
            }
            node = node.next;
        }
    }
    @Override
    public String toString()
    {
        Node n = head;
        while(n.next != null)
        {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
        return "";
    }
}