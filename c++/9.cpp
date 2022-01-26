#include <iostream>
using namespace std;

int main()
{
	int x,i;
	cin >> x;
	
	for (i = 1; i <= x;i++)
	{
		if (i == (x+1)/2)
		{
			cout << "*\t*\t*\t*\t*";
		}
		else
		{
			cout << " \t \t*\t \t";
		}
		cout << "\n";
	}
}
