public class Arre69{
	static int suma(){

		int mat[][]=0;
		for(int i=0;i<3;i++){	
			for(int j=0;j<4;j++){
				mat[][]=mat[4][i]+mat[j][i];
			}
		}
		return mat[][];
	}
	public static void main(String[]args){	
	
		int mat[][]={{5,6,13},{14,2,4},{21,7,6},{12,9,5},{0,0,0}};		
		for(int i=0;i<5;i++){	
			for(int j=0;j<3;j++){
				System.out.println(mat[i][j]+"|");
			}	
		}
    	}
}