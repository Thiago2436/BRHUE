import java.util.Arrays;
import java.util.Random;

public class Exercicio5 {

	public static void main(String[] args) {
		int V[] = new int [10],i;
		Random gera = new Random();
		System.out.println("\n Lista de de 10 numeros\n");
		for(i=0;i<10;i++) {
			V[i] = gera.nextInt(50)+1;
			System.out.print(V[i]+"|");
			
		}
		Arrays.sort(V);
		System.out.print("\n Ordem direta \n\n ");
		for(i=0;i<10;i++) {
						System.out.print((V[i])+"|");
		}
		System.out.print("\n Ordem reversa \n\n ");
		for( i=9;i>=0;i--) {
			System.out.print(V[i]+"|");
		}
		
		// TODO Auto-generated method stub

	}

}
