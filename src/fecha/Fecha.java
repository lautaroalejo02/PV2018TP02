/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fecha;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author LautaroAlejo
 */
public class Fecha {

    private String fecNac;
    private String dia;
    private String mes;
    private String año;

    public Fecha() {
    }

    public Date brindarFecha() {
        Date hoy = new Date();
        return hoy;
    }

    public String ingresarFec() {
        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingrese Fecha");
        setFecNac(ingreso.nextLine());
        return getFecNac();
    }

    public Date pasarStringADate() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date fechaDevuelta = formato.parse(getFecNac());
            return fechaDevuelta;
        } catch (ParseException e) {
            System.out.println("No se puede Formatear");
            return null;
        }
    }

    public void devolverLaEdadEnSemana() {
        double b;
        b = ((brindarFecha().getTime() - pasarStringADate().getTime()) / 86400000) / 7;
        System.out.println("La edad en semanas es: " + b);
    }

    public String obtEstacion() {
        int a;
        a = pasarStringADate().getMonth();
        String estacion;
        if (a >= 1 || a <= 3) {
            estacion = "Verano";
            return estacion;
        } else {
            if (a >= 4 || a <= 6) {
                estacion = "Otoño";
                return estacion;
            } else {
                if (a >= 7 || a <= 9) {
                    estacion = "Invierno";
                    return estacion;
                } else {
                    if (a >= 10 || a <= 12) {
                        estacion = "Primavera";
                        return estacion;
                    } else {
                        return "Mes invalido";
                    }
                }
            }
        }
    }

    public double obtDom() {
        ingresarFec();
        Date a = pasarStringADate();
        ingresarFec();
        Date b = pasarStringADate();
        double c;
        double d;
        c = ((a.getTime() - b.getTime()) / 86400000) / 7;
        d = c / 7;
        int dom;
        dom = (int) d;
        return dom;
    }

    public int devolverDifDias() {
        ingresarFec();
        Date a = pasarStringCortoADate();
        ingresarFec();
        Date b = pasarStringCortoADate();
        double c;
        c = (a.getTime() - b.getTime()) / 86400000;
        int d = (int) c;
        return d;
    }

    public Date pasarStringCortoADate() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yy");
        try {
            Date fechaDevuelta = formato.parse(getFecNac());
            return fechaDevuelta;
        } catch (ParseException e) {
            System.out.println("No se puede Formatear");
            return null;
        }
    }

    public void devFecCien() {
        ingresarFec();
        Date a = pasarStringADate();
        Date b = sumarCienDias(a);
        cortarFecha(b);
        System.out.println(getDia() + " de " + getMes() + " de " + getAño());

    }

    public void cortarFecha(Date b) {
        SimpleDateFormat nuevoDia = new SimpleDateFormat("dd");
        setDia(nuevoDia.format(b));
        SimpleDateFormat nuevoMes = new SimpleDateFormat("MMMM");
        setMes(nuevoMes.format(b));
        SimpleDateFormat nuevoAño = new SimpleDateFormat("yyyy");
        setAño(nuevoAño.format(b));

    }

    public Date sumarCienDias(Date a) {
        int b = 100;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(a);
        calendar.add(Calendar.DAY_OF_YEAR, b);
        return calendar.getTime();
    }

    public String getFecNac() {
        return fecNac;
    }

    /**
     * @param fecNac the fecNac to set
     */
    public void setFecNac(String fecNac) {
        this.fecNac = fecNac;
    }

    /**
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * @param dia the dia to set
     */
    public void setDia(String dia) {
        this.dia = dia;
    }

    /**
     * @return the mes
     */
    public String getMes() {
        return mes;
    }

    /**
     * @param mes the mes to set
     */
    public void setMes(String mes) {
        this.mes = mes;
    }

    /**
     * @return the año
     */
    public String getAño() {
        return año;
    }

    /**
     * @param año the año to set
     */
    public void setAño(String año) {
        this.año = año;
    }
}
