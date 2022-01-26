#include <iostream>
using namespace std;

int main()
{
	int  cislo;
	cout << "Zadej cosli\n";
	cin >> cislo;
	
	if (cislo > 0)
	{
		cout << "cislo je kladne";
	}
	else
	{
		if (cislo < 0)
		{
			cout << "cislo je zaporne";
		}
		else 
		{
			cout << "cislo je 0";
		}
	}
}
