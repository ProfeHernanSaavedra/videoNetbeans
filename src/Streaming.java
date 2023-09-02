

/**
 *
 * @author Hernan
 */
public class Streaming {
    
    //psvm+tab
    public static void main(String[] args) {
        //crear canciones
        Cancion objCancion1 = new Cancion();
        Cancion objCancion2 = new Cancion("Home", "Michael Buble",240, true, 'S');
        
        //modificar atributos de la cancion1
        objCancion1.setTitulo("Highway to hell");
        objCancion1.setArtista("AC-DC");
        objCancion1.setFavorita(false);
        objCancion1.setTiempoDuracion(300);
        objCancion1.setDescargada('N');
        
        //llamar a los métodos
        System.out.println(objCancion1.getTitulo()+" "+objCancion1.adelantarCancion(100, 0)+" segundos");
        System.out.println("*******************************");
        System.out.println(objCancion1.obtenerTipoCancion());
        System.out.println(objCancion1.toString());
        System.out.println("*******************************");
        System.out.println(objCancion2.toString());
        System.out.println("HOLA A TODOS!! ");
        System.out.println("2023");
        
    }
}
