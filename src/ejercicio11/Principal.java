/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.awt.Color;

/**
 *
 * @author Estudiante
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pantalla obj = new  Pantalla();
        obj.setVisible(true);
        obj.setLocationRelativeTo(null);
        obj.getContentPane().setBackground(Color.gray);//recupera el contenedor
    }
}
