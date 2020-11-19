import java.util.*;
class Quadratic
{ 
    public static void main ()
    {
        int i,j,k=0,ct=1,flag1=0,flag2=0,flagx=0,flagx2=0,flagn=0;
        char ch=' '; double a=0.0,b=0.0,c=0.0,X1=0.0,X2;
        String s1=""; String sx2=""; String sx=""; String sn=""; String s="";
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your equation : ");
        s1 = sc.nextLine();
        s1=s1.trim();
        for(i=0;i<s1.length();i++) // counting the number of words
        {
           ch=s1.charAt(i);
           if( ch==' ')
           ct++;
        }

 

        for(j=1;j<=ct;j++)
        {  for(i=k;i<s1.length();i++)
         { ch= s1.charAt(i);
          if( ch==' ')                      // storing the first word
          { 
            break;
            }
          s=s+ch;
         }
         k=i+1;

 

         for(i=0;i<s.length();i++)
         {
          ch=s.charAt(i);
          if( ch=='x'||ch=='X' )
          {                 // checking whether it would be part of x^2,x and x^0
             flag1=1;
             }
          if( ch=='^')
          {
             flag2=1;
            }
         }
         
         if(flag1==1 && flag2==1) 
         {
            sx2=sx2.concat(s);
         }
         if(flag1==1 && flag2==0) 
         {
            sx=sx.concat(s);
         }
         if(flag1==0 && flag2==0) 
         {
            sn=sn.concat(s);
         }
         s=""; flag1=0;flag2=0;
        }
        for(i=0;i<sx2.length();i++)
        {
            ch=sx2.charAt(i);
            if(ch=='-')
            {  flagx2=1;break;}// checking whether the number is positive or negative
            
        }
        
        for(i=0;i<sx2.length();i++)
        {
            ch=sx2.charAt(i); 
           if(ch=='^')
           break;
           if(ch>=48 && ch<=57 && flagx2==0)
           {  a=a*10 +(ch-48);
           }
           if(ch>=48 && ch<=57 && flagx2==1)
           {  a=a*-10 -(ch-48);
           }
        } System.out.println(a);
        for(i=0;i<sx.length();i++)
        {
            ch=sx.charAt(i);
            if(ch=='-')
            {   flagx=1;break;}
            
        }
        for(i=0;i<sx.length();i++)
        {
           ch=sx.charAt(i);
           if(ch=='^')
           break;
           if(ch>=48 && ch<=57 && flagx==0)
           {  b=b*10 +(ch-48);
           }
           if(ch>=48 && ch<=57 && flagx==1)
           {  b=b*10 -(ch-48);
           }
        }  
        System.out.println(b);
        for(i=0;i<sn.length();i++)
        {
            ch=sn.charAt(i);
            if(ch=='^')
            break;
            if(ch=='-')
            {   flagn =1 ;break;}
            
        }
        for(i=0;i<sn.length();i++)
        {
            ch=sn.charAt(i);
           if(ch>=48 && ch<=57 && flagn==0)
           {  c=c*10 +(ch-48);
           }
           if(ch>=48 && ch<=57 && flagn==1)
           {  c=c*10 -(ch-48);
           }
        } System.out.println(c);
        X1= (-b + Math.sqrt(b*b -4*a*c))/(2*a);
        X2= (-b - Math.sqrt(b*b -4*a*c))/(2*a);
        System.out.println(" first solution = " +X1);
        System.out.println(" second solution = " +X2);
    }
}