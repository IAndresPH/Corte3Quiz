package com.corhuila.BackendNoSQL.dto;

public class ProveedorDto {
    private int codigo;
    private String primerNombre;
    private String primerApellido;
    private String direccion;
    
    public ProveedorDto() {}

    public ProveedorDto(int codigo, String primerNombre, String primerApellido, String direccion) {
        this.codigo = codigo;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.direccion = direccion;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
