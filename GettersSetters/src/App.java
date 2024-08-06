import classes.Conta;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Bob");
        pessoa.setIdade(17);
        pessoa.setAltura(1.4);

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
        System.out.println(pessoa.getAltura());

        Conta conta = new Conta();
        System.out.println(conta.getsaldo());
        conta.depositar(450);
        System.out.println(conta.getsaldo());

    }
}
