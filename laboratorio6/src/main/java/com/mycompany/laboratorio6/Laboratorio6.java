/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.laboratorio6;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
class ColaCircular {

    int[] cola = new int[5];
    int frente = 0;
    int fin = -1;
    int tamaño = 0;
    
    void enqueue(int dato) {
        if (tamaño == cola.length) {
            System.out.println("Cola llena");
            return;
        }
        fin = (fin + 1) % cola.length;
        cola[fin] = dato;
        tamaño++;
    }
    void dequeue() {

        if (tamaño == 0) {
          System.out.println("Cola vacía");
          return;
        }
        System.out.println("Eliminado: " + cola[frente]);

        frente = (frente + 1) % cola.length;
        tamaño--;
    }
    void mostrar() {

        for (int i = 0; i < tamaño; i++) {
            System.out.print(cola[(frente + i) % cola.length] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {

      ColaCircular c = new ColaCircular();

      c.enqueue(10);
      c.enqueue(20);
      c.enqueue(30);
      c.mostrar();
      c.dequeue();
      c.mostrar();
    }
}