/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;


public class Licencia {
    
    private String nombre;
    private String tipoD;
    private String identificacion;
    private String telefono;
    private String correo;
    private String direccion;
    private String representante;
    private String identiR;
    private String nombreP;
    private String sector;
    private String tipoProyecto;
    private String valor;
    private String region;
    private String departamento;
    private String municipio;
    private String vereda;
    private String rio;
    private String estado;
    private String pago;
    private ArrayList permisos;

   
    public String getNombre() {
        return nombre;
    }

    public String getTipoD() {
        return tipoD;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getRepresentante() {
        return representante;
    }

    public String getIdentiR() {
        return identiR;
    }
    
    public String getNombreP() {
        return nombreP;
    }

    public String getSector() {
        return sector;
    }

    public String getTipoProyecto() {
        return tipoProyecto;
    }

    public String getValor() {
        return valor;
    }
     public String getRegion() {
        return region;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getMunicipio() {
        return municipio;
    }

    public String getVereda() {
        return vereda;
    }

    public String getRio() {
        return rio;
    }

    public String getEstado() {
        return ("Recibido");
    }

    public String getPago() {
        return ("0");
    }

    public void setPago(String pago) {
        this.pago = pago;
    }
    

    public ArrayList getPermisos() {
        return permisos;
    }

    public void setPermisos(ArrayList permisos) {
        this.permisos = permisos;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoD(String tipoD) {
        this.tipoD = tipoD;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void setIdentiR(String identiR) {
        this.identiR = identiR;
    }
    
    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setTipoProyecto(String tipoProyecto) {
        this.tipoProyecto = tipoProyecto;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    public void setRegion(String region) {
        this.region = region;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setVereda(String vereda) {
        this.vereda = vereda;
    }
    
     public void setRio(String rio) {
        this.rio = rio;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
}
