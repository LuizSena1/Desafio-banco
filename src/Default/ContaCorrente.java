package Default;

public class ContaCorrente extends Conta {
    public ContaCorrente(Default.Cliente cliente) {
        super(cliente);
    }

    @Override
    protected String getTipo() {
        return "Conta Corrente";
    }


    @Override
    public int getID() {
        return super.getID();
    }

    @Override
    public void Extratos() {
        System.out.println("Extrato da Conta Corrente");
        super.ImprimirInfo();
    }
}
