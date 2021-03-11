/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
/**
 *
 * @author fer_c
 */
public class Listado extends javax.swing.JFrame {
    
    /** Creates new form Listado */
    public Listado() {
        initComponents();
        //centrado en el monitor
        this.setLocationRelativeTo(null);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        skins = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lista = new javax.swing.JList();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        hombres = new javax.swing.JCheckBox();
        mujeres = new javax.swing.JCheckBox();
        movil = new javax.swing.JCheckBox();
        fijo = new javax.swing.JCheckBox();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jSeparator1 = new javax.swing.JSeparator();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jButton1.setText("Agregar Contacto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lista);

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        hombres.setSelected(true);
        hombres.setText("Hombres");
        hombres.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        hombres.setMargin(new java.awt.Insets(0, 0, 0, 0));
        hombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hombresActionPerformed(evt);
            }
        });

        mujeres.setSelected(true);
        mujeres.setText("Mujeres");
        mujeres.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        mujeres.setMargin(new java.awt.Insets(0, 0, 0, 0));
        mujeres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mujeresActionPerformed(evt);
            }
        });

        movil.setSelected(true);
        movil.setText("M\u00f3vil");
        movil.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        movil.setMargin(new java.awt.Insets(0, 0, 0, 0));
        movil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                movilActionPerformed(evt);
            }
        });

        fijo.setSelected(true);
        fijo.setText("Fijo");
        fijo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        fijo.setMargin(new java.awt.Insets(0, 0, 0, 0));
        fijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fijoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(hombres)
                    .addComponent(mujeres))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fijo)
                    .addComponent(movil))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hombres)
                    .addComponent(fijo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mujeres)
                    .addComponent(movil))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Filtrado", jPanel3);

        jLabel1.setText("Buscar en listado");

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 12));
        jLabel2.setText("nombre, fono, numero");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jTabbedPane1.addTab("Buscar", jPanel4);

        jTabbedPane1.getAccessibleContext().setAccessibleName("Filtrar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
        );

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel3.setText("Skin");

        skins.add(jRadioButton1);
        jRadioButton1.setText("Metal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        skins.add(jRadioButton2);
        jRadioButton2.setText("Motif");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        skins.add(jRadioButton3);
        jRadioButton3.setText("Windows");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jRadioButton3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton1))
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addComponent(jButton1)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 439, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(39, 39, 39)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton1))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
// TODO add your handling code here:
        //cambiar LAF
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception excep) {
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
// TODO add your handling code here:
        //cambiar LAF
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception excep) {
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
// TODO add your handling code here:
        //cambiar LAF
        try {
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
            SwingUtilities.updateComponentTreeUI(this);
        } catch (Exception excep) {
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed
    
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
// TODO add your handling code here:
        //limpiar textfield
        txtBuscar.setText("");
        //refrescar listado
        mostrarContactos();
    }//GEN-LAST:event_jTabbedPane1MouseClicked
    
    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
// TODO add your handling code here:
        buscar();
    }//GEN-LAST:event_txtBuscarKeyReleased
    
    private void movilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_movilActionPerformed
// TODO add your handling code here:
        mostrarContactos();
    }//GEN-LAST:event_movilActionPerformed
    
    private void fijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fijoActionPerformed
// TODO add your handling code here:
        mostrarContactos();
    }//GEN-LAST:event_fijoActionPerformed
    
    private void mujeresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mujeresActionPerformed
// TODO add your handling code here:
        mostrarContactos();
    }//GEN-LAST:event_mujeresActionPerformed
    
    private void hombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hombresActionPerformed
// TODO add your handling code here:
        mostrarContactos();
    }//GEN-LAST:event_hombresActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
// TODO add your handling code here:
        //ocultar esta ventana
        this.setVisible(false);
        //instanciar Agregar, para a�adir contacto
        new Agregar().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(List agenda) {
        
    }
    
    
    
    
    
    void buscar(){
        //Si textfield vacio recargamos agenda
        if(txtBuscar.getText().length()==0){
            mostrarContactos();
        } else{
            Iterator it = MiAgenda.getContactosIterador();
            DefaultListModel newmodelo= new DefaultListModel(), modelo= new DefaultListModel();
            //cargamos datos de agenda para filtrar
            while (it.hasNext()) {
                String contacto[]=(String[]) it.next();
                modelo.addElement(contacto[0]+" "+contacto[1]+" | "+contacto[3]+" | "+contacto[4]+"|"+contacto[5]);
            }
            //nuevo modelo luego de filtrar
            String res = null;
            for(int i=0;i<modelo.getSize();i++){
                res = modelo.get(i).toString();
                if(res.contains(txtBuscar.getText())){
                    newmodelo.addElement(res);
                }
            }
            //limpiar lista para mostrarla filtrada
            lista.removeAll();
            //llenar lista con nuevos valores
            lista.setModel(newmodelo);
        }
    }
    
    public static void mostrarContactos(){
        //limpiar lista para mostrarla filtrada
        lista.removeAll();
        DefaultListModel modelo = new DefaultListModel();
          Iterator  i = MiAgenda.getContactosIterador();
        String genero = null, fono= null;
        int queGenero=0, queFono=0;
        //usamos flags para filtrar por gereno y fono
        if(hombres.isSelected()){
            queGenero++;
        }
        if(mujeres.isSelected()){
            queGenero--;
        }
        if(fijo.isSelected()){
            queFono++;
        }
        if(movil.isSelected()){
            queFono--;
        }
        switch(queFono){
            case 1:
                fono="Fijo";
                break;
            case -1:
                fono="Celular";
                break;
            case 0:
                fono="todos";
                break;
        }
        switch(queGenero){
            case 1:
                genero="Masculino";
                break;
            case -1:
                genero="Femenino";
                break;
            case 0:
                genero="todos";
                break;
        }
        //consultamos por cada item que hay en el agenda
        while (i.hasNext()) {
            String contacto[]=(String[]) i.next();
            if(fono.compareTo("todos")!=0){
                if(fono.compareTo(contacto[3])==0){
                    if(genero.compareTo("todos")!=0){
                        if(genero.compareTo(contacto[2])==0){
                            modelo.addElement(contacto[0]+" "+contacto[1]+" | "+contacto[3]+" | "+contacto[4]+"|"+contacto[5]);
                        }
                    } else{
                        modelo.addElement(contacto[0]+" "+contacto[1]+" | "+contacto[3]+" | "+contacto[4]+"|"+contacto[5]);
                    }
                }
            } else{
                if(genero.compareTo("todos")!=0){
                    if(genero.compareTo(contacto[2])==0){
                        modelo.addElement(contacto[0]+" "+contacto[1]+" | "+contacto[3]+" | "+contacto[4]+"|"+contacto[5]);
                    }
                } else{
                    modelo.addElement(contacto[0]+" "+contacto[1]+" | "+contacto[3]+" | "+contacto[4]+"|"+contacto[5]);
                }
            }
        }
        //asignamos los valores a JList
        lista.setModel(modelo);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JCheckBox fijo;
    private static javax.swing.JCheckBox hombres;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTabbedPane jTabbedPane1;
    public static javax.swing.JList lista;
    private static javax.swing.JCheckBox movil;
    private static javax.swing.JCheckBox mujeres;
    private javax.swing.ButtonGroup skins;
    private static javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
    
}