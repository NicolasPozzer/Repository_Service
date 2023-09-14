/*====================================================================
===============EN ESTA CLASE VA TODA LA LOGICA DE NEGOCIOS============
=====================================================================*/

package com.demo.Repository_.Service.service;

import com.demo.Repository_.Service.model.Persona;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService implements IPersonaService{//Implementamos la interface


    @Override
    public void crearPersona(Persona per) {
        //Aca va toda la logica de creacion
        System.out.println("Persona creada");
    }

    @Override
    public List<Persona> traerPersonas() {
        //Aca deveria ir la logica para devolver la lista de personas
        return null;
    }
}
