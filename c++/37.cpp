#include <iostream>
using namespace std;

int main()
{
	int pole[5] = {5,4,3,2,1};
	int i = 0, j = 1, k, o = 0;
	
	for (int l; l < 5; l++)
	{
		cout << pole[l] << ", ";
	}
	cout << "\n";
	while (o != 3)
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
		
		if(j == 5)
		{
			i = 0;
			j = 1;
			o = 0;
		}

		
		cout << "\n";
		for (int m = 0; m < 5; m++)
		{
			cout << pole[m] << ", ";
		}
	}
	
	/*while (o != 4);	
	{
		cout << "a";
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
		
		if(j == 4)
		{
			i = 0;
			j = 1;
			o = 0;
		}
		i++;
		j++;
		
		cout << "\n";
		for (int m = 0; m < 5; m++)
		{
			cout << pole[m] << ", ";
		}
	} */
	
	/*for (int n; n < 5; n++)
	{
		cout << pole[n] << ", ";
	}*/

}
