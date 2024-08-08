package classes;

import javax.swing.JOptionPane;

public class Personagem {
    // atributos
    private String nome;
    private int nivel;
    private int forca;
    private int vida;
    private String classe;


    // metodo construtor
    public Personagem(String nome, String classe) {
        this.nome = nome;
        this.classe = classe;
        nivel = 10;
        vida = nivel * 10;
        if (classe.equals("guerreiro")){
            forca = nivel * 2;
        } else {
            forca = nivel;
        }
    }

    public void status(){
        String status = String.format("Nome: %s\nNivel: %d\nVida: %d\nClasse: %s\nForca: %d",
            nome,
            nivel,
            vida,
            classe,
            forca);
        JOptionPane.showMessageDialog(null, status, "Status do Personagem", JOptionPane.INFORMATION_MESSAGE);
    }

    // metodos especificos

    //get e set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNivel() {
        return this.nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getForca() {
        return this.forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return this.vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public Personagem nome(String nome) {
        setNome(nome);
        return this;
    }

    public Personagem nivel(int nivel) {
        setNivel(nivel);
        return this;
    }

    public Personagem forca(int forca) {
        setForca(forca);
        return this;
    }

    public Personagem vida(int vida) {
        setVida(vida);
        return this;
    }
    
}
