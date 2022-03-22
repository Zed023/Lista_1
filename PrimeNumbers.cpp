#include <iostream>
#include <math.h>
#include "PrimeNumbers.hpp"

using namespace std;

PrimeNumbers::PrimeNumbers(int n)
{
    this->n = n;
}

int PrimeNumbers::number(int n, int m)
{
    bool primes[n + 1];
    for(int p = 2; p <= sqrt(n); p++)
    {
        if(primes[p])
        {
            for(int x = p+p; x <= n; x += p)
            {
                primes[x] = false;
            }
        }
    }

    int y = 0;
    int l = 0;
    int j = 0;
    for(int b = 2; b < n; b++)
    {
        if (primes[b])
        {
            j++;
        }
    }

    if(m >= j || m < 0)
    {
        return -1;
    }
    else 
    {
        for(int i = 2; i < n + 1; i++)
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
}