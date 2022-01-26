#include <iostream>
using namespace std;

int mocnina (int i,int j);
int NSD (int i, int j);
int NSN (int i,int j);

int main()
{
	int a,b;
	cin >> a;
	cin >> b;
	//cout << mocnina(a,b);
	cout << NSD (a,b) << "\n";
	cout << NSN (a,b);
}

int NSD (int i, int j)
{
	int k;
	int l;
	if (i > j)
	{
		k = j;
	}
	else
	{
		k = i;
	}
	
	for (int m = 1;m <= k;m++)
	{
		if (i%m == 0 && j%m == 0)
		{
			l = m;
		}
	}
	return l;
}

int NSN (int i, int j) 
{
	int k;
	int l = 2;
	bool n = true;

	if (i > j)
	{
		k = j;
	}
	else
	{
		k = i;
	}
	
	while(n == true)
	{
		if (i%l == 0 && j%l == 0)
		{
			n = false;
		}
		else if (l == k)
		{
			return 1;
		}
		else
		{
			l = l+1;
		}
	}
	return l;
} 

int mocnina (int i,int j)
{
	if (j == 0)
	{
		return 1;
	}
	else
	{
		return i*mocnina(i,j-1); 
	}
}
