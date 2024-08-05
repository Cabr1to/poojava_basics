public class App {
    public static void main(String[] args) throws Exception {

        Celular celular1 = new Celular();
        celular1.nome = "Iphone12";
        celular1.tela = 6.1f;
        celular1.armazenamento = 256;
        celular1.sysO = "iOS";

        System.out.format("Celular %s com tela de %.1f, com %dGB e SO %s", celular1.nome, celular1.tela, celular1.armazenamento, celular1.sysO);

    }
}
