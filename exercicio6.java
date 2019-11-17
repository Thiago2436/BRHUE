import java.util.Random;
//errado
public class exercicio6 {

	public static void main(String[] args) {
		int A[][]=new int [5][5];
		int i,j,C[]= new int [5];
		Random gera = new Random();
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++) {
				A[i][j] = gera.nextInt(3)+1;
				System.out.printf("|%2d|",A[i][j]);
				}
				System.out.println("");
			}
		for(i=0;i<5;i++) {
			for(j=0;j<5;j++)
				{
				C[i]= C[i]+A[j][i];
				}
			System.out.printf("|%2d|",C[i]);
			System.out.println(" Col "+i);
		}
		
		// TODO Auto-generated method stub

	}

}
