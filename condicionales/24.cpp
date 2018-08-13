#include<iostream>

using namespace std;

int main(){
	int numero;
	cout<<"digite un numero: ";
	cin>>numero;
	
	if(numero<0){
		cout<<"el numero introducido es negativo";
	}
	else if(numero>=0){
		cout<<"el numero introducido es positivo";
	}
	
	
	return 0;
}
