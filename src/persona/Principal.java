/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author MARIA
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        String nombres=""; String apellidos=""; String direccion="";
        int edad=0; double peso=0.0; double estatura=0.0;
        
        Persona persona1 = new Persona(nombres, apellidos, direccion, edad, peso, estatura);
        
        persona1.setNombres(nombres= JOptionPane.showInputDialog("Escriba sus nombres:")); 
        persona1.setApellidos(apellidos = JOptionPane.showInputDialog("Escriba sus apellidos:"));    
        persona1.setDireccion(direccion = JOptionPane.showInputDialog("Escriba su direccion:"));       
        persona1.setEdad(edad = Integer.parseInt(JOptionPane.showInputDialog("Escriba su edad:")));   
        persona1.setPeso(peso = Double.parseDouble(JOptionPane.showInputDialog("Escriba su peso:")));  
        persona1.setEstatura(estatura = Double.parseDouble(JOptionPane.showInputDialog("Escriba su estatura:")));
        
        persona1.mostrarDatos();
        persona1.mayorEdad();
        persona1.imc(peso, estatura);
        
        Scanner entrada = new Scanner(System.in);
        
        Persona persona2 = new Persona(nombres, apellidos, direccion, edad, peso, estatura);
        
        System.out.print("Escriba sus nombres: ");
        persona2.setNombres(nombres = entrada.next());
        System.out.print("Escriba sus apellidos: ");
        persona2.setApellidos(apellidos = entrada.next());
        System.out.println("Escriba su direccion: ");
        persona2.setDireccion(direccion= entrada.next());
        System.out.println("Escriba su edad: ");
        persona2.setEdad(edad = Integer.parseInt(entrada.next()));
        System.out.println("Escriba su peso: ");
        persona2.setPeso(peso = Double.parseDouble(entrada.next()));
        System.out.println("Escriba su estatura: ");
        persona2.setEstatura(estatura = Double.parseDouble(entrada.next()));
        
        persona2.mostrarDatos();
        persona2.mayorEdad();
        persona2.imc(peso, estatura);
    }
    
}
