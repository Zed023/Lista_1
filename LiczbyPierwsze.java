import static java.lang.Math.sqrt;

public class LiczbyPierwsze
{
    public static boolean czyPierwsza(int x)
    {
        if (x <= 1)
        {
            return false;
        }
        for (int k = 2; k <= sqrt(x); k++)
        {
            if (x % k == 0)
            {
                return false;
            }
        }
        return true;
    }

    public static int[] LiczbyPierwsze(int n)
    {
        int pomoc = 0;
        for (int i = 2; i <= n; i++)
        {
            if (czyPierwsza(i) == true)
            {
                pomoc = pomoc + 1;
            }
        }
        int[] TablicaLiczbPierwszych = new int[pomoc];

        int y = -1;
        for (int w = 2; w <= n; w++)
        {
            if (czyPierwsza(w) == true)
            {
                y = y + 1;
                TablicaLiczbPierwszych[y] = w;
            }
        }
        return TablicaLiczbPierwszych;
    }

    public static int liczba(int m)
    {
        int n = 30;
        int [] test = LiczbyPierwsze(n);
        return test[m-1];
    }

    public static void main(String[] args)
    {
        int n;
        int k;
        try
        {
            n = Integer.parseInt(args[0]);
            if(n > 2)
            {
                int[] tab = LiczbyPierwsze(n);
                for(int i = 1; i < args.length; i++)
                {
                    try
                    {
                        k = Integer.parseInt(args[i]);
                        if(k > tab.length || k < 0)
                        {
                            System.out.println(args[i] + " - liczba spoza zakresu");
                        }
                        else
                        {
                            System.out.print(args[i] + " - ");
                            System.out.println(tab[k]);
                        }
                    }
                    catch (NumberFormatException ex)
                    {
                        System.out.println(args[i] + " - nieprawidłowa dana");
                    }
                }
            }
            else
            {
                System.out.println(args[0] + " - Nieprawdiłowy zakres");
            }
        }
        catch (NumberFormatException ex)
        {
            System.out.println(args[0] + " - Nieprawdiłowy zakres");
        }
    }
}
