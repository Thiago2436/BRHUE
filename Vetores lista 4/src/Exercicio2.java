import java.util.Random;

public class Exercicio2 {

	public static void main(String[] args) {
		int V[] = new int [20], i, par=0, soma = 0, media;
		Random gera = new Random();
		System.out.println("Lista de numeros");
		for(i=0;i<20;i++) {
			V[i]=gera.nextInt(50)+1;
			System.out.print(V[i]+" | ");
			if(V[i]%2 == 0)
			{
				par ++;
				soma += V[i];
			}
			
		}
		media = (soma/par);
		System.out.println(" \n media dos pares: "+soma+" / "+par+" = "+ media);
		
		// TODO Auto-generated method stub

	}

}
