
import java.util.Scanner;

public class Simple2{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a,b;
	int oper;
	//d=2*b-b;
	System.out.println("******************\n");
	System.out.println("digite un valor para a");
	a=in.nextInt();
	System.out.println("digite un valor para b");
	b=in.nextInt();
	oper=(a+5)*3/2*b-b;
	System.out.println("el resultado es: "+oper);
	}

}
