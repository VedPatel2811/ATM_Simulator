/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking.managment.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
/**
 *
 * @author Ved Patel
 */
public class Login extends JFrame implements ActionListener{
    JButton Login, Signup, clear;
    JTextField cardTextField,PinTextField;
    JPasswordField pinTextField;
    Login(){
        setTitle(" ATM");
        
        setLayout(null);
        
        ImageIcon il = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
        Image I2 = il.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        
        // ImageIcon can be pass through JLable, but Image can not be passed through JLable
        ImageIcon I3 = new ImageIcon(I2);
        // IN above line of code we converted Image to ImageIcom
        JLabel label = new JLabel(I3);
        label.setBounds(70,10, 100, 100);
        add(label);
        
        JLabel text = new JLabel("Welcom to ATM");
        text.setBounds(200,40,400,40);
        text.setFont(new Font("Osward",Font.BOLD,38));
        add(text);
        
        JLabel CardNo = new JLabel("Card Number :");
        CardNo.setBounds(120,150,400,40);
        CardNo.setFont(new Font("Osward",Font.BOLD,25));
        add(CardNo);
        
        cardTextField = new JTextField();
        cardTextField.setBounds(300,155,250,30);
        cardTextField.setFont(new Font("Arial",Font.BOLD,18));
        add(cardTextField);
        
        JLabel PIN = new JLabel("PIN Number :");
        PIN.setBounds(120,220,250,40);
        PIN.setFont(new Font("Osward",Font.BOLD,25));
        
        add(PIN);
        
        PinTextField = new JPasswordField();
        PinTextField.setBounds(300,225,250,30);
        add(PinTextField);
        
         Login = new JButton("SIGN IN");
        Login.setBounds(300,300 ,100,30);
        Login.setBackground(Color.BLACK);
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);
        
         clear= new JButton("CLEAR");
        clear.setBounds(430,300 ,100,30);
        clear.setBackground(Color.BLACK);
        clear.setForeground(Color.WHITE);
        clear.addActionListener(this);
        add(clear);
        
         Signup= new JButton("SIGN UP");
        Signup.setBounds(365,350 ,100,30);
        Signup.setBackground(Color.BLACK);
        Signup.setForeground(Color.WHITE);
        Signup.addActionListener(this);
        add(Signup);
        
        getContentPane().setBackground(Color.WHITE);
        
       
        setSize(800,480);
        setVisible(true);
        setLocation(350, 200);
    }
    
    public void actionPerformed(ActionEvent ac){
        if(ac.getSource() == clear){
            cardTextField.setText("");
            PinTextField.setText("");
        }else if(ac.getSource() == Login){
            
        }else if(ac.getSource() == Signup){
            setVisible(false);
            new SignupOne().setVisible(true);
        }
    }
    public static void main(String args[]){
        Login l =new Login();
    }
      
}
