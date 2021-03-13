public class Animal {
    static String nombre;
    static int piernas;
    static String sonido;
    static String comida;

    public Animal (String nombre, int piernas, String sonido, String comida){
        this.nombre = nombre;
        this.piernas = piernas;
        this.sonido = sonido;
        this.comida = comida;
    }

    public Animal (int piernas){
     }

    public Animal (String nombre, String sonido, String comida){
        this(4);
    }

    public void emitirSonido(){
        System.out.println("El sonido de " + nombre + " es: " + sonido);
    }


}