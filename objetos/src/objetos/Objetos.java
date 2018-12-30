/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;
import java.util.Scanner;
/**
 *
 * @author didier
 */
public class Objetos {
    static Cubo objcubo;
    static double opegeometrica;
    static double lado;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("********************************************************* \n");
        System.out.print("*\t Area, Volumen, Perimetro de Cuadrado y Cubo \t* \n");
        System.out.print("*********************************************************\n");
        
        

        init ();


        loop ();


        scanner.nextLine();

    }
    
    private static void loop() {

        int opt = get_menu();

        while (opt != 5) {
            opegeometrica = calculate(opt, objcubo);

            System.out.println(" El valor es " + opegeometrica +"\n");
            System.out.print("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");

            opt = get_menu();
        }

        init();
        loop();
    }

    private static void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Ingrese el valor del lado del objeto: ");
        try {
            lado = Double.parseDouble(scanner.nextLine());
            objcubo = new Cubo(lado);
        } catch (NumberFormatException nfe) {
            System.out.println("El valor debe de ser un numero");
            System.out.print("-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-");
            init();
        }

    }

    public static double calculate(int opt, Cubo objcubo) {

        double result = 0;
        switch (opt) {
            case 1:
                result = objcubo.Perimetro(true);
                break;
            case 2:
                result = objcubo.Area();
                break;
            case 3:
                result = objcubo.Volumen();
                break;
            case 4:
                result = objcubo.Perimetro(false);
                break;
            case 5:
                init();
                break;
            case 6:
                System.out.println("Gracias por utilizar el programa");
                System.exit(0);
                break;

        }
        return result;
    }

    public static int get_menu() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("\n LADO ACTUAL INGRESADO:"+lado+"\n");
        System.out.print(" Ingrese una opcion que desee: \n");
        System.out.print(" 1: Perimetro del cuadrado \n");
        System.out.print(" 2: calcular area del cuadrado \n");
        System.out.print(" 3: calcular volumen del cubo \n");
        System.out.print(" 4: calcular perimetro del cubo \n");
        System.out.print(" 5: Reiniciar programa \n");
        System.out.print(" 6: Salir del programa \n");
        

        int opt = Integer.parseInt(scanner.nextLine());
        return opt;
        
        
    }
    


    
}

