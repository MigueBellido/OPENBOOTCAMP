//*Crear una función con tres parámetros que sean números que se suman entre sí.*//

//*Llamar a la función en el main y darle valores.*//



public class FuncionSuma {

    int valor1=5;
    int valor2=6;
    int valor3=7;
    int resultado;

    public void operar(){
        resultado=valor1+valor2+valor3;
    }
    public void imprimir(){
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        FuncionSuma suma=new FuncionSuma();
        suma.operar();
        suma.imprimir();

    }
}
