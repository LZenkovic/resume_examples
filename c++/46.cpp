#include <iostream>
#include <stdio.h>
using namespace std;

int main()
{
	FILE* soub;
	FILE* zapis;
	
	char  zn;
	
	soub = fopen("text.txt", "r");
	zapis = fopen("zapis.txt", "w");
	
	while(feof(soub) == 0)
	{
		zn = getc(soub);
		putc(zn, zapis);
		
		cout << zn;
	}
	
	fclose(soub); 
	fclose(zapis); 
}
