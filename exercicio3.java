import java.util.Random;
import java.util.Scanner;

public class exercicio3 {

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
			System.out.println(" Linha "+i);
		}
		System.out.println("digite a linha : ");
		L=read.nextInt();
		if(L<7){
			for(i=L;i<=L;i++) {
				for(j=0;j<4;j++) {
			System.out.printf("|%2d|",A[L][j]);
				}
				System.out.println(" ");
			}
			}
		}
	}
				
	