/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import Clases.Categoria;
import java.util.ArrayList;

/**
 *
 * @author Stefani Escobar
 */
public class CategoriaData {
    
    public ArrayList<Categoria> obtenerCategorias(){
        
    
    ArrayList<Categoria> lista= new ArrayList<>();
    
    lista.add (new Categoria ("Perfumería"));
    lista.add (new Categoria ("Artefactos"));
    lista.add (new Categoria ("Electrodomésticos"));
    lista.add (new Categoria ("Ropa"));
    lista.add (new Categoria ("Art. de Limpieza"));
    lista.add (new Categoria ("Fiambres"));
    lista.add (new Categoria ("Lácteos"));
    return lista;
}
}

