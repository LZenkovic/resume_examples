#include <iostream>
using namespace std;

int main()
{
	int a;
	int b;
	int c;
	
	cin >> a;
	cin >> b;
	cin >> c;
	
	if (a > b)
	{
		if (a > c)
		{
			cout << "1. cislo je nevetsi";
		}
		else
		{
			cout << "3. cislo je nejvetsi";
		}
	}
	else
	{
		if (b > c)
		{
			cout << "2. cislo je nevetsi";
		}
		else
		{
			cout << "3. cislo je nejvetsi";
		}
	}
	
}
