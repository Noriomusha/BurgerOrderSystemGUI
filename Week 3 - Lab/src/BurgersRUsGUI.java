
import static java.awt.Color.gray;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;



/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**************************************************** 
Program Name: BurgersRUsGUI.java 
Programmer's Name: Edward Alvarado
Program Description: This is a GUI application that takes in parameters to order burgers
***********************************************************/
public class BurgersRUsGUI extends javax.swing.JFrame {

    // clas level references and attributes
    private double orderTotal;
    
    /**
     * Creates new form BurgersRUsGUI
     */
    public BurgersRUsGUI() {
        initComponents();
        //set to center of screen
        this.setLocationRelativeTo(null);
        this.setBackground(gray);
        orderTotal = 0.0;

    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgBurgers = new javax.swing.ButtonGroup();
        rdoSingle = new javax.swing.JRadioButton();
        rdoDouble = new javax.swing.JRadioButton();
        chkCheese = new javax.swing.JCheckBox();
        chkBacon = new javax.swing.JCheckBox();
        chkMeal = new javax.swing.JCheckBox();
        lblItemPrice = new javax.swing.JLabel();
        txtItemPrice = new javax.swing.JTextField();
        lblYourOrder = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaReceipt = new javax.swing.JTextArea();
        lblQuantity = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        lblOrderTotal = new javax.swing.JLabel();
        txtOrderTotal = new javax.swing.JTextField();
        jmbMainMenu = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mniExit = new javax.swing.JMenuItem();
        mnuOrder = new javax.swing.JMenu();
        mniAddToOrder = new javax.swing.JMenuItem();
        mniClearForNextItem = new javax.swing.JMenuItem();
        mniNewOrder = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Burger Barn");

        btgBurgers.add(rdoSingle);
        rdoSingle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdoSingle.setText("Single Burger");
        rdoSingle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoSingleActionPerformed(evt);
            }
        });

        btgBurgers.add(rdoDouble);
        rdoDouble.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        rdoDouble.setText("Double Burger");
        rdoDouble.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoDoubleActionPerformed(evt);
            }
        });

        chkCheese.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkCheese.setText("Add Cheese");
        chkCheese.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCheeseActionPerformed(evt);
            }
        });

        chkBacon.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkBacon.setText("Add Bacon");
        chkBacon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBaconActionPerformed(evt);
            }
        });

        chkMeal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        chkMeal.setText("Make It a Meal!");
        chkMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkMealActionPerformed(evt);
            }
        });

        lblItemPrice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblItemPrice.setText("Item Price:");

        txtItemPrice.setEditable(false);
        txtItemPrice.setBackground(new java.awt.Color(255, 255, 255));
        txtItemPrice.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtItemPrice.setText("0");

        lblYourOrder.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblYourOrder.setText("Your Order");

        txaReceipt.setEditable(false);
        txaReceipt.setColumns(20);
        txaReceipt.setRows(5);
        jScrollPane1.setViewportView(txaReceipt);

        lblQuantity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblQuantity.setText("Quantity:");
        lblQuantity.setToolTipText("");

        txtQuantity.setBackground(new java.awt.Color(255, 255, 255));
        txtQuantity.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtQuantity.setText("1");

        lblOrderTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblOrderTotal.setText("Order Total:");

        txtOrderTotal.setEditable(false);
        txtOrderTotal.setBackground(new java.awt.Color(255, 255, 255));
        txtOrderTotal.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        mnuFile.setText("File");

        mniExit.setText("Exit");
        mniExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniExitActionPerformed(evt);
            }
        });
        mnuFile.add(mniExit);

        jmbMainMenu.add(mnuFile);

        mnuOrder.setText("Order");

        mniAddToOrder.setText("Add To Order");
        mniAddToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniAddToOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mniAddToOrder);

        mniClearForNextItem.setText("Clear For Next Item");
        mniClearForNextItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniClearForNextItemActionPerformed(evt);
            }
        });
        mnuOrder.add(mniClearForNextItem);

        mniNewOrder.setText("New Order");
        mniNewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniNewOrderActionPerformed(evt);
            }
        });
        mnuOrder.add(mniNewOrder);

        jmbMainMenu.add(mnuOrder);

        setJMenuBar(jmbMainMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblOrderTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(lblItemPrice)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblQuantity)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chkMeal)
                            .addComponent(chkBacon)
                            .addComponent(chkCheese)
                            .addComponent(rdoDouble))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoSingle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblYourOrder)
                        .addGap(173, 173, 173))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoSingle)
                    .addComponent(lblYourOrder))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rdoDouble)
                        .addGap(18, 18, 18)
                        .addComponent(chkCheese)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(chkBacon)
                        .addGap(18, 18, 18)
                        .addComponent(chkMeal))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblItemPrice)
                        .addComponent(txtItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblQuantity, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtOrderTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblOrderTotal))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mniExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniExitActionPerformed
        // close application
        System.exit(0);
    }//GEN-LAST:event_mniExitActionPerformed

    private void rdoSingleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoSingleActionPerformed
        // adds price of single burger to total
        updateItemPrice();
    }//GEN-LAST:event_rdoSingleActionPerformed

    private void rdoDoubleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoDoubleActionPerformed
    // adds price of burger to total
        updateItemPrice();
    }//GEN-LAST:event_rdoDoubleActionPerformed

    private void chkCheeseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCheeseActionPerformed
    // adds price of burger to total
        updateItemPrice();
    }//GEN-LAST:event_chkCheeseActionPerformed

    private void chkBaconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBaconActionPerformed
        // adds price of burger to total
        updateItemPrice();
    }//GEN-LAST:event_chkBaconActionPerformed

    private void chkMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkMealActionPerformed
        // adds price of burger to total
        updateItemPrice();
    }//GEN-LAST:event_chkMealActionPerformed

    private void mniAddToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniAddToOrderActionPerformed
        // build the outpute line
        String outputLine = txtQuantity.getText();
        if(rdoSingle.isSelected())
            outputLine += " Single Burger";
        else outputLine += " Double Burger";
        
        if(chkCheese.isSelected())
            outputLine += " w/Cheese";
        if(chkBacon.isSelected())
            outputLine += " w/Bacon";
        if(chkMeal.isSelected())
            outputLine += " is a Meal";
        
        outputLine += " at ";
        outputLine += txtItemPrice.getText();
        outputLine += " each\n";
        
        txaReceipt.append(outputLine);     
                                               
        // update the orderTotal 
        int quantity = Integer.parseInt(txtQuantity.getText());
        double itemPrice = Double.parseDouble(txtItemPrice.getText());
        double linePrice = quantity * itemPrice;
        
        orderTotal += linePrice;
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        txtOrderTotal.setText(fmt.format(orderTotal));
           
    }//GEN-LAST:event_mniAddToOrderActionPerformed

    private void mniClearForNextItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniClearForNextItemActionPerformed
            clearForNextItem();
    }//GEN-LAST:event_mniClearForNextItemActionPerformed

    private void mniNewOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniNewOrderActionPerformed
        // TODO add your handling code here:
        clearForNextItem();
        txaReceipt.setText("");
        txtOrderTotal.setText("");
        orderTotal = 0.0;
    }//GEN-LAST:event_mniNewOrderActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(BurgersRUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BurgersRUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BurgersRUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BurgersRUsGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BurgersRUsGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgBurgers;
    private javax.swing.JCheckBox chkBacon;
    private javax.swing.JCheckBox chkCheese;
    private javax.swing.JCheckBox chkMeal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuBar jmbMainMenu;
    private javax.swing.JLabel lblItemPrice;
    private javax.swing.JLabel lblOrderTotal;
    private javax.swing.JLabel lblQuantity;
    private javax.swing.JLabel lblYourOrder;
    private javax.swing.JMenuItem mniAddToOrder;
    private javax.swing.JMenuItem mniClearForNextItem;
    private javax.swing.JMenuItem mniExit;
    private javax.swing.JMenuItem mniNewOrder;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenu mnuOrder;
    private javax.swing.JRadioButton rdoDouble;
    private javax.swing.JRadioButton rdoSingle;
    private javax.swing.JTextArea txaReceipt;
    private javax.swing.JTextField txtItemPrice;
    private javax.swing.JTextField txtOrderTotal;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables

    private void updateItemPrice() {
        double itemPrice = 0.0;
        
        //get the burger size
        if(rdoSingle.isSelected())
            itemPrice = 3.50;
        else if(rdoDouble.isSelected())
            itemPrice = 4.75;
        else
        {
            JOptionPane.showMessageDialog(this, "Burder type must be selected", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        //add charges for options
        if(chkCheese.isSelected())
            itemPrice += 0.50;
        if(chkBacon.isSelected())
            itemPrice += 1.25;
        if(chkMeal.isSelected())
            itemPrice += 4.0;
        
        //show the item price
        DecimalFormat fmt = new DecimalFormat("#,##0.00");
        txtItemPrice.setText(fmt.format(itemPrice));
        
                 
    }

    private void clearForNextItem() {
        // clears selections for next order
        btgBurgers.clearSelection();
        chkCheese.setSelected(false);
        chkBacon.setSelected(false);
        chkMeal.setSelected(false);
        txtItemPrice.setText("0");
        txtQuantity.setText("1");
    }
}
