package quiz.application;

/**
 *
 * @author Akanksha Kulkarni
 */

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{
    
    String name;
    JButton buttonStart, buttonBack;
    
    Rules(String name){
        this.name = name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // heading
        JLabel heading = new JLabel("Dear " + name + ", Welcome to Master Minds!");
        heading.setBounds(110, 30, 450, 45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 24));
        heading.setForeground(new Color(30, 144, 254));
        add(heading);
        
        // data
        JLabel data = new JLabel("Dear " + name + ", Welcome to Master Minds!");
        data.setBounds(120, 20, 500, 300);
        data.setFont(new Font("Tahoma", Font.PLAIN, 14));
        data.setText(
                "<html>" +
                        "1. Only Single participation is allowed." + "<br></br>" +
                        "2. The medium of the questions will be only English." + "<br></br>" +
                        "3. Every question has a timer." + "<br></br>" +
                        "4. Question is skipped, if not answered in given time." + "<br></br>" +
                        "5. There are total 10 questions to be attempted." + "<br></br>" + "<br></br>" +
                        "Good Luck!!!" + "<br></br>" +
                "<html>"
        );
        add(data);
        
        // rules Button
        buttonStart = new JButton("Start");
        buttonStart.setBounds(120, 270, 100, 25);
        buttonStart.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
        buttonStart.setForeground(Color.WHITE);
        buttonStart.setBackground(new Color(30, 144, 254));
        buttonStart.addActionListener(this);
        add(buttonStart);
        
        // exit Button
        buttonBack = new JButton("Exit");
        buttonBack.setBounds(360, 270, 100, 25);
        buttonBack.setFont(new Font("Bradley Hand ITC", Font.BOLD, 20));
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBackground(new Color(30, 144, 254));
        buttonBack.addActionListener(this);
        add(buttonBack);
        
        setSize(700, 400);
        setLocation(275, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == buttonStart){
            setVisible(false);
            new Quiz(name);
            
        } else if(ae.getSource() == buttonBack){
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String [] args){
        new Rules("User");
    }
}
