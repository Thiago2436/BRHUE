import java.util.Scanner;


public class Exercicio_UM {

	public static void main(String[] args) {
		float NL,F = 0,Desc = 0 ;
		char comb;
		Scanner read = new Scanner (System.in);
		System.out.println(" Digite o Numero de litros : ");
		NL = read.nextInt();
		System.out.println("Digite o Tipo de conbustivel [A - Alcool | G - Gasolina] ");
		comb = read.next().toUpperCase().charAt(0);
		if (comb == 'A')
		{
			
			System.out.println("Combustivel Valido[ ALCOOL]");
			F = (float) (NL*2.7);
			System.out.println("Abasteceu : "+F+ " Reais ");
		}
		else if (comb == 'G')
		{
			System.out.println("Combustive Valido [ GASOLINA ]");
			F = (float)(NL*4.5);
			System.out.println("Abasteceu : "+F+ " Reais ");
		}
		if (NL <= 20)
		{
			Desc = (float) (0.03*F);
			F = (float) (F - Desc);
		System.out.println(" valor a ser pago com desconto 3% "+F);
		}
		else if (NL > 20)
		{
			Desc = (float) (0.05*F);
			F = (float) (F - Desc);
			System.out.println(" Valor a ser pago com desconto 5% "+F);
		}
		
		
		
		// TODO Auto-generated method stub

	}

}
