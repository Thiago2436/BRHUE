import java.util.Random;
import java.util.Scanner;

public class RPGfight {
	static Scanner leitor = new Scanner(System.in);
	
	static int AtaqueUsuario(){
		System.out.println("Chose your atack : ");
		System.out.println("(1) :SOCO:");
		System.out.println("(2) :ESPECIAL, É O GOLPE:");
		return leitor.nextInt();
		}
	
	static int AtaqueComputador() {
		Random gera = new Random();
		return gera.nextInt(3)+1; //retorna numero entre 1 e 3
		
	}
	
	static void ImprimeHp(int HpUsu, int HpCPU, int contEXP, int Record) {
		System.out.println("###########");
		System.out.println("Hp Jogador: "+ HpUsu);
		System.out.println("Hp Maquina: "+ HpCPU);
		System.out.println("Inimigo atual: " + Record);
		System.out.println("Especiais: " + contEXP);
		System.out.println("###########");
	}
	
	static int Batalha() {
		int HpUsu = 150;
		int HpCPU = 11;
		int contEXP = 5;
		int EscolhaAtaque;
		int i = 0;
		while (HpUsu>0) {
			HpCPU = 10+i;
			System.out.println("==========");
			System.out.println("INIMIGO NIVEL : "+ i);
			System.out.println("==========\n");
			while(HpUsu > 0 && HpCPU > 0) {
				ImprimeHp(HpUsu, HpCPU, contEXP, i);
				EscolhaAtaque = AtaqueUsuario();
				switch(EscolhaAtaque) {
				case 1:
					System.out.println("SOCO ");
					HpCPU -=7;
					break;
				case 2:
					System.out.println("ESPECIAL ATACK");
					if(contEXP < 0) {
						System.out.println(" Sem Especial, VOCE BAIXOU A GUARDA. ");
						break;
						}
					HpCPU -= 20;
					contEXP --;
					
						break;
					
				default:
					System.out.println("Opção Invalida, VOCE BAIXOU A GUARDA");
					break;
				}
			if(HpCPU > 0) {
				EscolhaAtaque = AtaqueComputador();
				switch(EscolhaAtaque) {
				case 1:
					System.out.println("CPU Punch:  2 Dano");
					HpUsu -=2 +(int)(i/10);
					break;
				case 2:
					System.out.println("CPU Kick: 3 Dano");
					HpUsu -=3 +(int)(i/10);;
					break;
				case 3:
					System.out.println("CPU Especial: 4 Dano");
					HpUsu -=4 +(int)(i/20);;
					break;
				}
			}
				else {
					System.out.println("========================");
					System.out.println("  ! INIMIGO DERROTADO ! ");
					System.out.println("========================");

				}
				
				}//final do while luta
			if (HpUsu > 0) {
				HpUsu += 5;
				if (HpUsu > 200) {
					HpUsu = 200;
				}
				if ( i % 10 == 0) {
					contEXP ++;
					if (contEXP>6) {
						contEXP = 6;
					}
				}
			}
			i++;
			
			}
		return i;
		}
			
			
	
	
	
	public static void main(String[] args) {
		int continua = 1;
		int Record = 0;
		while(continua == 1) { 
			int pontos = Batalha();
			if (pontos > Record) {
				Record = pontos;
			}
			System.out.println("FIM DE JOGO: (1) Continua \n (2) Sair\n "
					+ "DERROTOU : "
					+ ": "+ pontos  +" INIMIGOS \n"
					+ Record +": Record Atual");
			continua =leitor.nextInt();
		}
		
		// TODO Auto-generated method stub

	}

}
