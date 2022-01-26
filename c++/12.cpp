#include <iostream>
using namespace std;

int main()
{
	int x;
	int i,k;
	int y;
	int l = 0;
	cin >> x;
	
	y = x;
	
	for (k = x; k > 0; k--)
	{
		y = x - l;
		for (i = x; i > 0 ; i--)
		{
			if (y == 0)
			{
				y = x;
				cout << y << " ";
				y--;
			}
			else
			{
				cout << y << " ";
				y--;
			}
		}
		cout << "\n";
		l++;
	}			
	
}
