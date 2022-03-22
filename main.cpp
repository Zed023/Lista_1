#include "PrimeNumbers.hpp"
#include <iostream>
#include <ostream>

using namespace std;

int main(int argc, char *argv[])
{
    try 
    {
        int n = std::stoi(argv[1]);
        static PrimeNumbers* test = new PrimeNumbers(n);
        for (int i = 2; i < argc; i++)
        {
            try
            {
                int m = std::stoi(argv[i]);

                if(test -> number(n,m) != 1)
                {
                    cout << m << " - " << test -> number(n,m) << endl;
                }
                else
                {
                    cout << m << " - liczba spoza zakresu" << endl;
                }
            }
            catch (exception &err)
            {
                cout << argv[i] << " - nieprawidłowa dana" << endl;
            }
        }
        delete test;
    } 
    
    catch (exception &err)
    {
        cout << "nieprawidłowy zakres" << endl;
    }
}