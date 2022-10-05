
package Assignment_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment_2_2  extends JApplet
{
        //For get text to button
        JTextField Jtext = new JTextField(18);
        JButton number1 = new JButton("1");
        JButton number2 = new JButton("2");
        JButton number3 = new JButton("3");
        JButton number4 = new JButton("4");
        JButton number5 = new JButton("5");
        JButton number6 = new JButton("6");
        JButton number7 = new JButton("7");
        JButton number8 = new JButton("8");
        JButton number9 = new JButton("9");
        JButton number0 = new JButton("0");
        JButton btP = new JButton("+");
        JButton btS = new JButton("-");
        JButton btM = new JButton("*");
        JButton btD = new JButton("/");
        JButton btE= new JButton("=");
        JButton btCE= new JButton("CE");
        JPanel Jp = new JPanel();
        JLabel val1 = new JLabel();
        static int b;
        public void init()
        {
            setLayout(new FlowLayout());
            add(Jtext,BorderLayout.NORTH);
            Jp.setLayout(new GridLayout(5,5));
            Jp.add(number7);
            Jp.add(number8);
            Jp.add(number9);
            Jp.add(btD);
            Jp.add(number4);
            Jp.add(number5);
            Jp.add(number6);
            Jp.add(btM);
            Jp.add(number1);
            Jp.add(number2);
            Jp.add(number3);
            Jp.add(btS);
            Jp.add(btCE);
            Jp.add(number0);
            Jp.add(btE);
            Jp.add(btP);
            add(Jp);
            number1.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"1");
            });
            number2.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"2");
            });
            number3.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"3");
            });
            number4.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"4");
            });
            number5.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"5");
            });
            number6.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"6");
            });
            number7.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"7");
            });
            number8.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"8");
            });
            number9.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"9");
            });
            number0.addActionListener((e) -> {
                Jtext.setText(Jtext.getText()+"0");
            });
            btP.addActionListener((e) -> {
                 val1.setText(Jtext.getText());
                 Jtext.setText("");
                 b=1;
            });
            btS.addActionListener((e) -> {
                 val1.setText(Jtext.getText());
                 Jtext.setText("");
                 b=2;
            });
            btM.addActionListener((e) -> {
                 val1.setText(Jtext.getText());
                 Jtext.setText("");
                 b=3;
            });
            btD.addActionListener((e) -> {
                 val1.setText(Jtext.getText());
                 Jtext.setText("");
                 b=4;
            });
            btE.addActionListener((e) -> {
                if(b==1)
                {
                     int ans = Integer.parseInt(val1.getText()) + Integer.parseInt(Jtext.getText());
                     Jtext.setText(ans+"");
                }
                if(b==2)
                { int ans = Integer.parseInt(val1.getText()) - Integer.parseInt(Jtext.getText());
                     Jtext.setText(ans+"");
                }
                if(b==3)
                {
                     int ans = Integer.parseInt(val1.getText()) * Integer.parseInt(Jtext.getText());
                     Jtext.setText(ans+"");
                }
                if(b==4)
                {
                     double ans = Double.parseDouble(val1.getText()) / Double.parseDouble(Jtext.getText());
                     Jtext.setText(ans+"");
                }
            });
            btCE.addActionListener((e) -> {
                Jtext.setText(""); 
            });
            
            
        }
}
