package Ejercicio6Excepciones;

public class ExcepcionEdadInvalida extends IllegalArgumentException{
    public ExcepcionEdadInvalida(){}

    public ExcepcionEdadInvalida(String mensaje){
        super(mensaje);
    }
}
