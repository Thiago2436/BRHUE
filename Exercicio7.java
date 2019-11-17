import java.util.Random;
import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[] args) {
		int A[][] = new int [10][10], i ,j;
		
		int L, V[]= new int [10];
		Scanner read = new Scanner (System.in);
			Random gera = new Random();
			
			for(i=0;i<10;i++){
				for(j=0; j<10; j++) {
					A[i][j]=gera.nextInt(98)+1;
					System.out.printf("|%2d|",A[i][j]);
					}
				System.out.println(" : "+(i+1));
		}
		System.out.println(" Digita uma linha cumpadi: de 0 a "+i+": ");
		L =read.nextInt(); 
		for(i=L;i<=L;i++) {
			for ( j=0; j<10; j++) {
				V[i] = A[i][j];
				System.out.printf("|%2d|",V[i]);
				}
			System.out.println("");
				}
		}
	}
	


