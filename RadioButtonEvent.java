import javax.swing.*;

import java.awt.Color;

import java.awt.Graphics;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

public class RadioButtonEvent extends JFrame implements
ActionListener {

JRadioButton m,f,n;

RadioButtonEvent(){

m=new JRadioButton("Red");

f=new JRadioButton("Yellow");
n=new JRadioButton("Green");
m.setBounds(50, 50, 100, 20);

f.setBounds(50, 100, 100, 20);
n.setBounds(50, 150, 100, 20);
ButtonGroup bg=new ButtonGroup();

bg.add(m);

bg.add(f);
bg.add(n);
m.addActionListener(this);

f.addActionListener(this);
n.addActionListener(this);
add(m);

add(f);
add(n);
setSize(400,400);

setLayout(null);

setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
public void paint(Graphics gr)

{

gr.setColor(Color.red);

gr.drawRect(180, 40, 90, 240);

gr.setColor(Color.black);

gr.drawOval(200, 50, 50, 60);

gr.setColor(Color.gray);

gr.fillOval(200, 50, 50, 60);
gr.setColor(Color.black);

gr.drawOval(200, 125, 50, 60);

gr.setColor(Color.gray);

gr.fillOval(200, 125, 50, 60);
gr.setColor(Color.black);

gr.drawOval(200, 185, 50, 60);

gr.setColor(Color.gray);

gr.fillOval(200, 185, 50, 60);

if(m.isSelected())

{

gr.setColor(Color.red);

gr.fillOval(200, 50, 50, 60);

}

if(f.isSelected())

{

gr.setColor(Color.yellow);

gr.fillOval(200, 125, 50, 60);

}
if(n.isSelected())
{
gr.setColor(Color.green);
gr.fillOval(200, 185, 50, 60);
} 
}
public void actionPerformed(ActionEvent ae)

{

repaint();

}
public static void main(String[] args) {

SwingUtilities.invokeLater(new Runnable() {

public void run()

{

new RadioButtonEvent();

}

});

}

}