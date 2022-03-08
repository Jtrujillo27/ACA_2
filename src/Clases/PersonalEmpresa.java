/*
 *
 *@Descripción: Esta clase hace alución al Personal de una empresa, utlizandose para ser 
 *instanciada desde el metodo Main por el objeto "objetoPersonalEmpresa"; mostrando los 4 tipos en un sistema(CRUD).
 *@Fecha de creación: 06-03-2022
 *@Versión: "17.0.2" 2022-01-18 LTS
 *@Autores: Juan Camilo Trujillo(juan.trujillo@cun.edu.co),Kevin Santiago Pastrana(kevin.pastrana@cun.edu.co),Jesica Fernanda Bernate (Jesica.Bernate@cun.edu.co), Yasser Saad Muñoz(Yasser.saad@cun.edu.co)
 */
package Clases;

public class PersonalEmpresa {
    /*Definición de atributos de la clase PersonalEmpresa*/
    public String Nombre="Pedro";
    public String Apellido="Perez";
    public int NroCedula=1233654925;
    public int IdContrato=125874;
    public String Localización="Bogotá";
    public int Edad=30;
    public String FechaIngeso="10-09-2021";
    public int Salario=900000;
    public String TipoContrato = "Definido";
    public int Antiguedad = 9;


    /*Definición de Metodos de la clase PersonalEmpresa*/
    public void MostrarEmpleados(String NombreEmpleado){ System.out.println("Se mostrará la info del empleado "+ NombreEmpleado);}
    public void CrearEmpleado(){ System.out.println("Se creará un usuario nuevo ");}
    public void ActualizarDatosEmpleado(){ System.out.println("Actualizando datos de lusuario");}
    public void EliminarEmpleado(int IdEmpleado){ System.out.println("Usuario "+ IdEmpleado +" Eliminado");}

}
