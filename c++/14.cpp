#include <iostream>
using namespace std;

int main()
{
	int x;
	int i;
	cin >> x;
	if (x%2 == 0)
	{
		x--;
	}
	else
	{
		x = x-2;
	}
	do
	{
		cout << x;
		for (i = x; i > 0;i--)
		{
			cout << ".";
		}
		x = x - 2;
		cout << "\n";
		
	}while (x > 0);
}
