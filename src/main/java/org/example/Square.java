package org.example;

/**
 * Clase que representa un cuadrado.
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando un cuadrado. ");
        color.applyColor();  // Aplica el color al cuadrado
    }
}
