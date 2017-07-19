package model;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Dado
 * Classe que Representa um dado
 * @author lucasrudolfo and augusto
 */
public class Dado {
    
    private int valor;
    private boolean preparado;

    /**
     * Dado
     * Construtor de Dado
     */
    public Dado(){
        setPreparado(true);
    }

    /**
     * GetValor
     * Retorna o Valor Atual do dado
     * @return Valor do Dado
     */
    public int getValor() {
        return valor;
    }

    /**
     * SetValor
     * Insere o valor passado como parametro na variavel Valor de Dado
     * @param valor 
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    /**
     * JogaDado
     * Insere um numero randomico de 1 a 6 na variavel valor de Dado
     */
    public void jogaDado(){
       int valor = (int) (1 + Math.random() * (6));
        setValor(valor);
    }

    /**
     * EstaPreparado
     * Retorna se o dado esta selecionado ou nao
     * @return Selecionado ou nao
     */
    public boolean estaPreparado() {
        return preparado;
    }

    /**
     * SetPreparado
     * Insere em na variavel preparado do Dado a variavel passada como parametro 
     * @param preparado 
     */
    public void setPreparado(boolean preparado) {
        this.preparado = preparado;
    }
    
    /**
     * VerificaDado
     * Metodo que Modifica a cor do Dado caso selecionado
     * @param jdado 
     */
    public void verificaDado(JLabel jdado){
        if(this.estaPreparado()){
            this.setPreparado(false);
            switch(this.getValor()){
                case 1:
                    URL url1 =  this.getClass().getResource("/resources/dado1b.png");
                    ImageIcon icon = new ImageIcon(url1);
                    jdado.setIcon(icon);
                    break;
                case 2:
                    URL url2 =  this.getClass().getResource("/resources/dado2b.png");
                    ImageIcon icon2 = new ImageIcon(url2);
                    jdado.setIcon(icon2);
                    break;    
                case 3:
                    URL url3 =  this.getClass().getResource("/resources/dado3b.png");
                    ImageIcon icon3 = new ImageIcon(url3);
                    jdado.setIcon(icon3);
                    break;   
                case 4:
                    URL url4 =  this.getClass().getResource("/resources/dado4b.png");
                    ImageIcon icon4 = new ImageIcon(url4);
                    jdado.setIcon(icon4);
                    break;   
                case 5:
                    URL url5 =  this.getClass().getResource("/resources/dado5b.png");
                    ImageIcon icon5 = new ImageIcon(url5);
                    jdado.setIcon(icon5);
                    break;   
                case 6:   
                    URL url6 =  this.getClass().getResource("/resources/dado6b.png");
                    ImageIcon icon6 = new ImageIcon(url6);
                    jdado.setIcon(icon6);
                    break;                          
            }
        } else {
            this.setPreparado(true);
            switch(this.getValor()){
                case 1:
                    URL url1 =  this.getClass().getResource("/resources/dado1.png");
                    ImageIcon icon = new ImageIcon(url1);
                    jdado.setIcon(icon);
                    break;
                case 2:
                    URL url2 =  this.getClass().getResource("/resources/dado2.png");
                    ImageIcon icon2 = new ImageIcon(url2);
                    jdado.setIcon(icon2);
                    break;    
                case 3:
                    URL url3 =  this.getClass().getResource("/resources/dado3.png");
                    ImageIcon icon3 = new ImageIcon(url3);
                    jdado.setIcon(icon3);
                    break;   
                case 4:
                    URL url4 =  this.getClass().getResource("/resources/dado4.png");
                    ImageIcon icon4 = new ImageIcon(url4);
                    jdado.setIcon(icon4);
                    break;   
                case 5:
                    URL url5 =  this.getClass().getResource("/resources/dado5.png");
                    ImageIcon icon5 = new ImageIcon(url5);
                    jdado.setIcon(icon5);
                    break;   
                case 6:   
                    URL url6 =  this.getClass().getResource("/resources/dado6.png");
                    ImageIcon icon6 = new ImageIcon(url6);
                    jdado.setIcon(icon6);
                    break;                          
            }
        }
    }    
    
}
