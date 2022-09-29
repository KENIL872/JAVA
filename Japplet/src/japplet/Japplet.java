/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Japplet;
//import java.awl.*;


import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author dell
 */
public class Japplet extends JApplet{

    /**
     * @param args the command line arguments
     */
//    JPanel j=new JPanel();
    JLabel a=new JLabel("Enter Your Name ");
    JLabel c=new JLabel("Select Your Hobby ");
    JLabel d=new JLabel("Select Your Gender ");
    JLabel b=new JLabel("Enter Your City ");
    JTextField aa=new JTextField(20);
    JTextField bb=new JTextField(20);
    JButton s=new JButton("Save");
    JCheckBox c1=new JCheckBox("Sports");
    JCheckBox c2=new JCheckBox("Drawing");
    JCheckBox c3=new JCheckBox("Painting");
    JCheckBox c4=new JCheckBox("Reading");
    JRadioButton g1=new JRadioButton("Male");
    JRadioButton g2=new JRadioButton("Female");
    ButtonGroup gen=new ButtonGroup();
    public void init()  {
//        super.init(); //To change body of generated methods, choose Tools | Templates.
         try{
         setLayout(new FlowLayout());
        add(a);
        add(aa);
        add(b);
        add(bb);
        add(c);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(d);
        add(g1);
        add(g2);
        //add(gen);
        add(s);
       
        s.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 try{String hobby="";
        String gender="";
        if(c1.isSelected())
        {
            hobby+="Sports";
        }
        if(c2.isSelected())
        {
            if(hobby!="")
            {
            hobby+=" , Drawing";}
            else{
            hobby+="Drawing";}
        }    
       
        if(c3.isSelected())
        {
            if(hobby!="")
            {
            hobby+=" , Painting";}
            else{
            hobby+="Painting";}
        }
        if(c4.isSelected())
        {
            if(hobby!="")
            {
            hobby+=" , Reading";}
            else{
            hobby+="Reading";}
        }
        if(g1.isSelected())
        {
            gender="Male";
        }
        if(g2.isSelected())
        {
            gender="Female";
        }
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql:///stud","root","");
            PreparedStatement p=con.prepareCall("insert into info values(?,?,?,?)");
            p.setString(1, aa.getText());
            p.setString(2, bb.getText());
            p.setString(3, gender);
            p.setString(4, hobby);
            p.executeUpdate();
         }
        catch(Exception e1){
            System.out.println(e1);
        }
             }
         });
         }
          catch(Exception e2){
            System.out.println(e2);
        }
   }
}

