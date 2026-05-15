/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labo7;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class nododatospunteros {

    public static void main(String[] args) {

        Nodo n1 = new Nodo(13);
        Nodo n2 = new Nodo(25);

        // unir nodos
        n1.siguiente = n2;

        System.out.println(n1.dato);
        System.out.println(n1.siguiente.dato);
    }
}
