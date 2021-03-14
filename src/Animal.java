public class Animal {
    String nombre;
    int piernas;
    String sonido;
    String comida;

    public Animal(){
        this("serpiente", 0, "sssssss");
    }


    public Animal (String nombre, String sonido){
        this.nombre = nombre;
        this.sonido = sonido;
    }


    public Animal (String nombre, int piernas, String sonido){
        this.nombre = nombre;
        this.piernas = piernas;
        this.sonido = sonido;
    }


    public Animal (String nombre, String sonido, String comida){
        this(nombre, 4, sonido, comida);
    }

    public Animal (String nombre){
        this(nombre,"beeeee", "pasto");
    }



    public Animal (String nombre, int piernas, String sonido, String comida){
        this.nombre = nombre;
        this.piernas = piernas;
        this.sonido = sonido;
        this.comida = comida;
    }


    public void emitirSonido(){
        System.out.println("el sonido del animal " + nombre + " es: " + sonido);
    }


}