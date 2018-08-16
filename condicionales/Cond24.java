import java.util.Scanner;

public class Cond24{
	public static void main(String[]args){
		int n;
		Scanner in=new Scanner(System.in);
		System.out.println("digite un numero");
		n=in.nextInt();
		if(n<0)
			System.out.println("el numero introducido es negativo");
		else if(n>=0)
			System.out.println("el numero introducido es positivo");
	}
}
