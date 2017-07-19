package model;

/**
 * Classe Jogada
 * Classe que representa uma jogada
 * @author lucasrudolfo and augusto
 */
public class Jogada{
    
    private TipoJogada tipoJogada;
    private Jogador jogador;
    private int pontos;
    
    /**
     * GetPontos
     * Pega a quantidade de pontos da Jogada
     * @return Pontos
     */
    public int getPontos() {
        return pontos;
    }

    /**
     * SetPontos
     * Insere o valor passado como parametro na variavel Pontos da Jogada
     * @param pontos 
     */
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    /**
     * GetTipoJogada
     * Retorna o tipo de jogada da Jogada
     * @return TipodeJogada
     */
    public TipoJogada getTipoJogada() {
        return tipoJogada;
    }

    /**
     * SetTipoJogada
     * Insere o Tipo da Jogada
     * @param tipoJogada 
     */
    public void setTipoJogada(TipoJogada tipoJogada) {
        this.tipoJogada = tipoJogada;
    }

    /**
     * GetJogador
     * Retorna o Jogador da Jogada
     * @return Jogador 
     */
    public Jogador getJogador() {
        return jogador;
    }

    /**
     * SetJogador
     * Insere o Jogador da Jogada
     * @param jogador 
     */
    public void setJogador(Jogador jogador) {
        this.jogador = jogador;
    }
    
    /**
     * CalcularPontuacao
     * Calcula a pontuacao da jogada de acordo com seu tipo
     * @param dado 
     */
    public void calcularPontuacao(Dado[] dado){
        int pts = 0;
        int qtde = 0;
        boolean controle = false;
        
        if(getTipoJogada() == TipoJogada.JOGADADE1){
            for(int i = 0;i < dado.length;i++){
                if(dado[i].getValor() == 1){
                    qtde++;
                }
            }
            pts = qtde * 1;
        }
        if(getTipoJogada() == TipoJogada.JOGADADE2){
           for(int i = 0;i < dado.length;i++){
                if(dado[i].getValor() == 2){
                    qtde++;
                }
            }
            pts = qtde * 2; 
        }
        if(getTipoJogada() == TipoJogada.JOGADADE3){
           for(int i = 0;i < dado.length;i++){
                if(dado[i].getValor() == 3){
                    qtde++;
                }
            }
            pts = qtde * 3; 
        }
        if(getTipoJogada() == TipoJogada.JOGADADE4){
           for(int i = 0;i < dado.length;i++){
                if(dado[i].getValor() == 4){
                    qtde++;
                }
            }
            pts = qtde * 4; 
        }
        if(getTipoJogada() == TipoJogada.JOGADADE5){
           for(int i = 0;i < dado.length;i++){
                if(dado[i].getValor() == 5){
                    qtde++;
                }
            }
            pts = qtde * 5; 
        }
        if(getTipoJogada() == TipoJogada.JOGADADE6){
           for(int i = 0;i < dado.length;i++){
                if(dado[i].getValor() == 6){
                    qtde++;
                }
            }
            pts = qtde * 6; 
        }
        if(getTipoJogada() == TipoJogada.TRINCA){
            for(int i = 0; i < dado.length;i++){
                for(int j = i+1;j < dado.length;j++){
                    if(dado[j].getValor() == dado[i].getValor()){
                        for(int t = j + 1;t < dado.length;t++){
                            if((dado[t].getValor() == dado[j].getValor())&&(dado[t].getValor() == dado[i].getValor())){
                                controle = true;
                                break;
                            }
                        }
                        }
                        if(controle){
                        break;
                    }
                    }
                    if(controle){
                        break;
                    }
                }
            if(controle){
                for(int e = 0;e < dado.length;e++){
                    pts += dado[e].getValor();
                }
            } else {
                pts = 0;
            }
        }
        if(getTipoJogada() == TipoJogada.QUADRA){
            for(int i = 0; i < dado.length;i++){
                for(int j = i+1;j < dado.length;j++){
                    if(dado[j].getValor() == dado[i].getValor()){
                        for(int t = j + 1;t < dado.length;t++){
                            if((dado[t].getValor() == dado[j].getValor())&&(dado[t].getValor() == dado[i].getValor())){
                                for(int h = t + 1;h < dado.length;h++){
                                    if((dado[h].getValor() == dado[t].getValor())&&(dado[h].getValor() == dado[j].getValor())&&(dado[h].getValor() == dado[i].getValor())){
                                        controle = true;
                                        break;
                                    }
                                }
                                if(controle){
                                    break;
                                } 
                            }
                        }
                        }
                        if(controle){
                        break;
                    }
                    }
                    if(controle){
                        break;
                    }
                }
            if(controle){
                for(int e = 0;e < dado.length;e++){
                    pts += dado[e].getValor();
                }
            } else {
                pts = 0;
            }
        }
        if(getTipoJogada() == TipoJogada.FULLHOUSE){
            int dadoTrinca = 0;
            for(int i = 0; i < dado.length;i++){
                for(int j = i+1;j < dado.length;j++){
                    if(dado[j].getValor() == dado[i].getValor()){
                        for(int t = j + 1;t < dado.length;t++){
                            if((dado[t].getValor() == dado[j].getValor())&&(dado[t].getValor() == dado[i].getValor())){
                                controle = true;
                                dadoTrinca = dado[t].getValor();
                                break;
                            }
                        }
                        }
                        if(controle){
                        break;
                    }
                    }
                    if(controle){
                        break;
                    }
                }
            if(controle){
                for(int e = 0;e < dado.length;e++){
                    if(dado[e].getValor() != dadoTrinca){
                        for(int d = 0;d < dado.length;d++){
                            if((dado[d].getValor() == dado[e].getValor())&&(d != e)){
                                pts = 25;
                            }
                        }
                    }
                }
            } else {
                pts = 0;
            }
        }
        if(getTipoJogada() == TipoJogada.SEQUENCIAALTA){
            int i = 2;
            int qtde2 = 0;
            while( i <= 6){
                for(int j = 0; j < dado.length;j++){
                    if(dado[j].getValor() == 1){
                        qtde2 = 2;
                        break;
                    }
                    if(dado[j].getValor() == i){
                        qtde2++;
                    }
                }
                if(qtde2 > 1){
                    pts = 0;
                    break;
                } else {
                    qtde2 = 0;
                }
                if(i == 6){
                    pts = 30;
                    break;
                } else {
                    i++;
                }
            }
        }
        if(getTipoJogada() == TipoJogada.SEQUENCIABAIXA){
            int i = 1;
            int qtde2 = 0;
            while( i <= 5){
                for(int j = 0; j < dado.length;j++){
                    if(dado[j].getValor() == 6){
                        qtde2 = 2;
                        break;
                    }
                    if(dado[j].getValor() == i){
                        qtde2++;
                    }
                }
                if(qtde2 > 1){
                    pts = 0;
                    break;
                } else {
                    qtde2 = 0;
                }
                if(i == 5){
                    pts = 40;
                    break;
                } else {
                    i++;
                }
            }
        }
        if(getTipoJogada() == TipoJogada.GENERAL){
            pts = 50;
            for(int i = 0;i < dado.length;i++){
                if(dado[i].getValor() != dado[0].getValor()){
                    pts = 0;
                    break;
                }
            }
        }
        if(getTipoJogada() == TipoJogada.ALEATORIA){
           for(int i = 0;i < dado.length;i++){
                pts += dado[i].getValor();
            } 
        }
        setPontos(pts);
    }
}
