
package vehiculos;

public class Avion implements VehiculoAereo {
    private boolean motorEncendido;
    private boolean enVuelo;

    @Override
    public void acelerar() {
        if (motorEncendido && !enVuelo) {
            System.out.println("El avión está tomando velocidad en la pista.");
            enVuelo = true;
        }
    }

    @Override
    public void frenar() {
        if (enVuelo) {
            System.out.println("El avión está reduciendo la velocidad antes del aterrizaje.");
            enVuelo = false;
        }
    }

    @Override
    public void encender() {
        motorEncendido = true;
        System.out.println("Encendiendo el motor del avión.");
    }

    @Override
    public void apagar() {
        motorEncendido = false;
        enVuelo = false;
        System.out.println("Apagando el motor y descendiendo el avión.");
    }

    @Override
    public void despegar() {
        if (motorEncendido && !enVuelo) {
            System.out.println("El avión despega y asciende.");
            enVuelo = true;
        }
    }

    @Override
    public void aterrizar() {
        if (enVuelo) {
            System.out.println("El avión se prepara para aterrizar en la pista.");
            enVuelo = false;
        }
    }
}
