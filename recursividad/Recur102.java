import java.util.Scanner;
public class Recur102{
	static int multi(int fi){

		int res=0;
		for(int i=1;i<=fi;i++){
			res=(i*(i+1))/2;
		}
		return res;
	}

	public static void main(String[]args){
		
		int fi,se,res=0,n;
		Scanner in=new Scanner(System.in);
		System.out.println("Escriba hasta que numero entero quiere sumar ");
		fi=in.nextInt();
		res=multi(fi);
		System.out.println("El resultado es: "+res);
		
	}
}

