
import javax.swing.JOptionPane;

public class frmTic extends javax.swing.JFrame {

    int O = 0;
    int X = 0;
    int Co = 1;
    int Draw = 0;

    public frmTic() {
        initComponents();
    }

    private void btnReset() {

        btnOne.setEnabled(true);
        btnTwo.setEnabled(true);
        btnThree.setEnabled(true);
        btnFour.setEnabled(true);
        btnFive.setEnabled(true);
        btnSix.setEnabled(true);
        btnSeven.setEnabled(true);
        btnEight.setEnabled(true);
        btnNine.setEnabled(true);
        btnInfo.setEnabled(true);
        btnRules.setEnabled(true);
        btnOne.setText("");
        btnTwo.setText("");
        btnThree.setText("");
        btnFour.setText("");
        btnFive.setText("");
        btnSix.setText("");
        btnSeven.setText("");
        btnEight.setText("");
        btnNine.setText("");

    }

    private void settingAValue() {

        lblXZero.setText(String.valueOf(X));
        lblOZero.setText(String.valueOf(O));

    }

    private void winX() {
        if (btnOne.getText().equals("X") && btnTwo.getText().equals("X") && btnThree.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            X++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (X == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player X won");
                O = 0;
                X = 0;
            }
        } else if (btnFour.getText().equals("X") && btnFive.getText().equals("X") && btnSix.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            X++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (X == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player X won");
                O = 0;
                X = 0;
            }
        } else if (btnSeven.getText().equals("X") && btnEight.getText().equals("X") && btnNine.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            X++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (X == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player X won");
                O = 0;
                X = 0;
            }
        } else if (btnOne.getText().equals("X") && btnFour.getText().equals("X") && btnSeven.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            X++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (X == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player X won");
                O = 0;
                X = 0;
            }
        } else if (btnOne.getText().equals("X") && btnFive.getText().equals("X") && btnNine.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            X++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (X == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player X won");
                O = 0;
                X = 0;
            }
        } else if (btnSeven.getText().equals("X") && btnFive.getText().equals("X") && btnThree.getText().equals("X")) {
            JOptionPane.showMessageDialog(this, "Player X wins");
            X++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (X == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player X won");
                O = 0;
                X = 0;
            }
        } else if (Draw == 9) {
            JOptionPane.showMessageDialog(this, "Draw");
            btnReset();
            Co = 1;
            Draw = 0;
        }

    }
    
    private void winO () {
        if (btnOne.getText().equals("O") && btnTwo.getText().equals("O") && btnThree.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            O++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (O == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player O won");
                O = 0;
                X = 0;
            }
        } else if (btnFour.getText().equals("O") && btnFive.getText().equals("O") && btnSix.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            O++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (O == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player O won");
                O = 0;
                X = 0;
            }
        } else if (btnSeven.getText().equals("O") && btnEight.getText().equals("O") && btnNine.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            O++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (O == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player O won");
                O = 0;
                X = 0;
            }
        } else if (btnOne.getText().equals("O") && btnFour.getText().equals("O") && btnSeven.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            O++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (O == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player O won");
                O = 0;
                X = 0;
            }
        } else if (btnOne.getText().equals("O") && btnFive.getText().equals("O") && btnNine.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            O++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (O == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player O won");
                O = 0;
                X = 0;
            }
        } else if (btnSeven.getText().equals("O") && btnFive.getText().equals("O") && btnThree.getText().equals("O")) {
            JOptionPane.showMessageDialog(this, "Player O wins");
            O++;
            Draw = 0;
            Co = 1;
            btnReset();
            if (O == 3) {
                lblXZero.setText(String.valueOf(X));
                lblOZero.setText(String.valueOf(O));
                JOptionPane.showMessageDialog(this, "Player O won");
                O = 0;
                X = 0;
            }
        } else if (Draw == 9) {
            JOptionPane.showMessageDialog(this, "Draw");
            btnReset();
            Co = 1;
            Draw = 0;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        panelBg = new javax.swing.JPanel();
        btnThree = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        lblS = new javax.swing.JLabel();
        lblX = new javax.swing.JLabel();
        lblO = new javax.swing.JLabel();
        lblXZero = new javax.swing.JLabel();
        lblOZero = new javax.swing.JLabel();
        btnInfo = new javax.swing.JButton();
        btnRules = new javax.swing.JButton();

        jButton13.setBackground(new java.awt.Color(204, 204, 204));
        jButton13.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N

        jButton14.setBackground(new java.awt.Color(204, 204, 204));
        jButton14.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N

        jButton15.setBackground(new java.awt.Color(204, 204, 204));
        jButton15.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TicTacToe");
        setBackground(new java.awt.Color(47, 54, 103));
        setResizable(false);

        panelBg.setBackground(new java.awt.Color(47, 54, 103));

        btnThree.setBackground(new java.awt.Color(255, 255, 255));
        btnThree.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });

        btnTwo.setBackground(new java.awt.Color(255, 255, 255));
        btnTwo.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });

        btnOne.setBackground(new java.awt.Color(255, 255, 255));
        btnOne.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });

        btnFour.setBackground(new java.awt.Color(255, 255, 255));
        btnFour.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });

        btnFive.setBackground(new java.awt.Color(255, 255, 255));
        btnFive.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });

        btnSix.setBackground(new java.awt.Color(255, 255, 255));
        btnSix.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });

        btnSeven.setBackground(new java.awt.Color(255, 255, 255));
        btnSeven.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });

        btnEight.setBackground(new java.awt.Color(255, 255, 255));
        btnEight.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });

        btnNine.setBackground(new java.awt.Color(255, 255, 255));
        btnNine.setFont(new java.awt.Font("Wide Latin", 1, 36)); // NOI18N
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });

        lblS.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblS.setForeground(new java.awt.Color(255, 255, 255));
        lblS.setText("Score:");

        lblX.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblX.setForeground(new java.awt.Color(255, 255, 255));
        lblX.setText("Player X:");

        lblO.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblO.setForeground(new java.awt.Color(255, 255, 255));
        lblO.setText("Player O:");

        lblXZero.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblXZero.setForeground(new java.awt.Color(255, 255, 255));
        lblXZero.setText("0");

        lblOZero.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        lblOZero.setForeground(new java.awt.Color(255, 255, 255));
        lblOZero.setText("0");

        btnInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnInfo.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        btnInfo.setText("Information");

        btnRules.setBackground(new java.awt.Color(255, 255, 255));
        btnRules.setFont(new java.awt.Font("Wide Latin", 1, 12)); // NOI18N
        btnRules.setText("Rules");

        javax.swing.GroupLayout panelBgLayout = new javax.swing.GroupLayout(panelBg);
        panelBg.setLayout(panelBgLayout);
        panelBgLayout.setHorizontalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                                .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                                .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBgLayout.createSequentialGroup()
                                .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(panelBgLayout.createSequentialGroup()
                        .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblS)
                            .addGroup(panelBgLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelBgLayout.createSequentialGroup()
                                        .addComponent(lblO)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblOZero))
                                    .addGroup(panelBgLayout.createSequentialGroup()
                                        .addComponent(lblX)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblXZero)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnRules, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelBgLayout.setVerticalGroup(
            panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnOne, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThree, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnFour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnFive, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSix, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSeven, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEight, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblS)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblX)
                    .addComponent(lblXZero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblO)
                    .addComponent(lblOZero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRules, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        if (Co % 2 == 0) {
            btnOne.setText("O");
        } else if (Co % 2 == 1) {
            btnOne.setText("X");
        }
        btnOne.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        if (Co % 2 == 0) {
            btnTwo.setText("O");
        } else if (Co % 2 == 1) {
            btnTwo.setText("X");
        }
        btnTwo.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        if (Co % 2 == 0) {
            btnThree.setText("O");
        } else if (Co % 2 == 1) {
            btnThree.setText("X");
        }
        btnThree.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        if (Co % 2 == 0) {
            btnFour.setText("O");
        } else if (Co % 2 == 1) {
            btnFour.setText("X");
        }
        btnFour.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        if (Co % 2 == 0) {
            btnFive.setText("O");
        } else if (Co % 2 == 1) {
            btnFive.setText("X");
        }
        btnFive.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        if (Co % 2 == 0) {
            btnSix.setText("O");
        } else if (Co % 2 == 1) {
            btnSix.setText("X");
        }
        btnSix.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        if (Co % 2 == 0) {
            btnSeven.setText("O");
        } else if (Co % 2 == 1) {
            btnSeven.setText("X");
        }
        btnSeven.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        if (Co % 2 == 0) {
            btnEight.setText("O");
        } else if (Co % 2 == 1) {
            btnEight.setText("X");
        }
        btnEight.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        if (Co % 2 == 0) {
            btnNine.setText("O");
        } else if (Co % 2 == 1) {
            btnNine.setText("X");
        }
        btnNine.setEnabled(false);
        btnInfo.setEnabled(false);
        btnRules.setEnabled(false);
        Co++;
        Draw++;
        winX();
        winO();
        settingAValue();
    }//GEN-LAST:event_btnNineActionPerformed

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
            java.util.logging.Logger.getLogger(frmTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmTic.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmTic().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnInfo;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnRules;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JLabel lblO;
    private javax.swing.JLabel lblOZero;
    private javax.swing.JLabel lblS;
    private javax.swing.JLabel lblX;
    private javax.swing.JLabel lblXZero;
    private javax.swing.JPanel panelBg;
    // End of variables declaration//GEN-END:variables
}
