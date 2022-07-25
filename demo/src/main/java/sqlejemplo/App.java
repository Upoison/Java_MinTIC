package sqlejemplo;


public class App 
{
    public static void main( String[] args )
    {
        static String url =  "link de la base de datos!" ;
    
        public static void main (String[] args )
        {

        }
        // select 
        public void seleccionarEmpleados(){
            try{
                //Establecer la conexion 
                Connection conecxion = DriverManager.getConnection(url);
                String sql = "select * from employees e where salary >1000";
                Statement stm = conexion.prepareStatement(sql);
            }

        }
    }
}
