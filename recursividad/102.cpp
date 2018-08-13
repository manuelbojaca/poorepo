#include <stdio.h>

void multi();
int fi, se,res;

//int mat[5][3]={5,6,13,14,2,4,21,7,6,12,9,5,0,0,0};

int main(){
	printf("Escriba hasta que numero entero quiere sumar \n");
	scanf("%d",&fi);
	//printf("Escriba segundo entero \n");
	//scanf("%d",&se);
	multi();
	printf("El resultado es: %d",res);
	return 0;
}
void multi(){
	//se=se+1;	
	//for(int i=0;i<3;i++){	
	for(int n=1;n<=fi;n++){
		res=(n*(n+1))/2;	
	}
	
}
