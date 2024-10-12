package Default;

public class Main {
    public static void main(String[] args) {
        Banco Bradesco = new Banco();
        Cliente Luiz = new Cliente();
        Cliente Sena = new Cliente();
        Cliente Silva = new Cliente();
        Luiz.setNome("Luiz");
        Sena.setNome("Sena");
        Silva.setNome("Silva");
        Conta ca = new ContaCorrente(Luiz);
        Conta pa = new ContaPoupanca(Sena);
        Conta cc = new ContaCorrente(Silva);
        Bradesco.AdicionarConta(ca);
        Bradesco.AdicionarConta(pa);
        Bradesco.AdicionarConta(cc);
        ca.Extratos();
        pa.Extratos();
        cc.depositar(9302);
        cc.Extratos();
        cc.transferir(800,ca);
        ca.Extratos();
        cc.Extratos();
        Bradesco.ListarContas();
    }
}