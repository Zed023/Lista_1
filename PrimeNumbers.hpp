#pragma once
#include <string>
#include <vector>
#include <math.h>
using namespace std;

class PrimeNumbers
{
    private:
    int n;
    int m;

    public:
    vector<bool> primes;

    PrimeNumbers(int n1)
    {
        n = n1;
        for(int i = 0; i <= n + 1; i++)
        {
            primes.push_back(true);
        }
        for(unsigned int p = 2; p <= sqrt(n+1); p++)
        {
            if(primes[p])
            {
                for(unsigned int x = p+p; x <= unsigned(n + 1); x += p)
                {
                    primes[x] = false;
                }
            }
        }
    }

    unsigned int liczba(int m1)
    {
        m = m1;
        int y = 0;
        unsigned int l = 0;

        for(unsigned int i = 2; i < primes.size(); i++)
        {
            if(primes[i])
            {
                l = i;
                if(y == m)
                {
                    break;
                }
                y += 1;
            }
        }
        return l;
    }
};