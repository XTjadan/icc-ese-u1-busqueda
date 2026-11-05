import java.util.List;

import models.Persona;

public class BusquedaLineal {
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas){
        this.personas = personas;

    }

    //Busque una persona
    //Retornoe la persona si lo encuentra
    //Retorne --null-- si no lo encuentra

    public Persona findByName(String name){
        for(int i = 0 ; i < personas.size() ; i++){
            if(personas.get(i).getName().equals(name))
                return personas.get(i);

        }

        return null;

    }
    
    //Busque la pos de una persona
    //Retornoe la pos persona si lo encuentra
    //Retorne _____-1_____ si no lo encuentra

    public int findPosByName(String name){
        
        for(Persona persona : personas){
            if(persona.getName().equals(name)){
                return personas.indexOf(persona);
            }
        }
        for(int i = 0 ; i < personas.size() ; i ++){
            if(personas.get(i).getName().equals(name)){
                return i;
                
            }


        }
        return -1;
    }





    
}
