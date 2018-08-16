import java.util.Scanner;

public class Simple1{
	public static void main(String[]args){
	Scanner in=new Scanner(System.in);
	int a,b,c;
	int oper;
	//int d=b+2-a;
	//oper=((a+7*c)/b+2-a)+2*b;
	System.out.println("******************\n");
	System.out.println("digite un valor para a");
	a=in.nextInt();
	System.out.println("digite un valor para b");
	b=in.nextInt();
	System.out.println("digite un valor para c");
	c=in.nextInt();
	oper=((a+7*c)/b+2-a)+2*b;
	System.out.println("el resultado es: "+oper);
	}

}

