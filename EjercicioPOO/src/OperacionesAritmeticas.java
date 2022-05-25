import java.util.Scanner;

public class OperacionesAritmeticas {
    //Variables globales o de clase

    private Scanner sc;
    public double d1;
    public double d2;
    //constructor
    public OperacionesAritmeticas(){
        //esta vacio
    }

    public int suma(){
        int resultado;
        return resultado = (int)(this.d1 + this.d2);
    }

    //resta

    public int resta(int a, int b){
        int resultado;
        resultado = a-b;
        return resultado;
    }

    //multiplicacion
    public int multi(){
        int resultado = (int) (d1 * d2);
        return resultado;
    }

    //division
    public double division(){
        double resultado;
        resultado = this.d1 / this.d2;
        return resultado;
    }



}
