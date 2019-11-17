import java.util.Random;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		int A[][]=new int [7][4];
		int i,j,L;
		Scanner read = new Scanner(System.in);
		Random gera = new Random();
		for(i=0;i<7;i++) {
			for(j=0;j<4;j++) {
				A[i][j] = gera.nextInt(50)+1;
				System.out.printf("|%2d|",A[i][j]);
			}
			System.out.println(" ");
		}
		System.out.println("digite a Coluna : ");
		L=read.nextInt();
		if(L<4){
			for(i=0;i<7;i++) {
				for(j=L;j<=L;j++) {
			System.out.printf("|%2d|",A[i][j]);
				}
				System.out.print(" ");
			}
			}
		}
	}
		
