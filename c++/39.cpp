#include <iostream>
using namespace std;

int main()
{
	int pole[5] = {5,4,3,2,1};
	int i = 0, j = 1, k, o = 0;
	
	for (int m = 0; m <= 4; m++)
	{
		if (pole[i] > pole[j])
		{
			k = pole[i];
			pole[i] = pole[j];
			pole[j] = k;
		}
		else
		{
			o++;
		}
		i++;
		j++;
	}
	
	for (int n = 0; n < 5; n++)
	{
		cout << pole[n] << ", ";
	}
}
