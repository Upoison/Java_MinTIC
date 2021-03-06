import java.util.Scanner;

public class Tablas {
    
    public void capturaDatos(){
        Scanner sc = new Scanner(System.in);
        int tabla;
        do {
            System.out.println("Digite la tabla que desea o \"-1\" para salir ");
            tabla = sc.nextInt();
            if (tabla != -1){
                mostrarTabla(tabla);
            }
        } while (tabla !=-1);
        sc.close();
    }
    
    public static void mostrarTabla(int num) {
        for (int i = 1; i<11;i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }

    public static void main(String[] args) {
        Tablas objeto1 = new Tablas();
        objeto1.capturaDatos();
        objeto1.mostrarTabla(num:10);
        
    }
}

