#include <iostream>
#include <math.h>
using namespace std;

float mocnina (int a, int b);

int main()
{
	int i,j;
	cin >> i;
	cin >> j;
	cout << mocnina (i,j);
}

float mocnina (int a, int b)
{
	if(b == 0)
	{
		a = 1;
		return a;
	}
	int c = a;
	for(int i = 1; i < b; i++)
	{
		a = a * c;
	}
	
	return a;
}
