import java.util.*;
class SuperSelectionSort
{
    public static void main()
   {
        Scanner sc = new Scanner(System.in);
        int i, j, min, max, uv, temp, tempm, pos, posm;
        int ui[] = new int[100000];
       for(i = 0; i < 100000; i ++)
        {
           ui[i] = 100000 - i;
        }
       for(i = 0; i < (int)(ui.length / 2); i ++)
        {
            min = ui[i];
            max = ui[i];
            pos = i;
            posm = i;
            uv = ui.length - i - 1;
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
    for(i = 0; i < 100000; i ++)
        {
            System.out.println(ui[i]);
        }     
}
}
