#include <stdio.h>

using namespace std;

int main(){
	int mat[3][3]={5,6,13,14,2,4,21,7,6};
	
for(int i=0;i<3;i++){	
		for(int j=0;j<3;j++){
			mat[i][j]=mat[i][j]*2;
			printf("%d\t",mat[i][j]);	
		}
	printf("\n");
    }

return 0;
}
