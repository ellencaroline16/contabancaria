package conta.controller;

import java.util.ArrayList;

import conta.model.Conta;
import conta.repository.ContaRepository;

public class ContaController implements ContaRepository{
	
	private ArrayList<Conta> listaContas = new ArrayList<Conta>();
	int numero = 0;

	@Override
	public void procurarPorNumero(int numero) {
		// TODO Auto-generated method stub
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
	}



 public int gerarNumero1() {
	 return ++ numero;
 }

public int gerarNumero() {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public void cadastrar(Conta conta) {
	// TODO Auto-generated method stub
	
}

@Override
public void atualizar(Conta conta) {
	// TODO Auto-generated method stub
	
}

@Override
public void deletar(int numero) {
	// TODO Auto-generated method stub
	
}

@Override
public void sacar(int numero, float valor) {
	// TODO Auto-generated method stub
	
}

@Override
public void depositar(int numero, float valor) {
	// TODO Auto-generated method stub
	
}

@Override
public void transferir(int numeroOrigem, int numeroDestino, float valor) {
	// TODO Auto-generated method stub
	
}

@Override
public void listarTodas1() {
	// TODO Auto-generated method stub
	
}
}

  // PR 09 - parte extra que a Camis falou, tentar na segunda ou terça.
// public Conta buscarNaCollection (int numero) {
//	 for (var conta : listaContas) {
//		 if (conta.getNumero() == numero) {
//			 return conta;
//		 }
//	 }
//	return null;
// }
//}
