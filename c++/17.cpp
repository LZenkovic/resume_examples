#include <iostream>
using namespace std;

int main()
{
	int vyber;	int a; int b; int c;
	
	cout << "Vyber si pocitani\n";
	cout<< "1) vypocet obsahu a obvodu ctverce/obdelniku\n";
	cout<< "2) vypocet obsahu a povruchu krychle\n";
	cin >> vyber;
	
	if(vyber == 1)
	{
		cout << "Zadej stranu A (v metrech)\n";
		cin>> a;
		cout << "Zadej stranu B (v metrech)\n";
		cin>> b;
		cout << "Vysledek obsahu je ";
		cout << a*b;
		cout << " m^2\n";
		cout << "Vysledek obvodu je ";
		cout << (a+b)*2;
		cout << " m";
	}
	else 
	{
		cout << "Zadej stranu A (v metrech)\n";
		cin>> a;
		cout << "Zadej stranu B (v metrech)\n";
		cin>> b;
		cout << "Zadej stranu C (v metrech)\n";
		cin>> c;
		cout << "Vysledek objemu kvadru je ";
		cout << a*b*c;
		cout << " m^3\n";
		cout << "Vysledek povrchu je ";
		cout << a*b*2 + a*c*2 + b*c*2;
		cout << " m^2";
	}
}
