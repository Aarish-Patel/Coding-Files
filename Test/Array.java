class Array
{
    public static void main()
    {
        int array[] = new int[1296760];
        int i, j;
        for(i = 0; i < array.length; i ++)
        {
            array[i] = i;
        }
        for(j = 0; j < array.length; j ++)
        {
            System.out.println(array[j]);
        }
    }
}