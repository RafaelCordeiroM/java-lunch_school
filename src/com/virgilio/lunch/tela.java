package com.virgilio.lunch;


import java.util.Arrays;
import java.util.Random;
import javax.swing.JOptionPane;

public class tela extends javax.swing.JFrame {

 
    public tela() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnProximo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnAnterior = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtN = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtNT = new javax.swing.JTextPane();
        btnReset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnProximo.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("aakar", 0, 24)); // NOI18N
        jLabel3.setText("Numeros");

        btnAnterior.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnAnterior.setText("Anterior");
        btnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnteriorActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Abyssinica SIL", 1, 30)); // NOI18N
        jLabel4.setText("  E.E. Virgílio de Melo Franco");

        jSeparator3.setForeground(new java.awt.Color(1, 1, 1));

        txtN.setFont(new java.awt.Font("Ubuntu", 0, 150)); // NOI18N
        txtN.setForeground(new java.awt.Color(1, 1, 1));
        txtN.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtN.setEnabled(false);
        jScrollPane1.setViewportView(txtN);

        txtNT.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        txtNT.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtNT.setEnabled(false);
        jScrollPane2.setViewportView(txtNT);

        btnReset.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        btnReset.setText("Recomeçar");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 234, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(35, 35, 35)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(161, 161, 161))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnReset)
                .addGap(223, 223, 223))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 672, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(511, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 197, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(267, 267, 267))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProximo)
                    .addComponent(btnAnterior))
                .addGap(29, 29, 29)
                .addComponent(btnReset)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(223, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    telaSaida telaCliente = new telaSaida();
               
  
    public static int[] calcular(){
        
        machine number = new machine();
        number.ordem();
        int numero[] = number.getNumeros();
        

        
        return numero;
        
    }
    
    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed
        telaCliente.setVisible(true);
        txtN.setText(Integer.toString(numero[base]));
        if(base==300){
            JOptionPane.showMessageDialog(this,"Fim!!");
        }
        else{
        for(int i =0;i<=base;i++){
            
            num1 +=numero[i] + " , ";
            
        }
        num = num1;
        num1 = "";
            
        txtNT.setText(num);
        
        telaCliente.setNum(Integer.toString(numero[base]),num);
       
       
        

        base++;
        }

    }//GEN-LAST:event_btnProximoActionPerformed

    private void btnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnteriorActionPerformed
         --base;
         
         txtN.setText(Integer.toString(numero[base]));
        
         for(int i =0;i<=base;i++){
            
            num1 +=numero[i] + " , ";
            
        }
        num = num1;
        num1 = "";
         telaCliente.setNum(Integer.toString(numero[base]) ,num);
         
        txtNT.setText(num);
      
        
    }//GEN-LAST:event_btnAnteriorActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnResetActionPerformed
       
 
    String num="";
    String num1="";
    
    
    int base = 0;
    
    int numero[] = calcular();
    
    
    
    public static void main(String args[]) {
        
      
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
                
                
            }
        });
    }
 
 
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnReset;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextPane txtN;
    private javax.swing.JTextPane txtNT;
    // End of variables declaration//GEN-END:variables
}
