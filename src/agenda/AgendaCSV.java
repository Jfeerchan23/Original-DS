/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fer_c
 */
public class AgendaCSV {
  public static final String SEPARADOR = ",";
    
    
public static void recuperarCSV(){
BufferedReader bufferLectura = null;
try {
// Abrir el .csv en buffer de lectura
bufferLectura = new BufferedReader(new FileReader("miarchivo.csv"));

// Leer una linea del archivo
String linea = bufferLectura.readLine();

while (linea != null) {
// Sepapar la linea leída con el separador definido previamente
String[] campos = linea.split(SEPARADOR); 
 //Agregamos los datos existentes del archivo CSV 
 MiAgenda.agregarContacto( (new Contacto(campos[0],campos[1],campos[2],campos[3],campos[4],campos[5])),1);

  
// Volver a leer otra línea del fichero
linea = bufferLectura.readLine();
  }
} 
catch (IOException e) {
e.printStackTrace();
}
finally {
// Cierro el buffer de lectura
if (bufferLectura != null) {
try {
bufferLectura.close();
} 
catch (IOException e) {
e.printStackTrace();
    }
   }
 }
    

}
    
public static void guardarContactoCSV(Contacto datos){

    
      try {
          BufferedWriter bw = null;
          FileWriter fw = null;
          File file = new File("miarchivo.csv");
          fw = new FileWriter(file.getAbsoluteFile(), true);
          bw = new BufferedWriter(fw);
          bw.write(datos.getNombre()+","+datos.getApellido()+","+datos.getGenero()+","+datos.getTipoFono()+","+datos.getNumeroFono()+","+datos.getCorreo()+"\n");
          bw.close();
          fw.close();
        
      } catch (IOException ex) {
          Logger.getLogger(AgendaCSV.class.getName()).log(Level.SEVERE, null, ex);
      }
}    
    
}
