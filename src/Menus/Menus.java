/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Menus;

import java.awt.Color;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author -----
 */
public class Menus extends javax.swing.JFrame {

    /**
     * Creates new form Menus
     */
    private final Icon nuevo;
    private final Icon abrir;
    private final Icon guardar;
    
    public Menus() {
        initComponents();
        nuevo = new ImageIcon("src/Imagenes/new.png");
        abrir = new ImageIcon("src/Imagenes/open.png");
        guardar = new ImageIcon("src/Imagenes/save.png");
    }

    private String nombreImagen () {
        String nombre = "geek-";
        
        nombre += chkBarbilla.isSelected()? "c" : "-";
        nombre += chkLentes.isSelected()? "g" : "-";
        nombre += chkCabello.isSelected()? "h" : "-";
        nombre += chkDientes.isSelected()? "t" : "-";
        
        return nombre + ".gif";
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dlgAbrir = new javax.swing.JFileChooser();
        dlgGuardar = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        pnlArchivo = new javax.swing.JPanel();
        lblArchivo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pnlColor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mmNuevo = new javax.swing.JMenuItem();
        mmAbrir = new javax.swing.JMenuItem();
        mmGuardar = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mmSalir = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        geekImage = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        chkBarbilla = new javax.swing.JCheckBoxMenuItem();
        chkCabello = new javax.swing.JCheckBoxMenuItem();
        chkLentes = new javax.swing.JCheckBoxMenuItem();
        chkDientes = new javax.swing.JCheckBoxMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        archivoNaranja = new javax.swing.JRadioButtonMenuItem();
        archivoAzul = new javax.swing.JRadioButtonMenuItem();
        archivoVerde = new javax.swing.JRadioButtonMenuItem();
        archivoAmarillo = new javax.swing.JRadioButtonMenuItem();
        jMenu5 = new javax.swing.JMenu();
        panelNaranja = new javax.swing.JRadioButtonMenuItem();
        panelAzul = new javax.swing.JRadioButtonMenuItem();
        panelVerde = new javax.swing.JRadioButtonMenuItem();
        panelAmarillo = new javax.swing.JRadioButtonMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mmAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlArchivo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jLabel1.setText("Archivo:");

        javax.swing.GroupLayout pnlArchivoLayout = new javax.swing.GroupLayout(pnlArchivo);
        pnlArchivo.setLayout(pnlArchivoLayout);
        pnlArchivoLayout.setHorizontalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlArchivoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 360, Short.MAX_VALUE))
        );
        pnlArchivoLayout.setVerticalGroup(
            pnlArchivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlArchivoLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addComponent(lblArchivo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlColor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout pnlColorLayout = new javax.swing.GroupLayout(pnlColor);
        pnlColor.setLayout(pnlColorLayout);
        pnlColorLayout.setHorizontalGroup(
            pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        pnlColorLayout.setVerticalGroup(
            pnlColorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 99, Short.MAX_VALUE)
        );

        jMenu1.setText("Archivo");

        mmNuevo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mmNuevo.setText("Nuevo");
        mmNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmNuevoActionPerformed(evt);
            }
        });
        jMenu1.add(mmNuevo);

        mmAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        mmAbrir.setText("Abrir");
        mmAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmAbrirActionPerformed(evt);
            }
        });
        jMenu1.add(mmAbrir);

        mmGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        mmGuardar.setText("Guardar");
        mmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmGuardarActionPerformed(evt);
            }
        });
        jMenu1.add(mmGuardar);
        jMenu1.add(jSeparator1);

        mmSalir.setText("Salir");
        mmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mmSalir);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Geek");

        geekImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/geek-----.gif"))); // NOI18N
        jMenu3.add(geekImage);
        jMenu3.add(jSeparator2);

        chkBarbilla.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.ALT_MASK));
        chkBarbilla.setText("Barbilla");
        chkBarbilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBarbillaActionPerformed(evt);
            }
        });
        jMenu3.add(chkBarbilla);

        chkCabello.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        chkCabello.setText("Cabello");
        chkCabello.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBarbillaActionPerformed(evt);
            }
        });
        jMenu3.add(chkCabello);

        chkLentes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.ALT_MASK));
        chkLentes.setText("Lentes");
        chkLentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBarbillaActionPerformed(evt);
            }
        });
        jMenu3.add(chkLentes);

        chkDientes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.ALT_MASK));
        chkDientes.setText("Dientes");
        chkDientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkBarbillaActionPerformed(evt);
            }
        });
        jMenu3.add(chkDientes);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Color de archivo");
        jMenu4.add(jSeparator3);

        buttonGroup1.add(archivoNaranja);
        archivoNaranja.setText("Naranja");
        archivoNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoNaranjaActionPerformed(evt);
            }
        });
        jMenu4.add(archivoNaranja);

        buttonGroup1.add(archivoAzul);
        archivoAzul.setText("Azul");
        archivoAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoAzulActionPerformed(evt);
            }
        });
        jMenu4.add(archivoAzul);

        buttonGroup1.add(archivoVerde);
        archivoVerde.setText("Verde");
        archivoVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoVerdeActionPerformed(evt);
            }
        });
        jMenu4.add(archivoVerde);

        buttonGroup1.add(archivoAmarillo);
        archivoAmarillo.setText("Amarillo");
        archivoAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                archivoAmarilloActionPerformed(evt);
            }
        });
        jMenu4.add(archivoAmarillo);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Color de panel");

        panelNaranja.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        buttonGroup2.add(panelNaranja);
        panelNaranja.setText("Naranja");
        panelNaranja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelNaranjaActionPerformed(evt);
            }
        });
        jMenu5.add(panelNaranja);

        panelAzul.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, 0));
        buttonGroup2.add(panelAzul);
        panelAzul.setText("Azul");
        panelAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelAzulActionPerformed(evt);
            }
        });
        jMenu5.add(panelAzul);

        panelVerde.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, 0));
        buttonGroup2.add(panelVerde);
        panelVerde.setText("Verde");
        panelVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelVerdeActionPerformed(evt);
            }
        });
        jMenu5.add(panelVerde);

        panelAmarillo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, 0));
        buttonGroup2.add(panelAmarillo);
        panelAmarillo.setText("Amarillo");
        panelAmarillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelAmarilloActionPerformed(evt);
            }
        });
        jMenu5.add(panelAmarillo);

        jMenuBar1.add(jMenu5);

        jMenu2.setText("Ayuda");

        mmAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mmAcercaDe.setText("Acerca de...");
        mmAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mmAcercaDeActionPerformed(evt);
            }
        });
        jMenu2.add(mmAcercaDe);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlArchivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlColor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlArchivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mmNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmNuevoActionPerformed
        JOptionPane.showMessageDialog(this, "Has creado un nuevo archivo con éxito", "Nuevo", JOptionPane.INFORMATION_MESSAGE, nuevo);
    }//GEN-LAST:event_mmNuevoActionPerformed

    private void mmAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmAbrirActionPerformed
        int opcion = dlgAbrir.showOpenDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(this, "Archivo abierto", "Abrir", JOptionPane.INFORMATION_MESSAGE, abrir);
            lblArchivo.setText(dlgAbrir.getSelectedFile().toString());
        }
    }//GEN-LAST:event_mmAbrirActionPerformed

    private void mmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_mmSalirActionPerformed

    private void mmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmGuardarActionPerformed
        int opcion = dlgGuardar.showSaveDialog(this);
        if (opcion == JFileChooser.APPROVE_OPTION) {
            JOptionPane.showMessageDialog(this, "El nuevo archivo se ha guardado", "Guardar", JOptionPane.INFORMATION_MESSAGE, guardar);
        }
    }//GEN-LAST:event_mmGuardarActionPerformed

    private void chkBarbillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkBarbillaActionPerformed
        geekImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(String.format("/Imagenes/%s", nombreImagen()))));
    }//GEN-LAST:event_chkBarbillaActionPerformed

    private void archivoNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoNaranjaActionPerformed
        pnlArchivo.setBackground(Color.orange);
    }//GEN-LAST:event_archivoNaranjaActionPerformed

    private void archivoAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoAzulActionPerformed
        pnlArchivo.setBackground(Color.blue);
    }//GEN-LAST:event_archivoAzulActionPerformed

    private void archivoVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoVerdeActionPerformed
        pnlArchivo.setBackground(Color.green);
    }//GEN-LAST:event_archivoVerdeActionPerformed

    private void archivoAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_archivoAmarilloActionPerformed
        pnlArchivo.setBackground(Color.yellow);
    }//GEN-LAST:event_archivoAmarilloActionPerformed

    private void panelNaranjaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelNaranjaActionPerformed
        pnlColor.setBackground(Color.orange);
    }//GEN-LAST:event_panelNaranjaActionPerformed

    private void panelAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelAzulActionPerformed
        pnlColor.setBackground(Color.blue);
    }//GEN-LAST:event_panelAzulActionPerformed

    private void panelVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelVerdeActionPerformed
        pnlColor.setBackground(Color.green);
    }//GEN-LAST:event_panelVerdeActionPerformed

    private void panelAmarilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelAmarilloActionPerformed
        pnlColor.setBackground(Color.yellow);
    }//GEN-LAST:event_panelAmarilloActionPerformed

    private void mmAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mmAcercaDeActionPerformed
        JOptionPane.showMessageDialog(this, "Este es una programa didáctico mostrando el funcionamiento de los componentes Menu y Menu Item");
    }//GEN-LAST:event_mmAcercaDeActionPerformed

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
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem archivoAmarillo;
    private javax.swing.JRadioButtonMenuItem archivoAzul;
    private javax.swing.JRadioButtonMenuItem archivoNaranja;
    private javax.swing.JRadioButtonMenuItem archivoVerde;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBoxMenuItem chkBarbilla;
    private javax.swing.JCheckBoxMenuItem chkCabello;
    private javax.swing.JCheckBoxMenuItem chkDientes;
    private javax.swing.JCheckBoxMenuItem chkLentes;
    private javax.swing.JFileChooser dlgAbrir;
    private javax.swing.JFileChooser dlgGuardar;
    private javax.swing.JMenuItem geekImage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JLabel lblArchivo;
    private javax.swing.JMenuItem mmAbrir;
    private javax.swing.JMenuItem mmAcercaDe;
    private javax.swing.JMenuItem mmGuardar;
    private javax.swing.JMenuItem mmNuevo;
    private javax.swing.JMenuItem mmSalir;
    private javax.swing.JRadioButtonMenuItem panelAmarillo;
    private javax.swing.JRadioButtonMenuItem panelAzul;
    private javax.swing.JRadioButtonMenuItem panelNaranja;
    private javax.swing.JRadioButtonMenuItem panelVerde;
    private javax.swing.JPanel pnlArchivo;
    private javax.swing.JPanel pnlColor;
    // End of variables declaration//GEN-END:variables
}
