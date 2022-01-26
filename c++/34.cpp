#include <iostream>
using namespace std;

int main()
{
	int i = 1,j = 1, l = 1; 
	char zn;
	while (i <= 10)
	{
		while( j <= 10)
		{
			if (l%2 == 0)
			{
				zn = 001;
			}
			else
			{
				zn = 002;
			}
			cout << zn << " " << l <<" i = " << i << " j = " << j << "\n" << (char)(007);
			j++;
			l++;

		}
		i++;
		j = 1;
	}
}
