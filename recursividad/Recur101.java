import java.util.Scanner;

public class Recur101{
	
	public static void main(String[]args){
		int fi,se;
		int res=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Escriba primer entero \n");
		fi=in.nextInt();
		System.out.println("Escriba segundo entero \n");
		se=in.nextInt();
		for(int j=0;j<se;j++){
			res=res+fi;
			}
		System.out.println("El producto es: "+res);

	}
}
