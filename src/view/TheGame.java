package view;

import model.Dado;
import model.GeneralGame;
import model.Jogada;
import model.Jogador;
import model.TipoJogada;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.table.TableColumn;
import model.GiraDado;
import model.Jogo;

public class TheGame extends javax.swing.JFrame {
    
    private int variavel;
    private GeneralGame game;
    private int jogadorvez;
    
    
    public TheGame(Jogador Jogador1, Jogador Jogador2,GeneralGame game){
        initComponents();
        setLocationRelativeTo(null);
        
        URL url1 =  this.getClass().getResource("/resources/Dado.png");
        ImageIcon icon1 = new ImageIcon(url1);
        variavel = 1;
        jogadorvez = 0;    
        
        Dado dados1 = new Dado();
        game.inserirDado(dados1);
        
        Dado dados2 = new Dado();
        game.inserirDado(dados2);
        
        Dado dados3 = new Dado();
        game.inserirDado(dados3);
        
        Dado dados4 = new Dado();
        game.inserirDado(dados4);
        
        Dado dados5 = new Dado();
        game.inserirDado(dados5);
        
        Dado[] dado = game.getDados();
        dado[0].jogaDado();
        dado[1].jogaDado();
        dado[2].jogaDado();
        dado[3].jogaDado();
        dado[4].jogaDado();
        tabela.getColumnModel().getColumn(1).setHeaderValue(Jogador1.getNome());
        tabela.getColumnModel().getColumn(2).setHeaderValue(Jogador2.getNome());
        TableColumn c1 = tabela.getColumnModel().getColumn(3);
                    tabela.getColumnModel().removeColumn(c1);
                    TableColumn c2 = tabela.getColumnModel().getColumn(3);
                    tabela.getColumnModel().removeColumn(c2);
        
        jogadordavez.setText(Jogador1.getNome());
        dado1.setIcon(icon1);
        dado2.setIcon(icon1);
        dado3.setIcon(icon1);
        dado4.setIcon(icon1);
        dado5.setIcon(icon1);
        this.game = game;
        
    }
    public TheGame(Jogador Jogador1, Jogador Jogador2, Jogador Jogador3, GeneralGame game){
        initComponents();
        variavel = 1;
        jogadorvez = 0;    
        URL url1 =  this.getClass().getResource("/resources/Dado.png");
        ImageIcon icon1 = new ImageIcon(url1);
        Dado dados1 = new Dado();
        Dado dados2 = new Dado();
        Dado dados3 = new Dado();
        Dado dados4 = new Dado();
        Dado dados5 = new Dado();
        game.inserirDado(dados1);
        game.inserirDado(dados2);
        game.inserirDado(dados3);
        game.inserirDado(dados4);
        game.inserirDado(dados5);
        Dado[] dado = game.getDados();
        dado[0].jogaDado();
        dado[1].jogaDado();
        dado[2].jogaDado();
        dado[3].jogaDado();
        dado[4].jogaDado();
        tabela.getColumnModel().getColumn(1).setHeaderValue(Jogador1.getNome());
        tabela.getColumnModel().getColumn(2).setHeaderValue(Jogador2.getNome());
        tabela.getColumnModel().getColumn(3).setHeaderValue(Jogador3.getNome());
        TableColumn c1 = tabela.getColumnModel().getColumn(4);
                    tabela.getColumnModel().removeColumn(c1);
        jogadordavez.setText(Jogador1.getNome());
        dado1.setIcon(icon1);
        dado2.setIcon(icon1);
        dado3.setIcon(icon1);
        dado4.setIcon(icon1);
        dado5.setIcon(icon1);
        this.game = game;
    }
    public TheGame(Jogador Jogador1, Jogador Jogador2, Jogador Jogador3, Jogador Jogador4, GeneralGame game){
        initComponents();
        variavel = 1;
        jogadorvez = 0;
        URL url1 =  this.getClass().getResource("/resources/Dado.png");
        ImageIcon icon1 = new ImageIcon(url1);
        Dado dados1 = new Dado();
        Dado dados2 = new Dado();
        Dado dados3 = new Dado();
        Dado dados4 = new Dado();
        Dado dados5 = new Dado();
        game.inserirDado(dados1);
        game.inserirDado(dados2);
        game.inserirDado(dados3);
        game.inserirDado(dados4);
        game.inserirDado(dados5);
        Dado[] dado = game.getDados();
        dado[0].jogaDado();
        dado[1].jogaDado();
        dado[2].jogaDado();
        dado[3].jogaDado();
        dado[4].jogaDado();
        tabela.getColumnModel().getColumn(1).setHeaderValue(Jogador1.getNome());
        tabela.getColumnModel().getColumn(2).setHeaderValue(Jogador2.getNome());
        tabela.getColumnModel().getColumn(3).setHeaderValue(Jogador3.getNome());
        tabela.getColumnModel().getColumn(4).setHeaderValue(Jogador4.getNome());
        jogadordavez.setText(Jogador1.getNome());
        dado1.setIcon(icon1);
        dado2.setIcon(icon1);
        dado3.setIcon(icon1);
        dado4.setIcon(icon1);
        dado5.setIcon(icon1);
        this.game = game;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabela = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jogarDados = new javax.swing.JButton();
        salvar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jogadade2 = new javax.swing.JPanel();
        jogde2 = new javax.swing.JRadioButton();
        Jogadade1 = new javax.swing.JPanel();
        jogde1 = new javax.swing.JRadioButton();
        Jogadade3 = new javax.swing.JPanel();
        jogde3 = new javax.swing.JRadioButton();
        General = new javax.swing.JPanel();
        general = new javax.swing.JRadioButton();
        Jogadade5 = new javax.swing.JPanel();
        jogde5 = new javax.swing.JRadioButton();
        Jogadade6 = new javax.swing.JPanel();
        jogde6 = new javax.swing.JRadioButton();
        Trinca = new javax.swing.JPanel();
        trinca = new javax.swing.JRadioButton();
        Jogadade4 = new javax.swing.JPanel();
        jogde4 = new javax.swing.JRadioButton();
        Quadra = new javax.swing.JPanel();
        quadra = new javax.swing.JRadioButton();
        FullHouse = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        fullhouse = new javax.swing.JRadioButton();
        Aleatorio = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        aleatoria = new javax.swing.JRadioButton();
        SequenciaBaixa = new javax.swing.JPanel();
        seqbaixa = new javax.swing.JRadioButton();
        SequenciaAlta = new javax.swing.JPanel();
        seqalta = new javax.swing.JRadioButton();
        jogadordavez = new javax.swing.JLabel();
        jogadorVez2 = new javax.swing.JLabel();
        dado1 = new javax.swing.JLabel();
        dado2 = new javax.swing.JLabel();
        dado3 = new javax.swing.JLabel();
        dado4 = new javax.swing.JLabel();
        dado5 = new javax.swing.JLabel();
        regras = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setLocation(new java.awt.Point(0, 0));
        setSize(new java.awt.Dimension(775, 510));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabela.setAutoCreateRowSorter(true);
        tabela.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        tabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Jogada de 1", "", null, null, null},
                {"Jogada de 2", null, null, null, null},
                {"Jogada de 3", null, null, null, null},
                {"Jogada de 4", null, null, null, null},
                {"Jogada de 5", null, null, null, null},
                {"Jogada de 6", null, null, null, null},
                {"Trinca", null, null, null, null},
                {"Quadra", null, null, null, null},
                {"FullHouse", null, null, null, null},
                {"Seq. Alta", null, null, null, null},
                {"Seq. Baixa", null, null, null, null},
                {"General", null, null, null, null},
                {"Aleatória", null, null, null, null}
            },
            new String [] {
                "Jogada", "Jogador1", "Jogador2", "Jogador3", "Jogador4"
            }
        ));
        tabela.setEnabled(false);
        tabela.setGridColor(new java.awt.Color(0, 0, 0));
        tabela.setRowHeight(25);
        tabela.setRowMargin(5);
        tabela.setShowGrid(true);
        jScrollPane1.setViewportView(tabela);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("TABELA DE JOGADAS");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 564, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)
                .addContainerGap())
        );

        jogarDados.setText("JOGAR DADOS");
        jogarDados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jogarDadosActionPerformed(evt);
            }
        });

        salvar.setText("Salvar Jogada");
        salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salvarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel2.setText("JOGADAS");

        Jogadade2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(jogde2);
        jogde2.setText("JOGADA DE 2");

        javax.swing.GroupLayout Jogadade2Layout = new javax.swing.GroupLayout(Jogadade2);
        Jogadade2.setLayout(Jogadade2Layout);
        Jogadade2Layout.setHorizontalGroup(
            Jogadade2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jogadade2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogde2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jogadade2Layout.setVerticalGroup(
            Jogadade2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jogadade2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogde2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        Jogadade1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(jogde1);
        jogde1.setText("JOGADA DE 1");

        javax.swing.GroupLayout Jogadade1Layout = new javax.swing.GroupLayout(Jogadade1);
        Jogadade1.setLayout(Jogadade1Layout);
        Jogadade1Layout.setHorizontalGroup(
            Jogadade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jogadade1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogde1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        Jogadade1Layout.setVerticalGroup(
            Jogadade1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jogadade1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jogde1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Jogadade3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(jogde3);
        jogde3.setText("JOGADA DE 3");

        javax.swing.GroupLayout Jogadade3Layout = new javax.swing.GroupLayout(Jogadade3);
        Jogadade3.setLayout(Jogadade3Layout);
        Jogadade3Layout.setHorizontalGroup(
            Jogadade3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jogadade3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogde3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jogadade3Layout.setVerticalGroup(
            Jogadade3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jogadade3Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jogde3)
                .addGap(27, 27, 27))
        );

        General.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(general);
        general.setText("GENERAL");

        javax.swing.GroupLayout GeneralLayout = new javax.swing.GroupLayout(General);
        General.setLayout(GeneralLayout);
        GeneralLayout.setHorizontalGroup(
            GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GeneralLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(general)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        GeneralLayout.setVerticalGroup(
            GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GeneralLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(general)
                .addGap(36, 36, 36))
        );

        Jogadade5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(jogde5);
        jogde5.setText("JOGADA DE 5");

        javax.swing.GroupLayout Jogadade5Layout = new javax.swing.GroupLayout(Jogadade5);
        Jogadade5.setLayout(Jogadade5Layout);
        Jogadade5Layout.setHorizontalGroup(
            Jogadade5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jogadade5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogde5)
                .addContainerGap())
        );
        Jogadade5Layout.setVerticalGroup(
            Jogadade5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jogadade5Layout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addComponent(jogde5)
                .addGap(27, 27, 27))
        );

        Jogadade6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(jogde6);
        jogde6.setText("JOGADA DE 6");

        javax.swing.GroupLayout Jogadade6Layout = new javax.swing.GroupLayout(Jogadade6);
        Jogadade6.setLayout(Jogadade6Layout);
        Jogadade6Layout.setHorizontalGroup(
            Jogadade6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jogadade6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jogde6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        Jogadade6Layout.setVerticalGroup(
            Jogadade6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jogadade6Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jogde6)
                .addGap(28, 28, 28))
        );

        Trinca.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(trinca);
        trinca.setText("TRINCA");

        javax.swing.GroupLayout TrincaLayout = new javax.swing.GroupLayout(Trinca);
        Trinca.setLayout(TrincaLayout);
        TrincaLayout.setHorizontalGroup(
            TrincaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrincaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(trinca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        TrincaLayout.setVerticalGroup(
            TrincaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TrincaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(trinca)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Jogadade4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(jogde4);
        jogde4.setText("JOGADA DE 4");

        javax.swing.GroupLayout Jogadade4Layout = new javax.swing.GroupLayout(Jogadade4);
        Jogadade4.setLayout(Jogadade4Layout);
        Jogadade4Layout.setHorizontalGroup(
            Jogadade4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Jogadade4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jogde4)
                .addContainerGap())
        );
        Jogadade4Layout.setVerticalGroup(
            Jogadade4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Jogadade4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jogde4)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        Quadra.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(quadra);
        quadra.setText("QUADRA");

        javax.swing.GroupLayout QuadraLayout = new javax.swing.GroupLayout(Quadra);
        Quadra.setLayout(QuadraLayout);
        QuadraLayout.setHorizontalGroup(
            QuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuadraLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(quadra)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        QuadraLayout.setVerticalGroup(
            QuadraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QuadraLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(quadra)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FullHouse.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        buttonGroup1.add(fullhouse);
        fullhouse.setText("FULLHOUSE");

        javax.swing.GroupLayout FullHouseLayout = new javax.swing.GroupLayout(FullHouse);
        FullHouse.setLayout(FullHouseLayout);
        FullHouseLayout.setHorizontalGroup(
            FullHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FullHouseLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fullhouse)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        FullHouseLayout.setVerticalGroup(
            FullHouseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FullHouseLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(fullhouse)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Aleatorio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        buttonGroup1.add(aleatoria);
        aleatoria.setText("ALEATORIO");

        javax.swing.GroupLayout AleatorioLayout = new javax.swing.GroupLayout(Aleatorio);
        Aleatorio.setLayout(AleatorioLayout);
        AleatorioLayout.setHorizontalGroup(
            AleatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AleatorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(aleatoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AleatorioLayout.setVerticalGroup(
            AleatorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AleatorioLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(aleatoria)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SequenciaBaixa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(seqbaixa);
        seqbaixa.setText("SEQ.BAIXA");

        javax.swing.GroupLayout SequenciaBaixaLayout = new javax.swing.GroupLayout(SequenciaBaixa);
        SequenciaBaixa.setLayout(SequenciaBaixaLayout);
        SequenciaBaixaLayout.setHorizontalGroup(
            SequenciaBaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SequenciaBaixaLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(seqbaixa)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        SequenciaBaixaLayout.setVerticalGroup(
            SequenciaBaixaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SequenciaBaixaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(seqbaixa)
                .addGap(25, 25, 25))
        );

        SequenciaAlta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        buttonGroup1.add(seqalta);
        seqalta.setText("SEQ.ALTA");

        javax.swing.GroupLayout SequenciaAltaLayout = new javax.swing.GroupLayout(SequenciaAlta);
        SequenciaAlta.setLayout(SequenciaAltaLayout);
        SequenciaAltaLayout.setHorizontalGroup(
            SequenciaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SequenciaAltaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(seqalta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SequenciaAltaLayout.setVerticalGroup(
            SequenciaAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SequenciaAltaLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(seqalta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Jogadade2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jogadade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jogadade4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jogadade3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Jogadade5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Jogadade6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(General, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Quadra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Trinca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Aleatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(FullHouse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(SequenciaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SequenciaBaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Aleatorio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Trinca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jogadade5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SequenciaBaixa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Quadra, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(FullHouse, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(SequenciaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jogadade6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Jogadade3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Jogadade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(Jogadade2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Jogadade4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(General, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(59, 59, 59))))
        );

        jogadordavez.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jogadordavez.setForeground(new java.awt.Color(204, 0, 51));
        jogadordavez.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jogadordavez.setText("Jogador Vez");

        jogadorVez2.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jogadorVez2.setForeground(new java.awt.Color(204, 0, 51));
        jogadorVez2.setText("é a sua vez");

        dado1.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        dado1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado1MouseClicked(evt);
            }
        });

        dado2.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        dado2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado2MouseClicked(evt);
            }
        });

        dado3.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        dado3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado3MouseClicked(evt);
            }
        });

        dado4.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        dado4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado4MouseClicked(evt);
            }
        });

        dado5.setFont(new java.awt.Font("Lucida Grande", 0, 48)); // NOI18N
        dado5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dado5MouseClicked(evt);
            }
        });

        regras.setText("Regras do Jogo");
        regras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jogadordavez, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jogadorVez2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(regras))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(29, 29, 29)
                                        .addComponent(jogarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(salvar, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jogadorVez2, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jogadordavez))
                    .addComponent(regras))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(dado2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jogarDados, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salvar))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dado3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dado5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dado1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dado4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void jogarDadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jogarDadosActionPerformed
        
        if(variavel != 3){
            variavel++;
        } else {
            jogarDados.setEnabled(false);
        }
        Dado[] d = game.getDados();
            if(d[0].estaPreparado()){
                d[0].jogaDado();
                new GiraDado(dado1, d[0].getValor());
            }
            if(d[1].estaPreparado()){
                d[1].jogaDado();
                new GiraDado(dado2, d[1].getValor());
            }
            if(d[2].estaPreparado()){
                d[2].jogaDado();
                new GiraDado(dado3, d[2].getValor());
            }
            if(d[3].estaPreparado()){
                d[3].jogaDado(); 
                new GiraDado(dado4, d[3].getValor());
            }
            if(d[4].estaPreparado()){
                d[4].jogaDado();
                new GiraDado(dado5, d[4].getValor());
            }
        
    }//GEN-LAST:event_jogarDadosActionPerformed

    private void salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salvarActionPerformed
        
        if(jogde1.isSelected() || jogde2.isSelected() || jogde3.isSelected() || jogde4.isSelected() || jogde5.isSelected() ||jogde6.isSelected()||trinca.isSelected() || quadra.isSelected() || fullhouse.isSelected() ||seqalta.isSelected() || seqbaixa.isSelected() || general.isSelected() || aleatoria.isSelected()){
        URL url1 =  this.getClass().getResource("/resources/Dado.png");
        ImageIcon icon1 = new ImageIcon(url1);
        dado1.setIcon(icon1);
        dado2.setIcon(icon1);
        dado3.setIcon(icon1);
        dado4.setIcon(icon1);
        dado5.setIcon(icon1);
        int pontuacao;
        Jogada j = new Jogada();
        Dado[] d = game.getDados();
        j.setTipoJogada(pegaTipoJogada());
        j.calcularPontuacao(d);
        pontuacao = j.getPontos();
        Jogador[] jo = game.getJogadores();
        Jogo f = jo[jogadorvez].getJogo();
        f.inserirJogada(j);
        if(jogde1.isSelected()){
            tabela.setValueAt(pontuacao, 0, jogadorvez + 1);
        }
        if(jogde2.isSelected()){
            tabela.setValueAt(pontuacao, 1, jogadorvez + 1);
        }
        if(jogde3.isSelected()){
            tabela.setValueAt(pontuacao, 2, jogadorvez + 1);
        }
        if(jogde4.isSelected()){
            tabela.setValueAt(pontuacao, 3, jogadorvez + 1);
        }
        if(jogde5.isSelected()){
            tabela.setValueAt(pontuacao, 4, jogadorvez + 1);
        }
        if(jogde6.isSelected()){
            tabela.setValueAt(pontuacao, 5, jogadorvez + 1);
        }
        if(trinca.isSelected()){
            tabela.setValueAt(pontuacao, 6, jogadorvez + 1);
        }
        if(quadra.isSelected()){
            tabela.setValueAt(pontuacao, 7, jogadorvez + 1);
        }
        if(fullhouse.isSelected()){
            tabela.setValueAt(pontuacao, 8, jogadorvez + 1);
        }
        if(seqalta.isSelected()){
            tabela.setValueAt(pontuacao, 9, jogadorvez + 1);
        }
        if(seqbaixa.isSelected()){
            tabela.setValueAt(pontuacao, 10, jogadorvez + 1);
        }
        if(general.isSelected()){
            tabela.setValueAt(pontuacao, 11, jogadorvez + 1);
        }
        if(aleatoria.isSelected()){
            tabela.setValueAt(pontuacao, 12, jogadorvez + 1);
        }
        jo[jogadorvez].getJogo().calcularPontuacaoTotal();
        
        if((jo[jogadorvez].getJogo().getJogada().length == 13)&&(jogadorvez == jo.length -1)){
            Ganhador g = new Ganhador(game.Vencedor().getNome());
            g.setVisible(true);
            //JOptionPane.showMessageDialog(rootPane, game.Vencedor().getNome() + " você venceu!!!");
            this.dispose();
        } else {
            newRodada();
        }  
        atualizaTiposJogadas();
        }
        
        
    }//GEN-LAST:event_salvarActionPerformed

    private void dado1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado1MouseClicked
        if(variavel > 1){
        Dado[] d = game.getDados();
        d[0].verificaDado(dado1);
        }
    }//GEN-LAST:event_dado1MouseClicked

    private void dado3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado3MouseClicked
        if(variavel > 1){
        Dado[] d = game.getDados();
        d[2].verificaDado(dado3);
        }
    }//GEN-LAST:event_dado3MouseClicked

    private void dado2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado2MouseClicked
        if(variavel > 1){
        Dado[] d = game.getDados();
        d[1].verificaDado(dado2);
        }
    }//GEN-LAST:event_dado2MouseClicked

    private void dado4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado4MouseClicked
        if(variavel > 1){
        Dado[] d = game.getDados();
        d[3].verificaDado(dado4);
        }
    }//GEN-LAST:event_dado4MouseClicked

    private void dado5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dado5MouseClicked
        if(variavel > 1){
        Dado[] d = game.getDados();
        d[4].verificaDado(dado5);
        }
    }//GEN-LAST:event_dado5MouseClicked

    private void regrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regrasActionPerformed
        Regras tela = new Regras(this, rootPaneCheckingEnabled);
        tela.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_regrasActionPerformed
    
    private TipoJogada pegaTipoJogada(){
        TipoJogada retorno = null;
        if(jogde1.isSelected()){
            retorno = TipoJogada.JOGADADE1;
        }
        if(jogde2.isSelected()){
            retorno = TipoJogada.JOGADADE2;
        }
        if(jogde3.isSelected()){
            retorno = TipoJogada.JOGADADE3;
        }
        if(jogde4.isSelected()){
            retorno = TipoJogada.JOGADADE4;
        }
        if(jogde5.isSelected()){
            retorno = TipoJogada.JOGADADE5;
        }
        if(jogde6.isSelected()){
            retorno = TipoJogada.JOGADADE6;
        }
        if(trinca.isSelected()){
            retorno = TipoJogada.TRINCA;
        }
        if(quadra.isSelected()){
            retorno = TipoJogada.QUADRA;
        }
        if(fullhouse.isSelected()){
            retorno = TipoJogada.FULLHOUSE;
        }
        if(seqalta.isSelected()){
            retorno = TipoJogada.SEQUENCIAALTA;
        }
        if(seqbaixa.isSelected()){
            retorno = TipoJogada.SEQUENCIABAIXA;
        }
        if(general.isSelected()){
            retorno = TipoJogada.GENERAL;
        }
        if(aleatoria.isSelected()){
            retorno = TipoJogada.ALEATORIA;
        }
        return retorno;
    }
    
    private void newRodada(){
        Jogador[] j = game.getJogadores();
        if(jogadorvez != j.length -1){
            jogadorvez++;
        } else {
            jogadorvez = 0;
        }
        jogadordavez.setText(j[jogadorvez].getNome().toUpperCase());
        variavel = 1;
        jogarDados.setEnabled(true);
        for(Dado d : game.getDados()){
            if(!d.estaPreparado()){
                d.setPreparado(true);
            }
            d.jogaDado();
        }
        buttonGroup1.clearSelection();
    }
    
    private void atualizaTiposJogadas(){
        jogde1.setEnabled(true);
        jogde2.setEnabled(true);
        jogde3.setEnabled(true);
        jogde4.setEnabled(true);
        jogde5.setEnabled(true);
        jogde6.setEnabled(true);
        trinca.setEnabled(true);
        quadra.setEnabled(true);
        fullhouse.setEnabled(true);
        seqalta.setEnabled(true);
        seqbaixa.setEnabled(true);
        aleatoria.setEnabled(true);
        general.setEnabled(true);
        
        Jogador[] j = game.getJogadores();
        Jogada[] jogada = j[jogadorvez].getJogo().getJogada();
        for(Jogada joga : jogada){
          if(jogde1.isEnabled()){  
            if(joga.getTipoJogada() == TipoJogada.JOGADADE1){
                jogde1.setEnabled(false);
            }
          }  
          if(jogde2.isEnabled()){  
            if(joga.getTipoJogada() == TipoJogada.JOGADADE2){
                jogde2.setEnabled(false);
            }    
          }  
          if(jogde3.isEnabled()){  
            if(joga.getTipoJogada() == TipoJogada.JOGADADE3){
                jogde3.setEnabled(false);
            }
          }
          if(jogde4.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.JOGADADE4){
                  jogde4.setEnabled(false);
              }
          }
          if(jogde5.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.JOGADADE5){
                  jogde5.setEnabled(false);
              }
          }
          if(jogde6.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.JOGADADE6){
                  jogde6.setEnabled(false);
              }
          }
          if(trinca.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.TRINCA){
                  trinca.setEnabled(false);
              }
          }
          if(quadra.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.QUADRA){
                  quadra.setEnabled(false);
              }
          }
          if(fullhouse.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.FULLHOUSE){
                  fullhouse.setEnabled(false);
              }
          }
          if(seqalta.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.SEQUENCIAALTA){
                  seqalta.setEnabled(false);
              }
          }
          if(seqbaixa.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.SEQUENCIABAIXA){
                  seqbaixa.setEnabled(false);
              }
          }
          if(general.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.GENERAL){
                  general.setEnabled(false);
              }
          }
          if(aleatoria.isEnabled()){
              if(joga.getTipoJogada() == TipoJogada.ALEATORIA){
                  aleatoria.setEnabled(false);
              }
          }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Aleatorio;
    private javax.swing.JPanel FullHouse;
    private javax.swing.JPanel General;
    private javax.swing.JPanel Jogadade1;
    private javax.swing.JPanel Jogadade2;
    private javax.swing.JPanel Jogadade3;
    private javax.swing.JPanel Jogadade4;
    private javax.swing.JPanel Jogadade5;
    private javax.swing.JPanel Jogadade6;
    private javax.swing.JPanel Quadra;
    private javax.swing.JPanel SequenciaAlta;
    private javax.swing.JPanel SequenciaBaixa;
    private javax.swing.JPanel Trinca;
    private javax.swing.JRadioButton aleatoria;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel dado1;
    private javax.swing.JLabel dado2;
    private javax.swing.JLabel dado3;
    private javax.swing.JLabel dado4;
    private javax.swing.JLabel dado5;
    private javax.swing.JRadioButton fullhouse;
    private javax.swing.JRadioButton general;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jogadorVez2;
    private javax.swing.JLabel jogadordavez;
    private javax.swing.JButton jogarDados;
    private javax.swing.JRadioButton jogde1;
    private javax.swing.JRadioButton jogde2;
    private javax.swing.JRadioButton jogde3;
    private javax.swing.JRadioButton jogde4;
    private javax.swing.JRadioButton jogde5;
    private javax.swing.JRadioButton jogde6;
    private javax.swing.JRadioButton quadra;
    private javax.swing.JToggleButton regras;
    private javax.swing.JButton salvar;
    private javax.swing.JRadioButton seqalta;
    private javax.swing.JRadioButton seqbaixa;
    private javax.swing.JTable tabela;
    private javax.swing.JRadioButton trinca;
    // End of variables declaration//GEN-END:variables
}
