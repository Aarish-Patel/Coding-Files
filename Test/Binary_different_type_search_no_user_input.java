import java.util.*;
class Binary_different_type_search_no_user_input
{
    public static void main()
    {
      Scanner sc =new Scanner(System.in);
      int a[]={5,10,15,20,25,30,35,40,45,50};
      int l=0,u=9,m=0,flag=0,search;
      System.out.print("Enter a search value:");
      search=sc.nextInt();//Search=10
      while(l<=u)
      {
          m=(l+u)/2;//4,4,3,3,2,2,1
           if(search==a[m])//false(10!=25),false(10!=25),false(10!=20),false(10!=20),false(10!=15),false(10!=15),True(10=10)
          {
              flag=1;
              break;
            }
            else if(search<a[m])//true,true,true,true,true,true
            u--;//8,7,6,5,4,3
            else
            l++;
        }
        if(flag==0)
        System.out.println("Value not found");
        else
        System.out.println("Value found at position:"+(m+1));//after 7 iteration value was found while number of values is 10(inefficiency overload)
    }
}

      
      
        
        
        
    
