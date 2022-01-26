#include <iostream>
using namespace std;

int main()
{
	int i,j,m;
	int k = 1;
	int l = 0;
	
	int p[20];
	for (i = 0; i < 20 ; i++)
	{
		cin >> p[i];
		if (p[i] == 0)
		{
			i = 20;
		}
	}
	
	for (j = 1; j <= 15; j++)
	{	
		for (m = 0; m < 20; m++)
		{
			if (p[m] == j)
			{
				l++;
			}
			else if (p[m] == 0)
			{
				m = 20;
			}
		}
		if (l > 0)
		{
			cout << j << " - " << l << "x\n";
			l = 0;
		}
	}
}
