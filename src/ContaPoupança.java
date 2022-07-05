
public class ContaPoupança extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato para Conta Poupança ===");
		super.imprimirInfosComuns();
	}

}
	
	



