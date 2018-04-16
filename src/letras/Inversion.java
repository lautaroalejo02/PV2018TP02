/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package letras;

/**
 *
 * @author LautaroAlejo
 */
public class Inversion {

    private String cadena;

    public String cargarCad() {
        Vocales ingreso = new Vocales();
        setCadena(ingreso.cargarCadena());
        return getCadena();
    }

    public void invertirCad() {
        String cadenainv = "";
        int i = getCadena().length() - 1;
        while (i >= 0) {
            cadenainv = cadenainv + getCadena().charAt(i);
            i = i - 1;
        }
        System.out.println(cadenainv);

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
