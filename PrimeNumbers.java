public class PrimeNumbers
{
    public static boolean[] primes;

    //sito Erostytensa czy jak go tam zwali
    public PrimeNumbers(int n)
    {
        primes = new boolean[n + 1];
        for(int i = 0; i < n; i++)
        {
            primes[i] = true;
        }
        for (int p = 2; p <= Math.sqrt(n); p++)
        {
            if(primes[p])
            {
                for(int x = p+p; x <= n; x += p)
                {
                    primes[x] = false;
                }
            }
        }
    }

    //metoda wyznaczająca m-tą liczbę pierwsza w tablicy
    public static int liczba(int m)
    {
        int y = 0;
        int l = 0;

        for(int i = 2; i < primes.length; i++)
        {
            if (primes[i])
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
