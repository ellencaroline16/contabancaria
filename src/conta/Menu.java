package conta;

import java.util.Scanner;
import conta.model.Conta;
import conta.util.Cores;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int opcao;
		
		while (true) { 
			System.out.println(Cores.TEXT_PURPLE + Cores.ANSI_PURPLE_BACKGROUND + "*********************************");
			
			System.out.println("*******************************************");
			System.out.println("                                           ");
			System.out.println("           BANCO DO BRAZIL COM Z           ");
			System.out.println("                                           ");
			System.out.println("*******************************************");
			System.out.println("                                           ");
			System.out.println("             1 - Criar conta               ");
			System.out.println("             2 - Listar todas as contas    ");
			System.out.println("             3 - Buscar conta por numero   ");
			System.out.println("             4 - Atualizar dados da conta  ");
			System.out.println("             5 - Apagar conta              ");
			System.out.println("             6 - Sacar                     ");
			System.out.println("             7 - Depositar                 ");
			System.out.println("             8 - Transferir valores entre contas  ");
			System.out.println("             9 - Sair                      ");
			System.out.println("                                           ");
			System.out.println("*******************************************");
			System.out.println("Entre com a opção desejada:                ");
			System.out.println("                                           ");
			
			Scanner leia;
			opcao = leia.nextInt();
			if (opcao == 9 ) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + " Banco do Brazil com Z - O seu futuro começa aqui!");
				sobre(); // não entendi muito bem essa parte e o pq desse método não chamar
			}
				leia.close();// não entendi muito bem essa parte e o pq desse método não chamar
				System.exit(0); 
			}
			
			switch (opcao) {
			case 1: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Criar conta: ");

				break; }
			case 2: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Listar todas as contas: ");

				break;}
			case 3: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Consultar dados da conta - por número: ");

				break;}
			case 4: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Atualizar dados da conta: ");

				break;}
			case 5: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Apagar a conta: ");

				break;}
			case 6: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Saque: ");

				break;}
			case 7: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Depósito ");

				break;}
			case 8: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Transferência entre contas: ");

				break;}
			default:
				System.out.println(Cores.ANSI_RED_BACKGROUND_BRIGHT + "Opção inválida!");
			
			}}
		
	
		public static void sobre() {
			
		System.out.println("*******************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Ellen Silva - ellen_caroline_17@hotmail.com");
		System.out.println("github.com/ellencaroline16");
		System.out.println("*******************************************");
	}

		
			
			
		}

