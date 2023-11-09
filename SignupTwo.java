/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking.managment.system;
import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

/**
 *
 * @author Ved Patel
 */
public class SignupTwo extends JFrame implements ActionListener{
    
    
    
    
    JTextField  dlTextField,pasTextField;
    
    JButton next;
    JRadioButton syes,sno,y,n;
    JComboBox re,rr,ev,oc;
    String formno;
    
    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");
        
       
        
        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Railway", Font.BOLD, 22));
        additionalDetails.setBounds(290,80,400,30);
        add(additionalDetails);
        
        JLabel religion = new JLabel("Religion: ");
        religion.setFont(new Font("Railway", Font.BOLD, 20));
        religion.setBounds(100,140,100,30);
        add(religion);
        
        String valReligion[] = {"Hindu", "Muslim", "Sikh", "Christian", "Other"};
        re = new JComboBox(valReligion);
        re.setBounds(300,140,400,30);
        re.setBackground(Color.WHITE);
        add(re);
        
     
        JLabel income = new JLabel("Income: ");
        income.setFont(new Font("Railway", Font.BOLD, 20));
        income.setBounds(100,190,200,30);
        add(income);
        
        
        String range[] = {"Null","< 25k","< 50k", "< 100k","< 150k"};
        rr = new JComboBox(range);
        rr.setBounds(300,190,400,30);
        rr.setBackground(Color.WHITE);
        add(rr);
        
        JLabel edu= new JLabel("Educational ");
        edu.setFont(new Font("Railway", Font.BOLD, 20));
        edu.setBounds(100,260,200,30);
        add(edu);
        
        
        
        JLabel qly = new JLabel("Qualification: ");
        qly.setFont(new Font("Railway", Font.BOLD, 20));
        qly.setBounds(100,290,200,30);
        add(qly);
        
        String eduvalues[] = {"Non-Gradguate","Gradguate","Doctory", "Other"};
        ev = new JComboBox(eduvalues);
        ev.setBounds(300,290,400,30);
        ev.setBackground(Color.WHITE);
        add(ev);
        
       
        
        JLabel marital = new JLabel("Occupation: ");
        marital.setFont(new Font("Railway", Font.BOLD, 20));
        marital.setBounds(100,340,200,30);
        add(marital);
        
        String occu[] = {"Employeed","Self-Employeed","Student", "Retired","Others"};
        oc = new JComboBox(occu);
        oc.setBounds(300,340,400,30);
        oc.setBackground(Color.WHITE);
        add(oc);
        
       
        JLabel dl = new JLabel("Driving Licence: ");
        dl.setFont(new Font("Railway", Font.BOLD, 20));
        dl.setBounds(100,390,200,30);
        add(dl);
        
        dlTextField = new JTextField();
        dlTextField.setFont(new Font("Railway", Font.BOLD, 14));
        dlTextField.setBounds(300,390,400,30);
        add(dlTextField);
        
        
        JLabel pas = new JLabel("Passport Number: ");
        pas.setFont(new Font("Railway", Font.BOLD, 20));
        pas.setBounds(100,440,200,30);
        add(pas);
        
        pasTextField = new JTextField();
        pasTextField.setFont(new Font("Railway", Font.BOLD, 14));
        pasTextField.setBounds(300,440,400,30);
        add(pasTextField);
        
        JLabel status = new JLabel("Senior Citizen: ");
        status.setFont(new Font("Railway", Font.BOLD, 20));
        status.setBounds(100,490,200,30);
        add(status);
        
        syes = new JRadioButton("Yes");
        syes.setBounds(300,490,100,30);
        syes.setBackground(Color.WHITE);
        add(syes);
        
        sno = new JRadioButton("No");
        sno.setBounds(450, 490, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);
        
        ButtonGroup Statusgroup = new ButtonGroup();
        Statusgroup.add(syes);
        Statusgroup.add(sno);
        
        
        JLabel Postalcode= new JLabel("Existing Account: ");
        Postalcode.setFont(new Font("Railway", Font.BOLD, 20));
        Postalcode.setBounds(100,540,200,30);
        add(Postalcode);
        
        
        
        y= new JRadioButton("Yes");
        y.setBounds(300,540,100,30);
        y.setBackground(Color.WHITE);
        add(y);
        
        n = new JRadioButton("No");
        n.setBounds(450, 540, 100, 30);
        n.setBackground(Color.WHITE);
        add(n);
        
        ButtonGroup group = new ButtonGroup();
        group.add(y);
        group.add(n);
        
       
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Railway", Font.BOLD, 14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
        
        getContentPane().setBackground(Color.WHITE);
                
        setSize(850, 800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
         
        String religion = (String) re.getSelectedItem();
        String incom = (String) rr.getSelectedItem();
        String edu = (String) ev.getSelectedItem();
        String occupation = (String) oc.getSelectedItem();
        String status = null;
        if(syes.isSelected()){
            status = "Yes";
        }else if(sno.isSelected()){
            status = "No";
        }
        
        
        String existac = null;
        if(y.isSelected()){
            existac = "Account Excists";
        }else if(n.isSelected()){
            existac = "Account not Excists";
        }
        
        String PassportNo = pasTextField.getText();
        String DrivingL = dlTextField.getText();
      
        
        try {
            if (DrivingL.equals("")){
                JOptionPane.showMessageDialog(null, "Name is Required");
            }else {
                Conn c = new Conn();
                String query = "insert into signuptwo values('"+formno+"','"+religion+"','"+incom+"','"+edu+"','"+occupation+"','"+status+"','"+existac+"','"+PassportNo+"','"+DrivingL+"')";
                c.s.executeUpdate(query);
                
                //Signup3 object
                setVisible(false); 
                new SignupThree(formno).setVisible(true);
            }
        }catch(Exception ee){
            System.out.println(ee);
        }
    }
    
    public static void main(String args[]) {
        new SignupTwo("");
    }
    
}
