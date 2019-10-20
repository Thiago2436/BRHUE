import java.util.Random;

public class Exercicio01 {

	public static void main(String[] args) {
		int VET[] = new int [10], i, par = 0, impar = 0;
		Random Gera = new Random();
		System.out.println("Lista de 10 Numeros aleatorios");
		for(i=0;i<10;i++)
		{
			VET[i]= Gera.nextInt(50)+1;
			System.out.print(VET[i]+" | ");
			if (VET[i]%2 == 0)
				par ++;
			else
				impar ++;				
		}
		System.out.println(" \n Pares "+par);
		System.out.println(" \n Impares "+impar);
		
		
		// TODO Auto-generated method stub

	}

}
