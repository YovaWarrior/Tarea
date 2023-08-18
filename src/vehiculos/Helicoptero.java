
package vehiculos;

public class Helicoptero implements VehiculoAereo {
    private boolean motorEncendido;
    private boolean enVuelo;

    @Override
    public void acelerar() {
        if (motorEncendido && !enVuelo) {
            System.out.println("El helicóptero está ganando altura y velocidad.");
            enVuelo = true;
        }
    }

    @Override
    public void frenar() {
        if (enVuelo) {
            System.out.println("El helicóptero disminuye la velocidad y altura.");
            enVuelo = false;
        }
    }

    @Override
    public void encender() {
        motorEncendido = true;
        System.out.println("Encendiendo el motor del helicóptero.");
    }

    @Override
    public void apagar() {
        motorEncendido = false;
        enVuelo = false;
        System.out.println("Apagando el motor del helicóptero y descendiendo.");
    }

    @Override
    public void despegar() {
        if (motorEncendido && !enVuelo) {
            System.out.println("El helicóptero despega y asciende verticalmente.");
            enVuelo = true;
        }
    }

    @Override
    public void aterrizar() {
        if (enVuelo) {
            System.out.println("El helicóptero inicia su proceso de aterrizaje.");
            enVuelo = false;
        }
    }
}
