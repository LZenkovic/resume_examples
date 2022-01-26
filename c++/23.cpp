#include <iostream>
using namespace std;

int main()
{
	int i = 1;
	int j = 1;
	
	int c;
	
	cin >> c;
	while (i <= c)
	{
		while (j <= c)
		{
			cout << "* ";
			j++;
		}
		cout << "\n";
		j = 1;
		i++;
	}
}
