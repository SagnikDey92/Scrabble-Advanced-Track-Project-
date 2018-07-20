/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trial1;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author Sagnik Dey
 */
public class Scrabble extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form Scrabble
     */
    Trie Tester=new Trie();
    ImageIcon Tileimg[]=new ImageIcon[27];
    String selected="";
    JButton Tile[][]=new JButton[15][15];
    JButton RTile[]=new JButton[7];
    public Scrabble() throws IOException {
        for(int i=0;i<26;++i)
        {
            if(i<8)
            {Tileimg[i]=new ImageIcon(getClass().getResource("/Tiles/scrabble-banner-0"+(i+2)+".png"));}
            else
            {Tileimg[i]=new ImageIcon(getClass().getResource("/Tiles/scrabble-banner-"+(i+2)+".png"));}   
        }
        Tileimg[26]=new ImageIcon(getClass().getResource("/Tiles/scrabble-banner-28.png"));
        initComponents();
        Board.setBackground(new Color(168,116,38));
        getContentPane().setBackground(new Color(66,140,64));
        Tester.insert();
        //Tester.insert();
        Board.setLayout(new GridLayout(15,15));
        Rack.setLayout(new GridLayout(1,7));
        for(int i=0;i<15;++i)
        {
            for(int j=0;j<15;++j)
            {
                Tile[i][j]=new JButton();
                Tile[i][j].setVisible(true);
                Tile[i][j].addActionListener(this);
                Tile[i][j].setBackground(new Color(209,149,58));
                Tile[i][j].setFont(new Font("Arial", Font.PLAIN, 13));
                Tile[i][j].setText("");
                Board.add(Tile[i][j]);
            }
        }
       for(int i=0;i<7;++i)
        {
            RTile[i]=new JButton();
            RTile[i].setVisible(true);
            RTile[i].setSize(91, 91);
            RTile[i].addActionListener(this);
            RTile[i].setFont(new Font("Arial", Font.PLAIN, 35));
            RTile[i].setText("");
            Rack.add(RTile[i]);
        }
       
        RTile[0].setText("A");
        RTile[1].setText("B");
        RTile[2].setText("C");
        RTile[3].setText("G");
        RTile[4].setText("Z");
        RTile[5].setText("X");
        RTile[6].setText("T");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Board = new javax.swing.JPanel();
        Rack = new javax.swing.JPanel();
        accept = new javax.swing.JButton();
        pass = new javax.swing.JButton();
        cdic = new javax.swing.JButton();
        selectile = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 51));
        setResizable(false);

        javax.swing.GroupLayout BoardLayout = new javax.swing.GroupLayout(Board);
        Board.setLayout(BoardLayout);
        BoardLayout.setHorizontalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BoardLayout.setVerticalGroup(
            BoardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout RackLayout = new javax.swing.GroupLayout(Rack);
        Rack.setLayout(RackLayout);
        RackLayout.setHorizontalGroup(
            RackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 588, Short.MAX_VALUE)
        );
        RackLayout.setVerticalGroup(
            RackLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );

        accept.setText("Accept");
        accept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptActionPerformed(evt);
            }
        });

        pass.setText("Pass");
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        cdic.setText("Check Dictionary");

        selectile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/scrabble-banner-28.png"))); // NOI18N

        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(selectile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(66, 66, 66)
                        .addComponent(cdic)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(Rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(434, 434, 434))))
            .addGroup(layout.createSequentialGroup()
                .addGap(391, 391, 391)
                .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(89, 89, 89))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(93, 93, 93)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cdic, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(Rack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(selectile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    int xstart=0;
    int ystart=0;
    boolean alongRow;
    boolean checkAcceptable()
    {
        xstart=0;
        ystart=0;
        boolean flg=false;
        alongRow=true;
        for(int i=0;i<15;++i)
            for(int j=0;j<15;++j)
            {
                if(Tile[i][j].isEnabled()&&!Tile[i][j].getText().equals(""))
                {
                    xstart=j;
                    ystart=i;
                    flg=true;
                    for(int k=ystart+1;k<15;++k)
                    {
                        if(Tile[k][xstart].isEnabled()&&!Tile[k][xstart].getText().equals(""))
                        {
                            alongRow=false;
                            break;
                        }
                    }
                    break;
                }
                if(flg)
                    break;
            }
        if(alongRow)
        {
            for(int i=0;i<15;++i)
                for(int j=0;j<15;++j)
                {
                    if(i!=ystart&&Tile[i][j].isEnabled()&&!Tile[i][j].getText().equals(""))
                        return false;
                }
        }
        else
        {
            for(int i=0;i<15;++i)
                for(int j=0;j<15;++j)
                {
                    if(j!=xstart&&Tile[i][j].isEnabled()&&!Tile[i][j].getText().equals(""))
                        return false;
                }
        }
        for(int i=0;i<15;++i)
            for(int j=0;j<15;++j)
            {
                
            }
        return true;  
    };
    
    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        if(checkAcceptable())
        {
            String word="";
            if(alongRow)
            {
                for(int i=xstart;i<15&&!Tile[ystart][i].getText().equals("");++i)
                {
                    word=word+Tile[ystart][i].getText();
                }
            }
            else
            {
                for(int i=ystart;i<15&&!Tile[i][xstart].getText().equals("");++i)
                {
                    word=word+Tile[i][xstart].getText();
                }
            }
            jLabel1.setText(word);
            if(Tester.search(word))
                jLabel2.setText("true");
            else
                jLabel2.setText("false");
            /*checkValidWord();
            addScore();
            disableTiles();
            */
        }    
        else
           System.exit(0);
    }//GEN-LAST:event_acceptActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Scrabble.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Scrabble().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Scrabble.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Board;
    private javax.swing.JPanel Rack;
    private javax.swing.JButton accept;
    private javax.swing.JButton cdic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton pass;
    private javax.swing.JLabel selectile;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        boolean foundsource=false;
        for(int i=0;i<7;++i)
        {
            if(foundsource)
                break;
            if(e.getSource().equals(RTile[i]))
            {
                foundsource=true;
                if(selected.equals(""))
                {
                    selected=RTile[i].getText();
                    RTile[i].setText(""); 
                }
                else
                {
                    String temp=selected;
                    selected=RTile[i].getText();
                    RTile[i].setText(temp);
                }
            }    
        }
        for(int i=0;i<15;++i)
        {
            if(foundsource)
                break;
            for(int j=0;j<15;++j)
            {
                if(foundsource)
                    break;
                if(e.getSource().equals(Tile[i][j]))
                {
                    foundsource=true;
                    if(selected.equals("")&&!Tile[i][j].getText().equals(""))
                    {
                        selected=Tile[i][j].getText();
                        Tile[i][j].setText("");
                    }
                    else if(selected.equals("")||Tile[i][j].getText().equals(""))
                    {
                        Tile[i][j].setText(selected);
                        selected="";
                    }
                }
            }
        }
        if(selected.equals(""))
            selectile.setIcon(Tileimg[26]);
        else
        {
           int index;
           index=(int)selected.charAt(0)-(int)"A".charAt(0);
           selectile.setIcon(Tileimg[index]);
        }
    }
}
