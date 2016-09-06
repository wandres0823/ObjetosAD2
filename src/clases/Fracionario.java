/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

/**
 *
 * @author walbonis1
 */
public class Fracionario {
    private int numerador;
    private int denominador;
    public Fracionario (int numerado, int denominador){
       this .numerador=numerador;
       this.denominador=denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public int getDenominador() {
        return denominador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }
    public Fracionario sumar(Fracionario f2){
        Fracionario f;
        int num,den;
        
        num =this.numerador* f2.denominador+this.denominador*f2.numerador;
        den = this.denominador*f2.denominador;
         f = new Fracionario(num, den);
         return f;
    }
}
