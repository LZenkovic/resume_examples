#include <iostream>
using namespace std;

int main()
{
	int x;
	int i;
	int a = 0;
	int b = 0;
	int c = 0;
	
	for(i = 0;i < 10;i++)
	{
		cin >> x;
		if(x%3 == 0)
		{
			a = a + x;
		}
		else if(x%5 == 0)
		{
			b = b + x;
		}
		else if (x%7 == 0)
		{
			c = c + x;
		}
	}
	cout << a << " " << b << " " << c;
}
