/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4b;

import java.util.Scanner;

/**
 *
 * @author aparracorbacho
 */
public class Boletin4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float km, litros, pGas, tempo;
    System.out.println("Introduce los kilometros");
    Scanner kmTeclado = new Scanner(System.in);
    km = kmTeclado.nextFloat();
    
   // System.out.println("Introduce los litros consumidos");
   // Scanner litrosTeclado = new Scanner(System.in);
   // litros = litrosTeclado.nextFloat();
     litros = (float) 50;
       
   // System.out.println("Introduce la velocidad media");
   // Scanner vMedTeclado = new Scanner(System.in);
   // vMed = vMedTeclado.nextFloat();
    
   // System.out.println("Introduce o prezo da gasolina");
   // Scanner pGasTeclado = new Scanner(System.in);
   // pGas = pGasTeclado.nextFloat();
     pGas = (float) 1.57;
    
      System.out.println("Introduce el tiempo del viaje en horas");
      Scanner tempoTeclado = new Scanner(System.in);
      tempo = tempoTeclado.nextFloat();
      Consumo consu = new Consumo(km, litros, tempo, pGas);
      System.out.println("El tiempo del viaje es: "+ consu.getTempo() );
      System.out.println("El consumo medio es: "+ consu.consumoMedio() );
      System.out.println("El consumo en euros es: "+ consu.consumoEuros());
      System.out.println("La velocidad media es : "+ consu.velocidadMedia());
      
      //Cambiamos el precio de la gasolina y calculamos el valor del viaje
      System.out.println("Introduce el nuevo precio de la gasolina");
      Scanner pGasTeclado = new Scanner(System.in);
      pGas = pGasTeclado.nextFloat();
      consu.nuevoPrecio(pGas);
      System.out.println("El nuevo precio de la gasolina es :"+ consu.pGas);
      
      
    }
    
}
