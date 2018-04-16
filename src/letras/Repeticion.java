/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import java.util.Scanner;

/**
 *
 * @author LautaroAlejo
 */
public class Repeticion {

    private String cadena;
    private String a;

    public Repeticion() {
    }

    public void cargarCad() {
        Vocales ingreso = new Vocales();
        setCadena(ingreso.cargarCadena());
        Scanner ingresar = new Scanner(System.in);
        System.out.println("Ingrese Char");
        setA(ingresar.nextLine());
    }

    public int contarRep() {
        char b = getA().charAt(0);
        int rep = 0;
        int i = (getCadena().length() - 1);
        String cadmay = getCadena().toUpperCase();
        while (i >= 0) {
            if (getCadena().charAt(i) == b || cadmay.charAt(i) == b) {
                rep = rep + 1;
            }
            i = i - 1;
        }
        return rep;
    }

    /**
     * @return the cadena
     */
    public String getCadena() {
        return cadena;
    }

    /**
     * @param cadena the cadena to set
     */
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    /**
     * @return the a
     */
    public String getA() {
        return a;
    }

    /**
     * @param a the a to set
     */
    public void setA(String a) {
        this.a = a;
    }
}
