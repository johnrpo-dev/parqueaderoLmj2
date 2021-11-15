/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmj2.modelos;

/**
 *
 * @author johns
 */
public class Ticket {
    
    private int id;
    private String placa_vehiculo;
    private String ingreso;
    private String salida;
    private String estadia;
    private int precio;

    public Ticket() {
    }

    public Ticket(int id, String placa_vehiculo, String ingreso, String salida, String estadia, int precio) {
        this.id = id;
        this.placa_vehiculo = placa_vehiculo;
        this.ingreso = ingreso;
        this.salida = salida;
        this.estadia = estadia;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca_vehiculo() {
        return placa_vehiculo;
    }

    public void setPlaca_vehiculo(String placa_vehiculo) {
        this.placa_vehiculo = placa_vehiculo;
    }

    public String getIngreso() {
        return ingreso;
    }

    public void setIngreso(String ingreso) {
        this.ingreso = ingreso;
    }

    public String getSalida() {
        return salida;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public String getEstadia() {
        return estadia;
    }

    public void setEstadia(String estadia) {
        this.estadia = estadia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    
    
}
