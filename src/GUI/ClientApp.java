/*
 * Rakstits iepriekseja Java kura laika, sogad papildinats
 */
package GUI;

import Database.LatLotoDb;
import Kryo.KryoClient;
import Kryo.KryoServer;
import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Listener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author Elina
 */
public class ClientApp extends javax.swing.JPanel { 
    
    VariationGUI vtempGUI = new VariationGUI();
    ArrayList<VariationGUI> vList = new ArrayList<>();
    KryoClient kryoClient = null;
    KryoServer kryoServer = null;
    
    public ClientApp() {
        initComponents();       
        
        try {
            
            kryoClient = new KryoClient();
            kryoServer = new KryoServer();
            
            LatLotoDb db = new LatLotoDb();
        } catch (IOException ex) {
            Logger.getLogger(ClientApp.class.getName()).log(Level.SEVERE, null, ex);
        }
        
//        kryoClient.sendMessage("Test message to server");
        
    }

    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        
        jComboBox2 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jPanelTickets = new javax.swing.JPanel();
        SubmitButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        randomVariatonLabel = new javax.swing.JLabel();

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jList1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jList1KeyPressed(evt);
            }
        });
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        jLabel1.setText("Cik daudz variantu?");

        javax.swing.GroupLayout jPanelTicketsLayout = new javax.swing.GroupLayout(jPanelTickets);
        jPanelTickets.setLayout(jPanelTicketsLayout);
        jPanelTicketsLayout.setHorizontalGroup(
            jPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanelTicketsLayout.setVerticalGroup(
            jPanelTicketsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );

        SubmitButton.setText("Saglabāt");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });
        
        ClearButton.setText("Notīrīt");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        randomVariatonLabel.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 15)); // NOI18N
        randomVariatonLabel.setText("Izvēlies, kuru gribi ģenerēt automātiski");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelTickets, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                            .addComponent(SubmitButton)
                            .addComponent(ClearButton)
                            .addComponent(randomVariatonLabel))
                        .addGap(0, 1952, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(randomVariatonLabel)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SubmitButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClearButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTickets, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    
    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {
        DefaultListModel model = new DefaultListModel();
        jList1.setModel(model);
        jPanelTickets.removeAll();
        
        for(int i = 0; i < jComboBox2.getSelectedIndex(); i++) {
                
                vtempGUI = new VariationGUI();
                vList.add(vtempGUI);
                vtempGUI.setBounds(i*280, 10, 270, 270);
                jPanelTickets.add(vList.get(i));
            
            model.addElement(i + 1 + ". variant");
        }
        
        this.add(jPanelTickets);
        this.repaint();
        this.validate();
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt)  {//GEN-FIRST:event_SubmitButtonActionPerformed
        /**
         * Save selected numbers and show message box.
         */
        boolean isOk = false;
        for (int i = 0; i < vList.size(); i++) {
                if(vList.get(i).variation.selectedNumbers.size() < 5) {
                    System.out.println("Nav atzimeti visi 5 skaitli");
                    isOk = false;
                } else {
                    //kryoClient.sendTest("Sutam zinju uz serveri, sheit jasuta skaitli, tikai japartaisa packet klase, lai glabatu skaitljus");
                    System.out.println("it`s ok");
                    isOk = true;
                }
        }
        
        if(isOk) {
            JOptionPane.showMessageDialog(null, vList.size()+" variations submitted!");
//            KryoClient cl = new KryoClient();
            kryoClient.sendMessage(vList.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Please fill all of the variations!");
        }
    }//GEN-LAST:event_SubmitButtonActionPerformed
    
    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        /**
         * Clear selected variation numbers
         */
        
        DefaultListModel model = new DefaultListModel();
        jList1.setModel(model);
        vList.clear();
        jPanelTickets.removeAll();
        
        this.add(jPanelTickets);
        this.repaint();
        this.validate();
    }//GEN-LAST:event_ClearButtonActionPerformed
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
//        System.out.println("Test output");
        
        
    }//GEN-LAST:event_jList1ValueChanged

    private void jList1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jList1KeyPressed
        
    }//GEN-LAST:event_jList1KeyPressed

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        // TODO add your handling code here:
            vList.get(jList1.getSelectedIndex()).randomVariation();
            jPanelTickets.add(vList.get(jList1.getAnchorSelectionIndex())); 
    }//GEN-LAST:event_jList1MouseClicked

    public JList<String> getjList1() {
        return jList1;
    }

    public ArrayList<VariationGUI> getvList() {
        return vList;
    }

    public VariationGUI getVtempGUI() {
        return vtempGUI;
    }

    public JButton getSubmitButton() {
        return SubmitButton;
    }

    public JButton getClearButton() {
        return ClearButton;
    }

    public JComboBox<String> getjComboBox2() {
        return jComboBox2;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public JPanel getjPanelTickets() {
        return jPanelTickets;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public JLabel getRandomVariatonLabel() {
        return randomVariatonLabel;
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SubmitButton;
    private javax.swing.JButton ClearButton;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanelTickets;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel randomVariatonLabel;
    // End of variables declaration//GEN-END:variables
}
