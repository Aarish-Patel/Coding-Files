import java.util.*;
class LCM_multiple_Done_
{
    public static void main()
    {
      int a,b,x,y,t,HCF,LCM,n,i,g,s,bi;
      Scanner sc=new Scanner(System.in);
      System.out.print("enter starting no:");
      a=sc.nextInt();
      System.out.print("\n\nenter ending no:");
      b=sc.nextInt();
      x=a;n=x+1;y=n;
      if(a!=1)
      {
      while (n!=0)
      {
          t=n;
          n=a%n;
          a=t;
        }
       HCF=a;
       LCM=(x*y)/HCF;
    }
    else
    {
        HCF=1;LCM=2;
    }
      if(a<b)
      {
          g=b;s=x+2;
        }
        else
        {
            g=x;s=b+2;
        }
          
      for(i=s;i<g;i++)
      {
          b=LCM;
          bi=i;
      while (i!=0)
      {
          t=i;
          i=LCM%i;
          LCM=t;
        }
       HCF=LCM;
       i=bi;
       LCM=(b*i)/HCF;
     
    }
    System.out.println(LCM);
}
}

      
        