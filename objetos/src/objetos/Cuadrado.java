/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author didier
 */
public class Cuadrado {
    public double a;

    public  Cuadrado(double valorlado) {
        this.a =  valorlado;
}

public  double Area(){
        return this.a * this.a;
    }

    public  double Perimetro()
    {
        return this.a *4;
    }
}

