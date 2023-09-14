
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author souravmazumdar
 */
public class UI extends JFrame implements ActionListener {
    
    
    JButton button1;
    JButton button2;
    JFrame frame;

    UI() {
        frame=new JFrame("Welcome to COMPRESSOR DECOMPRESSOR APP");
        frame.setLayout(null);
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.setSize(1000,1000);
        
        
        button1=new JButton("Select to Compress");
        button1.setBorder(null);  
        button1.setBounds(200,30,200,30); 
        button1.addActionListener(this);
        button1.setBackground(Color.GREEN);  // Set the background color to blue
        button1.setForeground(Color.BLACK);
        
        
        button2=new JButton("Select to Decompress");
        button2.setBackground(Color.YELLOW);    // Set the background color to red
        button2.setForeground(Color.BLACK);  // Set the text color to white
        button2.setBorder(null);
        button2.setBounds(500,30,200,30);
        button2.addActionListener(this);
        
        button1.setOpaque(true);
        button2.setOpaque(true);
        
        frame.add(button1); 
        frame.add(button2);
        frame.getContentPane().setBackground(Color.PINK);
        frame.setVisible(true);
        
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1){
            JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showSaveDialog(null);  //WHY SHOWSAVEDIALOG
            if(response==JFileChooser.APPROVE_OPTION){    // JFileChooser WHY??!!
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
                try{
                    Compressor.method(file);
                }
                catch(IOException ee){
                    JOptionPane.showMessageDialog(null, ee.toString());
                    
                }
            }    
        }
        
        if(e.getSource()==button2){
            JFileChooser filechooser=new JFileChooser();
            int response=filechooser.showSaveDialog(null);  //WHY SHOWSAVEDIALOG
            if(response==JFileChooser.APPROVE_OPTION){    // JFileChooser WHY??!!
                File file=new File(filechooser.getSelectedFile().getAbsolutePath());
                System.out.print(file);
                try{
                    Decompressor.method(file);
                }
                catch( IOException ef){
                    JOptionPane.showMessageDialog(null, ef.toString());
                    
                }
            }    
        }
        
        
    }

    
    
}
