import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		int A[] = new int[10], i, j, x;
		Random gera = new Random();
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Numeros gerados");
		
		for (i = 0; i < 10; i++) {
			A[i] = gera.nextInt(50) + 1;
			System.out.print(" | " + A[i]);
		}
		Arrays.sort(A);
		System.out.println(" \n vetor ordenado");
		System.out.println(Arrays.toString(A));
		//vetor ordenado no for ainda calculavel
		for(i = 0; i < 10 ; i++)
		{
			System.out.print((A[i])+" , ");
		}
		
		}
		// TODO Auto-generated method stub

	}


