/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Julian
 */
public class Usuario {
    
    private String Email;
    
    private String pass;
    
    private String nombre;

    public Usuario() {
    }

       
    public Usuario(String Email, String pass, String nombre) {
        this.Email = Email;
        this.pass = pass;
        this.nombre = nombre;
    }
    
    

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
