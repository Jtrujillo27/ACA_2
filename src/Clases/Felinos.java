/*
 *
 *@Descripción: Esta clase hace alución a los Felinos, utlizandose para ser 
 *instanciada desde el metodo Main por el objeto "objetoGato".
 *@Fecha de creación: 06-03-2022
 *@Versión: "17.0.2" 2022-01-18 LTS
 *@Autores: Juan Camilo Trujillo(juan.trujillo@cun.edu.co),Kevin Santiago Pastrana(kevin.pastrana@cun.edu.co),Jesica Fernanda Bernate (Jesica.Bernate@cun.edu.co), Yasser Saad Muñoz(Yasser.saad@cun.edu.co)
 */
package Clases;

public class Felinos {
    /*Definición de atributos de la clase Felinos*/
    public String Color="Bicolor negro y blanco";
    public String Especie="Tipo Domestico";
    public String Nombre="Tom";
    public String Tamaño="71 cm";
    public String Habitad="Silvestre";
    public String Peso="10 lb";

    /*Definición de Metodos de la clase Felinos*/
    public void Dormir(){ System.out.println("Durmiendo...");}
    public void Comer(String TipoComida){ System.out.println("Comiendo "+TipoComida);}
    public void Caminar(String Sentido){ System.out.println("Caminando hacia "+Sentido);}
    public void Beber(String Bebida){ System.out.println("Bebiendo "+Bebida);}
    public void Cazar(String TipoCaza){ System.out.println("Cazando "+TipoCaza);}
    public void Arañar(String Objeto){ System.out.println("Arañando "+Objeto);}

}
