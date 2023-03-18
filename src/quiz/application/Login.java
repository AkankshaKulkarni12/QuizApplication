package quiz.application;

/**
 *
 * @author Akanksha Kulkarni
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login extends JFrame implements ActionListener{
    
    JButton buttonRules, buttonExit;
    JTextField tfName;
    
    Login(){
        // setting background color
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // setting an Image for Front Page
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel imageLogin = new JLabel(imageIcon);
        imageLogin.setBounds(0, 0, 500, 500);
        add(imageLogin);
        
        // heading
        JLabel heading = new JLabel("Master Minds");
        heading.setBounds(625, 60, 300, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        // name
        JLabel enterName = new JLabel("Enter your Name");
        enterName.setBounds(670, 160, 300, 25);
        enterName.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
        enterName.setForeground(new Color(30, 144, 254));
        add(enterName);
        
        // textfield
        tfName = new JTextField();
        tfName.setBounds(620, 200, 270, 25);
        tfName.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(tfName);
        
        // rules Button
        buttonRules = new JButton("Rules");
        buttonRules.setBounds(620, 280, 100, 25);
        buttonRules.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
        buttonRules.setForeground(Color.WHITE);
        buttonRules.setBackground(new Color(30, 144, 254));
        buttonRules.addActionListener(this);
        add(buttonRules);
        
        // exit Button
        buttonExit = new JButton("Exit");
        buttonExit.setBounds(790, 280, 100, 25);
        buttonExit.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
        buttonExit.setForeground(Color.WHITE);
        buttonExit.setBackground(new Color(30, 144, 254));
        buttonExit.addActionListener(this);
        add(buttonExit);
        
        // setting the size and location of window
        setSize(1000, 500);
        setLocation(135, 30);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == buttonRules){
            String name = tfName.getText();
            setVisible(false);
            new Rules(name);
        }else if(ae.getSource() == buttonExit){
            setVisible(false);
        }
    }
    
    public static void main(String [] args){
     
        new Login();
    }
}
