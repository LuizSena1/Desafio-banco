package Default;

public class Main {
    public static void main(String[] args) {
        Banco Bradesco = new Banco();
        Cliente Luiz = new Cliente();
        Cliente Arthur = new Cliente();
        Cliente Maria = new Cliente();
        Luiz.setNome("Luiz");
        Arthur.setNome("Arthur");
        Maria.setNome("Maria");
        Conta CL = new ContaCorrente(Luiz);
        Conta PA = new ContaPoupanca(Arthur);
        Conta CM = new ContaCorrente(Maria);
        Bradesco.AdicionarConta(CL);
        Bradesco.AdicionarConta(PA);
        Bradesco.AdicionarConta(CM);
        CL.Extratos();
        PA.Extratos();
        CM.depositar(9302);
        CM.Extratos();
        CM.transferir(800, CL);
        CL.Extratos();
        CM.Extratos();
        Bradesco.ListarContas();
    }
}