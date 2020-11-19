interface Aarishable
{   
}

class MyException 
{   
    public MyException()
    {
        System.err.println("You need to implement Aarishable to use this method");
    }
}

class A  
{
    void m1(Object a)
    { 
         if((a instanceof Aarishable))
         {
             System.out.println("You figured out how to use Aarishable");
         }
         else {
             new MyException();
         }      
    }   
}

public class CustomMarkerInterface
{
    public void main()  
    {
        A ob = new A();
        ob.m1(this);
    }
}