//263
//789
class something
{
    int i;char c;double d;
    static int c4;
    something()
    {
        i = 0;
        c = 0;
        d = 0;
    }
    something(int i1)
    {
        i = i1;
    }
    void display()
    {
        System.out.println(i + " " + c + " " + d);
    }
}
class somethingelse
{
    public static void main()
    {
        something ob = new something(5);
        ob.display();
    }
}