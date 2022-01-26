#include <iostream>
using namespace std;

int main()
{
	int a,b;
	cin >> a;
	b = 2;
	while (b <= a)
	{
		if (a%b == 0)
		{
			cout << b << "\t";
			a = a / b;
		}
		else
		{
			b = b + 1;
		}
	}
}
