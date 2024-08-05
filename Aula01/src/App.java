public class App {
    public static void main(String[] args) throws Exception {

        Celular celular1 = new Celular();
        celular1.nome = "Iphone12";
        celular1.tela = 6.1f;
        celular1.armazenamento = 256;
        celular1.sysO = "iOS";
        celular1.bateria = 10;
        celular1.ligar();

        Computador computador1 = new Computador();
        computador1.marca = "HP";
        computador1.ano = 2021;
        computador1.processador = "intel";
        computador1.sysO = "Linux";

        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s\n A bateria esta em %d por cento\n o celular liga?", celular1.nome, celular1.tela, celular1.armazenamento, celular1.sysO, celular1.bateria);
        celular1.ligar();
        System.out.format("\nComputador 1\nMarca: %s\nAno: %d\nProcessador: %s\nSistema Operacional: %s", computador1.marca, computador1.ano, computador1.processador, computador1.sysO);

    }
}
