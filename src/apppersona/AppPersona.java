/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Revisar Cual puede ser el error el programa se basa en pedir datos para almacenarlos. Pero se pusieron los datos manualmente para ver su funcionalidad creo
package apppersona;
import java.util.*;
/**
 *
 * @author Darwin
 */
public class AppPersona {
    public static Scanner leer = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona p1 = new Persona(1010018751, "Jhon Darwin Llanos", 316, "m", "jhond-2409@hotmail.com", "Cll 77#62-44", 18, "Colombia");
        System.out.print(Persona.p1);
        //--Pilo desde aca
        //ArrayList <persona> Listap = new ArrayList<persona>();
        //long id;
        //String nom = new String();
        //long cel;
        //char gen;
        //String email = new String();
        //String direc = new String();
        //int e;
        //String pais = new String();
        //persona p2 = new persona();
        //int opc;
        //do{
            //opc = menu();
            //switch(opc){
                //case 1:
                //System.out.println("Digite el DNI");
                //id = leer.nextLong();
                //System.out.println("Digite el Nombre de la persona");
                //nom = leer.nextLine();
                //System.out.println("Digite el Celular");
                //cel = leer.nextLong();
                //System.out.println("Digite el Genero");
                //gen = leer.next()charAt(0);
                //System.out.println("Digite el Domicilio");
                //direc = leer.next();
                //persona p1 = new Persona(id, nom, cel, gen, email, direc, e ,pais);
                //Listap.add(p1);
                //break;
                //case 2:
                //System.out.println("Digite el DNI");
                //id = leer.nextLong();
                //persona p2 = buscar_persona(listap, id);
                //if(p2 != null){
                //System.out.println("Datos de la persona  = "p2.toString());
                //}
                //else{
                    //System.out.println("No existe la persona con los datos que devolio");
                //}
                //break;
                //case 3:
                    //System.out.println("Digite el celular");
                    //cel = leer.nextLong();
                    //System.out.println("Digite el Direccion");
                    //email = leer.next();
                    //System.out.println("Digite el correo");
                    //direc = leer.next();
                //break;
                //case 4:
                //brak;
            //}
        //}while()
        //persona pi = new persona (52125452, "Marcela perez", 320)
        //System.out.println();
    }
    //public int menu(){
        //System.out.println("M E N U\n 1)Crear persona\n 2)Consultar datos por DNI\n 3)Modificar (Celular, Direccion, Correo)\n4)Listar personas mayor de edad");
        //System.out.println("Digite su opcion");
        //return(leer.nextInt());
    //}
    //public static persona buscar_persona(ArrayList <persona> lp, long id){
        //persona ptmp = new Persona();
        //for(int i=0; i<lp.size(); i++){
            //if(lp.get(i).getdni()==id){
                //return lp.get(i);
            //}
        //}
        //return null;
    //}
}
