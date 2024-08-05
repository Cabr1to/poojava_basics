public class Celular {
    String nome;
    String sysO;
    int armazenamento;
    float tela;
    int bateria;
    
    void ligar(){
        if (bateria > 0){
            System.out.format(" Liga\n %d", bateria);
        }else{
            System.out.format(" Celular desligado\n %d", bateria);
        }
        
    }
}
