package Assignment_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment_2_5 extends JApplet
{
    JTextField Student_Name = new JTextField(15);
    JTextField Student_Enrollment_No = new JTextField(15);
    
    JTextField Java = new JTextField(5);
    JTextField CSharp = new JTextField(5);
    JTextField SEO = new JTextField(5);
    JTextField WS = new JTextField(5);
    
    JLabel SNV =new JLabel();//SNV = Student Name value
    JLabel SENV =new JLabel();//SENV = Student Enrollment No value
    
    JLabel JV =new JLabel();// JV = java value
    JLabel CSV =new JLabel();// CSV = Csharp value
    JLabel SV =new JLabel();// SV = SEO value
    JLabel WV =new JLabel();// WV =  WS Value
    
    JLabel Total = new JLabel();
    JLabel Result = new JLabel();
            
    JButton Create_markSheet = new JButton("Create MarkSheet");
    JPanel JP_1 = new JPanel();
    JPanel JP_2 = new JPanel();
    JPanel JP_3 = new JPanel();
    JPanel JP_4 = new JPanel();
    JPanel JP_5 = new JPanel();
    JPanel JP_6 = new JPanel();
    public void init()
    {
        setLayout(new FlowLayout());
        JP_1.setLayout(new GridLayout(2,2,5,5));
        JP_1.add(new Label("Student Name : "));
        JP_1.add(Student_Name);
        JP_1.add(new Label("Student Enrollment No : "));
        JP_1.add(Student_Enrollment_No);
        
        JP_5.setLayout(new GridLayout(1,1,5,5));
        JP_5.add(JP_1);
        
        JP_2.setLayout(new GridLayout(5,2,5,5));
        JP_2.add(new Label("Enter Java marks : "));
        JP_2.add(Java);
        JP_2.add(new Label("Enter C# Marks : "));
        JP_2.add(CSharp);
        JP_2.add(new Label("Enter SEO Marks : "));
        JP_2.add(SEO);
        JP_2.add(new Label("Enter WS Marks : "));
        JP_2.add(WS);
        
        JP_5.add(JP_2);
        
        JP_3.setLayout(new GridLayout(1,4,5,5));
        JP_3.add(new Label("Student Name : "));
        JP_3.add(SNV);
        JP_3.add(new Label("Student Enrollment No : "));
        JP_3.add(SENV);
        
        JP_6.setLayout(new GridLayout(2,1,5,5));
        JP_6.add(JP_3);
        
        JP_4.setLayout(new GridLayout(7,3,5,5));
        JP_4.add(new Label("Subjects"));
        JP_4.add(new Label("Subject marks"));
        JP_4.add(new Label("Obtained Marks"));
        JP_4.add(new Label("Java"));
        JP_4.add(new Label("100"));
        JP_4.add(JV);
        JP_4.add(new Label("CSharp"));
        JP_4.add(new Label("100"));
        JP_4.add(CSV);
        JP_4.add(new Label("SEO"));
        JP_4.add(new Label("100"));
        JP_4.add(SV);
        JP_4.add(new Label("WS"));
        JP_4.add(new Label("100"));
        JP_4.add(WV);
        JP_4.add(new Label("TOTAL"));
        JP_4.add(new Label("400"));
        JP_4.add(Total);
        JP_4.add(new Label("RESULT"));
        JP_4.add(new Label());
        JP_4.add(Result);
        
        JP_6.add(JP_4);
        
        setLayout(new GridBagLayout());
        GridBagConstraints GBC = new GridBagConstraints();   
        GBC.gridx=0;
        GBC.gridy=0;
        add(JP_5,GBC);
        GBC.gridx=0;
        GBC.gridy=1;
        add(Create_markSheet,GBC);
        GBC.gridx=0;
        GBC.gridy=2;
        add(JP_6,GBC);
        
        Create_markSheet.addActionListener((e) -> {
            SNV.setText(Student_Name.getText());
            SENV.setText(Student_Enrollment_No.getText());
            JV.setText(Java.getText());
            SV.setText(SEO.getText());
            CSV.setText(CSharp.getText());
            WV.setText(WS.getText());
            double Tot = Double.parseDouble(Java.getText())+Double.parseDouble(CSharp.getText())
                    +Double.parseDouble(SEO.getText())+Double.parseDouble(WS.getText());
            Total.setText(Tot+"");
            double Res = Tot*100/400;
            Result.setText(Res+"%");
        });
    }
}

