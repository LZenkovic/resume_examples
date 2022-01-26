#include <iostream>
#include <math.h>
using namespace std;

float trojuhlenik (float a, float b);

int main()
{
	float a,b;
	cin >> a;
	cin >> b;
	cout << trojuhlenik(a,b);
}

float trojuhlenik (float a, float b)
{
	float odvesna;
	odvesna = sqrt(pow(a,2)+pow(b,2));
	return odvesna;
}
