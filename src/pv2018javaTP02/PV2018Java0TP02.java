/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018javaTP02;

import fecha.Fecha;
import static java.lang.System.exit;
import java.util.Scanner;
import letras.Inversion;
import letras.Repeticion;
import letras.Vocales;

/**
 *
 * @author TiagoBrizuela
 */
public class PV2018Java0TP02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();// TODO code application logic here
    }

    public static void menu() {
        int opcion;
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Seleccione opcion");
        System.out.println("1-Dada una cadena mostrar por pantalla la cantidad de vocales que tiene");
        System.out.println("2-Dada una cadena invertirla");
        System.out.println("3-Dada una cadena y un caracter verificar cuantas veces se repite");
        System.out.println("4-Recibir la fecha de nacimiento y devuelve la edad en semanas");
        System.out.println("5-Este método recibe una fecha y devuelve el nombre de la estación en la que esta ubicada");
        System.out.println("6-Este método recibe dos fechas y devuelve la cantidad de días domingos comprendidos entre ambas fechas");
        System.out.println("7-Este método calcula la diferencia en días entre dos fechas dadas por el usuario como cadenas con el formato dd/mm/yy");
        System.out.println("8-Ingresa fecha y le agrega 100 dias");
        System.out.println("9-Salir");
        opcion = ingreso.nextInt();
        switch (opcion) {
            case 1:
                mostrarVocales();
                main(null);
            case 2:
                invertirCadena();
                main(null);
            case 3:
                obtenerRepeticiones();
                main(null);
            case 4:
                devolverEdadEnSemanas();
                main(null);
            case 5:
                obtenerEstacion();
                main(null);
            case 6:
                obtenerDomingos();
                main(null);
            case 7:
                obtenerDifDias();
                main(null);
            case 8:
                sumarCienDias();
                main(null);
            case 9:
                exit(0);
        }

    }

    public static void mostrarVocales() {
        Vocales obtVocales = new Vocales();
        obtVocales.cargarCadena();
        System.out.println("La cantidad de vocales es: " + obtVocales.obtenerVocales());
    }

    public static void invertirCadena() {
        Inversion inv = new Inversion();
        inv.cargarCad();
        inv.invertirCad();
    }

    public static void obtenerRepeticiones() {
        Repeticion obtRep = new Repeticion();
        obtRep.cargarCad();
        System.out.println("La cantidad de repeticiones es: " + obtRep.contarRep());
    }

    public static void devolverEdadEnSemanas() {
        Fecha obtFecha = new Fecha();
        obtFecha.ingresarFec();
        obtFecha.devolverLaEdadEnSemana();
    }

    public static void obtenerEstacion() {
        Fecha obtFecha = new Fecha();
        obtFecha.ingresarFec();
        System.out.println(obtFecha.obtEstacion());
    }

    public static void obtenerDomingos() {
        Fecha obtFecha = new Fecha();
        System.out.println("La diferencia es de " + obtFecha.obtDom() + " domingos");
    }

    public static void obtenerDifDias() {
        Fecha obtFecha = new Fecha();
        System.out.println("Diferencia: " + obtFecha.devolverDifDias());
    }

    public static void sumarCienDias() {
        Fecha obtFecha = new Fecha();
        obtFecha.devFecCien();
    }

}
