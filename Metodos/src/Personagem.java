import java.util.Random;

public class Personagem {
    String nome;
    int nivel;
    int forca;

    void mostrarstatus(){
        System.out.format("Personagem: %s (lvl %d) com %d de forca.\n", nome, nivel, forca);
    }

    int calcularDano() {
        Random gerador = new Random();
        int dado20faces = 1 + gerador.nextInt(19);
        int dano = forca + dado20faces;
        return dano;
    }


    void atacar(String alvo, String habilidade){
        int danoCausado = calcularDano();
        if(habilidade.length() == 0){
            System.out.format("%s atacou **%s** e causou %d de dano\n", nome, alvo, danoCausado);
        }
        else {
            System.out.format("%s usou '%s' contra **%s** causou %d de dano\n", nome, habilidade, alvo, danoCausado);
        }
        
    }
}
