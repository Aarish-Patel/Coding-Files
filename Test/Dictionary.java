 
public class Dictionary
{
    static String[] dict(int a[],int b[])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(b[i]);
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                dictionary[i]=temp+":"+String.valueOf(b[i]);
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(int a[],double b[])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(b[i]);
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                dictionary[i]=temp+":"+String.valueOf(b[i]);
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(String a[],double b[])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(b[i]);
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                dictionary[i]=temp+":"+String.valueOf(b[i]);
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(String a[],int b[])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(b[i]);
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                dictionary[i]=temp+":"+String.valueOf(b[i]);
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(String a[],String b[])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(b[i]);
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                dictionary[i]=temp+":"+String.valueOf(b[i]);
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(int a[],int b[][])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="[0]";
                }
                else
                {
                    temp="[";
                    for(int j=0;j<b[i].length;j++)
                        temp+=String.valueOf(b[i][j])+" ";
                    temp=temp.substring(0,temp.lastIndexOf(' '));
                    temp+="]";
                    System.out.println(temp);
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                String vob="{";
                for(int j=0;j<b[i].length;j++)
                    vob+=String.valueOf(b[i][j])+" ";
                vob=vob.substring(0,vob.lastIndexOf(' '));
                vob+="}";
                dictionary[i]=temp+":"+vob;
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(String a[],int b[][])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="[0]";
                }
                else
                {
                    temp="{";
                    for(int j=0;j<b[i].length;j++)
                        temp+=String.valueOf(b[i][j])+" ";
                    temp=temp.substring(0,temp.lastIndexOf(' '));
                    temp+="}";
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                String vob="[";
                for(int j=0;j<b[i].length;j++)
                    vob+=String.valueOf(b[i][j])+" ";
                vob=vob.substring(0,vob.lastIndexOf(' '));
                vob+="]";
                dictionary[i]=temp+":"+vob;
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(String a[],double b[][])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="[0]";
                }
                else
                {
                    temp="{";
                    for(int j=0;j<b[i].length;j++)
                        temp+=String.valueOf(b[i][j])+" ";
                    temp=temp.substring(0,temp.lastIndexOf(' '));
                    temp+="}";
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                String vob="[";
                for(int j=0;j<b[i].length;j++)
                    vob+=String.valueOf(b[i][j])+" ";
                vob=vob.substring(0,vob.lastIndexOf(' '));
                vob+="]";
                dictionary[i]=temp+":"+vob;
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(int a[],double b[][])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="[0]";
                }
                else
                {
                    temp="{";
                    for(int j=0;j<b[i].length;j++)
                        temp+=String.valueOf(b[i][j])+" ";
                    temp=temp.substring(0,temp.lastIndexOf(' '));
                    temp+="}";
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                String vob="[";
                for(int j=0;j<b[i].length;j++)
                    vob+=String.valueOf(b[i][j])+" ";
                vob=vob.substring(0,vob.lastIndexOf(' '));
                vob+="]";
                dictionary[i]=temp+":"+vob;
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static String[] dict(String a[],String b[][])
    {
        String dictionary[];
        int i=0;
        String temp="",temp2="";
        if(a.length>=b.length)
        {
            dictionary=new String[a.length];
            for(i=0;i<a.length;i++)
            {
                if(i==b.length || i>=b.length)
                {
                    temp="[0]";
                }
                else
                {
                    temp="{";
                    for(int j=0;j<b[i].length;j++)
                        temp+=String.valueOf(b[i][j])+" ";
                    temp=temp.substring(0,temp.lastIndexOf(' '));
                    temp+="}";
                }
                dictionary[i]=String.valueOf(a[i])+":"+temp;
            }//for loop ends
        }//if ends
        else
        {
            dictionary=new String[b.length];
            for(i=0;i<b.length;i++)
            {
                if(i==a.length || i>=a.length)
                {
                    temp="0";
                }
                else
                {
                    temp=String.valueOf(a[i]);
                }
                String vob="[";
                for(int j=0;j<b[i].length;j++)
                    vob+=String.valueOf(b[i][j])+" ";
                vob=vob.substring(0,vob.lastIndexOf(' '));
                vob+="]";
                dictionary[i]=temp+":"+vob;
            }//for loop ends
        }//if ends
        return dictionary;
    }//dict ends
    static int get(String dict[],int val)
    {
        int i;
        int key;
        for(i=0;i<dict.length;i++)
        {
            key=Integer.valueOf(dict[i].substring(0,dict[i].indexOf(":")));
            if(key==val)
            {
                return Integer.valueOf(dict[i].substring(dict[i].indexOf(":")+1));
            }
        }//for loop ends
        return 0;
    }//get ends
    static int get(String dict[],String val)
    {
        int i;
        String key;
        for(i=0;i<dict.length;i++)
        {
            key=dict[i].substring(0,dict[i].indexOf(":"));
            if(key.equals(val))
            {
                return Integer.valueOf(dict[i].substring(dict[i].indexOf(":")+1));
            }
        }//for loop ends
        return 0;
    }//get ends
    static double getDouble(String dict[],String val)
    {
        int i;
        String key;
        for(i=0;i<dict.length;i++)
        {
            key=dict[i].substring(0,dict[i].indexOf(":"));
            if(key.equals(val))
            {
                return Double.valueOf(dict[i].substring(dict[i].indexOf(":")+1));
            }
        }//for loop ends
        return 0;
    }//get ends
    static double getDouble(String dict[],int val)
    {
        int i;
        String key;
        for(i=0;i<dict.length;i++)
        {
            key=dict[i].substring(0,dict[i].indexOf(":"));
            if(key.equals(val))
            {
                return Double.valueOf(dict[i].substring(dict[i].indexOf(":")+1));
            }
        }//for loop ends
        return 0;
    }//get ends
    static String getString(String dict[],String val)
    {
        int i;
        String key;
        for(i=0;i<dict.length;i++)
        {
            key=dict[i].substring(0,dict[i].indexOf(":"));
            if(key.equals(val))
            {
                return dict[i].substring(dict[i].indexOf(":")+1);
            }
        }//for loop ends
        return "";
    }//get ends
    static int[] getArray(String dict[],String val)
    {
        int a[]={0};
        int i,ct=0;
        String key,cont;
        for(i=0;i<dict.length;i++)
        {
            key=dict[i].substring(0,dict[i].indexOf(":"));
            if(key.equals(val))
            {
                cont=dict[i].substring(dict[i].indexOf(":")+1);
                cont=cont.replace("{","");
                cont=cont.replace("}","");
                cont+=" ";
                int k=0;
                String s;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ct++;
                }
                int ar[]=new int[ct];
                k=0;
                int j=0;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ar[j]=Integer.valueOf(s);
                    j++;
                }
                return ar;
            }
        }
        return a;
    }//get ends
    static int[] getArray(String dict[],int val)
    {
        int a[]={0};
        int i,ct=0,key;
        String cont;
        for(i=0;i<dict.length;i++)
        {
            key=Integer.valueOf(dict[i].substring(0,dict[i].indexOf(":")));
            if(key==val)
            {
                cont=dict[i].substring(dict[i].indexOf(":")+1);
                cont=cont.replace("{","");
                cont=cont.replace("}","");
                cont+=" ";
                int k=0;
                String s;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ct++;
                }
                int ar[]=new int[ct];
                k=0;
                int j=0;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ar[j]=Integer.valueOf(s);
                    j++;
                }
                return ar;
            }
        }
        return a;
    }//get ends
    static double[] getDoubleArray(String dict[],String val)
    {
        double a[]={0.0};
        int i,ct=0;
        String key,cont;
        for(i=0;i<dict.length;i++)
        {
            key=dict[i].substring(0,dict[i].indexOf(":"));
            if(key.equals(val))
            {
                cont=dict[i].substring(dict[i].indexOf(":")+1);
                cont=cont.replace("{","");
                cont=cont.replace("}","");
                cont+=" ";
                int k=0;
                String s;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ct++;
                }
                double ar[]=new double[ct];
                k=0;
                int j=0;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ar[j]=Double.valueOf(s);
                    j++;
                }
                return ar;
            }
        }
        return a;
    }//get ends
    static double[] getDoubleArray(String dict[],int val)
    {
        double a[]={0.0};
        int i,ct=0,key;
        String cont;
        for(i=0;i<dict.length;i++)
        {
            key=Integer.valueOf(dict[i].substring(0,dict[i].indexOf(":")));
            if(key==val)
            {
                cont=dict[i].substring(dict[i].indexOf(":")+1);
                cont=cont.replace("{","");
                cont=cont.replace("}","");
                cont+=" ";
                int k=0;
                String s;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ct++;
                }
                double ar[]=new double[ct];
                k=0;
                int j=0;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ar[j]=Double.valueOf(s);
                    j++;
                }
                return ar;
            }
        }
        return a;
    }//get ends
    static String[] getStringArray(String dict[],String val)
    {
        String a[]={""};
        int i,ct=0;
        String key,cont;
        for(i=0;i<dict.length;i++)
        {
            key=dict[i].substring(0,dict[i].indexOf(":"));
            if(key.equals(val))
            {
                cont=dict[i].substring(dict[i].indexOf(":")+1);
                cont=cont.replace("{","");
                cont=cont.replace("}","");
                cont+=" ";
                int k=0;
                String s;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ct++;
                }
                String ar[]=new String[ct];
                k=0;
                int j=0;
                while(k<cont.length())
                {
                    s=cont.substring(k,cont.indexOf(' ',k));
                    k=cont.indexOf(' ',k)+1;
                    ar[j]=s;
                    j++;
                }
                return ar;
            }
        }
        return a;
    }//get ends
    static int[] keysInt(String dict[])
    {
        int i;
        int keysint[]=new int[dict.length];
        for(i=0;i<dict.length;i++)
        {
            keysint[i]=Integer.valueOf(dict[i].substring(0,dict[i].indexOf(":")));
        }
        return keysint;
    }
    static String[] keysString(String dict[])
    {
        int i;
        String keysString[]=new String[dict.length];
        for(i=0;i<dict.length;i++)
        {
            keysString[i]=dict[i].substring(0,dict[i].indexOf(":"));
        }
        return keysString;
    }
}//class ends