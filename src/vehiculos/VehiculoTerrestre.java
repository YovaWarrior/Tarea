
package vehiculos;


public abstract class VehiculoTerrestre implements Vehiculo {
    int velocidad;

    @Override
    public void acelerar() {
        velocidad += 25;
        System.out.println("Acelerando. Velocidad actual: " + velocidad + " km/h");
    }

    @Override
    public void frenar() {
        velocidad -= 9;
        System.out.println("Frenando. Velocidad actual: " + velocidad + " km/h");
    }
}