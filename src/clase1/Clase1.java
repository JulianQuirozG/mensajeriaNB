/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase1;

import vista.login;

/**
 *
 * @author Julian
 */
public class Clase1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        login vistaLogin = new login();
        vistaLogin.getContentPane().setBackground( new java.awt.Color(255, 255, 255));
        vistaLogin.setVisible(true);
    }
    
}
