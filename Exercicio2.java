import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int A[][] = new int [10][10];
		int i,j,M=51;
		Random gera = new Random();
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++){
				A[i][j]=gera.nextInt(50)+2;
				System.out.printf("[%2d]",A[i][j]);
				}
			System.out.println("");
		}
		for(i=0;i<10;i++) {
			for(j=0;j<10;j++) {
				if(A[i][j]<M) {
					M = A[i][j];
					}
				}
		}
				System.out.println("-Menor- "+M);
		
		// TODO Auto-generated method stub

	}

}
