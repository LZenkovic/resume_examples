#include <iostream>
using namespace std;

int main()
{
	int i,k = 1,l = 1;
	cin >> i;
	cout << "\n";
	while(l <= i)
	{
		if(k == l)
		{
			cout << "*\n";
			l++;
			k = 1;
		}
		else
		{
			cout << "* ";
			k++;
		}
	}	
}
