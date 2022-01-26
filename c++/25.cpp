#include <iostream>
using namespace std;

int main()
{
	int x;	
	cin >> x;
	
	while (2000 <= x)
	{
		cout << "2000\n";
		x = x - 2000;
	}
	while (500 <= x)
	{
		cout << "500\n";
		x = x - 500;
	}
	while (100 <= x)
	{
		cout << "100\n";
		x = x - 100;
	}
}
