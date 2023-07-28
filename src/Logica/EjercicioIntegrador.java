package Logica;

public class EjercicioIntegrador {
    public static void main(String[] args) {
        Bulbasaur bulbasaur = new Bulbasaur();
        Charmander charmander = new Charmander();
        Squirtle squirtle = new Squirtle();
        Pikachu pikachu = new Pikachu();
        bulbasaur.atacerAraniazo();
        bulbasaur.atacarDrenaje();
        squirtle.atacerAraniazo();
        squirtle.atacarHidroBomba();
        pikachu.atacerAraniazo();
        pikachu.atacarImpactruebo();
        charmander.atacerAraniazo();
        charmander.atacarLanzaLLamas();

    }
}
