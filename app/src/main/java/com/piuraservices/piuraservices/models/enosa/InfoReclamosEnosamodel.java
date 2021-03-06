package com.piuraservices.piuraservices.models.enosa;

public class InfoReclamosEnosamodel {
    private long id;
    private long entidadempresa_id;
    private String nombre;
    private String descripcion;
    public InfoReclamosEnosamodel(){

    }

    public InfoReclamosEnosamodel(long id, long entidadempresa_id, String nombre, String descripcion) {
        this.id = id;
        this.entidadempresa_id = entidadempresa_id;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getEntidadempresa_id() {
        return entidadempresa_id;
    }

    public void setEntidadempresa_id(long entidadempresa_id) {
        this.entidadempresa_id = entidadempresa_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "InfoReclamosEnosamodel{" +
                "id=" + id +
                ", entidadempresa_id=" + entidadempresa_id +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
