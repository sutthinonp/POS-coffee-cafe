import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.*;
import java.awt.Dimension;

public class Menu extends JFrame implements ActionListener{

     JButton bt,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10,bt11,bt12;
     JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
     int count,count1,count2,count3,count4;
     JTextField t1,t2;
     JFrame f,frame;
     int sum;

    Menu(){
        this.count = 0;
        this.count1 = 0;
        this.count2 = 0;
        this.count3 = 0;
        this.count4 = 0;

        frame = new JFrame();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setPreferredSize(new Dimension(550, 300));
        this.pack();
        this.setVisible(true);

        lb1 = new JLabel("เมนู");
        lb1.setBounds(230,20, 200,30);
        lb1.setFont(new Font("Tahoma",Font.BOLD,18));
        lb1.setForeground(Color.black);
        this.add(lb1);

        lb2 = new JLabel("ชาเขียว 50");
        lb2.setBounds(20,80, 200,30);
        lb2.setFont(new Font("Tahoma",Font.BOLD,18));
        lb2.setForeground(Color.black);
        this.add(lb2);

        lb2 = new JLabel("โกโก้    50");
        lb2.setBounds(20,120, 200,30);
        lb2.setFont(new Font("Tahoma",Font.BOLD,18));
        lb2.setForeground(Color.black);
        this.add(lb2);

        lb2 = new JLabel("ลาเต้    65");
        lb2.setBounds(20,160, 200,30);
        lb2.setFont(new Font("Tahoma",Font.BOLD,18));
        lb2.setForeground(Color.black);
        this.add(lb2);

        lb2 = new JLabel("ชาเย็น  45");
        lb2.setBounds(20,200, 200,30);
        lb2.setFont(new Font("Tahoma",Font.BOLD,18));
        lb2.setForeground(Color.black);
        this.add(lb2);

        lb2 = new JLabel("มอคค่า 65");
        lb2.setBounds(20,240, 200,30);
        lb2.setFont(new Font("Tahoma",Font.BOLD,18));
        lb2.setForeground(Color.black);
        this.add(lb2);

        bt3 = new JButton("+"); 
        bt3.setBounds(120,120, 100,30);
        bt3.addActionListener(this);
        this.add(bt3);

        bt4 = new JButton("-"); 
        bt4.setBounds(230,120, 100,30);
        bt4.addActionListener(this);
        this.add(bt4);

        lb3 = new JLabel("จำนวน");
        lb3.setBounds(400,80, 200,30);
        lb3.setFont(new Font("Tahoma",Font.BOLD,20));
        lb3.setForeground(Color.black);
        this.add(lb3);

        lb4 = new JLabel("จำนวน");
        lb4.setBounds(400,120, 200,30);
        lb4.setFont(new Font("Tahoma",Font.BOLD,20));
        lb4.setForeground(Color.black);
        this.add(lb4);

        bt = new JButton("ชำระเงิน"); 
        bt.setBounds(200,400, 100,30);
        bt.setFont(new Font("Tahoma",Font.BOLD,16));
        bt.addActionListener(this);
        this.add(bt);

        
        bt1 = new JButton("+"); 
        bt1.setBounds(120,80, 100,30);
        bt1.addActionListener(this);
        this.add(bt1);

        bt2 = new JButton("-"); 
        bt2.setBounds(230,80, 100,30);
        bt2.addActionListener(this);
        this.add(bt2);

        bt5 = new JButton("-"); 
        bt5.setBounds(230,120, 100,30);
        bt5.addActionListener(this);
        this.add(bt5);

        bt6 = new JButton("+"); 
        bt6.setBounds(120,160, 100,30);
        bt6.addActionListener(this);
        this.add(bt6);

        bt7 = new JButton("+"); 
        bt7.setBounds(120,200, 100,30);
        bt7.addActionListener(this);
        this.add(bt7);

        bt8 = new JButton("+"); 
        bt8.setBounds(120,240, 100,30);
        bt8.addActionListener(this);
        this.add(bt8);

        bt9 = new JButton("-"); 
        bt9.setBounds(230,160, 100,30);
        bt9.addActionListener(this);
        this.add(bt9);

        bt10 = new JButton("-"); 
        bt10.setBounds(230,200, 100,30);
        bt10.addActionListener(this);
        this.add(bt10);

        bt11 = new JButton("-"); 
        bt11.setBounds(230,240, 100,30);
        bt11.addActionListener(this);
        this.add(bt11);

        bt12 = new JButton("สั่งซื้อ");
        bt12.setBounds(200,300, 100,30);
        bt12.setFont(new Font("Tahoma",Font.BOLD,16));
        bt12.addActionListener(this);
        this.add(bt12);

        lb3 = new JLabel("จำนวน");
        lb3.setBounds(400,80, 200,30);
        lb3.setFont(new Font("Tahoma",Font.BOLD,20));
        lb3.setForeground(Color.black);
        this.add(lb3);

        lb5 = new JLabel("จำนวน");
        lb5.setBounds(400,160, 200,30);
        lb5.setFont(new Font("Tahoma",Font.BOLD,20));
        lb5.setForeground(Color.black);
        this.add(lb5);

        lb6 = new JLabel("จำนวน");
        lb6.setBounds(400,200, 200,30);
        lb6.setFont(new Font("Tahoma",Font.BOLD,20));
        lb6.setForeground(Color.black);
        this.add(lb6);

        lb7 = new JLabel("จำนวน");
        lb7.setBounds(400,240, 200,30);
        lb7.setFont(new Font("Tahoma",Font.BOLD,20));
        lb7.setForeground(Color.black);
        this.add(lb7);

        lb8 = new JLabel("รวม");
        lb8.setBounds(230,350, 200,30);
        lb8.setFont(new Font("Tahoma",Font.BOLD,20));
        lb8.setForeground(Color.black);
        this.add(lb8);

        setSize(600, 650);
        this.setTitle("เมนู");
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == bt1){
        count++;
        lb3.setText("จำนวน  "+count);
    }
    if(e.getSource() == bt2){
        if(count == 0){
        count = 0;
        }
        else{
            count--;
        }
        lb3.setText("จำนวน  "+count);
    }
    if(e.getSource() == bt3){
        count1++;
        lb4.setText("จำนวน  "+count1);
    }
    if(e.getSource() == bt4){
        if(count1 == 0){
            count1 = 0;
        }
        else{
            count1--;
        }
        lb4.setText("จำนวน  "+count1);
    }
    if(e.getSource() == bt6){
        count2++;
        lb5.setText("จำนวน  "+count2);
    }
    if(e.getSource() == bt9){
        if(count2 > 0)
        count2--;
        else count2 = 0;
        lb5.setText("จำนวน  "+count2);
    }
    if(e.getSource() == bt7){
        count3++;
        lb6.setText("จำนวน  "+count3);
    }
    if(e.getSource() == bt10){
        if(count3 > 0)
        count3--;
        else count3 = 0;
        lb6.setText("จำนวน  "+count3);
    }
    if(e.getSource() == bt8){
        count4++;
        lb7.setText("จำนวน  "+count4);
    }
    if(e.getSource() == bt11){
        if(count4 > 0)
        count4--;
        else count4 = 0;
        lb7.setText("จำนวน  "+count4);
    }
    if(e.getSource() == bt12){
        
        sum = (50*count)+(50*count1)+(65*count2)+(45*count3)+(65*count4);
        lb8.setText("รวม  "+sum);
    }
    if(e.getSource() == bt){
        new SumI(sum);
    }

 }
}