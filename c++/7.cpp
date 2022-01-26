#include <iostream>
using namespace std;

int main()
{
	int i;
	int j = 0;
	int a;
	int poc = 0;
	bool opak;
	int p[50];
	for (i = 0; i < 50;i++)
	{
		cin >> p[i];
		if (p[i] == 0)
		{
			break;
		}
	}
	
	poc = i -1;
	do
	{
		if (j == poc && opak == false)
		{
			break;
		}
		else if (j == poc)
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
	
	for (i = 0; i < 50; i++)
	{
		if (p[i] == 0)
		{break;}
		else
		{
			cout << p[i] <<" ";
		}		
	}
	
	cout << "\n";
	
	for (i = 0; i < 50; i++)
	{
		if (p[i] == 0)
		{
			break;
		}
		else if(p[i] != p[i+1])
		{
			cout << p[i] << "\n";	
		}
		else
		{
			cout << p[i];
		}
	}
}






















