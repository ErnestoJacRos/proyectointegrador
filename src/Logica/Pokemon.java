package Logica;

public abstract class Pokemon {
    protected Integer numPokeddex;
    protected String nombrePokemon;
    protected Double pesoPkemon;
    protected String sexoPokemon;
    protected Integer temporado;

    protected abstract void atacarPlacaje();
    protected abstract void atacerAraniazo();
    protected abstract void atacerMordisco();

}
