import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Registro extends JFrame implements ActionListener{
  private JTextField nombre;
  private JTextArea datos;
  private JScrollPane scroll;
  private JButton btn1;

  public class Registro(){
   setLayout(null);

   nombre = new JTextField();
   nombre.setBounds(10,10,150,30);
   add(nombre);

   datos = new JTextArea();
   
   scroll = new JScrollPane(datos);
   scroll.setBounds(10,50,300,380);
   add(scroll);

   btn1 = new JButton("Aceptar");
   btn1.setBounds(60,10,100,30);
   btn1.addActionListener(this);
   add(btn1);

 }
  public void actionPerformed(ActionEvent e){
   if(e.getSource() == btn1){
    String data = nombre.getText() + "\n";
    datos = setText(data)
    nombre.setText("")
    
  }
     public static void main(String args[]){
    Resgistro body = new Registro();
    body.setBounds(0,0,400,300);
    body.setLocationRelativeTo(null);
    body.setResizable(false);
    body.setVisible(true);
  }
 }
