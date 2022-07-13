public class Excepciones {
    public static void main(String[] args) {
        try{
            int[] numeros = {1, 45, 87, 3, 25, 41};
            System.out.println(numeros[10]);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            System.out.println("Indice fuera de rango");
        }
        finally{
            System.out.println("Esto siempre se ejecuta");
        }
        int[] numeros = {1, 45, 87, 3, 25, 41};
        System.out.println(numeros[10]);
        int div;
        int a;
        int b;
        try{
            a = 25;
            b = 0;
            div = a / b;
            System.out.println("La division es: " + div);
        }
        catch (Exception e) {
            System.out.println("La division no es valida");
        }
    }
}