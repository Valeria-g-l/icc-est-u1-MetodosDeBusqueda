package controllers;

import views.ShowConsole;

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
}
