package controllers;

import views.ShowConsole;
import models.Persona;

public class MetodosBusqueda {

    private ShowConsole showConsole;
    private int[] arreglo;


    public MetodosBusqueda(){
        this.arreglo = new int[] {10, 11, -2, 5, 6, 8, 15, 22};
        this.showConsole = new ShowConsole();
        showConsole.printArray(arreglo);

        // Buscar el 5 con for
        //int result1 = BusquedaLineal(5);
        //showConsole.printResult(5, result1);

        // Buscar el 5 con while
        int result2 = BusquedaLinealWhile(5);
        showConsole.printResult(5, result2);

        // Buscar el -2 con while
        int result3 = BusquedaLinealWhile(-2);
        showConsole.printResult(-2, result3);

        // Buscar el 20 con for
        int result4 = BusquedaLineal(20);
        showConsole.printResult(20, result4);

        //Buscar el 100
        Integer result5 = busquedaLinealObj(100);
        showConsole.printResult(result5);

        //Buscar el 10
        Integer result6 = busquedaLinealObj(10);
        showConsole.printResult(result6);
    }

    // Búsqueda lineal con for
    public int BusquedaLineal(int value){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Búsqueda lineal con while
    public int BusquedaLinealWhile(int value){
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i] == value) {
                return i;
            }
            i++;
        }
        return -1;
    }

    //Retorna Objeto buscado si lo encontro
    //Si no encuentro retorno null
    public Integer busquedaLinealObj(int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return arreglo[i]; 
            }
        }
        return null; 
    }

    public Persona searchPersonByName(Persona[] personas, String name){
         for (Persona persona : personas) {
            if (persona.getName().equalsIgnoreCase(name)) {
                return persona;
                }
            }
            return null;
        }

    //Encontrar una persona que sea mayor de age
    //Edad sea impar
        public Persona findPersonByAgeAndImpar(Persona[] personas, int age) {
            for (Persona persona : personas) {
                if (persona.getAge() > age && persona.getAge() % 2 != 0) {
                    return persona;
                }
            }
            return null;    
    }

    //Busqueda por valor de nombre 498
    public Persona findPersonByNameValue(Persona[] personas, int nameValue) {
        for (Persona persona : personas) {
            int valorNombre = 0;
            String name = persona.getName();
            for (int i = 0; i < name.length(); i++) {
                valorNombre += (int) name.charAt(i);
            }
            if (valorNombre == nameValue) {
                return persona;
            }
        }
        return null;
    }
}

