public class DictionaryTest
{
    public static void main()
    {
        String s[]={"Dhruv","Aarish"};
        int marks[]={100,99,98};
        double per[]={99.8,99.8};
        String st[]={"Maths","English"};
        int marksst[]={20,15,20};
        double marksper[][]={{100.0,98.0},{99.0,99.0}};
        String sm[]=Dictionary.dict(s,marks);
        String stm[]=Dictionary.dict(st,marksst);
        String sp[]=Dictionary.dict(s,per);
        String sst[]=Dictionary.dict(s,st);
        String smp[]=Dictionary.dict(s,marksper);
        System.out.println(Dictionary.get(sm,"0"));
        System.out.println(Dictionary.get(stm,"0"));
        System.out.println(Dictionary.getDouble(sp,"Dhruv"));
        System.out.println(Dictionary.getString(sst,"Dhruv"));
        double ar[]=Dictionary.getDoubleArray(smp,"Dhruv");
        for(double i:ar)
        System.out.print(i+" ");
    }//main ends
}//class ends
