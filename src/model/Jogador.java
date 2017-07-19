package model;

/**
 * Classe Jogador
 * Classe que representa um Jogador
 * @author lucasrudolfo and augusto
 */
public class Jogador {
    
    private String nome;
    private Jogo jogo;
    
    /**
     * GetJogo
     * Retorna o Jogo do Jogador
     * @return Jogo
     */
    public Jogo getJogo() {
        return jogo;
    }

    /**
     * SetJogo
     * Seta um Jogo para o Jogador
     * @param jogo 
     */
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
    
    /**
     * GetNome
     * Retorna o nome do Jogador
     * @return Nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * SetNome
     * Insere a String Passada na variavel nome do Jogador
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }    
    
}
