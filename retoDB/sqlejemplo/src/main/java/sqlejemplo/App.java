package sqlejemplo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App 
{
    static String url = "jdbc:sqlite:C:\\Users\\David7\\Downloads\\hr (1).db";
    public static void main( String[] args ) throws SQLException
    {
        seleccionarEmpleados();
        System.out.println();
        consultaEmpleado(150);
        crearRegristro();
        actualizarDep();
        borrarRegion(5);

    }
    //Select
    public static void seleccionarEmpleados(){
        try{
            // establecer conexion
            Connection conexion = DriverManager.getConnection(url); 
            String sql = "select * from employees e where salary > 10000";
            Statement stm = conexion.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            while (rs.next()){
                int id = rs.getInt("employee_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                Double salario = rs.getDouble("salary");
                System.out.println(id + "\t"+nombre + "\t"+apellido+ "\t"+ salario);
            }
            rs.close();
            stm.close();
            conexion.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void consultaEmpleado(int id_empleado){
        String sql = "SELECT * FROM EMPLOYEES WHERE employee_id = ?";
        try{
            Connection conexion = DriverManager.getConnection(url);
            PreparedStatement stmp = conexion.prepareStatement(sql);
            stmp.setInt(1, id_empleado);
            ResultSet rs = stmp.executeQuery();
            while (rs.next()){
                int id = rs.getInt("employee_id");
                String nombre = rs.getString("first_name");
                String apellido = rs.getString("last_name");
                Double salario = rs.getDouble("salary");
                System.out.println(id + "\t"+nombre + "\t"+apellido+ "\t"+ salario);
            }
            rs.close();
            stmp.close();
            conexion.close();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        
        } 
    }
    // Insert into
    public static void crearRegristro() throws SQLException{
        String sql = "insert into departments values (12, 'I+D', 1500)";
        try(
            Connection conexion = DriverManager.getConnection(url);
            Statement stm = conexion.createStatement();
        ){
            int rows = stm.executeUpdate(sql);
            if (rows > 0){
                System.out.println("Registro creado");
            }
        }
        
    }
    //Update
    public static void actualizarDep() throws SQLException{
        String sql = "update departments set department_name='Mantenimiento' where department_id=12";
        try(
            Connection conexion = DriverManager.getConnection(url);
            Statement stm = conexion.createStatement();
        )
        {
            int rows = stm.executeUpdate(sql);
            if (rows > 0){
                System.out.println("Registro actualizado");
            }
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
    }

//delete
public static void borrarRegion(int region_id) throws SQLException{
    String sql = "delete from regions where region_id = " + region_id;
    try(
        Connection conexion = DriverManager.getConnection(url);
        Statement stm = conexion.createStatement();
    )
    {
        int rows = stm.executeUpdate(sql);
        if (rows > 0){
            System.out.println("Registro borrado");
        }
    }
    catch(Exception e){
        System.out.println("Error: " + e.getMessage());
    }
}
}

