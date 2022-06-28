public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //* Variable */
        /*
         * Para declarar una varible se puede de dos formas :
         * i) tpodeVariable nombre == datoInicial
         * il) var nombre = dato inicial 
         */
        int num = 25;
        var nombre = "Marina";
        System.out.println(nombre);
        System.out.println(num);
        System.out.println(nombre.getClass().getSimpleName());
        System.out.println(((Object)num).getClass().getSimpleName());

    }
}
