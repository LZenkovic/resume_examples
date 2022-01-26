#include <iostream>
using namespace std;

int main()
{
	int i,j;
	int a;
	bool opak;
	int p[50];
	for (i = 0; i < 50;i++)
	{
		if (p[i] == 0)
		{
			break;
		}
		else
		{
			cin >> p[i];
		}
	}
	
	do
	{
		if (j == 49 && opak == false)
		{
			break;
		}
		else if (j == 49)
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
	
	for (i = 0; i < 50; i++)
	{
		if (p[i] == 0)
		{
			break;
		}
		else if(p[i] != p[i-1])
		{
			cout << p[i] << "\n";	
		}
		else
		{
			cout << p[i];
		}
	}
}






















