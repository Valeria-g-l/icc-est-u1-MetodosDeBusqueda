import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda mBusqueda = new MetodosBusqueda();
        ShowConsole showConsole = new ShowConsole();
      //  mBusqueda.BusquedaLineal(5);
      Persona[] personas = new Persona[] {
                new Persona("Ana", 25),
                new Persona("Luis", 30),
                new Persona("Maria", 28),
                new Persona("Carlos", 35),
                new Persona("Sofia", 22),
                new Persona("Jorge", 27),
                new Persona("Lucia", 24),
        };

        System.out.println();
        System.out.println("*******ENCONTRAR NOMBRES Y EDADES*******");
        //Busqueda de Juan
        String name="Juan";
        Persona resultadoPer = mBusqueda.searchPersonByName(personas, "Juan");
        //Imprimir la persona si encontro
        //Imprime si no encontro una persona con el nombre
        showConsole.showPersonResult(resultadoPer, "Juan");

        //Busqueda de edad impar y mayor a 25
        Persona resultadoPer2 = mBusqueda.findPersonByAgeAndImpar(personas, 25);
        showConsole.showPersonResult(resultadoPer2, "25");

        //Busqueda por valor de nombre 498
        Persona resultadoPer3 = mBusqueda.findPersonByNameValue(personas, 498 );
        boolean valorNombre = true;
        showConsole.showPersonResult(resultadoPer3, String.valueOf(valorNombre));
}
}
