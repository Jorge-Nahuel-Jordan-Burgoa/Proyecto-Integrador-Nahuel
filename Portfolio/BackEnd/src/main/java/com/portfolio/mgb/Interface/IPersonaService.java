package com.portfolio.mgb.Interface;

import com.portfolio.mgb.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer un lista de Personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de Tipo Persona
    public void savePersona(Persona persona);
            
    //Eliminar un objeto pero lo buscamos por ID
    public void deletePersona(Long id);
    
    //Buscar una perdona por ID
    public Persona findPersona(Long id);
}
