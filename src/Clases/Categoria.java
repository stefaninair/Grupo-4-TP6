/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Stefani Escobar
 */
public class Categoria {
    
    private String nombreCategoria;

    public Categoria() {
    }

    public Categoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }


    public String getNombreCategoria() {
        return nombreCategoria;
    }

    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public String toString() {
        return nombreCategoria ;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.nombreCategoria);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Categoria other = (Categoria) obj;
        if (!Objects.equals(this.nombreCategoria, other.nombreCategoria)) {
            return false;
        }
        return true;
    }

}