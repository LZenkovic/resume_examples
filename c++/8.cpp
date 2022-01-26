#include <iostream>
using namespace std;

int main()
{
	int i;
	int p[8];	
	for (i = 0; i < 8;i++)
	{
		cin >> p[i];
	}
	
	cout << "\n";
	cout << p[0]*128 + p[1]*64 + p[2]*32 + p[3]*16 + p[4]*8 + p[5]*4 + p[6]*2 +p[7]*1; 
	
}
