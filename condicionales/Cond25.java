import java.util.Scanner;
public class Cond25{
	public static void main(String[]args){

		int numer1,numer2,numer3;

		Scanner in=new Scanner(System.in);
		System.out.println("digite numer1: ");
		numer1=in.nextInt();
		System.out.println("digite numer2: ");
		numer2=in.nextInt();
		System.out.println("digite numer3: ");
		numer3=in.nextInt();
	
		if(numer1<numer2&&numer2<numer3){
			System.out.println("los numeros se introducieron en forma creciente");
		}
		else if(numer1>numer2&&numer2>numer3)
			System.out.println("los numeros se introducieron en forma decreciente");
		else
			System.out.println("los numeros no se introducieron en forma ordenada");
	}
}