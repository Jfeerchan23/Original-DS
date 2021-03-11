/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.util.logging.Logger;

/**
 *
 * @author fer_c
 */
public class Contacto {
    private String nombre;
    private String apellido;
    private String genero;
    enum tipoTel{
       Fijo("Fijo"),
       Celular ("Celular");
     
    private  String tipo;
    
    private tipoTel(String tipo){
        this.tipo=tipo;
    }   
    
    public String getTipo(){
        return tipo;
    }
    
    }
    private tipoTel tipoFono;
    private String numeroFono;
    private String correo;
    public Contacto(String nombre, String apellido,
            String genero, String tipoFono, String numeroFono, String correo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.tipoFono = tipoTel.valueOf(tipoFono);
        this.numeroFono = numeroFono;
        this.correo=correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public tipoTel getTipoFono() {
        return tipoFono;
    }

    public void setTipoFono(tipoTel tipoFono) {
        this.tipoFono = tipoFono;
    }

    public String getNumeroFono() {
        return numeroFono;
    }

    public void setNumeroFono(String numeroFono) {
        this.numeroFono = numeroFono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    

}
