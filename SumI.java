import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.Action;
import javax.swing.JButton.*;
import javax.swing.*;
import java.awt.Dimension;

public class SumI extends JFrame implements ActionListener{

     JButton bt1;
     JLabel lb1,lb2,lb3,lb4;
     JTextField t1,t2;
     JFrame f;

SumI(int sum1){

    lb1 = new JLabel("ช่องทางการชำระเงิน");
    lb1.setBounds(200,20, 200,30);
    lb1.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,24));
    lb1.setForeground(Color.black);
    this.add(lb1);

    lb3 = new JLabel("จำนวนที่ชำระ");
    lb3.setBounds(80,80, 200,30);
    lb3.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,21));
    lb3.setForeground(Color.black);
    this.add(lb3);

    lb4 = new JLabel("บาท");
    lb4.setBounds(330,80, 200,30);
    lb4.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,21));
    lb4.setForeground(Color.black);
    this.add(lb4);

    f = new JFrame("TextField Example");    
    t2 = new JTextField();
    t2.setText(sum1+"");
    t2.setBounds(200,80, 120,30);

    lb2 = new JLabel("เบอร์โทร");
    lb2.setBounds(80,120, 200,30);
    lb2.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,21));
    lb2.setForeground(Color.black);
    this.add(lb2);

    f = new JFrame("TextField Example");    
    t1 = new JTextField();
    t1.setBounds(200,120, 200,30);

    bt1 = new JButton("ตกลง"); 
    bt1.setBounds(250,200, 100,30);
    bt1.setFont(new Font("Tahoma",Font.ROMAN_BASELINE,21));
    bt1.addActionListener(this);
    this.add(bt1);

    this.add(t1); this.add(t2);
    this.setSize(400,400);  
    this.setLayout(null);  
    this.setVisible(true); 

    setSize(600, 400);
    this.setTitle("All member");
    this.setLayout(null);
    this.setVisible(true);
    this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        
}
@Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == bt1){
        JOptionPane.showMessageDialog(null, "Success");
    }
}
}    