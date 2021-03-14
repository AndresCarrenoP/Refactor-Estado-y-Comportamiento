public class Main {

public static void main (String[] args){

    Animal serpiente = new Animal();
    System.out.print("El animal " + serpiente.nombre + " tiene " + serpiente.piernas + " piernas, y ");
    serpiente.emitirSonido();

    Animal perro = new Animal("perro", "woof!", "croquetas");
    System.out.print("El animal " + perro.nombre + " tiene " + perro.piernas + " piernas y come " + perro.comida + ", y ");
    perro.emitirSonido();

    Animal pato = new Animal("pato", "cua cua");
    pato.emitirSonido();

    Animal oveja = new Animal("oveja");
    System.out.print("El animal " + oveja.nombre + " come " + oveja.comida);


    }

}
