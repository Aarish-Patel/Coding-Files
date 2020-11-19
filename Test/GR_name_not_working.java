import java.util.*;
class GR_name_not_working
{
    public static void main()
    {
       Scanner sc=new Scanner(System.in);
       int Gr[]=new int[1000];
       String name[]=new String[1000];
       int i,Gr_user,u=999,l=0,m=-1,flag;
       String st;
       for(i=0;i<1000;i++)
       {
           System.out.print("Enter Gr no. :  ");
           Gr[i]=sc.nextInt();
           System.out.print("Enter corresponding name : ");
           name[i]=sc.next();
           st=name[i];
           if(st=="done")
            break;
        }
        System.out.print("Enter the Gr no. :");
        Gr_user=sc.nextInt();
        while(l<=u)
        {
            m=(l+u)/2;
            if(Gr_user==Gr[m])
            {
                flag=1;
            break;
        }
        else if(Gr_user<Gr[m])
        u=m-1;
        else
        l=m+1;
    }
     System.out.print("the Corresponding name is:"+name[m]);
      
    }
}