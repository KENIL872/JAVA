package Assignment_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment_2_1  extends JApplet
{
    JTextField JT1 = new JTextField(20);
    JPasswordField JPass = new JPasswordField(20);
    JButton B1 = new JButton("Login");
    
    JLabel Jl = new JLabel();
    JPanel Jp = new JPanel();
    public void init()
    {
        setLayout(new FlowLayout());
        Jp.setLayout(new GridLayout(2,1));
        Jp.add(new Label("User name : "));
        Jp.add(JT1);
        Jp.add(new Label("Password :"));
        Jp.add(JPass);
        add(Jp);
        setLayout(new GridBagLayout());
        GridBagConstraints GBC = new GridBagConstraints();   
        GBC.gridx=0;
        GBC.gridy=1;
        add(B1,GBC);
        B1.addActionListener((e) -> {
            Jl.setText("User name : "+JT1.getText()+"    Password : "+JPass.getText());
        });
        GBC.gridx=0;
        GBC.gridy=2;
        add(Jl,GBC);
    }
}