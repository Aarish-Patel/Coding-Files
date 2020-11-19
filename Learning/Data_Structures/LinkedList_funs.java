package Data_Structures;
import java.util.Collection;
interface LinkedList_funs<T extends Comparable>
{
    abstract <T extends Number> void get_default(T argument);
    abstract void get_min();
    abstract void get_max();
    abstract void sort();
    abstract boolean search(T value);
    abstract void reverse();
    abstract void combine(LinkedList LinkedList2);
    abstract void combine(LinkedList[] lists);
    abstract LinkedList[] splitmid();
    abstract LinkedList[] alternatingsplit();
    abstract LinkedList[] split(int m, int n);
    abstract void pythagorean();
    abstract void sumOccurs();
    abstract LinkedList cloneLinkedList();
    abstract int indexOf(T value);
    abstract int lastIndexOf(T value);
    abstract T get(int index);
    abstract void set(int index, T ndata);
    abstract T pop(int index);
    abstract void insert(T data);
    abstract void insert(int index, T data);
    abstract void insert(T[] values);
    abstract void insert(int index, T[] values);
    abstract void insertAtStart(T data);
    abstract void insertAtStart(T[] values);
    abstract void insert(Collection<? extends T> values);
    abstract void insert(int index, Collection<? extends T> list);
    abstract void insertAtStart(Collection<? extends T> list);
    abstract void deleteAllOccur(T data);
    abstract void delete(T data);
    abstract void delete(int st_index, int end_index);
    abstract void deleteAt(int index);
    abstract void deleteFrom(int st_index);
    abstract void deleteType(Class c);
    abstract void deleteNode(Node<T> node);
    abstract void deldup();//37
}
