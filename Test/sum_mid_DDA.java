import java.util.*;
class sum_mid_DDA
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        int ui, i, j, m, s = 0;
        System.out.print("Enter the number of rows and columns(odd values only) : ");
        ui = sc.nextInt();        
        int dda[][] = new int[ui][ui];
        m = (ui)/2;
        if(ui%2==1)
        {
            for(i = 0;i < dda.length;i ++)
            { 
                for(j = 0;j < dda.length;j ++)
                {
                    System.out.print("Enter a value : ");
                    dda[i][j] = sc.nextInt();
                } 
            }
            for(i = 0;i < dda.length;i ++)
            {
                s += dda[m][i] + dda[i][m];
                 for(j = 0;j < dda.length;j ++)
                {
                    System.out.print(dda[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println(s);
        }
        else
        System.out.print("Input a odd value only");
    }
}