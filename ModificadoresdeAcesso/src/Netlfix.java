public class Netlfix {
    private String idiomaPreferencial;
    private String resulacaoTela;

    public void entrar(){
        buscarpreferencias();
        resulucao();
    }

    private void buscarpreferencias(){
        idiomaPreferencial = "PT-BR";
    }

    private void resulucao(){
        resulacaoTela = "4K";
    }

    public void assistirFilme(String nomeFilme){
        System.out.println("\nIniciando filme " + nomeFilme);
        System.out.println("Carregando o filme na resolucao " + resulacaoTela);
        carregarAudioFilme();
    }

    private void carregarAudioFilme(){
        if(idiomaPreferencial == "PT-BR" || idiomaPreferencial == "EN-US"){
            System.out.println("Audio em " + idiomaPreferencial);
        } else {
            System.out.println("Audio em EN-US");
        }
    }
}
