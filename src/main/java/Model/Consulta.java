package Model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Consulta extends DBCconexion{

    public boolean autenticacion(String usuario, String password){
        PreparedStatement pst = null;
        ResultSet rs = null;

        //Para concectar la base de datos
        try{
            String query = "select * from usuarios where usu_Usuario = ? and usu_Password = ?";
            pst = getDBCconexion().prepareStatement(query);
            pst.setString(1, usuario);
            pst.setString(2, password);
            rs = pst.executeQuery(); //Guardar y ejecutar la consulta usuario y password


            //Verificar el registro

            if (rs.absolute(1)){
                return true;


            }

        }catch (Exception e){

            System.err.println("Error"+ e);


        }finally { //Cierre de conexion
            try{
                if (getDBCconexion() != null) getDBCconexion().close();
                    if (pst != null) pst.close();
                    if (rs != null) rs.close();
            }catch (Exception e){

                System.err.println("Error"+ e);


            }


        }


        return false;

    }

    //Probar consulta

   //Registro
    public boolean registrar (String nombre, String apellido, String correo, String password){

        PreparedStatement pst = null;

        try{

            String query = "insert into usuarios (usu_Nombre, usu_Apellido, usu_Correo usu_Password values (?,?,?,?)";
            pst = getDBCconexion().prepareStatement(query);
            pst.setString(1, nombre);
            pst.setString(2, apellido);
            pst.setString(3, correo);
            pst.setString(4, password);

                if(pst.executeUpdate()==1 ){

                    return true;
                }



        }catch (Exception e){
            System.err.println("Error" + e);


        }finally {
            try {
                if (getDBCconexion() != null) getDBCconexion().close();
                if (pst != null) pst.close();
            }catch (Exception e){
                System.err.println("Error" + e);


            }

        }
        return  false;


    }

    public static void main (String[] args){
        Consulta co = new Consulta();



    }

}
