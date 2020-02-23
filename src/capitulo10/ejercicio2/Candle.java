package capitulo10.ejercicio2;

import java.awt.Color;

public class Candle {
    private Color color;
    private Double height;
    private Double price;
    private Integer pricexinch;

    public Candle() {
        this.pricexinch=2;
    }
    
    public Color getColor() {
        return color;
    }
    
    public Double getHeight() {
        return height;
    }

    public Double getPrice() {
        return price;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHeight(Double height) {
        this.height = height;
        this.price = pricexinch*height;
    }   
    
}
