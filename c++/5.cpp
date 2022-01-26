#include <iostream>
using namespace std;

int main()
{
	int x;
	int i,j;
	int mezery;
	
	cin >> x;
	mezery = (x-1)/2;
	
	while (true)
	{
		for (i = 0; i < mezery ; i++)
		{
			cout << "  ";
		}
		cout << "*\n";
		if (mezery == 0)
		{
			break;
		}
		mezery--;
	}
	while (true)
	{
		mezery++;
		for (i = 0; i < mezery; i++)
		{
			cout << "  ";
		}
		cout << "*\n";
		if (mezery == (x-1)/2)
		{
			break;
		}
	}
}
