
import java.util.Scanner;

public class Arre66{
	public static void main(String[]args){
		int mat[][]={{5,6,13},{14,2,4},{21,7,6}};
		for(int i=0;i<3;i++){	
			for(int j=0;j<3;j++){
				mat[i][j]=mat[i][j]*2;
				System.out.print(mat[i][j]+"| ");	
			}
		System.out.println("");
    		}
	}
}