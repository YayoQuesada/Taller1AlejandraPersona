/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author MARIA
 */
public class Persona {
    protected String nombres;
    protected String apellidos;
    protected String direccion;
    protected int edad;
    protected double peso;
    protected double estatura;

    public Persona(String nombres, String apellidos, String direccion, int edad, double peso, double estatura) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.edad = edad;
        this.peso = peso;
        this.estatura = estatura;
    }
    
    public void mayorEdad(){
        if (edad >= 18){
            System.out.println("La persona es MAYOR de edad");
        }
        else{
            System.out.println("La persona es MENOR de edad");
        }
    }
    
    public void mostrarDatos(){
        System.out.println("El nombbre de la persona es: "+nombres);
        System.out.println("El apellido de la persona es: "+apellidos);
        System.out.println("La direccion de la persona es: "+direccion);
        System.out.println("La edad de la persona es: "+edad);
        System.out.println("El peso de la persona es: "+peso);
        System.out.println("La estatura de la persona es: "+estatura);
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    
    public double imc(double peso, double estatura) {
        this.peso = peso;
        this.estatura = estatura;
        double imc = peso / (estatura * estatura);
        if(imc < 18.4){
            System.out.println("El estado de la persona es: Insuficiencia ponderal.");
        }else if(imc > 18.5 & imc < 24.9){
            System.out.println("El estado de la persona es: Normal.");
        }else if(imc > 25 & imc < 29.9){
            System.out.println("El estado de la persona es: Sobrepeso.");
        }else if(imc > 30 & imc < 34.9){
            System.out.println("El estado de la persona es: Obesidad 1.");
        }else if(imc > 35 & imc < 39.9){
            System.out.println("El estado de la persona es: Obesidad 2.");
        }else{
            System.out.println("El estado de la persona es: Obesidad 3.");
        }
        return imc;
    }
    
}

