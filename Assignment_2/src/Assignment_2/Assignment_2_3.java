package Assignment_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment_2_3  extends JApplet
{
    JTextField JT1 = new JTextField(20);
    JPasswordField JPass = new JPasswordField(20);
    JPasswordField JCPass = new JPasswordField(20);
    JButton B1 = new JButton("Sign up");
    JLabel Jl = new JLabel();
    JPanel Jp = new JPanel();
    public void init()
    {
        setLayout(new FlowLayout());
        Jp.setLayout(new GridLayout(3,1,5,5));
        Jp.add(new Label("User name : "));
        Jp.add(JT1);
        Jp.add(new Label("Enter Password :"));
        Jp.add(JPass);
        Jp.add(new Label("Re-Enter Password :"));
        Jp.add(JCPass);
        add(Jp);
        setLayout(new GridBagLayout());
        GridBagConstraints GBC = new GridBagConstraints();   
        GBC.gridx=0;
        GBC.gridy=1;
        add(B1,GBC);
        B1.addActionListener((e) -> {
            String JCP,JP;
            JCP = JCPass.getText(); 
            JP = JPass.getText();
            if(JCP.equals(JP) )
            {
                Jl.setText("User name : "+JT1.getText()+"    Password : "+JCPass.getText());
            }
            else
            {
                Jl.setText("Password Dose not match.Please try again");
            }
        });
        GBC.gridx=0;
        GBC.gridy=2;
        add(Jl,GBC);
    }
}
