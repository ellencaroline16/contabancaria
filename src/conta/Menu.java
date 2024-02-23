package conta;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.InputMismatchException;
import java.util.Scanner;

import conta.controller.ContaController;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;
import conta.util.Cores;
//import conta.model.ContaCorrente;
//import conta.model.ContaPoupanca;

public class Menu {

	public static void main(String[] args) {
	
		ContaController contas = new ContaController();
		Scanner ler = new Scanner (System.in);
		
		int opcao;
		int numero;
		int agencia;
		int tipo;
		int aniversario;
		String titular;
		float saldo;
		float limite;
		
		System.out.println("Criar contas");
		
		ContaCorrente cc1 = new ContaCorrente (contas.gerarNumero(), 123, 1, "Alessandra Souza", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		ContaCorrente cc2 = new ContaCorrente (contas.gerarNumero(), 124, 1, "Ellen Mergulhão", 2000f, 100.0f);
		contas.cadastrar(cc2);
		
		ContaCorrente cp1 = new ContaCorrente (contas.gerarNumero(), 125, 2, "Francine Basagni", 4000f, 12);
		contas.cadastrar(cp1);
		
		ContaCorrente cp2 = new ContaCorrente (contas.gerarNumero(), 126, 2, "Vitoria Sayuri", 1000f, 100.0f);
		contas.cadastrar(cc1);
		
		contas.listarTodas();
		
		Scanner leia = new Scanner (System.in);
		
		//Teste da Classe Conta Corrente
		ContaCorrente cc1 = new ContaCorrente ( 2,123,1, " Vitória", 10000.0f, 1000.0f);
		cc1.visualizar();
		cc1.sacar(1200.0f);
		cc1.visualizar();
		cc1.depositar(5000.0f);
		cc1.visualizar();
		
		//Teste da Classe Conta Poupança
		ContaPoupanca cp1 = new ContaPoupanca (3, 123, 2, "César", 100000.0f, 15);
		cp1.visualizar();
		cp1.sacar(100.0f);
		cc1.visualizar();
		cp1.depositar(5000.0f);
		cc1.visualizar();
		
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
			System.out.println("             9 - Sair                       ");
			System.out.println("                                           ");
			System.out.println("*******************************************");
			System.out.println("Entre com a opção desejada:                ");
			System.out.println("                                           " + Cores.TEXT_RESET);

			try {
				opcao = leia.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Digite valores inteiros!");
				leia.nextLine();
				opcao=0;
			}


			if (opcao == 9 ) {
				System.out.println(Cores.TEXT_YELLOW_BOLD + " Banco do Brazil com Z - O seu futuro começa aqui!");
				sobre(); // não entendi muito bem essa parte e o pq desse método não chamar
				leia.close();
				System.exit(0);
			}
			
			switch (opcao) {
			case 1: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Criar conta: ");
				
				System.out.println("Digite o tipo da conta (1-CC ou 2CP): ");
				tipo = leia.nextInt();
				System.out.println("Digite o nome do titular: ");
				leia.skip("\\R?");
				titular = leia.nextLine();
				
				do { 
					System.out.println("Digite o tipo da conta (1 - CC ou 2 - CP");
					tipo = leia.nextInt();
				} while (tipo < 1 && tipo > 2);
				
				System.out.println("Digite o saldo da conta (R$): ");
				saldo = leia.nextFloat();
				
				switch (tipo) {
				case 1 -> {
					System.out.println("Digite o limite de crédito (R$): ");
					limite = leia.nextFloat();
					contas.cadastrar(new ContaCorrente(contas.gerarNumero(), agencia, tipo, titular, saldo, limite));
				}
				
				}
		
				keyPress();
				break; }
			case 2: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Listar todas as contas: ");
				contas.listarTodas();
				keyPress();
				break;}
			case 3: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Consultar dados da conta - por número: ");

				keyPress();
				break;}
			case 4: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Atualizar dados da conta: ");

				keyPress();
				break;}
			case 5: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Apagar a conta: ");
				
				keyPress();
				break;}
			case 6: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Saque: ");

				keyPress();
				break;}
			case 7: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Depósito ");

				keyPress();
				break;}
			case 8: {
				System.out.println(Cores.TEXT_WHITE_BOLD_BRIGHT + "Transferência entre contas: ");

				keyPress();
				break;}
			
			default: {
				System.out.println(Cores.ANSI_RED_BACKGROUND_BRIGHT + "Opção inválida!" + Cores.TEXT_RESET);
		 // pedir ajuda p sobre ess parte 
	}

	public static void sobre() {

		System.out.println("*******************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Ellen Silva - ellen_caroline_17@hotmail.com");
		System.out.println("github.com/ellencaroline16");
		System.out.println("*******************************************");
	}
	
	private static void keyPress() {
	
		try { 
			
			System.out.println(Cores.TEXT_RESET + "Pressione enter para continuar");
			System.in.read();
		} catch (IOException e) {
			System.out.println(" Ôh benção, tu apertou a tecla errada!");
		}
	}
			}
			
