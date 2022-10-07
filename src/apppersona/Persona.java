/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package apppersona;

/**
 *
 * @author Darwin
 */
public class Persona{
    //Primero los atributos de los objetos
    long dni;
    String nombre;
    long celular;
    char genero;
    String correo;
    String direccion;
    int edad;
    String ciudadania;
    /*public void Persona(){
        String nombre = new String();
        String correo = new String();
        String direccion = new String();
        String ciudadania = new String();
    }*/
    public Persona(long id, String nom, long cel, char gen, String email, String direc, int e,String pais){
        dni = id;
        nombre = new String(nom);
        celular = cel;
        genero = gen;
        correo = new String(email);
        direccion = new String(direc);
        edad = e;
        ciudadania = new String(pais);
    }
    public void setdni(long id){
        dni = id;
    }//Recive dato y no devulee nada
    public void setnombre(String nom){
        nombre = nom;
    }//Recive dato y no devulee nada
    public void setcelular(long cel){
        celular = cel;
    }//Recive dato y no devulee nada
    public void setgenero(char gen){
        genero = gen;
    }//Recive dato y no devulee nada
    public void setcorreo(String email){
        correo = email;
    }//Recive dato y no devulee nada
    public void setdirecion(String direc){
        direccion = direc;
    }//Recive dato y no devulee nada
    public void setedad(int e){
        edad = e;
    }//Recive dato y no devulee nada
    public void setciudadania(String pais){
        ciudadania = pais;
    }//Recive dato y no devulee nada
    public long getdni(){
        return dni;
    }//Retorna el dato en dni
    public String getnombre(){
        return nombre;
    }
    public long getcelular(){
        return celular;
    }
    public char getgenero(){
        return genero;
    }
    public String getcorreo(){
        return correo;
    }
    public String getdireccion(){
        return direccion;
    }
    public int getedad(){
        return edad;
    }
    public String getciudadania(){
        return ciudadania;
    }

    public boolean es_mayor_de_edad(){//Esto es un metodo
        if(edad >= 18){
            return true;
        }
        else{
            return false;
        }
    }
    public String toString(){//Devuelve una cadena
    String resultado = new String();    
    resultado = "DNI = "+dni+ " Nombre = "+nombre+ " Celular = "+celular+ " Genero = "+genero+ " Correo = "+correo+ " Direccion = "+direccion+" Edad = "+edad+ " Ciudadania = "+ciudadania;
    return resultado;
    }
    
}
