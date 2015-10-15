/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2_1joptionpane;

import javax.swing.JOptionPane;

/**
 *
 * @author ngarciacarrillo
 */
public class Joptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float base, altura, area;
        String resposta = JOptionPane.showInputDialog("Teclea la base");
        //hola Aaron!
        base = Float.parseFloat(resposta);
        String resposta2 = JOptionPane.showInputDialog("Teclea la altura");
        altura = Float.parseFloat(resposta2);
        area = base+altura/2;
        JOptionPane.showMessageDialog(null,+area,"el area es ",JOptionPane.INFORMATION_MESSAGE);
        //Introduciendo un cambio
        //JOptionPane.showMessageDialog(null,"El area es "+area);
        
    }
    
}
