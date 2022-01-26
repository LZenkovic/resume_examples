#include <iostream>
using namespace std;

int main()
{
	int p[1000];
	int x;
	
	for(int i = 0;i < 1000; i++)
	{  
		p[i] = i+1;
	}
	
	for (int i = 1; i < 1000; i++)
	{
		if (p[i] != 0)
		{
			for(int k = i + p[i]; k < 1000; k = k + p[i])
			{
				p[k] = 0;
			}
		}
	}  
	
	for(int j = 0;j < 1000; j++)
	{
		cout << p[j] << "\t";
		if ((j+1)% 5 == 0)
		{
			cout << "\n";
		}
	}

}
