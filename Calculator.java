import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculator extends JFrame implements ActionListener
{
 JFrame jf;
 JTextField inputbox;
 JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
 JButton b_plus,b_minus,b_mult,b_div,b_dot,b_equals,b_clear;

 public Calculator()
 {
   jf=new JFrame("CACULATOR");
   jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

   GridBagLayout layout = new GridBagLayout();
   GridBagConstraints gbc = new GridBagConstraints();
   jf.setLayout(layout); 

   inputbox=new JTextField(10);
   inputbox.setEditable(false);
   jf.add(inputbox);

   b0= new JButton("0");
   b1= new JButton("1");
   b2= new JButton("2");
   b3= new JButton("3");
   b4= new JButton("4");
   b5= new JButton("5");
   b6= new JButton("6");
   b7= new JButton("7");
   b8= new JButton("8");
   b9= new JButton("9");
   b_plus= new JButton("+");
   b_minus= new JButton("-");
   b_mult= new JButton("*");
   b_div= new JButton("/");
   b_dot= new JButton(".");
   b_equals= new JButton("=");
   b_clear= new JButton("C");

   b0.addActionListener(this);
   b1.addActionListener(this);
   b2.addActionListener(this);
   b3.addActionListener(this);
   b4.addActionListener(this);
   b5.addActionListener(this);
   b6.addActionListener(this);
   b7.addActionListener(this);
   b8.addActionListener(this);
   b9.addActionListener(this);
   b_plus.addActionListener(this);
   b_minus.addActionListener(this);
   b_mult.addActionListener(this);
   b_div.addActionListener(this);
   b_equals.addActionListener(this);
   b_dot.addActionListener(this);
   b_clear.addActionListener(this);

   gbc.fill = GridBagConstraints.HORIZONTAL;
   gbc.gridwidth = 3;
   gbc.gridx=0; gbc.gridy=0; jf.add(inputbox, gbc);
   gbc.gridwidth = 1;
   gbc.gridx=3; gbc.gridy=0; jf.add(b_equals, gbc);

   gbc.gridwidth = 1;

   gbc.gridx=0; gbc.gridy=1; jf.add(b1, gbc);
   gbc.gridx=1; gbc.gridy=1; jf.add(b2, gbc);
   gbc.gridx=2; gbc.gridy=1; jf.add(b3, gbc);
   gbc.gridx=3; gbc.gridy=1; jf.add(b_plus, gbc);

   gbc.gridx=0; gbc.gridy=2; jf.add(b4, gbc);
   gbc.gridx=1; gbc.gridy=2; jf.add(b5, gbc);
   gbc.gridx=2; gbc.gridy=2; jf.add(b6, gbc);
   gbc.gridx=3; gbc.gridy=2; jf.add(b_minus, gbc);

   gbc.gridx=0; gbc.gridy=3; jf.add(b7, gbc);
   gbc.gridx=1; gbc.gridy=3; jf.add(b8, gbc);
   gbc.gridx=2; gbc.gridy=3; jf.add(b9, gbc);
   gbc.gridx=3; gbc.gridy=3; jf.add(b_div, gbc);

   gbc.gridx=0; gbc.gridy=4; jf.add(b_dot, gbc);
   gbc.gridx=1; gbc.gridy=4; jf.add(b0, gbc);
   gbc.gridx=2; gbc.gridy=4; jf.add(b_clear, gbc);
   gbc.gridx=3; gbc.gridy=4; jf.add(b_mult, gbc);

   jf.setSize(200,200);
   jf.setVisible(true);

 }

 public void actionPerformed(ActionEvent ae)
 {
   String temp = ae.getActionCommand();
   if(temp.charAt(0)== 'C')
      inputbox.setText("");
   
   else if(temp.charAt(0)== '=')
   {
     try
     {
      inputbox.setText(eval(inputbox.getText()));
     }
     catch(ArithmeticException e)
     {
      System.out.println(e);
     }
   }

   else
      inputbox.setText(inputbox.getText() + temp);

 }
 public static String eval(String exp)
 {
    char[] ch = exp.toCharArray();
    String s1=""; String s2=""; String op="";
    double result;
    int l=ch.length;

     for(int i=0; i<l; i++)
     {
       if((ch[i]>='0' && ch[i]<='9') || ch[i]=='.')
       {
          if(op.isEmpty())
           s1=s1+ch[i];
          else
           s2=s2+ch[i];

       }
        if(ch[i]=='+' || ch[i]=='-' || ch[i]=='*' || ch[i]=='/' || ch[i]=='%')
          op=op+ch[i];
     }
     
     
      if(op.equals("+"))
       result = Double.parseDouble(s1) + Double.parseDouble(s2);

      else if(op.equals("-"))
       result = Double.parseDouble(s1) - Double.parseDouble(s2);

      else if(op.equals("/"))
       result = Double.parseDouble(s1) / Double.parseDouble(s2);

      else
       result = Double.parseDouble(s1) * Double.parseDouble(s2);


     return s1 + op + s2 +"=" +result;
      
}
 

  
 public static void main(String[] args)
 {
  SwingUtilities.invokeLater(new Runnable()
  {
   public void run()
   {
     new Calculator();
   }
  });
 }
}