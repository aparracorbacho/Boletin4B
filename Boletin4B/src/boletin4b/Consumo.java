/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4b;

/**
 *
 * @author aparracorbacho
 */
public class Consumo {
        public float km, litros, vMed, pGas, tempo;   
        //constructores
        public Consumo(){
        }
        public Consumo(float kmc, float litrosc, float tempoc, float pGasc){
            km = kmc;
            litros = litrosc;
            tempo = tempoc;
            pGas = pGasc;
        }
        //metodos de acceso
        public void nuevoPrecio(float pGasc){
            pGas = pGasc;
        }
        public void setTempo (float tempoc){
        tempo = tempoc;
        }
        public float getTempo(){
        return tempo;
        }
        public float consumoMedio(){
            float consumom;
            consumom = (litros/km)*100;
            return consumom;
        }
        public float consumoEuros(){
            float consumoe;
            consumoe = litros*pGas;
            return consumoe;
        }
        public float velocidadMedia(){
            float velocidadm;
            velocidadm = km/tempo;
            return velocidadm;
        }
        }
      
        
