package Default;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Default.Cliente cliente) {
        super(cliente);
    }

    @Override
    protected String getTipo() {
        return "Conta Poupança";
    }


    @Override
    public void Extratos() {
            System.out.println("Extrato da Conta Poupanca");
            super.ImprimirInfo();
        }
    }
