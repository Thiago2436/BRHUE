import java.util.Scanner;


public class Exercicio_DOIS {

	public static void main(String[] args) {
		int N, Cont = 1;
		float D, T;
		Scanner read = new Scanner(System.in);
		System.out.println(" Digite um Numero ");
		N = read.nextInt();
		while (Cont <= N)
		{
			System.out.println(+Cont);
			D = (float) Math.pow(Cont,2);
			System.out.println("elevado a Dois "+D);
			T = (float) Math.pow(Cont,3);
			
			System.out.println("Elevado a Tres " + T);
			Cont ++;
		}
		
		// TODO Auto-generated method stub

	}

}
