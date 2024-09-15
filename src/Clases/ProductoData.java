/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Producto;
import java.util.ArrayList;

/**
 *
 * @author Stefani Escobar
 */
public class ProductoData {
        private ArrayList<Producto> lista= new ArrayList<>();
    
    public void guardarProducto (Producto p){
    lista.add(p);
    }
    
    public ArrayList<Producto> obtenerProductos(){
    return lista;
    }
    
    public void borrarProducto(Producto p){
    lista.remove(p);
    }
    
}
