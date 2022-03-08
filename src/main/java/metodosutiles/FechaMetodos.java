/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosutiles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Cris
 */
public class FechaMetodos {

    private int dia;
    private int mes;
    private int anio;

    //Métodos
    //Comprueba si existe la fecha(da true si existe)
    private boolean comprobarFecha(int dia, int mes, int anio) {

        boolean fecha = true;
        try {
            //Primero creamos una fecha y lo almacenamos en un LocalDate.of
            LocalDate.of(anio, mes, dia);

            //Si recoge alguna excepción da false
        } catch (IllegalArgumentException iae) {

            fecha = false;

        }
        return fecha;
    }

    //Dice si el año es bisiesto o no
    public boolean bisiesto() {
        boolean isbisiesto = false;
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);

        if (fechaCompuesta.isLeapYear()) {
            isbisiesto = true;
        }
        return isbisiesto;
    }

    //Dice el número de días que tiene el mes 
    public int diaMes() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);

        int diasMensuales = fechaCompuesta.lengthOfMonth();

        return diasMensuales;
    }

    //Muestra la fecha en formato corto(x-x-x)
    public String mostrarFechaCorta() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fechaFomateada = fechaCompuesta.format(formato);
        return fechaFomateada;
    }

    public String mostrarFechaLarga() {
        String configSistema = Locale.getDefault().getDisplayLanguage(Locale.ENGLISH);
//        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
//        DateTimeFormatter formato = DateTimeFormatter.ofPattern("EEEE ");
//        String fechaFomateada = fechaCompuesta.format(formato);
        return configSistema;
    }

    //Muestra el dia de la semana
    public int diaSemana() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        //Con getValue() lo que hace es que aparece en número del día(1 Lunes, 2 martes, 3 miércoles, etc)
        return fechaCompuesta.getDayOfWeek().getValue();
    }

    //Devuelve del nº de día entre una fecha y otra
    public static long diaEntreFechas(FechaMetodos ini, FechaMetodos fin) {
        //Pasamos el objeto fecha a LocalDate
        LocalDate inicio = LocalDate.of(ini.getAnio(), ini.getMes(), ini.getDia());
        LocalDate finalizar = LocalDate.of(fin.getAnio(), fin.getMes(), fin.getDia());

        //Restamos
        long resultado = ChronoUnit.DAYS.between(inicio, finalizar);

        //Devolvemos el resultado
        return resultado;
    }

    //Suma 1 día (va al día siguiente)
    public void siguiente() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);

        LocalDate resultado = fechaCompuesta.plusDays(1);
        this.dia = resultado.getDayOfMonth();
        this.mes = resultado.getMonthValue();
        this.anio = resultado.getYear();
    }

    //Resta un dia(va al día anterior)
    public void anterior() {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate resultado = fechaCompuesta.minusDays(1);
        this.dia = resultado.getDayOfMonth();
        this.mes = resultado.getMonthValue();
        this.anio = resultado.getYear();
    }

    //Copia la fecha en un objeto de tipo Fecha
    public FechaMetodos copia() {
        FechaMetodos resultado = new FechaMetodos(dia, mes, anio);
        return resultado;
    }

    //Copia la fecha en un objeto de tipo Fecha
    //Este es un método de clase
    public static FechaMetodos copia(FechaMetodos aux) {
        FechaMetodos nueva = new FechaMetodos(aux.getDia(), aux.getMes(), aux.getAnio());
        return nueva;
    }

    //Compara dos fechas
    public boolean igual(FechaMetodos fecha) {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());

        return fechaParametrizado.equals(fechaCompuesta);
    }

    public boolean menorFecha(FechaMetodos fecha) {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        
        return fechaParametrizado.isBefore(fechaCompuesta);

    }

    public boolean mayorFecha(FechaMetodos fecha) {
        LocalDate fechaCompuesta = LocalDate.of(anio, mes, dia);
        LocalDate fechaParametrizado = LocalDate.of(fecha.getAnio(), fecha.getMes(), fecha.getDia());
        
        return fechaParametrizado.isAfter(fechaCompuesta);
    }

    //Constructor por defecto con valores predeterminados
    public FechaMetodos() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 2022;
    }

    //Constructor parametrizado
    public FechaMetodos(int dia, int mes, int anio) {

        if (comprobarFecha(dia, mes, anio)) {

            this.dia = dia;
            this.mes = mes;
            this.anio = anio;

        } else {

            throw new IllegalArgumentException("No se ha creado la fecha correctamente.");

        }
    }

    //getters y setters
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (comprobarFecha(dia, mes, anio)) {
            this.dia = dia;
        }

    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (comprobarFecha(dia, mes, anio)) {
            this.mes = mes;
        }
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (comprobarFecha(dia, mes, anio)) {
            this.anio = anio;
        }

    }

    @Override
    public String toString() {
        return "Fecha{" + "dia=" + dia + ", mes=" + mes + ", anio=" + anio + '}';
    }

}
