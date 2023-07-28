package Logica;

public class Bulbasaur extends Pokemon implements IPlanta{
    public Bulbasaur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy bulbasaur y este es mi ataque Placaje");
    }

    @Override
    protected void atacerAraniazo() {
        System.out.println("Soy bulbasaur y este es mi ataque Arañazo");
    }

    @Override
    protected void atacerMordisco() {
        System.out.println("Soy bulbasaur y este es mi ataque Mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Soy bulbasaur y este es mi ataque Drenaje");
    }

    @Override
    public void atacarParalizar() {
        System.out.println("Soy bulbasaur y este es mi ataque Paralizar");

    }
}
