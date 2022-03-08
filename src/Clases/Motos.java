/*
 *
 *@Descripción: Esta clase hace alución a los objetos Motos, utlizandose para ser 
 *instanciada desde el metodo Main por el objeto "objetoMotos".
 *@Fecha de creación: 06-03-2022
 *@Versión: "17.0.2" 2022-01-18 LTS
 *@Autores: Juan Camilo Trujillo(juan.trujillo@cun.edu.co),Kevin Santiago Pastrana(kevin.pastrana@cun.edu.co),Jesica Fernanda Bernate (Jesica.Bernate@cun.edu.co), Yasser Saad Muñoz(Yasser.saad@cun.edu.co)
 */
package Clases;

public class Motos {
    /*Definición de atributos de la clase Moto*/
    public String Color="Rojo";
    public String Marca="Royal Enfield";
    public int Cilindraje=350;
    public String CiudadRegistro="Bogotá D.C";
    public int Modelo=2022;
    public String Referencia="Classic 350";
    public int Precio=14999000;
    public String Estado="Nuevo";
    public int Peso=191;

    /*Definición de Metodos de la clase Motos*/
    public void Encender(){ System.out.println("Encendiendo Moto");}
    public void Acelerar(){ System.out.println("Acelerando Moto");}
    public void Frenar(){ System.out.println("Frenando Moto");}
    public void TocarClaxon(){ System.out.println("Tocando Claxon");}
    public void EncenderLuces(String TipoLuces){ System.out.println("Encendiendo Luces "+TipoLuces+" de la Moto");}
    public void ApagarLuces(String TipoLuces){ System.out.println("Apagando Luces "+TipoLuces+ " de la Moto");}
    public void EncenderDireccionales(String Sentido){ System.out.println("Encendiendo direccional a la "+Sentido+ " Moto");}
}



