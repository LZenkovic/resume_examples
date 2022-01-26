#include <iostream>
using namespace std;

int main()
{
	int i = 500000000;
	int j = 2;
	while (true)
	{
		if (i == j)
		{
			cout << i << "\n";
			i++;
			j = 2;
		}
		else
		{
			if(i % j == 0)
			{
				i++;
				j = 2;
			}
			else
			{
				j++;
			}
		}
	}
}
