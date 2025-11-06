package views;

public class ShowConsole {

    public ShowConsole(){
    }

    public void printArray(int[] num){
        System.out.print("Arreglo: ");
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i] + ",");
        }
        System.out.println();
    }

    public void printResult(int value, int position) {
        if (position == -1) {
            System.out.println("No se encontró el valor: " + value);
        } else {
            System.out.println("Valor " + "[" + value + "]" + " encontrado en la posición: " + position);
        }
    }

    public void printResult(Integer result5){
        if(result5 != null){
            System.out.println(" El " + "{" + result5 + " }" + "se encontro");
        }else{
            System.out.println("El numero buscado NO se encontro");
        }
    }
}
