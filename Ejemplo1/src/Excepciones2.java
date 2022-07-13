public class Excepciones2 {
    static void validarEdad(int edad) {
        if(edad < 18){
            throw new ArithmeticException("Debes ser mayor de edad");
        }else{
            System.out.println("Puede entrar");
        }
    }
    public static void main(String[] args){
        validarEdad( 15);
        validarEdad( 50);
    }
}
