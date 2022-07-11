import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class Colecciones {
    public static void main(String[] args) {
        
        //ArrayList 
        ArrayList<String> ciudadesLista = new ArrayList<String>();
        ciudadesLista.add("Cali");// add Permite agregar alementos al final de la lista
        ciudadesLista.add("Santa Marta");
        ciudadesLista.add("Pereira");
        ciudadesLista.add("Bogota");
        ciudadesLista.add("Bogota");
        System.out.println(ciudadesLista);
        ciudadesLista.add(2, "Barranquilla"); // Add con dos parametros sea index o elemento este metodos permite agegar un elemento en la posiscion indicada 
        System.out.println(ciudadesLista);
        ciudadesLista.remove(4);// remove elimina elementos de la lista de la pocision indicada por el indice 
        System.out.println(ciudadesLista);
        ciudadesLista.set(0, "Cartagena"); // set(1), modifica el valor del elemento de la posicion index
        System.out.println(ciudadesLista);
        System.out.println(ciudadesLista.get(1)); // get (1) obtiene el valor de elemento de una poscision indicada 

        // recorrido por el ArrayList
        System.out.println("-------------------------");
        for (int i = 0; i < ciudadesLista.size(); i++){
            System.out.println(ciudadesLista.get(i));
        }
        System.out.println("-------------------------");
        for (String i: ciudadesLista){
            System.out.println(i);
        }
        System.out.println(ciudadesLista.contains("Cali")); // contains busca un elemento en un Arraylist y lo devuleve true o false si lo encuentra o no

        // crear un ArrayList de objetos CorroColecciones
        ArrayList<CarroColecciones> carrosLista = new ArrayList<CarroColecciones>();
        carrosLista.add(new CarroColecciones("Mazda"));
        carrosLista.add(new CarroColecciones("Volvo"));
        carrosLista.add(new CarroColecciones("BMW"));
        carrosLista.add(new CarroColecciones("Chevrolet"));
        System.out.println(carrosLista);
        System.out.println(carrosLista.get(0).getMarca()+"--"+carrosLista.get(0).getPrecio());

        for (int i = 0; i < carrosLista.size(); i++){
            System.out.println(carrosLista.get(i).getMarca());
        }

        for (CarroColecciones i: carrosLista){
            System.out.println(i.getMarca());
        }

        Collections.sort(ciudadesLista);
        System.out.println(ciudadesLista);

        //LinkedList 
        LinkedList<Integer> precios = new LinkedList<Integer>();
        precios.add(45);
        precios.add(25);
        precios.add(25);
        precios.add(78);
        precios.add(33);
        System.out.println(precios);
        // addFirst, AddLast, removeFirst, removeLast, getFirst, getLast, estos son metodos de la clase y no existen en los ArrayList
        System.out.println(precios.get(2));
        System.out.println(precios.contains(78));

        Collections.sort(precios);
        System.out.println(precios);

        
        // HashMap
        Map <String, String> map1 = new HashMap<String, String>();
        map1.put("blue", "azul"); // put es para ingresar valores con el HashMap
        map1.put("green", "verde");
        map1.put("red", "rojo");
        map1.put("yellow", "amarillo");
        for (String i: map1.keySet()){
            System.out.println(i + ":" + map1.get(i));
        }
        for (String i: map1.values()){
            System.out.println(i);


        }

        Map<CarroColecciones, String> map2 = new HashMap<CarroColecciones, String>();
        map2.put(new CarroColecciones("Mazda"), "Plateado");
        map2.put(new CarroColecciones("Renault"), "Rojo");
        map2.put(new CarroColecciones("Nissan"), "Blanco");
        for (CarroColecciones i: map2.keySet()){
            System.out.println(i.getMarca() + " " + map2.get(i));
        }

        // HashSet
        HashSet<Integer> numeros = new HashSet<Integer>();
        numeros.add(45);
        numeros.add(28);
        numeros.add(39);
        numeros.add(45);
        System.out.println(numeros.size());
        System.out.println(numeros);
        // Obtener un interador despues de impoertarlo arriba
        Iterator<Integer> i = numeros.iterator();
        //System.out.println(i.next());
        //System.out.println(i.next());
        while(i.hasNext()){
            System.out.println(i.next());
        }


        }
        


    }

