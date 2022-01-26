#include <iostream>
using namespace std;

int main()
{
	int i = 1;
	int j = 1;
	int c = 1;
	int a;
	
	cin >> a;
	
	while (i <= a)
	{
		while (j <= a)
		{
			cout << c << "\t";
			c++;
			j++;
		}	
		cout << "\n";
		j = 1;
		i++;
	} 
}
