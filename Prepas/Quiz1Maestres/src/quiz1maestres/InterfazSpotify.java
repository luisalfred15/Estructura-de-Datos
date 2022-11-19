/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quiz1maestres;

import javax.swing.JOptionPane;

/**
 *
 * @author luisa
 */
public class InterfazSpotify extends javax.swing.JFrame {

    ListaSpotify playlist;
    
    /**
     * Creates new form UIListaSimple
     */
    public InterfazSpotify() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.playlist = new ListaSpotify();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        filtrarArtista = new javax.swing.JButton();
        cargarPlaylist = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        inputPlaylist = new javax.swing.JTextArea();
        inputArtista = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        inputCancion = new javax.swing.JTextField();
        buscarCancion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Spotify");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 49, 40));

        jLabel2.setText("Cargar playlist");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        jLabel6.setText("Filtrar la playlist por artista");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        filtrarArtista.setText("Filtrar");
        filtrarArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filtrarArtistaActionPerformed(evt);
            }
        });
        jPanel1.add(filtrarArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        cargarPlaylist.setText("Cargar");
        cargarPlaylist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargarPlaylistActionPerformed(evt);
            }
        });
        jPanel1.add(cargarPlaylist, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, -1, -1));

        inputPlaylist.setColumns(20);
        inputPlaylist.setRows(5);
        jScrollPane3.setViewportView(inputPlaylist);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, 80));

        inputArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputArtistaActionPerformed(evt);
            }
        });
        jPanel1.add(inputArtista, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 170, -1));

        jLabel7.setText("Buscar cancion");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        inputCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputCancionActionPerformed(evt);
            }
        });
        jPanel1.add(inputCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 200, -1));

        buscarCancion.setText("Buscar");
        buscarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarCancionActionPerformed(evt);
            }
        });
        jPanel1.add(buscarCancion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargarPlaylistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargarPlaylistActionPerformed
        playlist.agregarCanciones(inputPlaylist.getText().toUpperCase());
        inputPlaylist.setText("");
        
    }//GEN-LAST:event_cargarPlaylistActionPerformed

    private void filtrarArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filtrarArtistaActionPerformed
        String artista = inputArtista.getText();
        String infoCanciones = this.playlist.filtrarPorArtista(artista.toUpperCase());
        JOptionPane.showMessageDialog(this, infoCanciones);
    }//GEN-LAST:event_filtrarArtistaActionPerformed

    private void inputArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputArtistaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputArtistaActionPerformed

    private void inputCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputCancionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputCancionActionPerformed

    private void buscarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarCancionActionPerformed
        String nombreCancion = inputCancion.getText();
        String infoCancion = this.playlist.buscarCancion(nombreCancion.toUpperCase());
        JOptionPane.showMessageDialog(this, infoCancion);
    }//GEN-LAST:event_buscarCancionActionPerformed

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
            java.util.logging.Logger.getLogger(InterfazSpotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazSpotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazSpotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazSpotify.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazSpotify().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarCancion;
    private javax.swing.JButton cargarPlaylist;
    private javax.swing.JButton filtrarArtista;
    private javax.swing.JTextField inputArtista;
    private javax.swing.JTextField inputCancion;
    private javax.swing.JTextArea inputPlaylist;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables
}
