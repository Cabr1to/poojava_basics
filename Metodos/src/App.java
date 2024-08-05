public class App {
    public static void main(String[] args) throws Exception {
        
        Personagem heroi = new Personagem();
        heroi.nome = "Hercules";
        heroi.nivel = 1;
        heroi.forca = 2;

        heroi.mostrarstatus();
        heroi.atacar("Bastardo", "berserk");
    }
}
