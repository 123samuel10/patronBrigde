package org.example;

/**
 * Clase que representa un triángulo.
 */
public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.print("Dibujando un triángulo. ");
        color.applyColor();  // Aplica el color al triángulo
    }
}