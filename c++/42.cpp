#include <iostream>
#include <math.h>
using namespace std;

int main()
{
	float a,b,c;
	cin >> a;
	cin >> b;
	cin >> c;
	float k = pow(b,2) - 4*a*c;
	float l;
	
	if (k < 0)
	{
		cout << "rovnice nema reseni";
	}
	else if (k == 0)
	{
		cout << "rovnice ma 1 reseni";
		l = (-b + sqrt(k))/2*a;
	}
	else
	{
		cout << "rovnice ma 2 reseni\n";
		l = (-b + sqrt(k))/2*a;
		cout << "x1 = " << l;
		l = l = (-b + sqrt(k))/2*a;
		cout << " x2 = " << l;
	}
}


