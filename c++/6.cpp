#include <iostream>
using namespace std;

int main()
{
	int i;
	int j;
	char p[30];
	
	for (i = 0;i < 30; i++)
	{
		cin >> p[i];
		if (p[i] == 'X')
		{
			break;
		}
	}
	cout << "\n";
	for (i = 0;i< 30;i++)
	{
		if (p[i] == 'X')
		{
			break;
		}
		else
		{
			cout << p[i];
			j = p[i]-'a'; 
			for(j; j >= 0;j--)
			{
				cout << "*";
			}
			cout << "\n";
		}
	}
}
