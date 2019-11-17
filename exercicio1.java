import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int A[][]=new int [2][3];
		int i,j = 0,Soma=0;
		for(i=0;i<2;i++) {
			System.out.println(" Linha"+i);
			for(j=0;j<3;j++) {
				System.out.print(":"+i+":"+j+"->");
				A[i][j] = read.nextInt();
				
			}
		}
		System.out.println("\n Numeros digitados");
		for(i=0;i<2;i++) {
			for(j=0;j<3;j++) {
				System.out.printf("[%d]",A[i][j]);
				Soma += A[i][j];
								}
			System.out.println("");
		}
		System.out.println("Soma Total : "+Soma);
		// TODO Auto-generated method stub
	}

}
