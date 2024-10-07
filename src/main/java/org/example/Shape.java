package org.example;

/**
 * Interfaz abstracta que define una figura geométrica.
 * Usa un color para aplicar a la figura.
 */
public abstract class Shape {
    protected Color color;  // Color que se aplicará a la figura

    public Shape(Color color) {
        this.color = color;
    }

    abstract void draw();  // Método para dibujar la figura
}