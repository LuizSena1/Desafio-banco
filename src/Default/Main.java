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
        System.out.println("Primeiros Extratos");
        CL.Extratos();
        PA.Extratos();
        System.out.println("_____________");
        PA.sacar(980);
        CM.depositar(9302);
        System.out.println("Segundo Extrato");
        CM.transferir(10000, CL);
        Bradesco.ListarContas();
    }
}