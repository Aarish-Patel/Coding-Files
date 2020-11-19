package Abstract_Class;
public class Stats
{
    public static void main()
    {
        IPhone ob = new IPhone();
        Samsung obj = new Samsung();
        show(obj);
    }
    public static void show(Phone obj)
    {
        obj.Config();
    }
}