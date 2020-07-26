/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.octal.decimal;

/**
 *
 * @author bryan
 */
public class Numero {
    private int base;
    private int numero;

    public Numero(int base, int numero) {
        this.base = base;
        this.numero = numero;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
