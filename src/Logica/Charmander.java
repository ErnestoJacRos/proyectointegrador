package Logica;

public class Charmander extends Pokemon implements IFuego{
    public Charmander() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy charmander y este es mi ataque Placaje");
    }

    @Override
    protected void atacerAraniazo() {
        System.out.println("Soy Charmander y este es mi ataque Arañazo");
    }

    @Override
    protected void atacerMordisco() {
        System.out.println("Soy charmander y este es mi ataque Mordisco");
    }

    @Override
    public void atacarPunhoFuego() {
        System.out.println("Soy charmander y este es mi ataque Puño d efuego");
    }

    @Override
    public void atacarLanzaLLamas() {
        System.out.println("Soy charmander y este es mi ataque lANZA llAMAS");
    }

    @Override
    public void atacarAscuas() {
        System.out.println("Soy charmander y este es mi ataque Ascuas");
    }
}
