
/**
 *
 * @author Hernan
 */
public class Cancion {
    
    //crear las variables de la clase
    private String titulo,artista;
    private int tiempoDuracion; //en segundos
    private boolean favorita;//true:favaorita, false: no es favorita
    private char descargada;// 'S': si, 'N':no

    //constructor sin y con parámetros

    public Cancion() {
    }

    public Cancion(String titulo, String artista, int tiempoDuracion, boolean favorita, char descargada) {
        this.titulo = titulo;
        this.artista = artista;
        this.tiempoDuracion = tiempoDuracion;
        this.favorita = favorita;
        this.descargada = descargada;
    }
    
    //accesadores y mutadores

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getTiempoDuracion() {
        return tiempoDuracion;
    }

    public void setTiempoDuracion(int tiempoDuracion) {
        this.tiempoDuracion = tiempoDuracion;
    }

    public boolean isFavorita() {
        return favorita;
    }

    public void setFavorita(boolean favorita) {
        this.favorita = favorita;
    }

    public char getDescargada() {
        return descargada;
    }

    public void setDescargada(char descargada) {
        this.descargada = descargada;
    }
    
    //imprimir las variables como retorno de String

    @Override
    public String toString() {
        return "Cancion{" + "titulo=" + titulo + ", artista=" + artista + ", tiempoDuracion=" + tiempoDuracion + ", favorita=" + favorita + ", descargada=" + descargada + '}';
    }
    
    //métodos customer
    public int adelantarCancion(int segundosAdd,int segundosActuales){
        
        segundosActuales = segundosActuales + segundosAdd;
        
        return segundosActuales;
    }

    public void imprimirCanciones(){
        //variables locales
        //int minutos = 0;
        //int segundos = 0;
        int minutos = 0, segundos = 0;
        
        minutos = this.tiempoDuracion /60;
        segundos = this.tiempoDuracion - minutos *60;
        
        System.out.println("Canción: " + this.getTitulo());
        System.out.println("Artista: " + this.artista);
        System.out.println("Duración: " + minutos + ":"+ segundos);
        
    }
    
    public String obtenerTipoCancion(){
        
        //5 minutos * 60 segundos
        //if (this.getTiempoDuracion() >= 300)
        if (this.tiempoDuracion >= 300){
            return "larga";
        }
        else{
            return "normal";
        }
    }

    
    
}
