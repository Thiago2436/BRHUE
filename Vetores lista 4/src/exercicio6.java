import java.util.Random;
import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		int A[]= new int [10],B[]= new int [10], i, x;
						Random gera = new Random();
		Scanner leia = new Scanner (System.in);
		System.out.println("Vetor A");
		for (i=0;i<10;i++)
		{
			A[i] = gera .nextInt(50)+1;
			System.out.print(" | "+A[i]);
		}
		System.out.println(" \n valor  multiplicação ");
		x = leia.nextInt();
		System.out.println(" Vetor B");
		for(i=0;i<10;i++)
		{
			
			B[i]=A[i]*x;
			System.out.print(" | "+B[i]);
		}
		}
		
		// TODO Auto-generated method stub

	}


