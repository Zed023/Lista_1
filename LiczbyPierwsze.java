public class LiczbyPierwsze
{
    public static boolean[] TabLiczbyPierwsze;

    public LiczbyPierwsze(int n)
    {
        TabLiczbyPierwsze = new boolean[n];
        for(int i = 0; i < n; i++)
        {
            TabLiczbyPierwsze[i] = true;
        }
        for (int p = 2; p < Math.sqrt(n); p++)
        {
            if(TabLiczbyPierwsze[p])
            {
                for(int x = p+p; x < n; x += p)
                {
                    TabLiczbyPierwsze[x] = false;
                }
            }
        }
    }

    //metoda
    public static int liczba(int m)
    {
        int y = 0;
        int l = 0;

        for(int i = 2; i < TabLiczbyPierwsze.length; i++)
        {
            if (TabLiczbyPierwsze[i])
            {
                l = i;
                if (y == m)
                {
                    break;
                }
                y += 1;
            }
        }
        return l;
    }
}
//Adam Zeid INA, Lista1 LiczbyPierwsze Java 15.03.22
