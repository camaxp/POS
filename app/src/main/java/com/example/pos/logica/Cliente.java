package com.example.pos.logica;

import java.io.Serializable;

public class Cliente implements Serializable {

    public String nombres;
    public String apellidos;
    public String correoElectronico;
    public String telefono;
    public String sexo;
    public String razonSocial;
    public String nit;
    public String contrasena;
    public String contrasena2;
    public Short aceptoChk;

    public Cliente(String nombres, String apellidos, String correoElectronico, String telefono, String sexo, String razonSocial, String nit, String contrasena, String contrasena2, Short aceptoChk) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.telefono = telefono;
        this.sexo = sexo;
        this.razonSocial = razonSocial;
        this.nit = nit;
        this.contrasena = contrasena;
        this.contrasena2 = contrasena2;
        this.aceptoChk = aceptoChk;
    }

    public Cliente() {
    }


    @Override
    public String toString() {
        return
                "  Nombres: " + nombres + "\n" +
                        ", Apellidos: " + apellidos + "\n" +
                        ", Correo Electronico: " + correoElectronico + "\n" +
                        ", Telefono: " + telefono + "\n" +
                        ", Sexo: " + sexo + "\n" +
                        ", Razon Social: " + razonSocial + "\n" +
                        ", Nit: " + nit + "\n";
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena2() {
        return contrasena2;
    }

    public void setContrasena2(String contrasena2) {
        this.contrasena2 = contrasena2;
    }

    public Short getAceptoChk() {
        return aceptoChk;
    }

    public void setAceptoChk(Short aceptoChk) {
        this.aceptoChk = aceptoChk;
    }
}
