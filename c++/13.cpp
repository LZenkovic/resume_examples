#include <iostream>
using namespace std;

int main()
{
	bool h = true;
	int x;
	int i;
	int j;
	cin >> x;
	
	for (i = 0;i < 10;i++)
	{		
		if (x%10 == 0)
		{
			cout << "1      :" << i << "\n";
			i = 11;
		}
		else
		{
			x = x - 1;
		}
	}
	
	for (i = 0;i < 10;i++)
	{		
		if (x%100 == 0)
		{
			cout << "10     :" << i << "\n";
			i = 11;
		}
		else
		{
			x = x - 10;
		}
	}
	
	for (i = 0;i < 10;i++)
	{		
		if (x%1000 == 0)
		{
			cout << "100    :" << i << "\n";
			i = 11;
		}
		else
		{
			x = x - 100;
		}
	}
	
	for (i = 0;i < 10;i++)
	{		
		if (x%10000 == 0)
		{
			cout << "1000   :" << i << "\n";
			i = 11;
		}
		else
		{
			x = x - 1000;
		}
	}
	
	for (i = 0;i < 10;i++)
	{		
		if (x%100000 == 0)
		{
			cout << "10000  :" << i << "\n";
			i = 11;
		}
		else
		{
			x = x - 10000;
		}
	}
}
