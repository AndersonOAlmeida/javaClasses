package entities;

import entities.enums.Color;

/* Para transformar um método em abstrato, é necessário transformar toda a classe em abstrata, o que torna um objeto Shape não
 * instanciável */
public abstract class Shape {
    protected Color color;

    public Shape(){}

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    /* O método area() é um método abstrato, pois cada classe tem sua area calculada de forma diferente, o que torna a sobrescrita
     * do método necessário em cada classe */
    public abstract double area();
}
