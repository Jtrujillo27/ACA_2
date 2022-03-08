/*
 *
 *@Descripción: Esta clase hace alución a los objetos Tarjeta de un banco, utlizandose para ser 
 *instanciada desde el metodo Main por el objeto "objetoTarjeta".
 *@Fecha de creación: 06-03-2022
 *@Versión: "17.0.2" 2022-01-18 LTS
 *@Autores: Juan Camilo Trujillo(juan.trujillo@cun.edu.co),Kevin Santiago Pastrana(kevin.pastrana@cun.edu.co),Jesica Fernanda Bernate (Jesica.Bernate@cun.edu.co), Yasser Saad Muñoz(Yasser.saad@cun.edu.co)
 */
package Clases;

public class TarjetasBanco {
    /*Definición de atributos de la clase TarjetasBanco*/
    public String Color="Rojo";
    public String Tipo="Credito";
    public String Nombre="Clasica";
    public String BancoEmisor="Bancolombia";
    public String Franquicia="Mastercard";
    public String Dimensiones="85,60 mm × 53,98 mm 0";
    public String Categoria="Classic";
    public int Cupo = 600000;

    /*Definición de Metodos de la clase TarjetasBanco*/
    public void Pagar(String Deuda,int Monto){ System.out.println("Pagando Deuda: "+Deuda+"De valor de "+ Monto);}
    public void ConsultarDeuda(String Deuda){ System.out.println("Tiene una deuda de 200.000 por concepto de"+Deuda);}
    public void Avance(int Valor){ System.out.println("Realizando avance de "+Valor);}
    public void RealizarCompra(String Compra){ System.out.println("Realizando compra de"+Compra);}
    public void Bloquear(){ System.out.println("Bloqueando su producto llamado "+this.Nombre);}
    public void ConsultarCupo(){ System.out.println("Su cupo es"+this.Cupo);}
    
}
