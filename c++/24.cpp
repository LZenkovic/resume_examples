#include <iostream>
using namespace std;

int main()
{
	int a;
	int b;
	int c;
	cin >> a;
	cin >> b;
	while (a >= b)
	{
		a = a - b;
		c++;
	}
	cout << "Zbytek je " << a << " a cislo je " << c;
}
