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
import java.util.Random;
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
    String LetterSet[]=new String[98];
    int numLetters=98;
    boolean firstmove=true;
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
        int index=0;
        for(int i=0;i<9;++index,++i)
            LetterSet[index]="A";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="B";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="C";
        for(int i=0;i<4;++index,++i)
            LetterSet[index]="D";
        for(int i=0;i<12;++index,++i)
            LetterSet[index]="E";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="F";
        for(int i=0;i<3;++index,++i)
            LetterSet[index]="G";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="H";
        for(int i=0;i<9;++index,++i)
            LetterSet[index]="I";
        for(int i=0;i<1;++index,++i)
            LetterSet[index]="J";
        for(int i=0;i<1;++index,++i)
            LetterSet[index]="K";
        for(int i=0;i<4;++index,++i)
            LetterSet[index]="L";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="M";
        for(int i=0;i<6;++index,++i)
            LetterSet[index]="N";
        for(int i=0;i<8;++index,++i)
            LetterSet[index]="O";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="P";
        for(int i=0;i<1;++index,++i)
            LetterSet[index]="Q";
        for(int i=0;i<6;++index,++i)
            LetterSet[index]="R";
        for(int i=0;i<4;++index,++i)
            LetterSet[index]="S";
        for(int i=0;i<6;++index,++i)
            LetterSet[index]="T";
        for(int i=0;i<4;++index,++i)
            LetterSet[index]="U";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="V";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="W";
        for(int i=0;i<1;++index,++i)
            LetterSet[index]="X";
        for(int i=0;i<2;++index,++i)
            LetterSet[index]="Y";
        for(int i=0;i<1;++index,++i)
            LetterSet[index]="Z";
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
                Tile[i][j].setFont(new Font("Arial", Font.PLAIN, 12));
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
        RTile[1].setText("P");
        RTile[2].setText("P");
        RTile[3].setText("L");
        RTile[4].setText("E");
        RTile[5].setText("T");
        RTile[6].setText("A");
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

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
            .addGap(0, 0, Short.MAX_VALUE)
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tiles/scrabble_logo_small1.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(selectile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195)
                .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(cdic)
                .addContainerGap(523, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(418, 418, 418)
                .addComponent(Rack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(434, 434, 434))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(Board, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(219, 219, 219)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(accept, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cdic, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(Rack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(selectile, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
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
                if(!Tile[i][j].getActionCommand().equals("disabled")&&!Tile[i][j].getText().equals(""))
                {
                    xstart=j;
                    ystart=i;
                    flg=true;
                    for(int k=ystart+1;k<15;++k)
                    {
                        if(!Tile[k][xstart].getActionCommand().equals("disabled")&&!Tile[k][xstart].getText().equals(""))
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
                    if(i!=ystart&&!Tile[i][j].getActionCommand().equals("disabled")&&!Tile[i][j].getText().equals(""))
                        return false;
                }
        }
        else
        {
            for(int i=0;i<15;++i)
                for(int j=0;j<15;++j)
                {
                    if(j!=xstart&&!Tile[i][j].getActionCommand().equals("disabled")&&!Tile[i][j].getText().equals(""))
                        return false;
                }
        }
        if(alongRow)
        {
            boolean broken=false;
            for(int x=xstart;x<15;++x)
            {
                if(Tile[ystart][x].getText().equals(""))
                {
                    broken=true;
                    continue;
                }
                if(broken&&!Tile[ystart][x].getActionCommand().equals("disabled")&&!Tile[ystart][x].getText().equals(""))
                    return false;
            }
            
        }
        else
        {
            boolean broken=false;
            for(int y=ystart;y<15;++y)
            {
                if(Tile[y][xstart].getText().equals(""))
                {
                    broken=true;
                    continue;
                }
                if(broken&&!Tile[y][xstart].getActionCommand().equals("disabled")&&!Tile[y][xstart].getText().equals(""))
                    return false;
            }
            
        }
        if(firstmove)
        {
            firstmove=false;
            return true;
        }
        if(alongRow)
        {
            for(int x=xstart;x<15&&!Tile[ystart][x].getText().equals("");++x)
            {
                if(x<14&&Tile[ystart][x+1].getActionCommand().equals("disabled"))
                    return true;
                if(x>0&&Tile[ystart][x-1].getActionCommand().equals("disabled"))
                    return true;
                if(ystart<14&&Tile[ystart+1][x].getActionCommand().equals("disabled"))
                    return true;
                if(ystart>0&&Tile[ystart-1][x].getActionCommand().equals("disabled"))
                    return true;
            }
        }
        else
        {
            for(int y=ystart;y<15&&!Tile[y][xstart].getText().equals("");++y)
            {
                if(y<14&&Tile[y+1][xstart].getActionCommand().equals("disabled"))
                    return true;
                if(y>0&&Tile[y-1][xstart].getActionCommand().equals("disabled"))
                    return true;
                if(xstart<14&&Tile[y][xstart+1].getActionCommand().equals("disabled"))
                    return true;
                if(xstart>0&&Tile[y][xstart-1].getActionCommand().equals("disabled"))
                    return true;
            }
        }
        return false;
    };
    
    private void acceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptActionPerformed
        // TODO add your handling code here:
        if(selected.equals("")){
        if(checkAcceptable())
        {
            String word="";
            boolean wflag=true;
            //Make words
            if(alongRow)
            {
                while(xstart>=0&&!Tile[ystart][xstart].getText().equals(""))
                    xstart--;
                xstart++;
                for(int i=xstart;i<15&&!Tile[ystart][i].getText().equals("");++i)
                word=word+Tile[ystart][i].getText();
                jLabel1.setText(word);
                if(Tester.search(word)||word.length()==1)
                    ;
                else
                    wflag=false;
                for(int x=xstart;x<15&&!Tile[ystart][x].getText().equals("");++x)
                {
                    if(Tile[ystart][x].getActionCommand().equals("disabled"))
                        continue;
                    String bword="";
                    int bystart;
                    for(bystart=ystart;bystart>=0&&!Tile[bystart][x].getText().equals("");--bystart);
                    bystart++;
                    for(int y=bystart;y<15&&!Tile[y][x].getText().equals("");++y)
                    {
                        bword=bword+Tile[y][x].getText();
                    }
                    jLabel1.setText(bword);
                    if(bword.length()==1||Tester.search(bword))
                       ;
                    else
                        wflag=false;
                }
            }
            else
            {
                while(ystart>=0&&!Tile[ystart][xstart].getText().equals(""))
                    ystart--;
                ystart++;
                for(int i=ystart;i<15&&!Tile[i][xstart].getText().equals("");++i)
                word=word+Tile[i][xstart].getText();
                jLabel1.setText(word);
                if(Tester.search(word))
                    ;
                else
                    wflag=false;
                for(int y=ystart;y<15&&!Tile[y][xstart].getText().equals("");++y)
                {
                    if(Tile[y][xstart].getActionCommand().equals("disabled"))
                        continue;
                    String bword="";
                    int bxstart;
                    for(bxstart=xstart;bxstart>=0&&!Tile[y][bxstart].getText().equals("");--bxstart);
                    bxstart++;
                    for(int x=bxstart;x<15&&!Tile[y][x].getText().equals("");++x)
                    {
                        bword=bword+Tile[y][x].getText();
                    }
                    jLabel1.setText(bword);
                    if(bword.length()==1||Tester.search(bword))
                        ;
                    else
                        wflag=false; 
                }
            }
            if(wflag){
            if(alongRow)
            {
                for(int i=xstart;i<15&&!Tile[ystart][i].getText().equals("");++i)
                {
                    
                    Tile[ystart][i].setActionCommand("disabled");
                    Tile[ystart][i].setBackground(new Color(168,116,38));
                    Tile[ystart][i].setFont(new Font("Arial", Font.BOLD, 12));
                }
            }
            else
            {
                for(int i=ystart;i<15&&!Tile[i][xstart].getText().equals("");++i)
                {
                    
                    Tile[i][xstart].setActionCommand("disabled");
                    Tile[i][xstart].setBackground(new Color(168,116,38));
                    Tile[i][xstart].setFont(new Font("Arial", Font.BOLD, 12));
                }
            }
            }
            jLabel2.setText(word);
            if(wflag)
                jLabel1.setText("All right");
            else
                jLabel1.setText("1 or more flaws");
            /*
            addScore();
            
            */
            if(wflag){
            for(int i=0;i<7;++i)
            {
                if(RTile[i].getText().equals(""))
                {
                    Random rand=new Random();
                    int n=rand.nextInt(numLetters);
                    if(n<0)
                        n=-1*n;
                    RTile[i].setText(LetterSet[n]);
                    for(int j=n;j<numLetters-1;++j)
                    {
                        LetterSet[j]=LetterSet[j+1];
                    }
                    numLetters--;
                    if(numLetters==0)
                    {
                        System.exit(0);
                    }
                }
            }
            }
            
        }    
        else
           jLabel4.setText("Unacceptable");
        }
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
        boolean flg=false;
        for(int i=0;i<15;++i)
        {
            if(flg)
                break;
            if(foundsource)
                break;
            for(int j=0;j<15;++j)
            {
                if(foundsource)
                    break;
                if(e.getSource().equals(Tile[i][j]))
                {
                    foundsource=true;
                    if(Tile[i][j].getActionCommand().equals("disabled"))
                    {
                        flg=true;
                        break;
                    }
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
        jLabel4.setText("");
    }
}
