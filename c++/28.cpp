#include <iostream>
using namespace std;

int main()
{
    int cislo = 1;
    
    int X;
    cin >> X;

    while ( cislo <= X * X )
    {
		cout << "*" << " ";
		
		if( (cislo % X) == 0 )
		{
			cout << "\n";
		}
		
		cislo = cislo + 1;
    }
}


