public class Test
{
    public static void main(String[] args)
    {
        //zmienne pomocnicze
        int n;
        int k;
        //try,catch sprawdzający czy pierwsza wartosc zczytana z konsoli jest liczba naturalna wieksza od 2
        try
        {
            n = Integer.parseInt(args[0]);

            if(n > 2)
            {
                //utowrzenie tablicy liczb pierwszych o podanej liczbie elementow
                PrimeNumbers arr = new PrimeNumbers(n);
                for(int i = 1; i < args.length; i++)
                {
                    try
                    {
                        k = Integer.parseInt(args[i]);
                        int j = 0;
                        for(int b = 2; b < n; b++)
                        {
                            if (arr.primes[b])
                            {
                                j++;
                            }
                        }
                        if(k >= j || k < 0)
                        {
                            System.out.println(args[i] + " - liczba spoza zakresu");
                        }
                        else
                        {
                            System.out.print(args[i] + " - ");
                            int m = PrimeNumbers.liczba(k);
                            System.out.println(m);
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
//Adam Zeid INA, Lista1 LiczbyPierwsze Java 15.03.22
