/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import proyectotickets.Menu;
import proyectotickets.MostrarVendidas;
import proyectotickets.Pantallas;
import proyectotickets.Registrar;

public class PruebaMain {

    public static void main(String[] args) {

        /*creamos un objeto nuevo de la clase Pantallas con el nombre pantallas
        ese nombre pantallas (en minuscula), puede ser cualquier nombre pero por convención se coloca de esta manera 
        class => NombreDeLaClase (Cada letra inicial de palabra en mayuscula) objeto => nombreObjeto (camelCase Primera palabra en minuscula las demas en Mayuscula)
         */
        Pantallas pantallas = new Pantallas();
        //pantallas.mensajesalida();

        //creamos un objeto nuevo de la clase Menu con el nombre menu
        Menu menu = new Menu();

        //usando el objeto  menu podemos llamar a todos los metodos (funciones) que contiene la clase a la que pertenece. 
        //menu.menu();
        Registrar registrar = new Registrar();
        //registrar.registrar();

        MostrarVendidas mostrarvendidas = new MostrarVendidas();
        String[][] matriz = new String[15][15];
        for (int i = 0; i <= 14; i++) {
            // Se considera una matriz de 15x5 es decir 225 entradas totales. 
            for (int j = 0; j <= 14; j++) {
                matriz[i][j] = "aaa111";
            }
        }
        mostrarvendidas.mostrarvendidas(matriz);
        
  
    }
}
