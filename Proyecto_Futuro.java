/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_futuro;

/**
 *
 * @author Pablo Moran Garcia
 */
public class Proyecto_Futuro {
//creamos metodo Veredicto    
private static String Veredicto(String Valor1,String Valor2){
    if(Valor1.equals(Valor2))
        return "Deberias estudiar mas tiempo...";    
       
    if(Integer.valueOf(Valor2) < Integer.valueOf(Valor1))
        return "Estudias muy poco para las asignaturas que tienes...";
    
    if(Integer.valueOf(Valor2) >= (Integer.valueOf(Valor1)*2))//para llevarlo bien por lo menos se deberia 
        //de estudiar el doble de asignaturas que tienes en  horas
    return "Ok sigue asi";
    //aqui se devuelve esta cadena al no cumplirse ninguna de las condiciones anteriores
     return "Vale estudias mas horas que asignaturas tienes...¿pero es suficiente?";
  }
    
    public static void main(String[] args) {
        
        
        System.out.println("Estudiante "+args[0]);
        //llamamos al metodo Veredicto pasandole los correspondientes valores de los argumentos
        System.out.println(Veredicto(args[1],args[2]));//el metodo nos devolvera una cadena segun el resultado
        //la cadena la mostraremos mediante System
        
    }
  
}
