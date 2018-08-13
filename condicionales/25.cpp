#include<iostream>

using namespace std;

int main(){
	int numer1,numer2,numer3;
	cout<<"digite numer1: ";
	cin>>numer1;
	cout<<"digite numer2: ";
	cin>>numer2;
	cout<<"digite numer3: ";
	cin>>numer3;
	
	if(numer1<numer2&&numer2<numer3){
		cout<<"los numeros se introducieron en forma creciente";
	}
	else
	cout<<"los numeros no se introducieron en forma creciente";
		
	return 0;
}
