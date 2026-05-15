/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.laboratorio6;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
class Nodo {

    int dato;
    Nodo siguiente;

    Nodo(int dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
class Cola {

    Nodo frente;
    Nodo fin;
    void enqueue(int dato) {

        Nodo nuevo = new Nodo(dato);

        if (fin == null) {
            frente = nuevo;
            fin = nuevo;
            return;
        }

        fin.siguiente = nuevo;
        fin = nuevo;
    }

    // DEQUEUE
    void dequeue() {

        if (frente == null) {
            System.out.println("Cola vacía");
            return;
        }

        System.out.println("Eliminado: " + frente.dato);

        frente = frente.siguiente;

        if (frente == null) {
            fin = null;
        }
    }

    // MOSTRAR
    void mostrar() {

        Nodo actual = frente;

        while (actual != null) {
            System.out.print(actual.dato + " ");
            actual = actual.siguiente;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Cola c = new Cola();

        c.enqueue(10);
        c.enqueue(20);
        c.enqueue(30);

        c.mostrar();

        c.dequeue();

        c.mostrar();
    }
}