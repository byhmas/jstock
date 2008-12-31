/*
 * AboutJDialog.java
 *
 * Created on July 5, 2007, 1:01 AM
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 *
 * Copyright (C) 2008 Yan Cheng Cheok <yccheok@yahoo.com>
 */

package org.yccheok.jstock.gui;

import java.awt.Desktop;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import javax.swing.event.HyperlinkEvent;

/**
 *
 * @author  yccheok
 */
public class AboutJDialog extends javax.swing.JDialog {
    
    /** Creates new form AboutJDialog */
    public AboutJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
   }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("About JStock");
        setBackground(java.awt.Color.white);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/splash/jstock2-wording.png"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 0, 5));
        getContentPane().add(jLabel1, java.awt.BorderLayout.NORTH);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.SOUTH);

        jEditorPane1.setContentType("text/html");
        jEditorPane1.setEditable(false);
        jEditorPane1.setText("<html>\n<head>\n</head>\n    <body>\n        <p style=\"margin-top: 10; font-size: 9px; font-family: Tahoma;\">JStock is a stock analysis tool to help you pick stocks in an automated way.</p>\n        <p style=\"margin-top: 10; font-size: 9px; font-family: Tahoma;\">Copyright &copy; 2008 Yan Cheng Cheok <a href=\"mailto:yccheok@yahoo.com\">yccheok@yahoo.com</a></p>\n        <p style=\"margin-top: 10; font-size: 9px; font-family: Tahoma;\">Special thanks to <a href=\"http://www.iconblock.com/\">IconBlock</a>, for providing graphics design service.</p>\n        <p style=\"margin-top: 10; font-size: 9px; font-family: Tahoma;\">Chatting feature emotional icons and sounds are taken from GPLed software <a href=\"http://pidgin.im\">Pidgin 2.4.0</a></p>\n        <p style=\"margin-top: 10; font-size: 9px; font-family: Tahoma;\">Latest update can be downloaded from : <a href=\"http://sourceforge.net/projects/jstock\">http://sourceforge.net/projects/jstock</a></p>\n        <p style=\"margin-top: 10; font-size: 9px; font-family: Tahoma;\">This free software is licensed under : <a href=\"http://www.gnu.org/licenses/old-licenses/gpl-2.0.txt\">GNU General Public License, version 2</a></p>\n    </body>\n</html>");
        jEditorPane1.addHyperlinkListener(new javax.swing.event.HyperlinkListener() {
            public void hyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {
                jEditorPane1HyperlinkUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(jEditorPane1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-525)/2, (screenSize.height-636)/2, 525, 636);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jEditorPane1HyperlinkUpdate(javax.swing.event.HyperlinkEvent evt) {//GEN-FIRST:event_jEditorPane1HyperlinkUpdate
    // TODO add your handling code here:
        if (HyperlinkEvent.EventType.ACTIVATED.equals(evt.getEventType())) {
            URL url = evt.getURL();
            
            if(Desktop.isDesktopSupported())
            {
                Desktop desktop = Desktop.getDesktop();
                
                if(desktop.isSupported(Desktop.Action.BROWSE))
                {
                    if (url == null) {
						// www.yahoo.com considered an invalid URL. Hence, evt.getURL() returns null.
                        String string = "http://" + evt.getDescription();
                        try {
                            url = new URL(string);
                        } catch (MalformedURLException ex) {
                            return;
                        }
                    }

                    try {
                        desktop.browse(url.toURI());
                    }
                    catch (URISyntaxException ex) {                        
                    } 
                    catch (IOException ex) {                        
                    }
                }
            }
        }
    }//GEN-LAST:event_jEditorPane1HyperlinkUpdate
    
    private String getHeaderInfo() {
        String headerInfo = "<html>JStock - Stock Market Software<br><center><h4>version " + Utils.getApplicationVersionString() + "</h4></center></html>";
        return headerInfo;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
}
