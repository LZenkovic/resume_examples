#include <iostream>
using namespace std;

int main()
{
	bool zavorka = false;
	int i;
	char p[1024];
	
	for (i = 0;i < 1024;i++)
	{
		cin >> p[i];
		if (p[i] == '!')
		{
			break;
		}
	}
	
	for (i= 0; i < 1024; i++)
	{
		if (p[i] == '!')
		{
			break;
		}
		else if (p[i] == '(')
		{

			zavorka = true;
		}
		else if (p[i] == ')')
		{
			zavorka = false;
		}
		else if (zavorka == true)
		{
			cout << "";
		}
		else
		{
			cout << p[i];
		}
	}
	
}
