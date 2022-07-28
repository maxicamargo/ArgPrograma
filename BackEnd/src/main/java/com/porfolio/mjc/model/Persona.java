package com.porfolio.mjc.model;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Persona {
    private Long id;
    private String nombre;
    private String apellido;
    private String img;
    
    
    //Constructores
    public Persona(){
        
    }
    
    public Persona(Long id, String nombre, String apellido, String img){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.img = img;
    }
    
}
