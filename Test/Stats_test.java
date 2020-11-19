class Stats_test
{
    public static void main()
    {
        int pars[] = {3, 7, 9, 5};
        int parsed[][] = {{10, 8, 9, 5}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        Statistics.Vert_Histo(pars);
        Statistics.Vert_Histo(parsed);
    }
}