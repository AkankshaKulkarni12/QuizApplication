package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Akanksha Kulkarni
 */
public class Score extends JFrame implements ActionListener{
    
    Score(String name, int score){
        setBounds(250, 50, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        // setting an Image for Front Page
        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = imageIcon.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLogin = new JLabel(i3);
        imageLogin.setBounds(0, 200, 300, 250);
        add(imageLogin);
        
        JLabel heading = new JLabel("Thankyou " + name + " for playing !");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblScore = new JLabel("Your score is : " + score);
        lblScore.setBounds(380, 200, 300, 30);
        lblScore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblScore);
        
        // submit Button
        JButton submit = new JButton("Play Again!");
        submit.setBounds(400, 270, 150, 30);
        submit.setFont(new Font("Tahoma", Font.PLAIN, 20));
        submit.setBackground(new Color(30, 144, 254));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true); 
    }
    
    public void actionPerformed(ActionEvent ae){
        setVisible(false);
        new Login(); 
    }
    
    public static void main(String [] args){
        new Score("User", 0);
    }
}
