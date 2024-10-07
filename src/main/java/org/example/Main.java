package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear colores
        Color red = new Red();
        Color blue = new Blue();
        Color green = new Green();
        Color yellow = new Yellow();

        // Crear figuras con diferentes colores
        Shape circle = new Circle(red);
        Shape square = new Square(blue);
        Shape triangle = new Triangle(green);

        // Dibujar las figuras con los colores aplicados
        circle.draw();      // Dibujando un círculo. Color rojo aplicado.
        square.draw();      // Dibujando un cuadrado. Color azul aplicado.
        triangle.draw();    // Dibujando un triángulo. Color verde aplicado.
    }
}