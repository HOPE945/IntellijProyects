public class OperacionesAritmeticas {

    //tres cosas importantes
    // 1 variables globales o de clase
    public double d1;
    public double d2;

    //2 constructor Vacio
    public OperacionesAritmeticas(){

    }

    //metodos de las diferentes operaciones aritmeticas
    //pueden ser void que solo sirven para la clase internamente
    //

    //Metodo de suma en este ejemplo es dependiente de las variables

    public int suma(){
        int resultado;
        resultado = (int) (this.d1+this.d2);
        //este es el retorno y tengo que eacribir la variable que trae el resultado
        return resultado;

    }

    //metodo de resta este con parametros
    public int resta(int a, int b ){
        int resultado;
        resultado = a - b;
        return resultado;
    }

    //metodo de multiplicacion
    public int multi(){
        int resultado = (int)(d1 * d2);
        return resultado;
    }

    //division
    public double division(){
        double resultado;
        resultado = this.d1 / this.d2;
        return resultado;
    }



}
