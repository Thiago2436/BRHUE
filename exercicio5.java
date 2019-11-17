import java.util.Random;

public class exercicio5 {

	public static void main(String[] args) {
		int A[][]=new int [10][10];
		int i,j,soma = 0;
		Random gera = new Random();
		for(i=0;i<10;i++) {
			soma = 0;
			for(j=0;j<10;j++) {
				A[i][j] = gera.nextInt(50)+1;
				System.out.printf("|%2d|",A[i][j]);
				soma += A[i][j];
				
				}
			System.out.println("Linha :"+i+" Soma "+soma);
			}
		
		// TODO Auto-generated method stub

	}

}
