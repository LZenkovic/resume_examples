#include <iostream>
using namespace std;

int main()
{
	int a,b,c;
	cin >> a;
	b = 1;
	c = 0;
	while (b <= a)
	{
		if (a%b == 0)
		{
			cout << b << "\t";
			c++;
			b++;
		}
		else
		{
			b++;
		}
	}
	cout << "\n\n" << c;
}
