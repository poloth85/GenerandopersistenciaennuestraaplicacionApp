package net.copaba.integrandowebservicesanuestraaplicacion.pojo;

import java.io.Serializable;

/**
 * Created by Polo on 17/08/16.
 */
public class Pet implements Serializable {
    private int id;
    private String nombre;
    private int foto;
    private int likes;

    public Pet(int id, String nombre, int foto, int likes) {
        this.id = id;
        this.nombre = nombre;
        this.foto = foto;
        this.likes = likes;
    }

    public Pet() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }
}
