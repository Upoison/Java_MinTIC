public class Ciclos {
    public static void main(String[] args) throws Exception {
        // conteo del 1 al 5
        int count = 1;
        while(count <=5){
            System.err.println(count);
            count++;
        }
        // do while
        count = 1;
        do{
            System.out.println(count);
            count++;
        }
        while(count <=5); // hace por primera vez el ciclo y luego lo evalua
        
        //ciclo for
        for (int i = 1; i<6; i++){
            System.out.println(i);
        }
        String[] nombres = {"Marina", "Juan", "Pedro", "Ana", "Samuel"};
        for (String i: nombres){
            System.out.println(i);
        }


    }
}
