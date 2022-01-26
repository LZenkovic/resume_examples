#include <iostream>
using namespace std;

int main()
{
	int p[10];
	int i;
	int j = 0;
	int a;
	bool opak = false;
	for (i = 0; i < 10;i++)
	{
		cin >> p[i];
	}
	
	do
	{
		if (j == 9 && opak == false)
		{
			break;
		}
		else if (j == 9)
		{
			j = 0;
			opak = false;
			j--;
		}
		else if (p[j] <= p[j+1])
		{}
		else
		{
			a = p[j];
			p[j] = p[j+1];
			p[j + 1] = a;
			opak = true;
		}
		j++;
	}while(true);
	
	cout << "\n";
	
	for (i = 0; i < 10; i++)
	{
		cout << p[i] <<"\n";
	}
	a = 0;
	for (i = 0; i < 10; i++)
	{
		a = a + p[i];
		cout << a << ", ";
	}
}
