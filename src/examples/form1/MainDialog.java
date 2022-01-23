package examples.form1;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author davibern
 * @version 1.0
 */
public class MainDialog extends javax.swing.JDialog {

    /**
     * Creates new form MainDialog
     */
    public MainDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        centraTextoEtiqueta();
        this.jLabelStreaming.setVisible(false);
        this.jTextFieldStreaming.setVisible(false);
    }
    
    /**
     * Method to align center label
     */
    private void centraTextoEtiqueta() {
        this.jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        this.jLabel1.setVerticalAlignment(SwingConstants.CENTER);
    }
    
    /**
     * Method to validate the form
     * @return False if the form is blank or true is form is complete
     */
    private boolean isConfirm() {
        String nombre = this.jTextFieldNombre.getText();
        String apellido = this.jTextFieldApellidos.getText();
        String email = this.jTextFieldEmail.getText();
        String fecha = this.jTextFieldFechaAlta.getText();
        String streaming = this.jTextFieldStreaming.getText();
        boolean colorRojo = this.jRadioButtonRojo.isSelected();
        boolean colorAmarillo = this.jRadioButtonAmarillo.isSelected();
        boolean colorMorado = this.jRadioButtonMorado.isSelected();
        boolean colorNegro = this.jRadioButtonNegro.isSelected();
        boolean colorRosa = this.jRadioButtonRosa.isSelected();
        boolean colorVerde = this.jRadioButtonVerde.isSelected();
        boolean colorAzul = this.jRadioButtonAzul.isSelected();
        boolean baloncesto  = this.jCheckBoxBaloncesto.isSelected();
        boolean balonmano = this.jCheckBoxBalonmano.isSelected();
        boolean formula = this.jCheckBoxFormula1.isSelected();
        boolean futbol = this.jCheckBoxFutbol.isSelected();
        boolean padel = this.jCheckBoxPadel.isSelected();
        boolean tenis = this.jCheckBoxTenis.isSelected();
        
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo nombre está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (apellido.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo apellido está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (email.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo email está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (fecha.isEmpty()) {
            JOptionPane.showMessageDialog(this, "El campo fecha alta está vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!colorRojo && !colorAmarillo && !colorMorado && !colorNegro && !colorRosa && !colorVerde && !colorAzul) {
            JOptionPane.showMessageDialog(this, "Selecciona un color favorito.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (!baloncesto && !balonmano && !formula && !futbol && !padel && !tenis) {
            JOptionPane.showMessageDialog(this, "Selecciona un deporte favorito.", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if (this.jRadioButtonStreamingSi.isSelected()) {
            if (streaming.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hay que indicar un servicio de streaming", "Error", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupColores = new javax.swing.ButtonGroup();
        buttonGroupStreaming = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldApellidos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jSliderEdad = new javax.swing.JSlider();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldFechaAlta = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonRojo = new javax.swing.JRadioButton();
        jRadioButtonVerde = new javax.swing.JRadioButton();
        jRadioButtonAzul = new javax.swing.JRadioButton();
        jRadioButtonNegro = new javax.swing.JRadioButton();
        jRadioButtonAmarillo = new javax.swing.JRadioButton();
        jRadioButtonMorado = new javax.swing.JRadioButton();
        jRadioButtonRosa = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jCheckBoxFutbol = new javax.swing.JCheckBox();
        jCheckBoxBaloncesto = new javax.swing.JCheckBox();
        jCheckBoxFormula1 = new javax.swing.JCheckBox();
        jCheckBoxTenis = new javax.swing.JCheckBox();
        jCheckBoxBalonmano = new javax.swing.JCheckBox();
        jCheckBoxPadel = new javax.swing.JCheckBox();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jComboBoxCoches = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jComboBoxMotos = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel7 = new javax.swing.JPanel();
        jButtonAceptar = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jRadioButtonStreamingSi = new javax.swing.JRadioButton();
        jRadioButtonStreamingNo = new javax.swing.JRadioButton();
        jLabelStreaming = new javax.swing.JLabel();
        jTextFieldStreaming = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setBackground(new java.awt.Color(204, 204, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setText("Formulario de Ejemplo 1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setLayout(new java.awt.GridLayout(5, 2));

        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2);
        jPanel2.add(jTextFieldNombre);

        jLabel3.setText("Apellidos");
        jPanel2.add(jLabel3);
        jPanel2.add(jTextFieldApellidos);

        jLabel4.setText("Correo electrónico");
        jPanel2.add(jLabel4);
        jPanel2.add(jTextFieldEmail);

        jLabel5.setText("Edad");
        jPanel2.add(jLabel5);

        jSliderEdad.setMaximum(120);
        jSliderEdad.setMinimum(18);
        jSliderEdad.setMinorTickSpacing(10);
        jSliderEdad.setPaintLabels(true);
        jSliderEdad.setPaintTicks(true);
        jSliderEdad.setSnapToTicks(true);
        jSliderEdad.setValueIsAdjusting(true);
        jPanel2.add(jSliderEdad);

        jLabel9.setText("Fecha de alta");
        jPanel2.add(jLabel9);
        jPanel2.add(jTextFieldFechaAlta);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(102, 102, 255))); // NOI18N

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Color Preferido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(0, 0, 153))); // NOI18N
        jPanel4.setLayout(new javax.swing.BoxLayout(jPanel4, javax.swing.BoxLayout.LINE_AXIS));

        buttonGroupColores.add(jRadioButtonRojo);
        jRadioButtonRojo.setText("Rojo");
        jPanel4.add(jRadioButtonRojo);

        buttonGroupColores.add(jRadioButtonVerde);
        jRadioButtonVerde.setText("Verde");
        jPanel4.add(jRadioButtonVerde);

        buttonGroupColores.add(jRadioButtonAzul);
        jRadioButtonAzul.setText("Azul");
        jPanel4.add(jRadioButtonAzul);

        buttonGroupColores.add(jRadioButtonNegro);
        jRadioButtonNegro.setText("Negro");
        jPanel4.add(jRadioButtonNegro);

        buttonGroupColores.add(jRadioButtonAmarillo);
        jRadioButtonAmarillo.setText("Amarillo");
        jPanel4.add(jRadioButtonAmarillo);

        buttonGroupColores.add(jRadioButtonMorado);
        jRadioButtonMorado.setText("Morado");
        jPanel4.add(jRadioButtonMorado);

        buttonGroupColores.add(jRadioButtonRosa);
        jRadioButtonRosa.setText("Rosa");
        jPanel4.add(jRadioButtonRosa);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Deportes Favoritos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(51, 0, 204))); // NOI18N
        jPanel5.setLayout(new javax.swing.BoxLayout(jPanel5, javax.swing.BoxLayout.LINE_AXIS));

        jCheckBoxFutbol.setText("Fútbol");
        jPanel5.add(jCheckBoxFutbol);

        jCheckBoxBaloncesto.setText("Baloncesto");
        jPanel5.add(jCheckBoxBaloncesto);

        jCheckBoxFormula1.setText("Fórmula 1");
        jPanel5.add(jCheckBoxFormula1);

        jCheckBoxTenis.setText("Tenis");
        jPanel5.add(jCheckBoxTenis);

        jCheckBoxBalonmano.setText("Balonmano");
        jPanel5.add(jCheckBoxBalonmano);

        jCheckBoxPadel.setText("Pádel");
        jPanel5.add(jCheckBoxPadel);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecciones", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 153, 0))); // NOI18N

        jLabel6.setText("Número de coches");

        jComboBoxCoches.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel7.setText("Número de motos");

        jComboBoxMotos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel8.setText("Número de aviones");

        jSpinner1.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCoches, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(jSpinner1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jComboBoxMotos, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBoxCoches, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxMotos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonAceptar.setText("Aceptar");
        jButtonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAceptarActionPerformed(evt);
            }
        });

        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jButtonAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAceptar)
                    .addComponent(jButtonSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel10.setText("¿Tienes suscripción por streaming?");

        buttonGroupStreaming.add(jRadioButtonStreamingSi);
        jRadioButtonStreamingSi.setText("Sí");
        jRadioButtonStreamingSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStreamingSiActionPerformed(evt);
            }
        });

        buttonGroupStreaming.add(jRadioButtonStreamingNo);
        jRadioButtonStreamingNo.setText("No");
        jRadioButtonStreamingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonStreamingNoActionPerformed(evt);
            }
        });

        jLabelStreaming.setText("Indica cuáles");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonStreamingSi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jRadioButtonStreamingNo)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabelStreaming)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextFieldStreaming)))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jRadioButtonStreamingSi)
                    .addComponent(jRadioButtonStreamingNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStreaming)
                    .addComponent(jTextFieldStreaming, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Method to exit
     * @param evt 
     */
    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonSalirActionPerformed
    
    /**
     * Method to confirm
     * @param evt 
     */
    private void jButtonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAceptarActionPerformed
       if (this.isConfirm()) {
           JOptionPane.showMessageDialog(this, "Validado");
       }
    }//GEN-LAST:event_jButtonAceptarActionPerformed

    private void jRadioButtonStreamingSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStreamingSiActionPerformed
        if (this.jRadioButtonStreamingSi.isSelected()) {
            this.jLabelStreaming.setVisible(true);
            this.jTextFieldStreaming.setVisible(true);
        }
    }//GEN-LAST:event_jRadioButtonStreamingSiActionPerformed

    private void jRadioButtonStreamingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonStreamingNoActionPerformed
        if (this.jRadioButtonStreamingNo.isSelected()) {
            this.jLabelStreaming.setVisible(false);
            this.jTextFieldStreaming.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButtonStreamingNoActionPerformed

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
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainDialog dialog = new MainDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupColores;
    private javax.swing.ButtonGroup buttonGroupStreaming;
    private javax.swing.JButton jButtonAceptar;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JCheckBox jCheckBoxBaloncesto;
    private javax.swing.JCheckBox jCheckBoxBalonmano;
    private javax.swing.JCheckBox jCheckBoxFormula1;
    private javax.swing.JCheckBox jCheckBoxFutbol;
    private javax.swing.JCheckBox jCheckBoxPadel;
    private javax.swing.JCheckBox jCheckBoxTenis;
    private javax.swing.JComboBox jComboBoxCoches;
    private javax.swing.JComboBox jComboBoxMotos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelStreaming;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JRadioButton jRadioButtonAmarillo;
    private javax.swing.JRadioButton jRadioButtonAzul;
    private javax.swing.JRadioButton jRadioButtonMorado;
    private javax.swing.JRadioButton jRadioButtonNegro;
    private javax.swing.JRadioButton jRadioButtonRojo;
    private javax.swing.JRadioButton jRadioButtonRosa;
    private javax.swing.JRadioButton jRadioButtonStreamingNo;
    private javax.swing.JRadioButton jRadioButtonStreamingSi;
    private javax.swing.JRadioButton jRadioButtonVerde;
    private javax.swing.JSlider jSliderEdad;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextFieldApellidos;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFechaAlta;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldStreaming;
    // End of variables declaration//GEN-END:variables
}
