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

public class UI extends JFrame implements ActionListener{

     JButton bt1;
     JLabel lb1,lb2,lb3;
     float count;
     JTextField t1,t2;
     JFrame f;

    UI(){
        this.count = 0;
        
        lb1 = new JLabel("Login");
        lb1.setBounds(260,20, 200,30);
        lb1.setFont(new Font("Tahoma",Font.BOLD,20));
        lb1.setForeground(Color.black);
        this.add(lb1);

        lb2 = new JLabel("User :");
        lb2.setBounds(70, 100, 200, 30);
        lb2.setFont(new Font("Tahoma",Font.BOLD,18));
        lb2.setForeground(Color.black);
        this.add(lb2);

        lb3 = new JLabel("Password :");
        lb3.setBounds(70, 150, 200, 30);
        lb3.setFont(new Font("Tahoma",Font.BOLD,18));
        lb3.setForeground(Color.black);
        this.add(lb3);

        f = new JFrame("TextField Example");    
        t1 = new JTextField();  
        t1.setBounds(200,100, 200,30);  
        t2 = new JTextField();
        t2.setBounds(200,150, 200,30);
        
        bt1 = new JButton("Login"); 
        bt1.setBounds(255,200, 100,30);
        bt1.addActionListener(this);
        this.add(bt1);

        this.add(t1); this.add(t2);  
        this.setSize(400,400);  
        this.setLayout(null);  
        this.setVisible(true);  

        setSize(600, 400);
        this.setTitle("Login");
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e){
    if(e.getSource() == bt1){
        if(t1.getText().equals("admin")&&t2.getText().equals("admin")){
        JOptionPane.showMessageDialog(null, "Login successes");
        new Menu();
    }
    else{
        JOptionPane.showMessageDialog(null, "Username and Password not match");
    }
}
}
}