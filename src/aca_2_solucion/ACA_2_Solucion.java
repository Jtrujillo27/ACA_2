/*
 *
 *@Descripción: Esta clase es la pricipal desde donde inicia la ejecución; tendrá en conjunto el uso e importanción
 * De las demás clases que se utilizan en el sistema.
 *@Fecha de creación: 06-03-2022
 *@Versión: "17.0.2" 2022-01-18 LTS
 *@Autores: Juan Camilo Trujillo(juan.trujillo@cun.edu.co),Kevin Santiago Pastrana(kevin.pastrana@cun.edu.co),Jesica Fernanda Bernate (Jesica.Bernate@cun.edu.co), Yasser Saad Muñoz(Yasser.saad@cun.edu.co)
 */
package aca_2_solucion; //Paquete donde se encuentra la clase
import Clases.Motos; //Importación de la clase Motos
import Clases.Felinos; //Importación de la clase Felinos
import Clases.TarjetasBanco; //Importación de la clase TarjetasBanco
import Clases.Automoviles; //Importación de la clase Automoviles
import Clases.PersonalEmpresa; //Importación de la clase PersonalEmpresa

public class ACA_2_Solucion {

    //Metodo Main(Donde inicia el programa)
    public static void main(String[] args) {
       
    
        Motos objetoMotos = new Motos(); //Instancia de la clase Motos
        //Mensajes en consola
        System.out.print("Atributos del Objeto");
        System.out.print("El Color es: " + objetoMotos.Color +"\n");
        System.out.print("La Marca es: " + objetoMotos.Marca +"\n");
        System.out.print("El Cilindraje es: " + objetoMotos.Cilindraje +"\n");
        System.out.print("La Ciudad de Registro es: " + objetoMotos.CiudadRegistro +"\n");
        System.out.print("El Modelo es: " + objetoMotos.Modelo +"\n");
        System.out.print("La Referencia es: " + objetoMotos.Referencia +"\n");
        System.out.print("El Precio es: " + objetoMotos.Precio +"\n");
        System.out.print("El Estado es: " + objetoMotos.Estado +"\n");
        System.out.print("El Peso es: " + objetoMotos.Peso +"\n");
    
        System.out.print("Metodos del Objeto");
        
        //Llamados a los metodos de la clase mediante el objeto
        objetoMotos.Encender();
        objetoMotos.Acelerar();
        objetoMotos.Frenar();
        objetoMotos.TocarClaxon();
        objetoMotos.EncenderLuces("Delanteras");
        objetoMotos.ApagarLuces("Traseras");
        objetoMotos.EncenderDireccionales("Izquierda");
        
        /******************************OBJETO DE CLASE FELINOS***************************************/
        Felinos objetoGato = new Felinos(); //Instancia de la clase Felinos
        //Mensajes en consola
        System.out.print("Atributos del Objeto");
        System.out.print("El Color es: " + objetoGato.Color +"\n");
        System.out.print("La Especie es: " + objetoGato.Especie +"\n");
        System.out.print("El Nombre es: " + objetoGato.Nombre +"\n");
        System.out.print("El Tamaño: " + objetoGato.Tamaño +"\n");
        System.out.print("El Habitad es: " + objetoGato.Habitad +"\n");
        System.out.print("La Peso es: " + objetoGato.Peso +"\n");
        
        System.out.print("Metodos del Objeto Gato");
        
        //Llamados a los metodos de la clase mediante el objeto
        objetoGato.Dormir();
        objetoGato.Comer("Pezcado");
        objetoGato.Caminar("Adelante");
        objetoGato.Beber("Leche");
        objetoGato.Cazar("Ratones");
        objetoGato.Arañar("Silla");
        /******************************OBJETO DE CLASE TARJETAS BANCO***************************************/
        TarjetasBanco objetoTarjeta = new TarjetasBanco(); //Instancia de la clase TarjetasBanco
        //Mensajes en consola
        System.out.print("Atributos del Objeto");
        System.out.print("El Color es: " + objetoTarjeta.Color +"\n");
        System.out.print("La Tipo es: " + objetoTarjeta.Tipo +"\n");
        System.out.print("El Nombre es: " + objetoTarjeta.Nombre +"\n");
        System.out.print("El Banco emisor es: " + objetoTarjeta.BancoEmisor +"\n");
        System.out.print("La franquicia es: " + objetoTarjeta.Franquicia +"\n");
        System.out.print("Sus dimensiones son: " + objetoTarjeta.Dimensiones +"\n");
        System.out.print("La Categoría es: " + objetoTarjeta.Categoria +"\n");
        System.out.print("Tiene un cupo de: " + objetoTarjeta.Cupo +"\n");
        
        System.out.print("Metodos del Objeto Tarjeta Banco");
        //Llamados a los metodos de la clase mediante el objeto
        objetoTarjeta.Pagar("Estracto", (200000));
        objetoTarjeta.ConsultarDeuda("Estracto");
        objetoTarjeta.Avance((500000));
        objetoTarjeta.RealizarCompra("Celular");
        objetoTarjeta.Bloquear();
        objetoTarjeta.ConsultarCupo();
        /******************************OBJETO DE CLASE AUTOMOVILES***************************************/
        Automoviles objetoCarro = new Automoviles(); //Instancia de la clase Automoviles
        //Mensajes en consola
        System.out.print("Atributos del Objeto");
        System.out.print("El Color es: " + objetoCarro.Color +"\n");
        System.out.print("La Marca es: " + objetoCarro.Marca +"\n");
        System.out.print("El Cilindraje es: " + objetoCarro.Cilindraje +"\n");
        System.out.print("La Ciudad de Registro es: " + objetoCarro.CiudadRegistro +"\n");
        System.out.print("El Modelo es: " + objetoCarro.Modelo +"\n");
        System.out.print("La Referencia es: " + objetoCarro.Referencia +"\n");
        System.out.print("El Precio es: " + objetoCarro.Precio +"\n");
        System.out.print("El Estado es: " + objetoCarro.Estado +"\n");
        System.out.print("El Peso es: " + objetoCarro.Peso +"\n");
    
        System.out.print("Metodos del Objeto");
        //Llamados a los metodos de la clase mediante el objeto
        objetoCarro.Encender();
        objetoCarro.Acelerar();
        objetoCarro.Frenar();
        objetoCarro.TocarClaxon();
        objetoCarro.EncenderLuces("Delanteras");
        objetoCarro.ApagarLuces("Traseras");
        objetoCarro.EncenderDireccionales("Izquierda");
        objetoCarro.AbrirPuertas();
        objetoCarro.CerrarPuertas();
        objetoCarro.EncenderRadio();
        objetoCarro.ApagarRadio();
        /******************************OBJETO DE CLASE PERSONAL EMPRESA***************************************/
        PersonalEmpresa objetoPersonalEmpresa = new PersonalEmpresa(); //Instancia de la clase TarjetasBanco
        //Mensajes en consola
        System.out.print("Atributos del Objeto");
        System.out.print("Nombre: " + objetoPersonalEmpresa.Nombre +"\n");
        System.out.print("Apellido: " + objetoPersonalEmpresa.Apellido +"\n");
        System.out.print("Nro Cedula: " + objetoPersonalEmpresa.NroCedula +"\n");
        System.out.print("IdContrato: " + objetoPersonalEmpresa.IdContrato +"\n");
        System.out.print("Localización: " + objetoPersonalEmpresa.Localización +"\n");
        System.out.print("Edad: " + objetoPersonalEmpresa.Edad +"\n");
        System.out.print("Fecha de Ingreso: " + objetoPersonalEmpresa.FechaIngeso +"\n");
        System.out.print("Salario: " + objetoPersonalEmpresa.Salario +"\n");
        System.out.print("Tipo de contrato: " + objetoPersonalEmpresa.TipoContrato +"\n");
        System.out.print("Antiguedad: " + objetoPersonalEmpresa.Antiguedad +"\n");
        
        
        System.out.print("Metodos del Objeto");
        //Llamados a los metodos de la clase mediante el objeto
        objetoPersonalEmpresa.CrearEmpleado();
        objetoPersonalEmpresa.ActualizarDatosEmpleado();
        objetoPersonalEmpresa.MostrarEmpleados("Pedro");
        objetoPersonalEmpresa.EliminarEmpleado(158795);
    }
    
}
