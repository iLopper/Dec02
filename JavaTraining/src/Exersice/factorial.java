package Exersice;
import java.util.Scanner;
public class factorial {
	public static void main(String []arg) {
		Scanner In=new Scanner (System.in);
		System.out.print("Factorial de ");
		System.out.println((sfactorial(In.nextInt())));
		
	}


public static int sfactorial(int last) {
	int fact=1;
	for(int consec=last;consec>0;consec--) {
		if(consec==1) {
		System.out.print(consec+" = ");
		}
		else
		{
			System.out.print(consec+" * ");
		}
		fact=consec*fact;
		//System.out.println(fact);
	}
	return fact;
}
}
