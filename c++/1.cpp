#include <iostream>
using namespace std;

int main()
{
	int k,i;
	char znak;
	for(i = 0; i< 20; i++)
	{
		cin >> znak;
		
		if (znak >= 'a' && znak <='z')
		for (k; k < (znak - 'a' + 1); k++)
		{
			cout << znak;
		}
		cout << "\n";
	}
	
}
