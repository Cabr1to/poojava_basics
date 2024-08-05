public class Celular {
    String nome;
    String sysO;
    int armazenamento;
    float tela;
    int bateria;
    
    boolean ligar(){
        if (bateria > 0){
            return true;
        }
        return false;
    }
}
