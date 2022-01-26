#include <iostream>
using namespace std;

int main()
{
	int i = -128;
	char j;
	while (i <= 127)
	{
		j = i;
		cout << j << "\t" << i << "\n"; 
		i++;
	}
}
