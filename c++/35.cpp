#include <iostream>
using namespace std;

int main()
{
	int p[100];
	int x = 1; 
	int y = 1;
	
	for(int i = 0;i < 100; i++)
	{  
		p[i] = x;
		x += y;
		
		if(x > 5)
		{
			x = 5;
			y = -y;
		}
		else if (x < 1)
		{
			x = 1;
			y = -y;
		}
	}
	
	for(int j = 0;j < 100; j++)
	{
		cout << p[j] << " ";
		if ((j+1)% 10 == 0)
		{
			cout << "\n";
		}
	}
}
