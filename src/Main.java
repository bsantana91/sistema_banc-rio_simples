
public class Main {

	public static void main(String[] args) {
		
		Conta cc = new ContaCorrente();
		Conta poupanca = new ContaPoupanša(); 
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
	}

}
