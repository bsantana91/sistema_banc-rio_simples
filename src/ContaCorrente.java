
public class ContaCorrente extends Conta {
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato para Conta Corrente ===");
		super.imprimirInfosComuns();
	}
	
}
