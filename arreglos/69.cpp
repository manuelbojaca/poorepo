#include <stdio.h>

void suma();

int mat[5][3]={5,6,13,14,2,4,21,7,6,12,9,5,0,0,0};

int main(){
	suma();
	for(int i=0;i<5;i++){	
		for(int j=0;j<3;j++){
			printf("%d\t",mat[i][j]);	
		}
	printf("\n");
    }
return 0;
}
void suma(){
	for(int i=0;i<3;i++){	
		for(int j=0;j<4;j++){
			mat[4][i]=mat[4][i]+mat[j][i];
		}
	}
}
