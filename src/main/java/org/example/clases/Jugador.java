package org.example.clases;

public class Jugador {

    private String nombre;
    private int edad;
    private String apellidos;
    private int numeroCamiseta;
    private String posicion;
    private String equipoDondeJuega;

    public Jugador() {
    }

    public Jugador(String nombre, int edad, String apellidos, int numeroCamiseta, String posicion, String equipoDondeJuega) {
        this.nombre = nombre;
        this.edad = edad;
        this.apellidos = apellidos;
        this.numeroCamiseta = numeroCamiseta;
        this.posicion = posicion;
        this.equipoDondeJuega = equipoDondeJuega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNumeroCamiseta() {
        return numeroCamiseta;
    }

    public void setNumeroCamiseta(int numeroCamiseta) {
        this.numeroCamiseta = numeroCamiseta;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipoDondeJuega() {
        return equipoDondeJuega;
    }

    public void setEquipoDondeJuega(String equipoDondeJuega) {
        this.equipoDondeJuega = equipoDondeJuega;
    }
}
