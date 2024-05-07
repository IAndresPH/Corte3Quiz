package com.corhuila.BackendNoSQL.collections;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "proveedores")
public class Proveedor {
    @Id
    private String identificacion;
    private int codigo;
    private String primerNombre;
    private String primerApellido;
    private String direccion;
    
    public Proveedor() {}

    public Proveedor(String identificacion, int codigo, String primerNombre, String primerApellido, String direccion) {
        this.identificacion = identificacion;
        this.codigo = codigo;
        this.primerNombre = primerNombre;
        this.primerApellido = primerApellido;
        this.direccion = direccion;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
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
