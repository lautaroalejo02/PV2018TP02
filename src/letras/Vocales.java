/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

import java.util.Scanner;

/**
 *
 * @author TiagoBrizuela
 */
public class Vocales {

    private String cadena;

    public Vocales() {
    }

    public String cargarCadena() {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese Cadena");
        setCadena(ingreso.nextLine());
        return getCadena();
    }

    public int obtenerVocales() {
        int vocales = 0;
        int i = (getCadena().length()) - 1;
        while (i >= 0) {
            if (getCadena().charAt(i) == 'a' || getCadena().charAt(i) == 'e' || getCadena().charAt(i) == 'i' || getCadena().charAt(i) == 'o' || getCadena().charAt(i) == 'u') {
                vocales = vocales + 1;
            }
            i = i - 1;
        }
        return vocales;
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

}
