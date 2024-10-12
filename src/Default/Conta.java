package Default;

public abstract class Conta implements IConta{

    protected int agencia;
    protected int numero;
    protected double saldo;
    private static final int DEFAUL_AGENCY = 1;
    private Cliente Cliente;


    private static int ID = 1;
    public Conta(Cliente cliente){
        this.numero = ID++;
        this.agencia = Conta.DEFAUL_AGENCY;
        this.Cliente = cliente;
    }

    protected abstract String getTipo();

    public Default.Cliente getCliente() {
        return Cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public int getNumero() {
        return numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getID(){
        return ID;
    }

    @Override
    public void sacar(double Valor) {
        saldo -= Valor;
    }

    @Override
    public void depositar(double Valor) {
        saldo += Valor;
    }

    @Override
    public void transferir(double Valor, Conta contaDestino) {
        this.sacar(Valor);
        contaDestino.depositar(Valor);
    }

    protected void ImprimirInfo(){
        System.out.println("Titular : " + this.Cliente.getNome());
        System.out.printf("Agencia : %d%n",this.agencia);
        System.out.printf("Numero : %d%n",this.numero);
        System.out.printf("Saldo : %.2f%n",this.saldo);
    }
}
