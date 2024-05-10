
import javax.swing.JOptionPane;

public class NewJFrame extends javax.swing.JFrame {

    int o = 0;
    int x = 0;
    int c = 1;
    int d = 0;

    public NewJFrame() {
        initComponents();
    }

    private void checkWX() {

        jLabel4.setText(String.valueOf(x));
        jLabel5.setText(String.valueOf(o));

    }

    private void X() {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
        bI.setEnabled(true);
        bR.setEnabled(true);
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");
    }

    private void checkX() {

        if (b1.getText().equals("X") && b2.getText().equals("X") && b3.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b4.getText().equals("X") && b5.getText().equals("X") && b6.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b7.getText().equals("X") && b8.getText().equals("X") && b9.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b1.getText().equals("X") && b4.getText().equals("X") && b7.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b2.getText().equals("X") && b5.getText().equals("X") && b8.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b3.getText().equals("X") && b6.getText().equals("X") && b9.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b1.getText().equals("X") && b5.getText().equals("X") && b9.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b3.getText().equals("X") && b5.getText().equals("X") && b7.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            x++;
            d = 0;
            X();
            c = 1;
            if (x == 3) {
                jLabel4.setText("3");
                jLabel5.setText(String.valueOf(o));
                JOptionPane.showMessageDialog(this, "Player X won");
                jLabel4.setText("0");
                o = 0;
                x = 0;
            }
        } else if (d == 9) {
            JOptionPane.showMessageDialog(this, "Draw");
            X();
            c = 1;
            d = 0;
        }

    }

    private void checkO() {

        if (b1.getText().equals("O") && b2.getText().equals("O") && b3.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b4.getText().equals("O") && b5.getText().equals("O") && b6.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b7.getText().equals("O") && b8.getText().equals("O") && b9.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b1.getText().equals("O") && b4.getText().equals("O") && b7.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b2.getText().equals("O") && b5.getText().equals("O") && b8.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b3.getText().equals("O") && b6.getText().equals("O") && b9.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b1.getText().equals("O") && b5.getText().equals("O") && b9.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (b3.getText().equals("O") && b5.getText().equals("O") && b7.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            o++;
            d = 0;
            X();
            c = 1;
            if (o == 3) {
                jLabel5.setText("3");
                jLabel4.setText(String.valueOf(x));
                JOptionPane.showMessageDialog(this, "Player O won");
                jLabel5.setText("0");
                o = 0;
                x = 0;
            }
        } else if (d == 9) {
            JOptionPane.showMessageDialog(this, "Draw");
            X();
            c = 1;
            d = 0;
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        b3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        b4 = new javax.swing.JButton();
        b5 = new javax.swing.JButton();
        b6 = new javax.swing.JButton();
        b7 = new javax.swing.JButton();
        b8 = new javax.swing.JButton();
        b9 = new javax.swing.JButton();
        bI = new javax.swing.JButton();
        bR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        b3.setBackground(new java.awt.Color(255, 255, 255));
        b3.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(255, 255, 255));
        b2.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(255, 255, 255));
        b1.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        b4.setBackground(new java.awt.Color(255, 255, 255));
        b4.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b4ActionPerformed(evt);
            }
        });

        b5.setBackground(new java.awt.Color(255, 255, 255));
        b5.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b5ActionPerformed(evt);
            }
        });

        b6.setBackground(new java.awt.Color(255, 255, 255));
        b6.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b6ActionPerformed(evt);
            }
        });

        b7.setBackground(new java.awt.Color(255, 255, 255));
        b7.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b7ActionPerformed(evt);
            }
        });

        b8.setBackground(new java.awt.Color(255, 255, 255));
        b8.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b8ActionPerformed(evt);
            }
        });

        b9.setBackground(new java.awt.Color(255, 255, 255));
        b9.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        b9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b9ActionPerformed(evt);
            }
        });

        bI.setBackground(new java.awt.Color(255, 255, 255));
        bI.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        bI.setText("Information");
        bI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bIActionPerformed(evt);
            }
        });

        bR.setBackground(new java.awt.Color(255, 255, 255));
        bR.setFont(new java.awt.Font("Wide Latin", 1, 14)); // NOI18N
        bR.setText("Rules");
        bR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Score:");

        jLabel2.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Player X:");

        jLabel3.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Player O:");

        jLabel4.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("0");

        jLabel5.setFont(new java.awt.Font("Wide Latin", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(bR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(b7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(39, 39, 39)
                .addComponent(bI, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bIActionPerformed
        JOptionPane.showMessageDialog(this, "Mangayao, Kierby Ybrahim P.", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bIActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed

        if (c % 2 == 0) {
            b1.setText("O");
        } else if (c % 2 == 1) {
            b1.setText("X");
        }
        b1.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();

    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed

        if (c % 2 == 0) {
            b2.setText("O");
        } else if (c % 2 == 1) {
            b2.setText("X");
        }
        b2.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();

    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed

        if (c % 2 == 0) {
            b3.setText("O");
        } else if (c % 2 == 1) {
            b3.setText("X");
        }
        b3.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();

    }//GEN-LAST:event_b3ActionPerformed

    private void b4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b4ActionPerformed

        if (c % 2 == 0) {
            b4.setText("O");
        } else if (c % 2 == 1) {
            b4.setText("X");
        }
        b4.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();
    }//GEN-LAST:event_b4ActionPerformed

    private void b5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b5ActionPerformed

        if (c % 2 == 0) {
            b5.setText("O");
        } else if (c % 2 == 1) {
            b5.setText("X");
        }
        b5.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();
    }//GEN-LAST:event_b5ActionPerformed

    private void b6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b6ActionPerformed

        if (c % 2 == 0) {
            b6.setText("O");
        } else if (c % 2 == 1) {
            b6.setText("X");
        }
        b6.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();

    }//GEN-LAST:event_b6ActionPerformed

    private void b7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b7ActionPerformed

        if (c % 2 == 0) {
            b7.setText("O");
        } else if (c % 2 == 1) {
            b7.setText("X");
        }
        b7.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();

    }//GEN-LAST:event_b7ActionPerformed

    private void b8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b8ActionPerformed

        if (c % 2 == 0) {
            b8.setText("O");
        } else if (c % 2 == 1) {
            b8.setText("X");
        }
        b8.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();

    }//GEN-LAST:event_b8ActionPerformed

    private void b9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b9ActionPerformed

        if (c % 2 == 0) {
            b9.setText("O");
        } else if (c % 2 == 1) {
            b9.setText("X");
        }
        b9.setEnabled(false);
        bI.setEnabled(false);
        bR.setEnabled(false);
        c++;
        d++;
        checkX();
        checkO();
        checkWX();


    }//GEN-LAST:event_b9ActionPerformed

    private void bRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRActionPerformed
        JOptionPane.showMessageDialog(this, "basta rules yan HAHAHAH malaki ka na", "Rules", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_bRActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton b4;
    private javax.swing.JButton b5;
    private javax.swing.JButton b6;
    private javax.swing.JButton b7;
    private javax.swing.JButton b8;
    private javax.swing.JButton b9;
    private javax.swing.JButton bI;
    private javax.swing.JButton bR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
