/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin5switch;

import javax.swing.JOptionPane;

/**
 *
 * @author propa
 */
public class Switch {
    public final double PI=3.14;

    public Switch() {
    }
   public void Comparacion(){
   String opcion;
   opcion=JOptionPane.showInputDialog("***MENU***\\n 1 -> Cuadrado.\\n 2 -> Triángulo.\\n 3 -> Círculo.");
   switch(opcion){
       case"1":
           String dato=JOptionPane.showInputDialog("introducir lado");
           double l= Double.parseDouble(dato);
           JOptionPane.showMessageDialog(null,"el area es "+ l*l);
         break;
         
         case"2":
             String dato2=JOptionPane.showInputDialog("teclea base");
             String dato3=JOptionPane.showInputDialog("teclea altura");
             double b=Double.parseDouble(dato2);
             double a=Double.parseDouble(dato3);
             double area=a*b/2;
             JOptionPane.showMessageDialog(null, "el area es "+area);
             break;
             
             case"3":
                 String dato4=JOptionPane.showInputDialog("Insire radio");
                 double r=Double.parseDouble(dato4);
                 double r1=Math.pow(r, 2);
                 JOptionPane.showMessageDialog(null,"el area es: "+r1*PI);
                 break;
             default:
                 JOptionPane.showMessageDialog(null,"opcion no válida");
                 
                 
             
        
   }
    
}}
