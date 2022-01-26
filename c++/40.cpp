#include <iostream>
#include <math.h>
using namespace std;

float obdelnik (float a, float b);

int main()
{
	float a,b;
	cin >> a;
	cin >> b;
	cout << obdelnik(a,b);
}

float obdelnik (float a, float b)
{
	float obsah;
	obsah = a*b;
	return obsah;
}

