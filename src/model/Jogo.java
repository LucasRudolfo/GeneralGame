package model;

/**
 * Classe Jogo
 * Classe que representa o Jogo de Um jogador
 * @author lucasrudolfo and augusto
 */
public class Jogo {
    
    private int pontuacaoTotal;
    private Jogada[] jogadas = new Jogada[13];
    
    /**
     * GetPontuacaoTotal
     * Retorna a pontuacao total do Jogo
     * @return 
     */
    public int getPontuacaoTotal() {
        return pontuacaoTotal;
    }
    
    /**
     * SetPontuacao
     * Insere a variavel passada como parametro na variavel pontuacaoTotal
     * @param pontuacaoTotal 
     */
    public void setPontuacaoTotal(int pontuacaoTotal) {
        this.pontuacaoTotal = pontuacaoTotal;
    }
    
    /**
     * GetJogada
     * Retorna todas as Jogadas a um vetor
     * @return Jogadas
     */
    public Jogada[] getJogada(){
        
        int qtde = 0;
        
        for(Jogada jogada : jogadas){
            if(jogada != null){
                qtde++;
            }
        }
        
        Jogada [] resultado = new Jogada[qtde];
        
        int i = 0;
        
        for(Jogada jogada : jogadas){
            if(jogada != null){
                resultado[i] = jogada;
                i++;
            }
        }
        
        return resultado;
        
    }
    
    /**
     * Inserir Jogada
     * Insere a jogada passada como parametro no Vetor de Jogadas ate que tenha 13 jogadas
     * @param jogada 
     */
    public void inserirJogada(Jogada jogada){
        
        int i;
        
        for(i = 0;i < this.jogadas.length;i++){
            if(this.jogadas[i] == null){
                break;
            } 
        }
        
        this.jogadas[i] = jogada;
        
    }
    
    /**
     * CalcularPontuacao
     * Calcula a pontuacao total do jogo e insere na variavel total
     */
    public void calcularPontuacaoTotal(){
        
        int total = 0;
        
        Jogada[] jogada = getJogada();
        
        for( Jogada joga : jogada){
            total += joga.getPontos();
        }
        
        setPontuacaoTotal(total);
        
    }  
    
}
