package classes;


public class Pessoa{
    private String nome;
    private int idade;
    private float altura;

    public Pessoa(){
        nome = "Luis";
        idade = 185;
        altura = 1.2f;
        imprimirDados();
    }

    private void imprimirDados(){
        System.out.format(
            "Nome: %s\n Idade: %d\n Altura: %.2fm\n",
            nome,
            idade,
            altura
        );
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    
}
