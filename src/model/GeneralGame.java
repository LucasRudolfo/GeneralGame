package model;

import java.util.ArrayList;

/**
 * Classe GeneralGame
 * Classe Principal do Game
 * @author lucasrudolfo and augusto
 */
public class GeneralGame {    
    
    private ArrayList<Jogador> jogador = new ArrayList<>();
    private Jogada jogada;
    private Dado[] dados = new Dado[5];
    
    /**
     * InserirDado
     * Insere o dado passado como parametro no vetor de dados do Jogo
     * @param dado 
     */
    public void inserirDado(Dado dado){
        int i;
        for(i = 0; i < dados.length; i++){
            if(dados[i] == null){
                break;
            }
        }
        dados[i] = dado;
    }
    
    /**
     * GetDados
     * Retorna os dados do jogo a um Vetor
     * @return Dados do Jogo
     */
    public Dado[] getDados(){
        
        int qtde = 0;
        
        for(Dado d : dados){
            if(d != null){
                qtde++;
            }
        }
        
        Dado[] resultado = new Dado[qtde];
        
        int i = 0;
        
        for(Dado d : dados){
            if(d != null){
                resultado[i] = d;
                i++;
            }
        }
        
        return resultado;
    }
    
    /**
     * InserirJogador
     * Insere um Jogador no Array de Jogadores do Game
     * @param jogador 
     */
    public void inserirJogador(Jogador jogador){
        this.jogador.add(jogador);
    }
    
    /**
     * GetJogada
     * Retorna a Jogada atual do Game
     * @return Jogada atual
     */
    public Jogada getJogada() {
        return jogada;
    }
    
    /**
     * SetJogada
     * Insere a Jogada Atual ao Game
     * @param jogada 
     */
    public void setJogada(Jogada jogada) {
        this.jogada = jogada;
    }
    
    /**
     * GetJogadores
     * Retorna todos os Jogadores do Game
     * @return 
     */
    public Jogador[] getJogadores(){
        Jogador[] retorno = new Jogador[this.jogador.size()];
        this.jogador.toArray(retorno);
        return retorno;
    }
    
    /**
     * Vencedor
     * Retorna o Jogador que obteve mais pontos
     * @return Vencedor do Game
     */
    public Jogador Vencedor(){
        Jogador vencedor = null;
        int maior = 0;
        
        for (Jogador jogadorEscolhido : this.jogador) {
            int valor = jogadorEscolhido.getJogo().getPontuacaoTotal();
            
            if(valor > maior){
                maior = valor;
                vencedor = jogadorEscolhido;
            }
	}
        return vencedor;
    } 
}

