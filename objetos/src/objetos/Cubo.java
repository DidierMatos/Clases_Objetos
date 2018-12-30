/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
import java.lang.Math;

/**
 *
 * @author didier
 */
public class Cubo extends Cuadrado{
    public double a;

    public Cubo(double lado) {
        super(lado);

        this.a = lado;
        
}
    



    public  double Volumen(){
        return Math.pow(this.a,3);
    }


    public   double Perimetro(boolean p)
    {

        if (p){
           return super.Perimetro ();
        }
        else{
            return this.a*12;
        }


    }
}

