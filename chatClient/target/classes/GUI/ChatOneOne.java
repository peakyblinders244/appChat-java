/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import chatClient.chatClient;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lhqua
 */
public class ChatOneOne extends javax.swing.JFrame {
    private chatClient client = null;
    private Socket socket = null;
    String userName = "";
    String nameFriend = "";
    String sms = "";
    /**
     * Creates new form ChatOneOne
     */
    public ChatOneOne(chatClient client, Socket socket,String nameFriend) throws IOException {
        this.client = client;
        this.socket = socket;
        this.userName = client.getNameUser();
        this.nameFriend = nameFriend;
        initComponents();
        readClient();
        guiThongTinChoServer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        danhSachTinNhan = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        layTinNhan = new javax.swing.JTextArea();
        gui = new javax.swing.JButton();
        icon = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        thoat = new javax.swing.JButton();

        jScrollPane2.setViewportView(jTextPane1);

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        danhSachTinNhan.setColumns(20);
        danhSachTinNhan.setRows(5);
        jScrollPane1.setViewportView(danhSachTinNhan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
        );

        layTinNhan.setColumns(20);
        layTinNhan.setRows(5);
        jScrollPane3.setViewportView(layTinNhan);

        gui.setText("Gửi");
        gui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guiActionPerformed(evt);
            }
        });

        icon.setText("Icon");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gui, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(icon, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(gui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(icon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        thoat.setText("Thoát");
        thoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thoatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(thoat, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(thoat)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
    }// </editor-fold>//GEN-END:initComponents

    private void guiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guiActionPerformed
        writeClient();
    }//GEN-LAST:event_guiActionPerformed

    private void thoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thoatActionPerformed
        try {
            new FormClient(client.getHost(), client.getPort(), userName).setVisible(true);
                    } catch (IOException ex) {
            Logger.getLogger(ChatOneOne.class.getName()).log(Level.SEVERE, null, ex);
        }
        dispose();
    }//GEN-LAST:event_thoatActionPerformed
    
     private void readClient() throws IOException{
        Thread thread = new Thread(){
            @Override
            public void run(){
                DataInputStream dis = null;
                
                try {
                    dis = new DataInputStream(socket.getInputStream());
                    while(true){
                        String sms = dis.readUTF();
                        System.out.println(sms);
                        StringTokenizer token = new StringTokenizer(sms);
                        String Format = token.nextToken();
                        System.out.println(Format);
                        switch(Format){
                            case "ChatOneOne":

                                String userFriend = token.nextToken();
                                String nameUser = token.nextToken();
                                String smsReceive = userFriend +": ";
                                while(token.hasMoreTokens()){
                                    smsReceive = smsReceive + token.nextToken();
                                  
                                }
                                smsReceive = smsReceive +"\n";
                                danhSachTinNhan.append(smsReceive);
                                System.out.println("ghi danh sach tin nhan");
                                break;
                            default:
                                System.out.println("loi One One");
                                    
                        }
                        
                    }
                } catch (IOException ex) {
                    Logger.getLogger(FormClient.class.getName()).log(Level.SEVERE, null, ex);
                    try {
                        dis.close();
                         socket.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(FormClient.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                   
                }
                
            }
        }; 
        thread.start();
    }
    
    private void writeClient(){
        Thread thread = new Thread(){
            @Override
            public void run(){
                DataOutputStream dos = null;
                //Scanner sc = null;
                try {
                    dos = new DataOutputStream(socket.getOutputStream());
                    sms = "ChatOneOne";
                    String tmp = layTinNhan.getText();
                    sms = sms + " " + userName + " " + nameFriend + " " + tmp;

                    if (!sms.equals("")) {
                        dos.writeUTF(sms);
                        sms = "";
                        layTinNhan.setText("");
                    }

                    
                    
                } catch (IOException ex) {
                    Logger.getLogger(FormClient.class.getName()).log(Level.SEVERE, null, ex);
                    try {
                        dos.close();
                         socket.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(FormClient.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
        };
        thread.start();
    }
    
    private void guiThongTinChoServer(){
        Thread thread = new Thread(){
            @Override
            public void run(){
                DataOutputStream dos = null;
                //Scanner sc = null;
                try {
                    dos = new DataOutputStream(socket.getOutputStream());
                    String thongtin = "ThongTin" + " " + userName;
                    dos.writeUTF(thongtin);
                    
                } catch (IOException ex) {
                    Logger.getLogger(FormClient.class.getName()).log(Level.SEVERE, null, ex);
                    try {
                        dos.close();
                         socket.close();
                    } catch (IOException ex1) {
                        Logger.getLogger(FormClient.class.getName()).log(Level.SEVERE, null, ex1);
                    }
                }
            }
            
        };
        thread.start();
    }
    /**
     * @param args the command line arguments
     */


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea danhSachTinNhan;
    private javax.swing.JButton gui;
    private javax.swing.JButton icon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTextArea layTinNhan;
    private javax.swing.JButton thoat;
    // End of variables declaration//GEN-END:variables
}