package Default;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private Conta Conta;
    private List<Conta> contas = new ArrayList<>();

    public void AdicionarConta(Conta Conta){
        contas.add(Conta);
    }

    public void ListarContas(){
        System.out.println("-------BANCO DE DADOS ATUAL--------");
 //       System.out.println(Arrays.toString(contas.toArray()));
        for (Default.Conta conta : contas) {
            System.out.println("|Tipo de Conta: " + conta.getTipo() + "|Numero De Contas: " + conta.getNumero() + "|Titular: " + conta.getCliente().getNome() + "|Saldo Disponivel: " + conta.getSaldo() + "|");
        }
    }

}
