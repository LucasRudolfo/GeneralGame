package model;

import java.net.URL;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 * Classe Gira Dado
 * @author lucasrudolfo and augusto
 */
public class GiraDado {
    Timer timer;

    /**
     * Construtor de GiraDado
     * O Construtor Chama o metodo giraDado que ira setar o gif e apos 2 segundo seta a imagem do dado correspondente ao valor do dado passado como parametro
     * @param label
     * @param dado 
     */
    public GiraDado(JLabel label,int dado) {
        timer = new Timer();
        this.giraDado(label);
        
        TimerTask tarefa = new TimerTask() {
            @Override
            public void run() {
                switch(dado){
                case 1:
                    URL url1 =  this.getClass().getResource("/resources/dado1.png");
                    ImageIcon icon1 = new ImageIcon(url1);
                    label.setIcon(icon1);
                    break;
                case 2:
                    URL url2 =  this.getClass().getResource("/resources/dado2.png");
                    ImageIcon icon2 = new ImageIcon(url2);
                    label.setIcon(icon2);
                    break;
                case 3:
                    URL url3 =  this.getClass().getResource("/resources/dado3.png");
                    ImageIcon icon3 = new ImageIcon(url3);
                    label.setIcon(icon3);
                    break;            
                case 4:
                    URL url4 =  this.getClass().getResource("/resources/dado4.png");
                    ImageIcon icon4 = new ImageIcon(url4);
                    label.setIcon(icon4);
                    break;
                case 5:
                    URL url5 =  this.getClass().getResource("/resources/dado5.png");
                    ImageIcon icon5 = new ImageIcon(url5);
                    label.setIcon(icon5);
                    break;
                case 6:
                    URL url6 =  this.getClass().getResource("/resources/dado6.png");
                    ImageIcon icon6 = new ImageIcon(url6);
                    label.setIcon(icon6);
                    break;
            }
            timer.cancel();//Terminate the timer thread
            }
        };
        
        timer.schedule(tarefa, 2*1000);
    }
    
    /**
     * GiraDado
     * Seta no label passado o gif que representa o dado Girando
     * @param label 
     */
    public void giraDado(JLabel label){
        URL url =  this.getClass().getResource("/resources/gifDado.gif");
        ImageIcon icon = new ImageIcon(url);
        label.setIcon(icon);
    }
    
    
}