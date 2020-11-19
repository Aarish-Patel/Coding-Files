import java.util.*;
class SuperSelectionSort_Done
{
    public static void main()
   {
        Scanner sc = new Scanner(System.in);
        int i, j, min, max, uv, temp, tempm, pos, posm;
        int ui[] = new int[10];
       for(i = 0; i < 10; i ++)
        {
           System.out.print("Enter a number : ");
           ui[i] = sc.nextInt();
        }
       for(i = 0; i < 5; i ++)
        {
            min = ui[i];
            max = ui[i];
            pos = i;
            posm = i;
            uv = 9 - i;
            for(j = i + 1; j <= uv; j ++)
            {
               if(min > ui[j])
                {
                    min = ui[j];
                    pos = j;
                }
               if(max < ui[j])
               {
                 max = ui[j];
                 posm = j;
                }
               }
            temp = ui[i];
            ui[i] = ui[pos];
            ui[pos] = temp;
            if(i == posm)
            {
                tempm = ui[uv];
                ui[uv] = ui[pos];
                ui[pos] = tempm;
            }
            else
            {
            if(uv != 5)
            {
             tempm = ui[uv];
             ui[uv] = ui[posm];
             ui[posm] = tempm;
            }
           }
        }
    for(i = 0; i < 10; i ++)
        {
            System.out.println(ui[i]);
        }     
}
}