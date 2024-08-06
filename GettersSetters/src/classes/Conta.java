package classes;

public class Conta {

    private double saldo = 0;

    public void depositar(double valor){
        if(valor < 0){
            System.out.println("Nao eh possivel realizar essa transacao");
        } else {
         saldo = saldo + valor;
        }
    }
    
    public double getsaldo(){
        return saldo;
    }
}
