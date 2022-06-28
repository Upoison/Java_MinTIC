import java.util.Scanner;
public class Ejemplo1
//variables (propiedades o atriutos)
//metodos o funciones
//main
//static, significa que se ouede utilizar sin necesidad de crear un objeto 

// void, significa que no se retornan los datos 

//variables
private String nombre;
private float nota;

//metodos
public void capturaDatos(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite el nombre: ");
    nombre = sc.nextLine();
    System.out.println("Digite la nota");
    nota = sc.nextFloat();
    sc.close();
}

public void imprimir(){
    System.out.println("Nombre" + nombre);
    System.out.println("Nota" + nota);
    
}

public void aprobar(){
    if(nota>=3){
        System.out.println("Aprobo");
    }else{
        System.out.println("No Aprobo");
    }
}

//main
public static void imprimir(String[] args){

    }
}