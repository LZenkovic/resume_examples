#include <iostream>
#include <math.h>
using namespace std;

float obdelnik (float a, float b);

int main()
{
	int i,j;
	cin >> i;
	cin >> j;
	cout << obdelnik(i,j);
}

float obdelnik (float a, float b)
{
	float obsah = a*b;
	return obsah;
}
