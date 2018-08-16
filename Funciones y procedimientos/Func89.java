import java.util.Scanner;
public class Func89{
	static int factor(int a){

		int i;
		int fac = 1;
		for (i=1; i<=(a); i=i+1)
			fac=fac*i;
		return (fac);
	}

	public static void main(String[]args){

		int a;
		do{
			Scanner in=new Scanner(System.in);
			System.out.println("Introduzca un numero ");
			a=in.nextInt();
			if(a>0){
				a=factor(a);
				System.out.println("El factorial es "+a);
			}
		}while (a > 0);
	}
}


