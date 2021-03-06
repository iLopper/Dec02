package Exersice;
import java.util.Scanner;
public class Fibonnaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int last,fibo=0;
		Scanner In=new Scanner(System.in);
		System.out.print("Indique la cantidad del serial a mostrar: ");
		serieFib(In.nextInt());
		//System.out.println(fib(In.nextInt()));
	}
	//Muestra serie a paso en una misma l�nea.
	public static void serieFib(int last) {
		int fibo=0;
		for (int consec=1;consec<=last;consec++) {
			fibo=consec+fibo;
			if(consec==last)
				System.out.println(fibo+".");
			else
				System.out.print(fibo+",");
		}
	}
	//Muestra resultado final.
	public static int fib(int n) {
		if(n==0) {
			return 0;
		}
		else if (n==1) {
			return 1;
		}
		return (((fib(n-1))+(fib(n-2))));
	}

}

// Finbonacci: sum of previous numbers, acumulate.
// fib(0)=0
// fib(1)=0+1=1
// fib(2)=0+1+2=3
// fib(3)=0+1+2+3=6
// fib (8)=0+1+2+3+4+5+6+7+8=36
