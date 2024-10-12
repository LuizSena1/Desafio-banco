package Default;

public class Main {
    public static void main(String[] args) {
        Banco Bradesco = new Banco();
        Cliente Generico = new Cliente();
        Cliente Algum = new Cliente();
        Cliente Qualquer = new Cliente();
        Generico.setNome("Luiz");
        Algum.setNome("Arthur");
        Qualquer.setNome("Maria");
        Conta ca = new ContaCorrente(Generico);
        Conta pa = new ContaPoupanca(Algum);
        Conta cc = new ContaCorrente(Qualquer);
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