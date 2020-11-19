import java.util.*;
class multiplication_array
{
    public static void main()
    {
        Scanner sc = new Scanner(System.in);
        String size1, size2;
        System.out.print("Enter size of the first array : ");
        size1 = sc.nextLine();
        System.out.print("Enter size of the second array : ");
        size2 = sc.nextLine();
        int i, j;
        int array1[][] = new int[((int)(size1.charAt(0)) - 48)][((int)(size1.charAt(2)) - 48)];
        int array2[][] = new int[((int)(size2.charAt(0)) - 48)][((int)(size2.charAt(2)) - 48)];
        if(size1.charAt(2) == size2.charAt(0))
        {
            int prod[][] = new int[((int)(size1.charAt(0)) - 48)][((int)(size2.charAt(2)) - 48)];
            for(i = 0; i < ((int)(size1.charAt(0)) - 48); i++)
            {
                for(j = 0; j < ((int)(size1.charAt(2)) - 48); j++)
                {
                    System.out.print("Enter the value : ");
                    array1[i][j] = sc.nextInt();
                }
            }
            System.out.println("Second : ");
            for(i = 0; i < ((int)(size2.charAt(0)) - 48); i++)
            {
                for(j = 0; j < ((int)(size2.charAt(2)) - 48); j++)
                {
                    System.out.print("Enter the value : ");
                    array2[i][j] = sc.nextInt();
                    prod[j][i] = array1[j][i] * array2[i][j];
                }
            }
            for(i = 0; i < ((int)(size1.charAt(0)) - 48); i ++)
            {
                for(j = 0; j < ((int)(size2.charAt(2)) - 48); j ++)
                {
                    System.out.print(prod[i][j]+"\t");
                }
                System.out.println();
            }
        }
        else
        System.out.println("Matrices cannot be multiplied");
    }
}