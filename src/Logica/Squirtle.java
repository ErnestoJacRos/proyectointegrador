package Logica;

public class Squirtle extends  Pokemon implements IAgua{
    public Squirtle() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Squirtle  y este es mi ataque Placaje");
    }

    @Override
    protected void atacerAraniazo() {
        System.out.println("Soy Squirtle  y este es mi ataque Arañazo");
    }

    @Override
    protected void atacerMordisco() {
        System.out.println("Soy Squirtle  y este es mi ataque Mordisco");
    }

    @Override
    public void atacarHidroBomba() {
        System.out.println("Soy Squirtle  y este es mi ataque Hidro Bomba");
    }

    @Override
    public void atacarBurbuja() {
        System.out.println("Soy Squirtle  y este es mi ataque Burnuja");
    }

    @Override
    public void atacarPistolaAgua() {
        System.out.println("Soy Squirtle  y este es mi ataque Pistola de agua");
    }
}
