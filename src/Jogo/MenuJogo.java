package Jogo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;

/* @author Lucas Nunes */
public class MenuJogo extends javax.swing.JFrame {

    public MenuJogo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        B3 = new javax.swing.JButton();
        B1 = new javax.swing.JButton();
        B6 = new javax.swing.JButton();
        B4 = new javax.swing.JButton();
        B7 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        B8 = new javax.swing.JButton();
        B5 = new javax.swing.JButton();
        B9 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        NomeDoJogador1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        NomeDoJogador2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        NumeroDeVitoriasDoJogador2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        NumeroDeEmpates = new javax.swing.JLabel();
        Iniciar = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Jogo = new javax.swing.JMenu();
        NovoJogo = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();
        Ajuda = new javax.swing.JMenu();
        ObjetivoJogo = new javax.swing.JMenuItem();
        EstrategiasJogo = new javax.swing.JMenuItem();
        Sobre = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 350));

        B3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B3.setForeground(new java.awt.Color(255, 0, 0));
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B1.setForeground(new java.awt.Color(255, 0, 0));
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B6.setForeground(new java.awt.Color(255, 0, 0));
        B6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B6ActionPerformed(evt);
            }
        });

        B4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B4.setForeground(new java.awt.Color(255, 0, 0));
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B7.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B7.setForeground(new java.awt.Color(255, 0, 0));
        B7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B7ActionPerformed(evt);
            }
        });

        B2.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B2.setForeground(new java.awt.Color(255, 0, 0));
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B8.setForeground(new java.awt.Color(255, 0, 0));
        B8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B8ActionPerformed(evt);
            }
        });

        B5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B5.setForeground(new java.awt.Color(255, 0, 0));
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        B9.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        B9.setForeground(new java.awt.Color(255, 0, 0));
        B9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(B5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(B8, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(B9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Informações", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N

        NomeDoJogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NomeDoJogador1.setText("Jogador 1:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Símbolo: X ");

        NumeroDeVitoriasDoJogador1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador1.setText("Número de Vitórias: 0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(NumeroDeVitoriasDoJogador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(NomeDoJogador1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoJogador1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroDeVitoriasDoJogador1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        NomeDoJogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NomeDoJogador2.setText("Jogador 2:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Símbolo: O");

        NumeroDeVitoriasDoJogador2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeVitoriasDoJogador2.setText("Número de Vitórias: 0");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(NumeroDeVitoriasDoJogador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(NomeDoJogador2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeDoJogador2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NumeroDeVitoriasDoJogador2)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 12))); // NOI18N

        NumeroDeEmpates.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        NumeroDeEmpates.setText("Número de Empates: 0");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NumeroDeEmpates)
                .addContainerGap(112, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(NumeroDeEmpates))
        );

        Iniciar.setLabel("Iniciar");
        Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IniciarActionPerformed(evt);
            }
        });

        jMenuBar1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        Jogo.setText("Jogo");

        NovoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        NovoJogo.setText("Novo jogo");
        NovoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoJogoActionPerformed(evt);
            }
        });
        Jogo.add(NovoJogo);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Jogo.add(Sair);

        jMenuBar1.add(Jogo);

        Ajuda.setText("Ajuda");

        ObjetivoJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        ObjetivoJogo.setText("Objetivo");
        ObjetivoJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ObjetivoJogoActionPerformed(evt);
            }
        });
        Ajuda.add(ObjetivoJogo);

        EstrategiasJogo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, 0));
        EstrategiasJogo.setText("Estratégias");
        EstrategiasJogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EstrategiasJogoActionPerformed(evt);
            }
        });
        Ajuda.add(EstrategiasJogo);

        Sobre.setText("Sobre o jogo (Tic-Tac-Toe)");
        Sobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SobreActionPerformed(evt);
            }
        });
        Ajuda.add(Sobre);

        jMenuBar1.add(Ajuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Iniciar)
                        .addGap(105, 105, 105))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(Iniciar))
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    boolean Jogador1 = true, Jogador2 = false;
    int VitoriasJogador1 = 0, VitoriasJogador2 = 0, Empates = 0, NPartidas = 0;
    String NomeJogador1 = null, NomeJogador2 = null, MV = null;
    
    long TotalMiliSegundos = System.currentTimeMillis() - 10800000;  
    long TotalSegundos = TotalMiliSegundos/1000;
    long SegundoAtual = TotalSegundos%60;
    long TotalMinutos = TotalSegundos/60;
    long MinutoAtual = TotalMinutos%60;
    long TotalHoras = TotalMinutos/60;
    long HoraAtual = TotalHoras%24;

    
    public void Jogador() {

        if (Jogador1 == true) {
            Jogador1 = false;
            Jogador2 = true;
        } else {
            Jogador1 = true;
            Jogador2 = false;
        }

        JogadorVencedor("X");
        JogadorVencedor("O");

    }

    public void JogadorVencedor(String Jogada) {

        /********** Verificando linhas **********/
        if (B1.getText().equals(Jogada)
                && B2.getText().equals(Jogada)
                && B3.getText().equals(Jogada)) {

            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        if (B4.getText().equals(Jogada)
                && B5.getText().equals(Jogada)
                && B6.getText().equals(Jogada)) {

            if (B4.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        if (B7.getText().equals(Jogada)
                && B8.getText().equals(Jogada)
                && B9.getText().equals(Jogada)) {

            if (B7.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        /********** Verificando colunas **********/
        if (B1.getText().equals(Jogada)
                && B4.getText().equals(Jogada)
                && B7.getText().equals(Jogada)) {

            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        if (B2.getText().equals(Jogada)
                && B5.getText().equals(Jogada)
                && B8.getText().equals(Jogada)) {

            if (B2.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        if (B3.getText().equals(Jogada)
                && B6.getText().equals(Jogada)
                && B9.getText().equals(Jogada)) {

            if (B3.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        /**
         * ******** Verificando diagonais *********
         */
        if (B1.getText().equals(Jogada)
                && B5.getText().equals(Jogada)
                && B9.getText().equals(Jogada)) {

            if (B1.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        if (B3.getText().equals(Jogada)
                && B5.getText().equals(Jogada)
                && B7.getText().equals(Jogada)) {

            if (B3.getText().equals("X")) {
                Vencedor("Jogador 1");
            } else {
                Vencedor("Jogador 2");
            }

        }

        /********** Verificando empate **********/
        if (!B1.getText().equals("")
                && !B2.getText().equals("")
                && !B3.getText().equals("")
                && !B4.getText().equals("")
                && !B5.getText().equals("")
                && !B6.getText().equals("")
                && !B7.getText().equals("")
                && !B8.getText().equals("")
                && !B9.getText().equals("")) {

            Vencedor("Empate");
        }

    }

    public void Vencedor(String JogadorVencedor) {
      
        SonsJogo som = new SonsJogo();

        if (JogadorVencedor.equals("Jogador 1")) {
            som.play("src/Sons/venceu.WAV");
            JOptionPane.showMessageDialog(MenuJogo.this, "VENCEDOR! Parabéns Jogador 1: " + jTextField1.getText());
            VitoriasJogador1++;
            NumeroDeVitoriasDoJogador1.setText("Número de Vitórias: " + VitoriasJogador1);
            LimparDados();
        }

        if (JogadorVencedor.equals("Jogador 2")) {
            som.play("src/Sons/venceu.WAV");
            JOptionPane.showMessageDialog(MenuJogo.this, "VENCEDOR! Parabéns Jogador 2: " + jTextField2.getText());
            VitoriasJogador2++;
            NumeroDeVitoriasDoJogador2.setText("Número de Vitórias: " + VitoriasJogador2);
            LimparDados(); 
        }

        if (JogadorVencedor.equals("Empate")) {
            som.play("src/Sons/empate.WAV");
            JOptionPane.showMessageDialog(MenuJogo.this, "EMPATE!");
            Empates++;
            NumeroDeEmpates.setText("Número de Empates: " + Empates);
            LimparDados();
        }
         
         NPartidas++;  
        
         //Gravando os dados em um arquivo de texto
         File arquivo = new File("dist/Dados.txt");
            arquivo.delete();

            try{
                if (arquivo.exists() == false) {
                //Se não houver esse arquivo ele cria um
                   arquivo.createNewFile();
                }
                
                    File[] arquivos = arquivo.listFiles(); //array para guardar as linhas do arquivo
                    FileWriter fw = new FileWriter(arquivo, true);
                    BufferedWriter bw = new BufferedWriter(fw);
                    
                    bw.write("******************** ÚLTIMA RODADA DE PARTIDAS DO JOGO DA VELHA ********************");
                    bw.newLine(); //adiciona uma linha
                    bw.write("JOGADOR 1 - Nome: " + NomeJogador1 + " - " + "Número de Vitórias: " + VitoriasJogador1);
                    bw.newLine(); //adiciona uma linha
                    bw.write("JOGADOR 2 - Nome: " + NomeJogador2 + " - " + "Número de Vitórias: " + VitoriasJogador2); 
                    bw.newLine(); //adiciona mais uma linha
                    bw.write("Número de Empates: " + Empates);
                    bw.newLine(); //adiciona mais uma linha
                    bw.write("Número de Partidas: " + NPartidas);
                    bw.newLine(); //adiciona mais uma linha
                    bw.write("Maior Vencedor: " + MaiorVencedor(MV));
                    bw.newLine(); //adiciona mais uma linha
                    bw.write("Horário inicial do acesso ao Jogo: " + HoraAtual + ":" + MinutoAtual + ":" + SegundoAtual);
                    bw.newLine(); //adiciona mais uma linha
                    bw.close();
                    fw.close();
                    
               } catch (IOException ex) {

              }
    }

    public String MaiorVencedor(String MV) {
        if(VitoriasJogador1 > VitoriasJogador2){
            return MV = NomeJogador1;
        } else if(VitoriasJogador1 < VitoriasJogador2){
            return MV = NomeJogador2;
          } else {
              return MV = "Jogadores empatados!";
          }
    }
     
    public void LimparDados() {

        B1.setText("");
        B2.setText("");
        B3.setText("");
        B4.setText("");
        B5.setText("");
        B6.setText("");
        B7.setText("");
        B8.setText("");
        B9.setText("");

        Jogador1 = true;
        Jogador2 = false;

    }

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_SairActionPerformed

    private void NovoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoJogoActionPerformed

        Object resposta;

        resposta = JOptionPane.showConfirmDialog(null,
                "Tem certeza que deseja iniciar uma nova partida?",
                "Sair",
                JOptionPane.YES_NO_OPTION);

        if (resposta.equals(YES_OPTION)) {
            LimparDados();
           
          resposta = JOptionPane.showConfirmDialog(null,
                "Iniciar com os mesmos jogadores?",
                "Sair",
                JOptionPane.YES_NO_OPTION);
             if (resposta.equals(NO_OPTION)) {
                  
                NomeJogador1 = null;
                NomeJogador2 = null;
                 //Salvando os nomes dos jogadores
                 while (NomeJogador1 == null || NomeJogador1.equals("")) {
                    NomeJogador1 = JOptionPane.showInputDialog("Digite o nome do Jogador 1:");
                     if (NomeJogador1 == null || NomeJogador1.equals("")) {
                        JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta!");
                     }
                 }
                   JOptionPane.showMessageDialog(null, "Nome do Jogador 1: " + NomeJogador1);

                 while (NomeJogador2 == null || NomeJogador2.equals("")) {
                    NomeJogador2 = JOptionPane.showInputDialog("Digite o nome do Jogador 2:");
                     if (NomeJogador2 == null || NomeJogador2.equals("")) {
                        JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta!");
                     }
                 }
                   JOptionPane.showMessageDialog(null, "Nome do Jogador 2: " + NomeJogador2);
                    // TODO add your handling code here:
                    jTextField1.setText(NomeJogador1);
                    jTextField2.setText(NomeJogador2);
                    VitoriasJogador1 = 0; 
                    VitoriasJogador2 = 0;
                    Empates = 0;
                    NPartidas = 0;
                    NumeroDeVitoriasDoJogador1.setText("Número de Vitórias: " + 0);
                    NumeroDeVitoriasDoJogador2.setText("Número de Vitórias: " + 0);
             }   
        }
    }//GEN-LAST:event_NovoJogoActionPerformed

    private void SobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SobreActionPerformed
        SobreJogo SobreJV = new SobreJogo(this, true);
        SobreJV.setVisible(true);
    }//GEN-LAST:event_SobreActionPerformed

    private void ObjetivoJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ObjetivoJogoActionPerformed
        ObjetivoJogo ObjetivoJV = new ObjetivoJogo(this, true);
        ObjetivoJV.setVisible(true);
    }//GEN-LAST:event_ObjetivoJogoActionPerformed

    private void B9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B9ActionPerformed
        if (Jogador1 == true) {
            if (B9.getText().equals("")) {
                B9.setText("X");
                Jogador();
            }
        } else {
            if (B9.getText().equals("")) {
                B9.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B9ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        if (Jogador1 == true) {
            if (B5.getText().equals("")) {
                B5.setText("X");
                Jogador();
            }
        } else {
            if (B5.getText().equals("")) {
                B5.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B5ActionPerformed

    private void B8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B8ActionPerformed
        if (Jogador1 == true) {
            if (B8.getText().equals("")) {
                B8.setText("X");
                Jogador();
            }
        } else {
            if (B8.getText().equals("")) {
                B8.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B8ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        if (Jogador1 == true) {
            if (B2.getText().equals("")) {
                B2.setText("X");
                Jogador();
            }
        } else {
            if (B2.getText().equals("")) {
                B2.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B2ActionPerformed

    private void B7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B7ActionPerformed
        if (Jogador1 == true) {
            if (B7.getText().equals("")) {
                B7.setText("X");
                Jogador();
            }
        } else {
            if (B7.getText().equals("")) {
                B7.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B7ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        if (Jogador1 == true) {
            if (B4.getText().equals("")) {
                B4.setText("X");
                Jogador();
            }
        } else {
            if (B4.getText().equals("")) {
                B4.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B4ActionPerformed

    private void B6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B6ActionPerformed
        if (Jogador1 == true) {
            if (B6.getText().equals("")) {
                B6.setText("X");
                Jogador();
            }
        } else {
            if (B6.getText().equals("")) {
                B6.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B6ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        if (Jogador1 == true) {
            if (B1.getText().equals("")) {
                B1.setText("X");
                Jogador();
            }
        } else {
            if (B1.getText().equals("")) {
                B1.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B1ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        if (Jogador1 == true) {
            if (B3.getText().equals("")) {
                B3.setText("X");
                Jogador();
            }
        } else {
            if (B3.getText().equals("")) {
                B3.setText("O");
                Jogador();
            }
        }
    }//GEN-LAST:event_B3ActionPerformed

    private void EstrategiasJogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EstrategiasJogoActionPerformed
        EstrategiasJogo EstrategiasJV = new EstrategiasJogo(this, true);
        EstrategiasJV.setVisible(true);
    }//GEN-LAST:event_EstrategiasJogoActionPerformed

    private void IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IniciarActionPerformed
 
        //Salvando os nomes dos jogadores
        while (NomeJogador1 == null || NomeJogador1.equals("")) {
            NomeJogador1 = JOptionPane.showInputDialog("Digite o nome do Jogador 1:");
            if (NomeJogador1 == null || NomeJogador1.equals("")) {
                JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta!");
            }
        }
        JOptionPane.showMessageDialog(null, "Nome do Jogador 1: " + NomeJogador1);

        while (NomeJogador2 == null || NomeJogador2.equals("")) {
            NomeJogador2 = JOptionPane.showInputDialog("Digite o nome do Jogador 2:");
            if (NomeJogador2 == null || NomeJogador2.equals("")) {
                JOptionPane.showMessageDialog(null, "Você não respondeu a pergunta!");
            }
        }
        JOptionPane.showMessageDialog(null, "Nome do Jogador 2: " + NomeJogador2);

        jTextField1.setText(NomeJogador1);
        jTextField2.setText(NomeJogador2);
        
        Iniciar.setEnabled(false);
    }//GEN-LAST:event_IniciarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SonsJogo som = new SonsJogo();
                som.play("src/Sons/inicio.WAV");
                new MenuJogo().setVisible(true);
                JOptionPane.showMessageDialog(null, "Antes de tudo, clique no botão 'Iniciar'. Logo, a partida será iniciada. Bom jogo!");
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Ajuda;
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JButton B3;
    private javax.swing.JButton B4;
    private javax.swing.JButton B5;
    private javax.swing.JButton B6;
    private javax.swing.JButton B7;
    private javax.swing.JButton B8;
    private javax.swing.JButton B9;
    private javax.swing.JMenuItem EstrategiasJogo;
    public javax.swing.JToggleButton Iniciar;
    private javax.swing.JMenu Jogo;
    private javax.swing.JLabel NomeDoJogador1;
    private javax.swing.JLabel NomeDoJogador2;
    private javax.swing.JMenuItem NovoJogo;
    private javax.swing.JLabel NumeroDeEmpates;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador1;
    private javax.swing.JLabel NumeroDeVitoriasDoJogador2;
    private javax.swing.JMenuItem ObjetivoJogo;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Sobre;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
