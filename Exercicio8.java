import java.util.Random;
import java.util.Scanner;

public class Exercicio8 {
	
	public static void main(String[] args) {
		
		int a [][]=new int [10][10],i,j;
		Random gera = new Random ();
		Scanner read = new Scanner (System.in);
		for (i=0;i<10;i++) {
			for (j=0;j<10;j++) {
				a[i][j]=gera.nextInt (98)+1;
				System.out.printf("[%2d]", a[i][j]);
				
			}
			System.out.println(" ");
		}
		System.out.println (" Digite uma coluna: ");
		int c=read.nextInt ();
		
		System.out.println("Digite um valor para multiplicar a coluna: ");
		int v=read.nextInt ();
		
		int col []=new int [10];
		for (i=0;i<10;i++) {
			for (j=c;j==c;j++) {
				col[j]=a[i][j];
				System.out.printf("[%2d]",col [j]);
			}
		}
		System.out.println("multiplicar ");
		for (i=0;i<0;i++) {
			for(j=0;j<10;j++) {
			System.out.println(" Col");
			System.out.printf("[%2d]",col[j]);
			}
			}
		
	

	}

}
