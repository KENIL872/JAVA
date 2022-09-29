package Assignment_2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Assignment_2_4 extends JApplet
{
    JTextField Name = new JTextField(15);
    JTextArea Address = new JTextArea(2,20);
    String Quali[]= {"Select One","B.sc.IT","BE.IT","BCA","M.sc.IT","MCA"};
    JComboBox<String> Qualification = new JComboBox<>(Quali);
    JTextField Phone_number = new JTextField(10);
    JTextField Email =new JTextField(25);
    JTextField Expreience_Year = new JTextField(3);
    JTextField Expreience_Month = new JTextField(3);
    String Plat[]= {"Select One","Java","C#","Flutter","React JS","Kotlin"};
    JComboBox<String> Platform = new JComboBox<>(Plat);
    String Mon[] ={"Month","January","February","March","April","May","June","July",
                        "August","September","October","November","December"}; 
    JComboBox<String> Month = new JComboBox<>(Mon);
    String Da[] = {"Date","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
                        "21","22","23","24","25","26","27","28","29","30","31"};
    JComboBox<String> Date = new JComboBox<>(Da);
    String Y[] = {"Year","1981","1982","1983","1984","1985","1986","1987","1988","1989","1990"
                        ,"1991","1992","1993","1994","1995","1996","1997","1998","1999","2000"
                        ,"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010"
                        ,"2011","2012","2013","2014","2015","2016","2017","2018","2019","2020"
                        ,"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
    JComboBox<String> Year = new JComboBox<>(Y);
    JRadioButton Gender_M =  new  JRadioButton("MALE");
    JRadioButton Gender_F =  new  JRadioButton("FEMALE");
    ButtonGroup BG = new ButtonGroup();
    JButton Submit =new JButton("Submit");
    JLabel JL =new JLabel("JOB APPLICTION");
    JPanel JP_0 = new JPanel();
    JPanel JP_1 = new JPanel();
    JPanel JP_2 = new JPanel();
    JPanel JP_3 = new JPanel();
    JPanel JP_4 = new JPanel();
    JPanel JP_5 = new JPanel();
    JPanel JP_6 = new JPanel();
    public void init()
    {
        setLayout(new FlowLayout());
        
        JP_0.setLayout(new GridLayout(2,1,5,5));
        JP_1.setLayout(new GridLayout(5,2,5,5));
        JP_1.add(new Label("Name : "));
        JP_1.add(Name);
        JP_1.add(new Label("Address : "));
        JP_1.add(Address);
        JP_1.add(new Label("Qualification : "));
        JP_1.add(Qualification);
        JP_1.add(new Label("Phone Number : "));
        JP_1.add(Phone_number);
        JP_1.add(new Label("Email Id : "));
        JP_1.add(Email);
        JP_0.add(JP_1);
        JP_6.setLayout(new GridLayout(4,1,5,5));
        JP_2.setLayout(new GridLayout(1,5,5,5));
        JP_2.add(new Label("Expreience(Year/Month) : "));
        JP_2.add(Expreience_Year);
        JP_2.add(new Label("Year"));
        JP_2.add(Expreience_Month);
        JP_2.add(new Label("Month"));
        JP_6.add(JP_2);
        
        JP_3.setLayout(new GridLayout(1,2,5,5));
        JP_3.add(new Label("Platform : "));
        JP_3.add(Platform);
        JP_6.add(JP_3);
        
        JP_4.setLayout(new GridLayout(1,4,5,5));
        JP_4.add(new Label("Date : "));
        JP_4.add(Date);
        JP_4.add(Month);
        JP_4.add(Year);
        JP_6.add(JP_4);
        
        JP_5.setLayout(new GridLayout(1,3,0,5));
        JP_5.add(new Label("Gender : "));
        BG.add(Gender_M);
        BG.add(Gender_F);
        JP_5.add(Gender_M);
        JP_5.add(Gender_F);
        JP_6.add(JP_5);
        JP_0.add(JP_6);
        
        setLayout(new GridBagLayout());
        GridBagConstraints GBC = new GridBagConstraints();   
        GBC.gridx=0;
        GBC.gridy=0;
        add(JL,GBC);
        GBC.gridx=0;
        GBC.gridy=1;
        add(JP_0,GBC);
        GBC.gridx=0;
        GBC.gridy=2;
        add(Submit,GBC);
    }
}

