#include <iostream>
using namespace std;

struct Numeros{
	
	float numero;
	int entero ;
	float decimal;
}numeros [10], *p = &numeros[10];

int main() {
	
	int cant=0;
	
	cout<<"Digite la cantidad de numeros a ingresar: ";
	cin>>cant;
	
	for (int i=0; i<cant; i++){
		cout<<"Ingrese el numero Decimal: ";
		cin>> p-> numero;
		
		p->entero=p->numero;
		p->decimal=p->numero-p->entero;
		p++;
	}
	
	system ("cls");
	
	for (int i=0; i<cant; i++){
		cout<<"numero: "<<i+1<<p->numero<<endl;
		cout<<"parte entera : "<<p->entero<<endl;
		cout<<"parte decimal : "<<p->decimal<<endl;
		cout<<endl;
		p++;
	}
	
	return 0;
}

