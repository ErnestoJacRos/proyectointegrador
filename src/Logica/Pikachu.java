package Logica;

public class Pikachu extends  Pokemon implements IElectrico{
    public Pikachu() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Soy Pikachu y este es mi ataque Placaje");
    }

    @Override
    protected void atacerAraniazo() {
        System.out.println("Soy Pikachu y este es mi ataque Arañazo");
    }

    @Override
    protected void atacerMordisco() {
        System.out.println("Soy Pikachu y este es mi ataque Mordisco");
    }

    @Override
    public void atacarImpactruebo() {
        System.out.println("Soy Pikachu y este es mi ataque Impactrueno");
    }

    @Override
    public void atacarPunhoTrueno() {
        System.out.println("Soy Pikachu y este es mi ataque Puño Trueno");
    }
}
