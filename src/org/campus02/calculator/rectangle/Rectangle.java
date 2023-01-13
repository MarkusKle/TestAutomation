package org.campus02.calculator.rectangle;

public class Rectangle {

    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }


    // berechne den Umfang
    public int berechneUmfang() {
        int umfang = (2 * a) + (2 * b);
        return umfang;
    }

    public int berechneFlaeche(){
        int flaeche = a * b;
        return flaeche;
    }
}
