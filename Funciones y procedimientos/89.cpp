#include <stdio.h>
long int factorial (int x) {
	int i;
	long int fac = 1;
	for (i=2; i<=x; i=i+1) fac=fac*i;
	return (fac);
}
main (){
	int a;
	do{
		printf ("\n Introduzca un numero ");
		scanf ("%d", &a);
		if (a>0)
		printf ("El factorial es %ld", factorial (a));
	} while (a > 0);
}
