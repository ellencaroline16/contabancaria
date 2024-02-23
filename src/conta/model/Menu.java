package conta.model;

import java.util.Scanner;

import conta.model.Conta;
import conta.model.ContaCorrente;
import conta.model.ContaPoupanca;

public class Menu {
	
	public static void main (String[] args) {

			//Teste da Classe Conta
			
			Conta c1 = new Conta(1, 123, 1 ," Ellen", 10000.0f);
			c1.visualizar();
			c1.sacar(12000.0f);
			c1.visualizar();
			c1.depositar(6000.0f);
			c1.visualizar();
			
			Scanner leia = new Scanner (System.in);
			
			//Teste da Classe Conta Corrente
			ContaCorrente cc1 = new ContaCorrente ( 2,123,1, " Vitória", 15000.0f, 2000.0f);
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
			
			
			
	}

	
	
	

}
