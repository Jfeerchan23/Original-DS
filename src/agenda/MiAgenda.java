/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import static agenda.AgendaCSV.recuperarCSV;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cristian Riffo Huez
 */
public class MiAgenda {

    //clase para poder acceder a la agenda desde cualquier formulario
    //ArrayList fue la forma que encontre de tener un arreglo dinamico
    private static List<Contacto> agenda = new ArrayList<Contacto>();

    public MiAgenda() {
  
       recuperarCSV();
    }

    
    
    public static void agregarContacto(Contacto datos, int x){
        switch(x){
            case 0:
                 agenda.add(datos);
                 AgendaCSV.guardarContactoCSV(datos);
                 break;
             case 1:   
                  agenda.add(datos);
                break ;   
        }
        
        
        
      
    

      
    }
    
    public static Iterator getContactosIterador(){
        List <String[]> temp = new ArrayList();
        for(int i=0; i<agenda.size();i++){
          String[] temp2={agenda.get(i).getNombre(),agenda.get(i).getApellido(),
             agenda.get(i).getGenero(),agenda.get(i).getTipoFono().getTipo(),agenda.get(i).getNumeroFono(),agenda.get(i).getCorreo()};
           temp.add(temp2);
        }
        Iterator i=temp.iterator();
        return i;
    }
    
}
