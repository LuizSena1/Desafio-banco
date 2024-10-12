package Default;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.EnumSet.range;

public class Banco {
    private String nome;
    private Conta Conta;
    private List<Conta> contas = new ArrayList<>();

    public void AdicionarConta(Conta Conta){
        contas.add(Conta);
    }

    public void ListarContas(){
        System.out.println("-------BANCO DE DADOS ATUAL--------");
 //       System.out.println(Arrays.toString(contas.toArray()));
        for (Default.Conta conta : contas) {
            System.out.println("|Tipo de Conta: " + conta.getTipo() + "|ID DE CONTAS: " + conta.getNumero() + "|Titular: " + conta.getCliente().getNome() + "|Saldo Disponivel: " + conta.getSaldo() + "|");
        }
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
